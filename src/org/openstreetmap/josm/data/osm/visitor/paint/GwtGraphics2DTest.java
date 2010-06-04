package org.openstreetmap.josm.data.osm.visitor.paint;

import java.util.Map;

import org.openstreetmap.josm.data.osm.Color;
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

	

	

	

	

	@Override
	public GeneralPath draw(GeneralPath path) {
		// TODO Auto-generated method stub
		debug();
		return path;
	}



	@Override
	public Rectangle drawRect(long a, long b, int c, int d) {
		// TODO Auto-generated method stub
		System.out.println("Rect:" + a + " "+ b + " "+ c + " "+ d);
		//debug();
		return null;
	}



	@Override
	public Polygon fillPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		debug();
		return polygon;
	}

	

	@Override
	public Rectangle fillRect(long l, long m, int size, int size2) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	

	




	@Override
	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}



	@Override
	public Font getFont() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	@Override
	public FontMetrics getFontMetrics(Font orderFont) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}

	

	

	


	@Override
	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		debug();
	}



	@Override
	public void setFont(Font orderFont) {
		// TODO Auto-generated method stub
		debug();
	}
	

	@Override
	public void setStroke(BasicStroke basicStroke) {
		// TODO Auto-generated method stub
		debug();
	}


	@Override
	public Text drawString(String name, long l, long m) {
		// TODO Auto-generated method stub
		debug();
		return null;
	}
	@Override
	public IGwtGraphics2DSimple g() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}
	@Override
	public Widget getDrawingArea() {
		// TODO Auto-generated method stub
		debug();
		return null;
	}
	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

}
