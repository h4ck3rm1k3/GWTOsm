package org.openstreetmap.josm.data.osm.visitor.paint;

import org.openstreetmap.josm.data.osm.Color;

import com.google.gwt.user.client.ui.Widget;

public interface IGwtGraphics2DSimple {

	void setColor(Color color);

	void setStroke(BasicStroke basicStroke);

	void draw(GeneralPath path);

	Rectangle getClipBounds();

	Font getFont();

	void setFont(Font orderFont);

	void drawString(String name, long l, long m);

	void drawRect(long l, long m, int i, int j);

	void fillRect(long l, long m, int size, int size2);

	void fillPolygon(Polygon polygon);

	FontMetrics getFontMetrics(Font orderFont);

	IGwtGraphics2DSimple g();

	Color getColor();

	Widget getDrawingArea();

	void clear();

}
