package org.openstreetmap.gwt.tests;

import static org.junit.Assert.*;
import com.google.gwt.junit.client.GWTTestCase;

import org.junit.Test;
import org.openstreetmap.josm.data.coor.CoordinateFormat;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;

import com.google.gwt.core.client.GWT;
public class LatLonTest extends GWTTestCase{

	@Test
	public void testHashCode() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValidLat() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsValidLon() {
		fail("Not yet implemented");
	}

	@Test
	public void testDms() {
		fail("Not yet implemented");
	}

	@Test
	public void testLatLonDoubleDouble() {
		//fail("Not yet implemented");
		LatLon pos = new LatLon(1, 2);
		String s = pos.toString();
		GWT.log(s);
		System.out.println(s);
		assertTrue(pos.getX()==2.0);
	
	}

	@Test
	public void testLatLonLatLon() {
		//fail("Not yet implemented");
		LatLon pos = new LatLon(1, 2);
		String s = pos.toString();
		GWT.log(s);
		System.out.println(s);
		assertTrue(pos.getX()==2.0);
		
		LatLon pos2 = new LatLon(pos);
		assertTrue(pos2.getX()==2.0);
		
		s = pos.toString();
		GWT.log(s);
		System.out.println(s);
	}

	@Test
	public void testLatLonNode() {
	//	fail("Not yet implemented");
	    LatLon pos = new LatLon(1, 2);
	    Node n = new Node(pos );
	    
	    LatLon pos2= new LatLon(n);
		assertTrue(pos2.getX()==2.0);
	}

	@Test
	public void testLat() {
		//fail("Not yet implemented");
		 LatLon pos = new LatLon(1, 2);
		assertTrue(pos.lat() ==1.0);
	}

	@Test
	public void testLatToString() {
		//fail("Not yet implemented");
		LatLon pos = new LatLon(1, 2);
		assertTrue(pos.lat() ==1.0);		
		CoordinateFormat d=CoordinateFormat.DECIMAL_DEGREES;
		String s = pos.latToString(d);
		System.out.println(s);
		assertTrue(s.equalsIgnoreCase("formatted string 1.0"));
	}

	@Test
	public void testLon() {
			 LatLon pos = new LatLon(1, 2);
			assertTrue(pos.lon() ==2.0);
	}

	@Test
	public void testLonToString() {
		LatLon pos = new LatLon(1, 2);
		assertTrue(pos.lat() ==1.0);		
		CoordinateFormat d=CoordinateFormat.DECIMAL_DEGREES;
		String s = pos.lonToString(d);
		System.out.println(s);
		assertTrue(s.equalsIgnoreCase("formatted string 2.0"));
	}

	@Test
	public void testEqualsEpsilon() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsOutSideWorld() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsWithin() {
		fail("Not yet implemented");
	}

	@Test
	public void testGreatCircleDistance() {
		fail("Not yet implemented");
	}

	@Test
	public void testHeading() {
		fail("Not yet implemented");
	}

	@Test
	public void testToDisplayString() {
		fail("Not yet implemented");
	}

	@Test
	public void testInterpolate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCenter() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetRoundedToOsmPrecision() {
		fail("Not yet implemented");
	}

	@Test
	public void testCoordinate() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetX() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetY() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetLocation() {
		fail("Not yet implemented");
	}

	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		return "org.openstreetmap.gwt.GWTOSMJUnit";
	}

}
