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
import org.vaadin.gwtgraphics.client.shape.Text;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class GwtGraphics2DTest implements IGwtGraphics2DSimple {

	public GwtGraphics2DTest() {
		// TODO Auto-generated constructor stub
		debug();
	}
	 public void debug() {
	      //System.out.println
	         new Exception().printStackTrace();
	         //);
	      //.getStackTrace().toString()
	    }

	public GeneralPath draw(GeneralPath path) {
		// TODO Auto-generated method stub
		debug();
		return path;
	}

	public Rectangle drawRect(long a, long b, int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("Rect:" + a + " "+ b + " "+ c + " "+ d);
		//debug();
		return null;
	}

	public Polygon fillPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		debug();
		return polygon;
	}

	public Rectangle fillRect(long l, long m, int size, int size2) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public Color getColor() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public Font getFont() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public FontMetrics getFontMetrics(Font orderFont) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		debug();
	}

	public void setFont(Font orderFont) {
		// TODO Auto-generated method stub
		debug();
	}

	public void setStroke(BasicStroke basicStroke) {
		// TODO Auto-generated method stub
		debug();
	}

	public Text drawString(String name, long l, long m) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	public IGwtGraphics2DSimple g() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}
	
	public Widget getDrawingArea() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}
	
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
