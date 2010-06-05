package org.openstreetmap.gwt.client;

import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke;
import org.openstreetmap.josm.data.osm.visitor.paint.Font;
import org.openstreetmap.josm.data.osm.visitor.paint.FontMetrics;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.Polygon;
import org.openstreetmap.josm.data.osm.visitor.paint.Rectangle;
import org.vaadin.gwtgraphics.client.DrawingArea;
import org.vaadin.gwtgraphics.client.Shape;
import org.vaadin.gwtgraphics.client.shape.Text;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.ui.Widget;

public class GWTGraphics2D //extends Graphics2D
 implements IGwtGraphics2DSimple
{

    private DrawingArea canvas;
    
    public GWTGraphics2D(int height, int width) {
    	
    	canvas = new DrawingArea(height,width);
 
    }

    public void clear()
    {
    	canvas.clear();
    	
    }

	public Text drawString(String t, int x, int y) {
	    Text o = new Text( x, y,t);    
	    GWT.log("drawRect2" +o .toString());
	    canvas.add(o);
	    return o;
	}

	
	public Text drawString(String t, float x, float y) {
		// TODO Auto-generated method stub
	    Text o = new Text((int)x, (int)y,t); 
	    GWT.log("drawString" +o .toString());
	    canvas.add(o);
	    return o;
		
	}

	
	public Shape fill(Shape o) {
		// TODO Auto-generated method stub
		canvas.add(o);
		return o;
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#draw(org.vaadin.gwtgraphics.client.Shape)
	 */
	public Shape draw(Shape o) {
		// TODO Auto-generated method stub
		canvas.add(o);
		return o;
	}

	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setFont(org.openstreetmap.josm.data.osm.visitor.paint.Font)
	 */
	public void setFont(Font orderFont) {
		// TODO Auto-generated method stub
		 GWT.log( "TODO: set font " + orderFont .toString());
	}

	/* called to draw a point
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawRect(long, long, int, int)
	 */
	public Rectangle drawRect(long l, long m, int k, int l2) {
		// TODO Auto-generated method stub
		
	    Rectangle o = new Rectangle( l,m,k,l2);    
	   // GWT.log("drawRect" + o .toString()); // called many times
	    canvas.add(o);
	    return o;
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setStroke(org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke)
	 */
	public void setStroke(BasicStroke basicStroke) {
		// TODO Auto-generated method stub
		// GWT.log( "TODO: set stroke " + basicStroke .toString());
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#draw(org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath)
	 */
	public GeneralPath draw(
			org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath path) {
	
		canvas.add(path);
		return path;
	};


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillRect(long, long, int, int)
	 */
	public Rectangle fillRect(long l, long m, int size, int size2) {
		Rectangle o = new Rectangle( l,m,size,size2);
		GWT.log("fillRect" + o .toString());
	    canvas.add(o);
	    return o;
	}



	@Override
	public Text drawString(String t, long x, long y) {
		GWT.log( "draw string" + t+ x + ":"+ y );
		Text o = new Text((int)x, (int)y,t); 
		GWT.log("draw String:" +o .toString());
		canvas.add(o);
		return o;
	}

	@Override
	public Polygon fillPolygon(Polygon polygon) {
			canvas.add(polygon);
			return polygon;
	}



	@Override
	public IGwtGraphics2DSimple g() {
		// TODO Auto-generated method stub
		GWT.log( "get g" );
		return null;
	}



	@Override
	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public Font getFont() {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public FontMetrics getFontMetrics(Font orderFont) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public Widget getDrawingArea() {
		// TODO Auto-generated method stub
		return canvas;
	}


}
