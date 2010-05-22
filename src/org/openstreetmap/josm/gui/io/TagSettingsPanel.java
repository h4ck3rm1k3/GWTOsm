// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.io;

import java.awt.BorderLayout;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.osm.Changeset;
import org.openstreetmap.josm.gui.tagging.TagEditorPanel;
import org.openstreetmap.josm.gui.tagging.TagModel;
import org.openstreetmap.josm.tools.CheckParameterUtil;

public class TagSettingsPanel extends JPanel implements TableModelListener {

    /** checkbox for selecting whether an atomic upload is to be used  */
    private TagEditorPanel pnlTagEditor;
    /** the model for the changeset comment */
    private ChangesetCommentModel changesetCommentModel;


    protected void build() {
        setLayout(new BorderLayout());
        add(pnlTagEditor = new TagEditorPanel(), BorderLayout.CENTER);
    }

    /**
     * Creates a new panel
     * 
     * @param changesetCommentModel the changeset comment model. Must not be null.
     * @throws IllegalArgumentException thrown if {@code changesetCommentModel} is null
     */
    public TagSettingsPanel(ChangesetCommentModel changesetCommentModel) throws IllegalArgumentException{
        CheckParameterUtil.ensureParameterNotNull(changesetCommentModel, "changesetCommentModel");
        this.changesetCommentModel = changesetCommentModel;
        this.changesetCommentModel.addObserver(new ChangesetCommentObserver());
        build();
        pnlTagEditor.getModel().addTableModelListener(this);
    }

    /**
     * Replies the default value for "created_by"
     *
     * @return the default value for "created_by"
     */
    protected String getDefaultCreatedBy() {
        Object ua = System.getProperties().get("http.agent");
        return(ua == null) ? "JOSM" : ua.toString();
    }

    protected void setUploadComment(String comment) {
        if (comment == null) {
            comment = "";
        }
        comment  = comment.trim();
        String commentInTag = getUploadComment();
        if (comment.equals(commentInTag))
            return;

        if (comment.equals("")) {
            pnlTagEditor.getModel().delete("comment");
            return;
        }
        TagModel tag = pnlTagEditor.getModel().get("comment");
        if (tag == null) {
            tag = new TagModel("comment", comment);
            pnlTagEditor.getModel().add(tag);
        } else {
            pnlTagEditor.getModel().updateTagValue(tag, comment);
        }
    }

    protected String getUploadComment() {
        TagModel tag = pnlTagEditor.getModel().get("comment");
        if (tag == null) return null;
        return tag.getValue();
    }

    protected void initNewChangeset() {
        String currentComment = getUploadComment();
        pnlTagEditor.getModel().clear();
        if (currentComment != null) {
            pnlTagEditor.getModel().add("comment", currentComment);
        }
        pnlTagEditor.getModel().add("created_by", getDefaultCreatedBy());
    }

    protected void initFromExistingChangeset(Changeset cs) {
        String currentComment = getUploadComment();
        Map<String,String> tags = cs.getKeys();
        if (tags.get("comment") == null) {
            tags.put("comment", currentComment);
        }
        tags.put("created_by", getDefaultCreatedBy());
        pnlTagEditor.getModel().initFromTags(tags);
    }

    public void initFromChangeset(Changeset cs) {
        if (cs == null) {
            initNewChangeset();
        } else {
            initFromExistingChangeset(cs);
        }
    }

    /**
     * Replies the map with the current tags in the tag editor model.
     *
     * @return the map with the current tags in the tag editor model.
     */
    public Map<String,String> getTags() {
        return pnlTagEditor.getModel().getTags();
    }

    public void startUserInput() {
        pnlTagEditor.initAutoCompletion(Main.main.getEditLayer());
    }

    /* -------------------------------------------------------------------------- */
    /* Interface TableChangeListener                                              */
    /* -------------------------------------------------------------------------- */
    public void tableChanged(TableModelEvent e) {
        String uploadComment = getUploadComment();
        changesetCommentModel.setComment(uploadComment);
    }

    /**
     * Observes the changeset comment model and keeps the tag editor in sync
     * with the current changeset comment
     *
     */
    class ChangesetCommentObserver implements Observer {
        public void update(Observable o, Object arg) {
            if (!(o instanceof ChangesetCommentModel)) return;
            String newValue = (String)arg;
            String oldValue = getUploadComment();
            if (oldValue == null) {
                oldValue = "";
            }
            if (!oldValue.equals(newValue)) {
                setUploadComment((String)arg);
            }
        }
    }
}
