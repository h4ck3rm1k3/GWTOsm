// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.conflict.tags;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.table.DefaultTableModel;

import org.openstreetmap.josm.data.osm.TagCollection;
import org.openstreetmap.josm.tools.CheckParameterUtil;

public class TagConflictResolverModel extends DefaultTableModel {
    static public final String NUM_CONFLICTS_PROP = TagConflictResolverModel.class.getName() + ".numConflicts";

    private TagCollection tags;
    private List<String> displayedKeys;
    private Set<String> keysWithConflicts;
    private HashMap<String, MultiValueResolutionDecision> decisions;
    private int numConflicts;
    private PropertyChangeSupport support;
    private boolean showTagsWithConflictsOnly = false;
    private boolean showTagsWithMultiValuesOnly = false;

    public TagConflictResolverModel() {
        numConflicts = 0;
        support = new PropertyChangeSupport(this);
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        support.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        support.removePropertyChangeListener(listener);
    }

    protected void setNumConflicts(int numConflicts) {
        int oldValue = this.numConflicts;
        this.numConflicts = numConflicts;
        if (oldValue != this.numConflicts) {
            support.firePropertyChange(NUM_CONFLICTS_PROP, oldValue, this.numConflicts);
        }
    }

    protected void refreshNumConflicts() {
        int count = 0;
        for (MultiValueResolutionDecision d : decisions.values()) {
            if (!d.isDecided()) {
                count++;
            }
        }
        setNumConflicts(count);
    }

    protected void sort() {
        Collections.sort(
                displayedKeys,
                new Comparator<String>() {
                    public int compare(String key1, String key2) {
                        if (decisions.get(key1).isDecided() && ! decisions.get(key2).isDecided())
                            return 1;
                        else if (!decisions.get(key1).isDecided() && decisions.get(key2).isDecided())
                            return -1;
                        return key1.compareTo(key2);
                    }
                }
        );
    }

    /**
     * initializes the model from the current tags
     *
     */
    protected void rebuild() {
        if (tags == null) return;
        for(String key: tags.getKeys()) {
            MultiValueResolutionDecision decision = new MultiValueResolutionDecision(tags.getTagsFor(key));
            if (decisions.get(key) == null) {
                decisions.put(key,decision);
            }
        }
        displayedKeys.clear();
        Set<String> keys = tags.getKeys();
        if (showTagsWithConflictsOnly) {
            keys.retainAll(keysWithConflicts);
            if (showTagsWithMultiValuesOnly) {
                Set<String> keysWithMultiValues = new HashSet<String>();
                for (String key: keys) {
                    if (decisions.get(key).canKeepAll()) {
                        keysWithMultiValues.add(key);
                    }
                }
                keys.retainAll(keysWithMultiValues);
            }
            for (String key: tags.getKeys()) {
                if (!decisions.get(key).isDecided() && !keys.contains(key)) {
                    keys.add(key);
                }
            }
        }
        displayedKeys.addAll(keys);
        refreshNumConflicts();
        sort();
        fireTableDataChanged();
    }

    /**
     * Populates the model with the tags for which conflicts are to be resolved.
     *
     * @param tags  the tag collection with the tags. Must not be null.
     * @param keysWithConflicts the set of tag keys with conflicts
     * @throws IllegalArgumentException thrown if tags is null
     */
    public void populate(TagCollection tags, Set<String> keysWithConflicts) {
        CheckParameterUtil.ensureParameterNotNull(tags, "tags");
        this.tags = tags;
        displayedKeys = new ArrayList<String>();
        this.keysWithConflicts = keysWithConflicts == null ? new HashSet<String>() : keysWithConflicts;
        decisions = new HashMap<String, MultiValueResolutionDecision>();
        rebuild();
    }

    @Override
    public int getRowCount() {
        if (displayedKeys == null) return 0;
        return displayedKeys.size();
    }

    @Override
    public Object getValueAt(int row, int column) {
        return decisions.get(displayedKeys.get(row));
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 2;
    }

    @Override
    public void setValueAt(Object value, int row, int column) {
        MultiValueResolutionDecision decision = decisions.get(displayedKeys.get(row));
        if (value instanceof String) {
            decision.keepOne((String)value);
        } else if (value instanceof MultiValueDecisionType) {
            MultiValueDecisionType type = (MultiValueDecisionType)value;
            switch(type) {
            case KEEP_NONE:
                decision.keepNone();
                break;
            case KEEP_ALL:
                decision.keepAll();
                break;
            }
        }
        fireTableDataChanged();
        refreshNumConflicts();
    }

    /**
     * Replies true if each {@see MultiValueResolutionDecision} is decided.
     *
     * @return true if each {@see MultiValueResolutionDecision} is decided; false
     * otherwise
     */
    public boolean isResolvedCompletely() {
        return numConflicts == 0;
    }

    public int getNumConflicts() {
        return numConflicts;
    }

    public int getNumDecisions() {
        return getRowCount();
    }

    //TODO Should this method work with all decisions or only with displayed decisions? For MergeNodes it should be
    //all decisions, but this method is also used on other places, so I've made new method just for MergeNodes
    public TagCollection getResolution() {
        TagCollection tc = new TagCollection();
        for (String key: displayedKeys) {
            tc.add(decisions.get(key).getResolution());
        }
        return tc;
    }

    public TagCollection getAllResolutions() {
        TagCollection tc = new TagCollection();
        for (MultiValueResolutionDecision value: decisions.values()) {
            tc.add(value.getResolution());
        }
        return tc;
    }

    public MultiValueResolutionDecision getDecision(int row) {
        return decisions.get(displayedKeys.get(row));
    }

    /**
     * Sets whether all tags or only tags with conflicts are displayed
     *
     * @param showTagsWithConflictsOnly if true, only tags with conflicts are displayed
     */
    public void setShowTagsWithConflictsOnly(boolean showTagsWithConflictsOnly) {
        this.showTagsWithConflictsOnly = showTagsWithConflictsOnly;
        rebuild();
    }

    /**
     * Sets whether all conflicts or only conflicts with multiple values are displayed
     *
     * @param showTagsWithMultiValuesOnly if true, only tags with multiple values are displayed
     */
    public void setShowTagsWithMultiValuesOnly(boolean showTagsWithMultiValuesOnly) {
        this.showTagsWithMultiValuesOnly = showTagsWithMultiValuesOnly;
        rebuild();
    }

    /**
     * Prepare the default decisions for the current model
     *
     */
    public void prepareDefaultTagDecisions() {
        for (MultiValueResolutionDecision decision: decisions.values()) {
            List<String> values = decision.getValues();
            values.remove("");
            if (values.size() == 1) {
                decision.keepOne(values.get(0));
            } else {
                decision.keepAll();
            }
        }
        rebuild();
    }

}
