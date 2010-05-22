// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.dialogs.relation;

import java.awt.Color;
import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTree;
import javax.swing.tree.TreeCellRenderer;

import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.gui.DefaultNameFormatter;
import org.openstreetmap.josm.tools.ImageProvider;

/**
 * This is the cell renderer used in {@see RelationTree}.
 *
 *
 */
public class RelationTreeCellRenderer extends JLabel implements TreeCellRenderer {
    public final static Color BGCOLOR_SELECTED = new Color(143,170,255);

    /** the relation icon */
    private ImageIcon icon;

    /**
     * constructor
     */
    public RelationTreeCellRenderer() {
        icon = ImageProvider.get("data", "relation");
        setOpaque(true);
    }

    /**
     * renders the icon
     */
    protected void renderIcon() {
        setIcon(icon);
    }

    /**
     * renders the textual value. Uses the relations names as value
     *
     * @param relation the relation
     */
    protected void renderValue(Relation relation) {
        setText(relation.getDisplayName(DefaultNameFormatter.getInstance()));
    }

    /**
     * renders the background
     *
     * @param selected true, if the current node is selected
     */
    protected void renderBackground(boolean selected) {
        Color bgColor = Color.WHITE;
        if (selected) {
            bgColor = BGCOLOR_SELECTED;
        }
        setBackground(bgColor);
    }

    public Component getTreeCellRendererComponent(JTree tree, Object value, boolean selected, boolean expanded,
            boolean leaf, int row, boolean hasFocus) {
        renderIcon();
        renderValue((Relation)value);
        renderBackground(selected);
        return this;
    }

}
