// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm.visitor.paint;

//import org.openstreetmap.josm.tools.Color;

//import org.openstreetmap.josm.data.Preferences.PreferenceChangeEvent;
//import org.openstreetmap.josm.data.Preferences.PreferenceChangedListener;

import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.Main;

public class MapPaintSettings  {

    public static final MapPaintSettings INSTANCE = new MapPaintSettings();

    private boolean useRealWidth;
    private boolean showDirectionArrow;
    private boolean showRelevantDirectionsOnly;
    private int defaultSegmentWidth;
    private boolean showOrderNumber;
    private boolean showHeadArrowOnly;
    private int showNamesDistance;
    private int useStrokesDistance;
    private int showIconsDistance;
    private int selectedNodeSize;
    private int connectionNodeSize;
    private int unselectedNodeSize;
    private int taggedNodeSize;
    private boolean fillSelectedNode;
    private boolean fillUnselectedNode;
    private boolean fillTaggedNode;
    private boolean fillConnectionNode;
    private Color selectedColor;
    private Color highlightColor;
    private Color inactiveColor;
    private Color nodeColor;
    private Color taggedColor;
    private Color connectionColor;
    private Color taggedConnectionColor;

    private MapPaintSettings() {
        load();
        //Main.pref.addPreferenceChangeListener(this);
    }

    static boolean draw_segment_direction=true;
    static boolean draw_segment_relevant_directions_only=true;
    static boolean mappaint_useRealWidth=false;
    static int mappaint_segment_default_width=2;
    static boolean draw_segment_order_number=false;
    static boolean draw_segment_head_only=false;
    static int mappaint_shownames=10000000;
    static int mappaint_showicons=10000000;
    static int mappaint_strokes=10000000;
    static int mappaint_node_selected_size=5;
    static int mappaint_node_unselected_size=3;
    static int mappaint_node_connection_size=5;
    static int mappaint_node_tagged_size=3;
    static boolean mappaint_node_fill_selected= true;
    static boolean     mappaint_node_fill_unselected= false;
    static boolean     mappaint_node_fill_tagged=true;
    static boolean     mappaint_node_fill_connection=false;


    private void load() {
        showDirectionArrow = draw_segment_direction;//", true);
        showRelevantDirectionsOnly = draw_segment_relevant_directions_only;//", true);
        useRealWidth = mappaint_useRealWidth;//", false);
        defaultSegmentWidth = mappaint_segment_default_width;//", 2);

        selectedColor = PaintColors.SELECTED.get();
        highlightColor = PaintColors.HIGHLIGHT.get();
        inactiveColor = PaintColors.INACTIVE.get();
        nodeColor = PaintColors.NODE.get();
        taggedColor = PaintColors.TAGGED.get();
        connectionColor = PaintColors.CONNECTION.get();
        if (taggedColor != nodeColor) {
            taggedConnectionColor = taggedColor;
        } else {
            taggedConnectionColor = connectionColor;
        }


        showOrderNumber = draw_segment_order_number;//", false);
        showHeadArrowOnly = draw_segment_head_only;//", false);

        showNamesDistance = mappaint_shownames;//", 10000000);
        useStrokesDistance = mappaint_strokes;//", 10000000);
        showIconsDistance = mappaint_showicons;//", 10000000);

        selectedNodeSize = mappaint_node_selected_size;//", 5);
        unselectedNodeSize = mappaint_node_unselected_size;//", 3);
        connectionNodeSize = mappaint_node_connection_size;//", 5);
	taggedNodeSize = mappaint_node_tagged_size;//", 3);
        fillSelectedNode = mappaint_node_fill_selected;//", true);
	fillUnselectedNode = mappaint_node_fill_unselected;//", false);
        fillTaggedNode = mappaint_node_fill_tagged;//", true);
	fillConnectionNode = mappaint_node_fill_connection;//", false);
    }

    //    public void preferenceChanged(PreferenceChangeEvent e) {
    //        load();
    //    }

    public boolean isUseRealWidth() {
        return useRealWidth;
    }

    public boolean isShowDirectionArrow() {
        return showDirectionArrow;
    }

    public boolean isShowRelevantDirectionsOnly() {
        return showRelevantDirectionsOnly;
    }

    public int getDefaultSegmentWidth() {
        return defaultSegmentWidth;
    }

    public Color getSelectedColor() {
        return selectedColor;
    }

    public Color getHighlightColor() {
        return highlightColor;
    }

    public Color getInactiveColor() {
        return inactiveColor;
    }

    public Color getNodeColor() {
        return nodeColor;
    }

    public Color getTaggedColor() {
        return taggedColor;
    }

    public Color getConnectionColor() {
        return connectionColor;
    }

    public Color getTaggedConnectionColor() {
        return taggedConnectionColor;
    }

    public boolean isShowOrderNumber() {
        return showOrderNumber;
    }

    public void setShowHeadArrowOnly(boolean showHeadArrowOnly) {
        this.showHeadArrowOnly = showHeadArrowOnly;
    }

    public boolean isShowHeadArrowOnly() {
        return showHeadArrowOnly;
    }

    public int getShowNamesDistance() {
        return showNamesDistance;
    }

    public int getUseStrokesDistance() {
        return useStrokesDistance;
    }

    public int getShowIconsDistance() {
        return showIconsDistance;
    }

    public int getSelectedNodeSize() {
        return selectedNodeSize;
    }

    public int getConnectionNodeSize() {
        return connectionNodeSize;
    }

    public int getUnselectedNodeSize() {
        return unselectedNodeSize;
    }

    public int getTaggedNodeSize() {
        return taggedNodeSize;
    }

    public boolean isFillSelectedNode() {
        return fillSelectedNode;
    }

    public boolean isFillUnselectedNode() {
        return fillUnselectedNode;
    }

    public boolean isFillConnectionNode() {
        return fillConnectionNode;
    }

    public boolean isFillTaggedNode() {
        return fillTaggedNode;
    }
}
