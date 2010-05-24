package org.openstreetmap.josm.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.visitor.paint.GWTGraphics2D;
import org.openstreetmap.josm.data.osm.visitor.paint.GwtGraphics2DTest;
import org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D;
import org.openstreetmap.josm.data.osm.visitor.paint.INavigatableComponent;
import org.openstreetmap.josm.data.osm.visitor.paint.MapPaintSettings;
import org.openstreetmap.josm.data.osm.visitor.paint.MapPainter;
import org.openstreetmap.josm.data.osm.visitor.paint.NavigatableComponent;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

public class MapPainterTest  {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



	@Test
	public void testMapPainter() {
	//GWT.create();
		IGwtGraphics2D g=new GwtGraphics2DTest();
		
		DataSet data=new DataSet();
		INavigatableComponent nc=new NavigatableComponent (data);
		MapPaintSettings paintSettings=new MapPaintSettings ();
		boolean inactive=false;
		double circum=100;
		double dist=100;
		boolean virtual = false;
		MapPainter painter = new MapPainter(paintSettings, g, inactive, nc, virtual, dist, circum);

	}

	@Test
	public void testDrawWay() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawNodeIcon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawAreaPolygonColorString() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawRestriction() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawVirtualNodes() {
		fail("Not yet implemented");
	}

	@Test
	public void testVisitVirtual() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawOrderNumberNodeNodeInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawOrderNumberPointPointInt() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetNodeName() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetWayName() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsInactive() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsShowNames() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCircum() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsShowIcons() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawAreaPolygonColorObject() {
		fail("Not yet implemented");
	}

	public String getModuleName() {
		// TODO Auto-generated method stub
		return "TESTER";
	}

}
