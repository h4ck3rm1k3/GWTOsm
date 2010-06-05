package org.openstreetmap.gwt.client;

import java.util.Map;

import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke;
import org.openstreetmap.josm.data.osm.visitor.paint.Font;
import org.openstreetmap.josm.data.osm.visitor.paint.FontMetrics;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.Polygon;
import org.openstreetmap.josm.data.osm.visitor.paint.Rectangle;
import org.vaadin.gwtgraphics.client.Shape;

import com.google.gwt.user.client.ui.Composite;

public interface IGwtGraphics2D {

	/**
	 * This is the entry point method.
	 */

	public abstract void addRenderingHints(Map<String, String> arg0);

	public abstract void clip(Shape arg0);

	public abstract void drawString(String t, int x, int y);

	public abstract void drawString(String t, float x, float y);

	public abstract void fill(Shape arg0);

	public abstract Color getBackground();

	public abstract Composite getComposite();

	public abstract boolean hit(Rectangle arg0, Shape arg1, boolean arg2);

	public abstract void rotate(double arg0);

	public abstract void rotate(double arg0, double arg1, double arg2);

	public abstract void scale(double arg0, double arg1);

	public abstract void setBackground(Color arg0);

	public abstract void setComposite(Composite arg0);

	public abstract void setRenderingHints(Map<?, ?> arg0);

	public abstract void shear(double arg0, double arg1);

	public abstract void translate(int arg0, int arg1);

	public abstract void translate(double arg0, double arg1);

	public abstract void clearRect(int arg0, int arg1, int arg2, int arg3);

	public abstract void clipRect(int arg0, int arg1, int arg2, int arg3);

	public abstract void copyArea(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5);

	public abstract void dispose();

	public abstract void drawArc(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5);

	public abstract void drawLine(int arg0, int arg1, int arg2, int arg3);

	public abstract void drawOval(int arg0, int arg1, int arg2, int arg3);

	public abstract void drawPolygon(int[] arg0, int[] arg1, int arg2);

	public abstract void drawPolyline(int[] arg0, int[] arg1, int arg2);

	public abstract void drawRoundRect(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5);

	public abstract void fillArc(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5);

	public abstract void fillOval(int arg0, int arg1, int arg2, int arg3);

	public abstract void fillPolygon(int[] arg0, int[] arg1, int arg2);

	public abstract void fillRect(int arg0, int arg1, int arg2, int arg3);

	public abstract void fillRoundRect(int arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5);

	public abstract Shape getClip();

	public abstract Rectangle getClipBounds();

	public abstract Color getColor();

	public abstract void setClip(Shape arg0);

	public abstract void setClip(int arg0, int arg1, int arg2, int arg3);

	public abstract void setColor(Color arg0);

	public abstract void setPaintMode();

	public abstract void setXORMode(Color arg0);

	public abstract void drawRect(int i, int j, int k, int l);

	public abstract IGwtGraphics2D create();

	public abstract void draw(Shape createStrokedShape);

	public abstract Font getFont();

	public abstract void setFont(Font orderFont);

	public abstract void drawRect(long l, long m, int k, int l2);

	public abstract void setStroke(BasicStroke basicStroke);

	public abstract void draw(
			org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath path);

	public abstract void fillRect(long l, long m, int size, int size2);

	public abstract FontMetrics getFontMetrics(Font orderFont);

	public abstract void fillPolygon(Polygon polygon);

	public abstract IGwtGraphics2D g();

	public abstract void drawOval(long l, long m, int arg2, int arg3);

}