package org.openstreetmap.gwt.client;

import java.util.Map;

import org.openstreetmap.gwt.shared.FieldVerifier;
import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke;
import org.openstreetmap.josm.data.osm.visitor.paint.Font;
import org.openstreetmap.josm.data.osm.visitor.paint.FontMetrics;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D;
import org.openstreetmap.josm.data.osm.visitor.paint.Polygon;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
//import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
import org.vaadin.gwtgraphics.client.DrawingArea;
import org.vaadin.gwtgraphics.client.Shape;
import org.vaadin.gwtgraphics.client.animation.Animate;
import org.vaadin.gwtgraphics.client.shape.Circle;
import org.vaadin.gwtgraphics.client.shape.Path;
import org.vaadin.gwtgraphics.client.shape.Text;
import org.vaadin.gwtgraphics.client.shape.Rectangle;
import org.vaadin.gwtgraphics.client.shape.path.LineTo;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWT2dAdaptor implements IGwtGraphics2D {

    private DrawingArea canvas;

  /**
   * This is the entry point method.
   */
    public void drawString(String t, int x, int y) {
    
	Text o = new Text(x, y, t);
	//	circle.setFillColor(fillColors[i]);
	//  circle.setFillOpacity(0.5);
	//  circle.addClickHandler(handler);
	canvas.add(o);
    }
    
    public GWT2dAdaptor(VerticalPanel parent) {
	canvas = new DrawingArea(400,400);
	parent.add(canvas);   
    }

	@Override
	public void addRenderingHints(Map<String, String> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clearRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clipRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IGwtGraphics2D create() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Shape createStrokedShape) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(GeneralPath path) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawLine(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawOval(long l, long m, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawPolyline(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawRect(long l, long m, int k, int l2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void drawString(String t, float x, float y) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fill(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillRect(long l, long m, int size, int size2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fillRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public IGwtGraphics2D g() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Shape getClip() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public org.openstreetmap.josm.data.osm.visitor.paint.Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Composite getComposite() {
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
	public boolean hit(
			org.openstreetmap.josm.data.osm.visitor.paint.Rectangle arg0,
			Shape arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void rotate(double arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void rotate(double arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void scale(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setBackground(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setClip(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setComposite(Composite arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setFont(Font orderFont) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setPaintMode() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setRenderingHints(Map<?, ?> arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setStroke(BasicStroke basicStroke) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setXORMode(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void shear(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translate(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void translate(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}
}
