package org.openstreetmap.josm.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.visitor.paint.GwtGraphics2DTest;
import org.openstreetmap.josm.data.osm.visitor.paint.IGwtGraphics2D;
import org.openstreetmap.josm.data.osm.visitor.paint.INavigatableComponent;
import org.openstreetmap.josm.data.osm.visitor.paint.MapPaintVisitor;
import org.openstreetmap.josm.data.osm.visitor.paint.NavigatableComponent;
import com.google.gwt.junit.client.GWTTestCase;
public class MapPaintVisitorTest extends GWTTestCase{
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}



	@Test
	public void testIsZoomOk() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrimitiveStyle() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPrimitiveNodeStyle() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPrimitiveArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawNode() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawWay() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawSelectedMember() {
		fail("Not yet implemented");
	}

	@Test
	public void testPaintUnselectedRelation() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawRestriction() {
		fail("Not yet implemented");
	}

	@Test
	public void testDrawMultipolygon() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsPolygonVisible() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetPolygon() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCentroid() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetArea() {
		fail("Not yet implemented");
	}

	@Test
	public void testSelectedLast() {
		fail("Not yet implemented");
	}

	
	 public void drawmap() {
	      
	       try {     
	    	   IGwtGraphics2D g=new GwtGraphics2DTest();
	    	   DataSet data = new DataSet();
	    	   INavigatableComponent nc = new NavigatableComponent(data );
	    	   MapPaintVisitor painter = new MapPaintVisitor (nc);
	    	   painter .setGraphics(g);
		   boolean virtual=false;

		   
		   

			OsmPrimitive primitive = new Node(new LatLon(1,2));
			data.addPrimitive(primitive );
		 	Bounds bounds= new Bounds(-180,-90, 180,90);
		 	//x: -180.0 -> 180.0, y: -90.0 -> 90.0
		 	
		 	
		 	
		   painter.visitAll(data, virtual, bounds);
	       }
	       catch (Exception e)
		   {
		       
		   }
	  }
	 
	 
	@Test
	public void testVisitAll() {
		//fail("Not yet implemented");
		 try {
				DataSet data=new DataSet();
				INavigatableComponent nc = new NavigatableComponent(data); 
			 	MapPaintVisitor painter=new MapPaintVisitor(nc);
			 
			 	IGwtGraphics2D g=new GwtGraphics2DTest();
			 	//IGwtGraphics2D g=new GwtGraphics2D();
				painter.setGraphics(g);
			 
				//String xml="";
				OsmPrimitive primitive = new Node(new LatLon(1,2));
				data.addPrimitive(primitive );
			 	Bounds bounds= new Bounds(-180,-90, 180,90);
			 	//x: -180.0 -> 180.0, y: -90.0 -> 90.0
			 	
			 	boolean virtual=false;
			 	painter.visitAll(data, virtual, bounds);
		       }
		       catch (Exception e)
			   {
		    	   fail(e.toString());
			   }
		       drawmap(); 
	}

	@Test
	public void testPutError() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetGraphics() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetInactive() {
		fail("Not yet implemented");
	}

	@Test
	public void testSetNavigatableComponent() {
		fail("Not yet implemented");
	}

	@Override
	public String getModuleName() {
		// TODO Auto-generated method stub
		return "org.openstreetmap.gwt.GWTOSM";
	}

}
