package org.openstreetmap.josm.data.osm.visitor.paint;

import java.awt.Color;
import java.awt.Composite;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GraphicsConfiguration;
import java.awt.Image;
import java.awt.Paint;
import java.awt.Polygon;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.Stroke;
import java.awt.RenderingHints.Key;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;
import java.awt.image.ImageObserver;
import java.awt.image.RenderedImage;
import java.awt.image.renderable.RenderableImage;
import java.text.AttributedCharacterIterator;
import java.util.Map;

public class GWTGraphics2D //extends Graphics2D
{

	
	public void addRenderingHints(Map<String, String> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void clip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void draw(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawGlyphVector(GlyphVector arg0, float arg1, float arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public boolean drawImage(Image arg0, AffineTransform arg1,
			ImageObserver arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void drawImage(BufferedImage arg0, BufferedImageOp arg1, int arg2,
			int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawRenderableImage(RenderableImage arg0, AffineTransform arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawRenderedImage(RenderedImage arg0, AffineTransform arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawString(String arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawString(String arg0, float arg1, float arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawString(AttributedCharacterIterator arg0, int arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawString(AttributedCharacterIterator arg0, float arg1,
			float arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void fill(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public Color getBackground() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Composite getComposite() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public GraphicsConfiguration getDeviceConfiguration() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public FontRenderContext getFontRenderContext() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Paint getPaint() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Object getRenderingHint(Key arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public RenderingHints getRenderingHints() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Stroke getStroke() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public AffineTransform getTransform() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public boolean hit(Rectangle arg0, Shape arg1, boolean arg2) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void rotate(double arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void rotate(double arg0, double arg1, double arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void scale(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void setBackground(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setComposite(Composite arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setPaint(Paint arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setRenderingHint(Key arg0, Object arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void setRenderingHints(Map<?, ?> arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setStroke(Stroke arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setTransform(AffineTransform arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void shear(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void transform(AffineTransform arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void translate(int arg0, int arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void translate(double arg0, double arg1) {
		// TODO Auto-generated method stub
		
	}

	
	public void clearRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void clipRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void copyArea(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	public Graphics create() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void dispose() {
		// TODO Auto-generated method stub
		
	}

	
	public void drawArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, ImageObserver arg3) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, Color arg3,
			ImageObserver arg4) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
			int arg4, ImageObserver arg5) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
			int arg4, Color arg5, ImageObserver arg6) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, ImageObserver arg9) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public boolean drawImage(Image arg0, int arg1, int arg2, int arg3,
			int arg4, int arg5, int arg6, int arg7, int arg8, Color arg9,
			ImageObserver arg10) {
		// TODO Auto-generated method stub
		return false;
	}

	
	public void drawLine(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawPolyline(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void drawRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	public void fillArc(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	public void fillOval(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void fillPolygon(int[] arg0, int[] arg1, int arg2) {
		// TODO Auto-generated method stub
		
	}

	
	public void fillRect(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void fillRoundRect(int arg0, int arg1, int arg2, int arg3, int arg4,
			int arg5) {
		// TODO Auto-generated method stub
		
	}

	
	public Shape getClip() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Rectangle getClipBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Color getColor() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public Font getFont() {
		// TODO Auto-generated method stub
		return null;
	}

	
	public FontMetrics getFontMetrics(Font arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	
	public void setClip(Shape arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setClip(int arg0, int arg1, int arg2, int arg3) {
		// TODO Auto-generated method stub
		
	}

	
	public void setColor(Color arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setFont(Font arg0) {
		// TODO Auto-generated method stub
		
	}

	
	public void setPaintMode() {
		// TODO Auto-generated method stub
		
	}

	
	public void setXORMode(Color arg0) {
		// TODO Auto-generated method stub
		
	}


	public Graphics g() {
		// TODO Auto-generated method stub
		return null;
	}


	public void drawRect(int i, int j, int k, int l) {
		// TODO Auto-generated method stub
		
	}


	public void fillPolygon(Polygon polygon) {
		// TODO Auto-generated method stub
		
	}

}
