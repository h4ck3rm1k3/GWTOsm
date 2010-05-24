package org.openstreetmap.josm.data.osm.visitor.paint;

// import org.openstreetmap.josm.tools.Color;
// //import java.awt.Composite;
// //import java.awt.Font;
// //import java.awt.FontMetrics;
// //import java.awt.Graphics;
// //import java.awt.Graphics2D;
// //import java.awt.GraphicsConfiguration;
// //import java.awt.Image;
// //import java.awt.Paint;
// //import java.awt.Polygon;
// ////import java.awt.Rectangle;
// //import java.awt.RenderingHints;
// //import java.awt.Shape;
// //import java.awt.Stroke;
// //import java.awt.RenderingHints.Key;
// //import java.awt.font.FontRenderContext;
// //import java.awt.font.GlyphVector;
// //import java.awt.geom.AffineTransform;
// //import java.awt.image.BufferedImage;
// //import java.awt.image.BufferedImageOp;
// //import java.awt.image.ImageObserver;
// //import java.awt.image.RenderedImage;
// //import java.awt.image.renderable.RenderableImage;
////import java.awt.Graphics2D;
////import java.awt.RenderingHints.Key;
////import java.awt.geom.GeneralPath;
////import java.awt.Graphics;
////import java.awt.Polygon;
////import java.awt.RenderingHints.Key;
////import java.awt.geom.GeneralPath;
//import java.awt.Graphics;
//import java.text.AttributedCharacterIterator;
import java.util.Map;

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

import org.openstreetmap.josm.data.osm.Color;
//import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
import org.vaadin.gwtgraphics.client.DrawingArea;
import org.vaadin.gwtgraphics.client.Image;
import org.vaadin.gwtgraphics.client.Shape;
import org.vaadin.gwtgraphics.client.animation.Animate;
import org.vaadin.gwtgraphics.client.shape.Circle;
import org.vaadin.gwtgraphics.client.shape.Path;
import org.vaadin.gwtgraphics.client.shape.Text;
//import org.vaadin.gwtgraphics.client.shape.Rectangle;
import org.vaadin.gwtgraphics.client.shape.path.LineTo;

