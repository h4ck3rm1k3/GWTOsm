// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm.visitor.paint;

import static org.openstreetmap.josm.data.osm.I18n.marktr;

//import org.openstreetmap.josm.tools.Color;

import org.openstreetmap.josm.data.Preferences.ColorKey;
import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.Main;

//import org.openstreetmap.josm.tools.Color;
//import com.google.gwt.gwtwidgets.client.style.Color;

public enum PaintColors implements ColorKey {

    INACTIVE(marktr("inactive"), new Color(169, 169, 169)), //DARKGREY),
    SELECTED(marktr("selected"), Color.RED),
    NODE(marktr("Node: standard"), Color.YELLOW),
    CONNECTION(marktr("Node: connection"), Color.YELLOW),
    TAGGED(marktr("Node: tagged"), new Color(204, 255, 255)), // light cyan
    DEFAULT_WAY(marktr("way"),  new Color(0,0,128)), // dark blue
    RELATION(marktr("relation"), new Color(0,128,128)), // teal
    UNTAGGED_WAY(marktr("untagged way"), new Color(0,128,0)), // dark green
    INCOMPLETE_WAY(marktr("incomplete way"), new Color(0,0,96)), // darker blue
    BACKGROUND(marktr("background"), Color.BLACK),
    HIGHLIGHT(marktr("highlight"), new Color(0, 255, 186)), // lighteal

    UNTAGGED(marktr("untagged"),Color.GREY),
    TEXT(marktr("text"), Color.WHITE),
    AREA_TEXT(marktr("areatext"), Color.LIGHTGREY);

    private final String name;
    private final Color defaultColor;

    private PaintColors(String name, Color defaultColor) {
        this.name = name;
        this.defaultColor = defaultColor;
    }

    public String getColorName() {
        return name;
    }

//    public Color getDefault() {
//        return defaultColor;
//    }

    public String getSpecialName() {
        return null;
    }

//    public Color get() {
//		return defaultColor;
//       // return Main.pref.getColor(this);
//    }

    public static void getColors() {
        for (PaintColors c:values()) {
            c.get();
        }
    }

	public Color get() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getDefault() {
		// TODO Auto-generated method stub
		return null;
	}
}
