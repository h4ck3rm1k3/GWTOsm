package org.openstreetmap.gwt.client;

import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke;
import org.openstreetmap.josm.data.osm.visitor.paint.Font;
import org.openstreetmap.josm.data.osm.visitor.paint.FontMetrics;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.Polygon;
import org.openstreetmap.josm.data.osm.visitor.paint.Rectangle;
import org.vaadin.gwtgraphics.client.shape.Text;

import com.google.gwt.user.client.ui.Widget;

public interface IGwtGraphics2DSimple {

	void setColor(Color color);

	void setStroke(BasicStroke basicStroke);

	GeneralPath draw(GeneralPath path);

	Rectangle getClipBounds();

	Font getFont();

	void setFont(Font orderFont);

	Text drawString(String name, long l, long m);

	Rectangle drawRect(long l, long m, int i, int j);

	Rectangle fillRect(long l, long m, int size, int size2);

	Polygon fillPolygon(Polygon polygon);

	FontMetrics getFontMetrics(Font orderFont);

	IGwtGraphics2DSimple g();

	Color getColor();

	Widget getDrawingArea();

	void clear();

}
