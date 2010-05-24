package org.openstreetmap.josm.data.osm.visitor.paint;

//import java.awt.Graphics2D;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.ElemStyle;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;

public interface MapPaintVisitorInterface {

	public abstract ElemStyle getPrimitiveStyle(OsmPrimitive osm);

	public abstract IconElemStyle getPrimitiveNodeStyle(OsmPrimitive osm);

	public abstract boolean isPrimitiveArea(Way osm);

	public abstract void drawNode(Node n);

	public abstract void drawWay(Way w, int fillAreas);

	public abstract void drawSelectedMember(OsmPrimitive osm, ElemStyle style,
			boolean area, boolean areaselected);

	public abstract void paintUnselectedRelation(Relation r);

	public abstract void drawRestriction(Relation r);

	public abstract boolean drawMultipolygon(Relation r);

	/* Shows areas before non-areas */
	public abstract void visitAll(DataSet data, boolean virtual, Bounds bounds);

	public abstract void putError(OsmPrimitive p, String text, boolean isError);

	public abstract void setGraphics(IGwtGraphics2D g);

	public abstract void setInactive(boolean inactive);

	public abstract void setNavigatableComponent(NavigatableComponent nc);

}