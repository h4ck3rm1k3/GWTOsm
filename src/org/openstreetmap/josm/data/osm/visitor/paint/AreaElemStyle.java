package org.openstreetmap.josm.data.osm.visitor.paint;

import org.openstreetmap.josm.tools.Color;

import org.openstreetmap.josm.data.osm.ElemStyle;
import org.openstreetmap.josm.data.osm.OsmPrimitive;

public class AreaElemStyle extends ElemStyle{

	public Color color;

	@Override
	public void paintPrimitive(OsmPrimitive primitive,
			MapPaintSettings paintSettings, MapPainter painter, boolean selected) {
		// TODO Auto-generated method stub
		
	}

	public ElemStyle getLineStyle() {
		// TODO Auto-generated method stub
		return null;
	}

}
