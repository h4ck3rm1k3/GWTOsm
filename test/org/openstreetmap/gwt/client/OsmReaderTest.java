package org.openstreetmap.gwt.client;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.ProgressMonitor;

import com.google.gwt.junit.client.GWTTestCase;

public class OsmReaderTest extends GWTTestCase{

	public String getModuleName() {
		// TODO Auto-generated method stub
		//return "org.openstreetmap.gwt.tests.DataSetTest";
		return "org.openstreetmap.gwt.GWTOSMJUnit";
	}
	
	@Test
	public void testGetDataSet() {
		fail("Not yet implemented");
	}

	@Test
	public void testOsmReader() {
		//fail("Not yet implemented");
		String fakerequest=OSMXMLData.INSTANCE.osmData().getText();
		ProgressMonitor pm=new ProgressMonitor();
		DataSet ds;
		try {
			ds = OsmReader.parseDataSet(fakerequest, pm);
			ds.print();
		} catch (IllegalDataException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void testProcessWaysAfterParsing() {
		fail("Not yet implemented");
	}

	@Test
	public void testParserelations() {
		fail("Not yet implemented");
	}

	@Test
	public void testParseways() {
		fail("Not yet implemented");
	}

	@Test
	public void testProcessNodesAfterParsing() {
		fail("Not yet implemented");
	}

	@Test
	public void testParseDataSet() {
		fail("Not yet implemented");
	}

}
