package org.openstreetmap.gwt.client;
//these tests really dont work..
import static org.junit.Assert.*;

import java.util.Map;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.visitor.paint.BasicStroke;
import org.openstreetmap.josm.data.osm.visitor.paint.Font;
import org.openstreetmap.josm.data.osm.visitor.paint.FontMetrics;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.Polygon;
import org.openstreetmap.josm.data.osm.visitor.paint.Rectangle;
import org.vaadin.gwtgraphics.client.Shape;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

public class GWTGraphics2DTest extends GWTTestCase implements IGwtGraphics2D{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	@Test
	public void testGWTGraphics2D() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddRenderingHints() {
		fail("Not yet implemented");
	}

	@Test
	public void testClip() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawStringStringIntInt() {
		
		// this does not work, i dont know how to access to the document object 
		//GWTGraphics2D g = new GWTGraphics2D();
		//g.drawString("hello world", 10, 10);
//		GWT.log("test draw string" + g.toString());
//		GWT.log("test draw string" + g.getDrawingArea().toString());
		
	}

	@Test
	public void testDrawStringStringFloatFloat() {
		fail("Not yet implemented");
	}

	@Test
	public void testFill() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetBackground() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetComposite() {
		fail("Not yet implemented");
	}

	@Test
	public void testHit() {
		fail("Not yet implemented");
	}

	@Test
	public void testRotateDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testRotateDoubleDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testScale() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetBackground() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetComposite() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetRenderingHints() {
		fail("Not yet implemented");
	}

	@Test
	public void testShear() {
		fail("Not yet implemented");
	}

	@Test
	public void testTranslateIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testTranslateDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testClearRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testClipRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testCopyArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testDispose() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawArc() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawLine() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawOvalIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawPolygon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawPolyline() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawRoundRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillArc() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillOval() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillPolygonIntArrayIntArrayInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillRectIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillRoundRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClip() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetClipBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClipShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetClipIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetColor() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetPaintMode() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetXORMode() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawRectIntIntIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreate() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawShape() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFont() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetFont() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawRectLongLongIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetStroke() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawGeneralPath() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillRectLongLongIntInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetFontMetrics() {
		fail("Not yet implemented");
	}

	@Test
	public void testFillPolygonPolygon() {
		fail("Not yet implemented");
	}

	@Test
	public void testG() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawOvalLongLongIntInt() {
		fail("Not yet implemented");
	}

	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		
		return "org.openstreetmap.gwt.GWTOSMJUnit";
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
	public void drawString(String t, int x, int y) {
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
	public boolean hit(Rectangle arg0, Shape arg1, boolean arg2) {
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