public class GWTGraphics2D //extends Graphics2D
 implements IGwtGraphics2D
{

    private DrawingArea canvas;
    
    public GWTGraphics2D(VerticalPanel parent) {
	canvas = new DrawingArea(400,400);
	parent.add(canvas);   
    }


  /* (non-Javadoc)
 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#addRenderingHints(java.util.Map)
 */
    
	
	public void addRenderingHints(Map<String, String> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#clip(org.vaadin.gwtgraphics.client.Shape)
	 */
	public void clip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
//	public void draw(Shape arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
//	public void drawGlyphVector(GlyphVector arg0, float arg1, float arg2) {
//		// TODO Auto-generated method stub
//		
//	}

	
//	public boolean drawImage(Image arg0, AffineTransform arg1,
//			ImageObserver arg2) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
//	public void drawImage(BufferedImage arg0, BufferedImageOp arg1, int arg2,
//			int arg3) {
//		// TODO Auto-generated method stub
//		
//	}

	
//	public void drawRenderableImage(RenderableImage arg0, AffineTransform arg1) {
//		// TODO Auto-generated method stub
//		
//	}
//
//	
//	public void drawRenderedImage(RenderedImage arg0, AffineTransform arg1) {
//		// TODO Auto-generated method stub
//		
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawString(java.lang.String, int, int)
	 */
	public void drawString(String t, int x, int y) {
	    Text o = new Text( x, y,t);    
	    canvas.add(o);
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawString(java.lang.String, float, float)
	 */
	public void drawString(String t, float x, float y) {
		// TODO Auto-generated method stub
	    Text o = new Text((int)x, (int)y,t);    
	    canvas.add(o);
		
	}

	
//	public void drawString(AttributedCharacterIterator t, int x, int y) {
//		// TODO Auto-generated method stub
//	    Text o = new Text(x, y,t.toString());    
//	    canvas.add(o);
//	}
//
//	
//	public void drawString(AttributedCharacterIterator t, float x,float y) {
//		// TODO Auto-generated method stub
//	    Text o = new Text((int)x, (int)y,t.toString());    
//	    canvas.add(o);		
//	}
	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fill(org.vaadin.gwtgraphics.client.Shape)
	 */
	public void fill(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getBackground()
	 */
	public Color getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getComposite()
	 */
	public Composite getComposite() {
		// TODO Auto-generated method stub
		return null;
	}

	
//	public GraphicsConfiguration getDeviceConfiguration() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public FontRenderContext getFontRenderContext() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public Paint getPaint() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public Object getRenderingHint(Key arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public RenderingHints getRenderingHints() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
//	public Stroke getStroke() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	public AffineTransform getTransform() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#hit(org.openstreetmap.josm.data.osm.visitor.paint.Rectangle, org.vaadin.gwtgraphics.client.Shape, boolean)
	 */
	public boolean hit(Rectangle arg0, Shape arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#rotate(double)
	 */
	public void rotate(double arg0) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#rotate(double, double, double)
	 */
	public void rotate(double arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#scale(double, double)
	 */
	public void scale(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setBackground(org.openstreetmap.josm.data.osm.Color)
	 */
	public void setBackground(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setComposite(com.google.gwt.user.client.ui.Composite)
	 */
	public void setComposite(Composite arg0) {
		// TODO Auto-generated method stub
		
	}

	
//	public void setPaint(Paint arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
//	public void setRenderingHint(Key arg0, Object arg1) {
//		// TODO Auto-generated method stub
//		
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setRenderingHints(java.util.Map)
	 */
	public void setRenderingHints(Map<?, ?> arg0) {
		// TODO Auto-generated method stub
		
	}

//	
//	public void setStroke(Stroke arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
//	public void setTransform(AffineTransform arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#shear(double, double)
	 */
	public void shear(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
//	public void transform(AffineTransform arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#translate(int, int)
	 */
	public void translate(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#translate(double, double)
	 */
	public void translate(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#clearRect(int, int, int, int)
	 */
	public void clearRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#clipRect(int, int, int, int)
	 */
	public void clipRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#copyArea(int, int, int, int, int, int)
	 */
	public void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
//	public Graphics create() {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#dispose()
	 */
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawArc(int, int, int, int, int, int)
	 */
	public void drawArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
//	public boolean drawImage(Image arg0, int arg1, int arg2, ImageObserver arg3) {
//		// TODO Auto-generated method stub
//		return false;
//	}

//	
//	public boolean drawImage(Image arg0, int arg1, int arg2, Color arg3,
//			ImageObserver arg4) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
//	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
//			int arg4, ImageObserver arg5) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
//	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
//			int arg4, Color arg5, ImageObserver arg6) {
//		// TODO Auto-generated method stub
//		return false;
//	}
//
//	
//	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
//			int arg4, int arg5, int arg6, int arg7, int arg8, ImageObserver arg9) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
//	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
//			int arg4, int arg5, int arg6, int arg7, int arg8, Color arg9,
//			ImageObserver arg10) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawLine(int, int, int, int)
	 */
	public void drawLine(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawOval(int, int, int, int)
	 */
	public void drawOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawPolygon(int[], int[], int)
	 */
	public void drawPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawPolyline(int[], int[], int)
	 */
	public void drawPolyline(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawRoundRect(int, int, int, int, int, int)
	 */
	public void drawRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillArc(int, int, int, int, int, int)
	 */
	public void fillArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillOval(int, int, int, int)
	 */
	public void fillOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillPolygon(int[], int[], int)
	 */
	public void fillPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillRect(int, int, int, int)
	 */
	public void fillRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillRoundRect(int, int, int, int, int, int)
	 */
	public void fillRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getClip()
	 */
	public Shape getClip() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getClipBounds()
	 */
	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getColor()
	 */
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	
//	public Font getFont() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	
//	public FontMetrics getFontMetrics(Font arg0) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setClip(org.vaadin.gwtgraphics.client.Shape)
	 */
	public void setClip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setClip(int, int, int, int)
	 */
	public void setClip(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setColor(org.openstreetmap.josm.data.osm.Color)
	 */
	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	
//	public void setFont(Font arg0) {
//		// TODO Auto-generated method stub
//		
//	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setPaintMode()
	 */
	public void setPaintMode() {
		// TODO Auto-generated method stub
		
	}

	
	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setXORMode(org.openstreetmap.josm.data.osm.Color)
	 */
	public void setXORMode(Color arg0) {
		// TODO Auto-generated method stub
		
	}


//	public Graphics g() {
//		// TODO Auto-generated method stub
//		return null;
//	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawRect(int, int, int, int)
	 */
	public void drawRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}


//	public void setRenderingHint(Key keyAntialiasing, Object object) {
//		// TODO Auto-generated method stub
//		
//	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#create()
	 */
	public IGwtGraphics2D create() {
		// TODO Auto-generated method stub
		return null;
	}


	
//
//	public void setRenderingHint(Key keyAntialiasing, Object object) {
//		// TODO Auto-generated method stub
//		
//	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#draw(org.vaadin.gwtgraphics.client.Shape)
	 */
	public void draw(Shape createStrokedShape) {
		// TODO Auto-generated method stub
		
	}





	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getFont()
	 */
	public Font getFont() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setFont(org.openstreetmap.josm.data.osm.visitor.paint.Font)
	 */
	public void setFont(Font orderFont) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawRect(long, long, int, int)
	 */
	public void drawRect(long l, long m, int k, int l2) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#setStroke(org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke)
	 */
	public void setStroke(BasicStroke basicStroke) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#draw(org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath)
	 */
	public void draw(
			org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath path) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillRect(long, long, int, int)
	 */
	public void fillRect(long l, long m, int size, int size2) {
		// TODO Auto-generated method stub
		
	}





	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#getFontMetrics(org.openstreetmap.josm.data.osm.visitor.paint.Font)
	 */
	public FontMetrics getFontMetrics(Font orderFont) {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#fillPolygon(org.openstreetmap.josm.data.osm.visitor.paint.Polygon)
	 */
	public void fillPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#g()
	 */
	public IGwtGraphics2D g() {
		// TODO Auto-generated method stub
		return null;
	}


	/* (non-Javadoc)
	 * @see org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D#drawOval(long, long, int, int)
	 */
	public void drawOval(long l, long m, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

//
//	public void fillPolygon(Polygon polygon) {
//		// TODO Auto-generated method stub
//		
//	}

}
