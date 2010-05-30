package org.openstreetmap.gwt.client;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.coor.LatLon;

import com.google.gwt.core.client.GWT;
import com.google.gwt.junit.client.GWTTestCase;

public class BoundsTest extends GWTTestCase{

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	

	@Test
	public void testHashCode() {
		Bounds b = new Bounds();
		GWT.log(Integer.toString(b.hashCode()));
		assert(b.hashCode() != 0);
	}

	@Test
	public void testGetMin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetMax() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsLatLonLatLon() {
		//fail("Not yet implemented");
		LatLon pos = new LatLon(1, 2);
		LatLon pos2 = new LatLon(3, 4);
		Bounds b = new Bounds (pos,pos2);
		
		double a = b.getArea();
		System.out.println("area is " + a);
		
		assertTrue(a == 4.0);
		
	}

	@Test
	public void testBoundsLatLon() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsDoubleDoubleDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsDoubleArray() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsStringString() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsRectangle2D() {
		fail("Not yet implemented");
	}

	@Test
	public void testBoundsLatLonDoubleDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testToShortString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCenter() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtendLatLon() {
		fail("Not yet implemented");
	}

	@Test
	public void testExtendBounds() {
		fail("Not yet implemented");
	}

	@Test
	public void testContains() {
		fail("Not yet implemented");
	}

	@Test
	public void testIntersects() {
		fail("Not yet implemented");
	}

	@Test
	public void testAsRect() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testEncodeAsString() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		//return "org.openstreetmap.gwt.tests.BoundsTest";
		return "org.openstreetmap.gwt.GWTOSMJUnit";
		
	}

}
