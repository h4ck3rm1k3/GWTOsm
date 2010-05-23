/**
 * 
 */
package org.openstreetmap.josm.data.osm;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author mdupont
 *
 */
public class QuadBucketsTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#abort(java.lang.String)}.
	 */
	@Test
	public void testAbort() {
		// dont test this
		//QuadBuckets.abort("bye!");

	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#out(java.lang.String)}.
	 */
	@Test
	public void testOut() {
	//	fail("Not yet implemented"); // TODO
		QuadBuckets.out("who needs this?");
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#pout(java.lang.String)}.
	 */
	@Test
	public void testPoutString() {
	//	fail("Not yet implemented"); // TODO
		QuadBuckets q=new QuadBuckets() ;
		q.pout("who needs this?");
		//delete p;
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#pout(java.lang.String, int, int)}.
	 */
	@Test
	public void testPoutStringIntInt() {
		//fail("Not yet implemented"); // TODO
		QuadBuckets q=new QuadBuckets() ;
		q.pout("who needs this?",1,10);
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#QuadBuckets()}.
	 */
	@Test
	public void testQuadBuckets() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#clear()}.
	 */
	@Test
	public void testClear() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#add(org.openstreetmap.josm.data.osm.OsmPrimitive)}.
	 */
	@Test
	public void testAddOsmPrimitive() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#unsupported()}.
	 */
	@Test
	public void testUnsupported() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#retainAll(java.util.Collection)}.
	 */
	@Test
	public void testRetainAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#removeAll(java.util.Collection)}.
	 */
	@Test
	public void testRemoveAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#addAll(java.util.Collection)}.
	 */
	@Test
	public void testAddAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#containsAll(java.util.Collection)}.
	 */
	@Test
	public void testContainsAll() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#remove(java.lang.Object)}.
	 */
	@Test
	public void testRemoveObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#remove(org.openstreetmap.josm.data.osm.OsmPrimitive)}.
	 */
	@Test
	public void testRemoveOsmPrimitive() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#contains(java.lang.Object)}.
	 */
	@Test
	public void testContains() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#toArrayList()}.
	 */
	@Test
	public void testToArrayList() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#toArray()}.
	 */
	@Test
	public void testToArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#toArray(org.openstreetmap.josm.data.osm.OsmPrimitive[])}.
	 */
	@Test
	public void testToArrayOsmPrimitiveArray() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#iterator()}.
	 */
	@Test
	public void testIterator() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#size()}.
	 */
	@Test
	public void testSize() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#isEmpty()}.
	 */
	@Test
	public void testIsEmpty() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#search(org.openstreetmap.josm.data.osm.BBox)}.
	 */
	@Test
	public void testSearch() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#printTree()}.
	 */
	@Test
	public void testPrintTree() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#add(java.lang.Object)}.
	 */
	@Test
	public void testAddObject() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link org.openstreetmap.josm.data.osm.QuadBuckets#toArray(java.lang.Object[])}.
	 */
	@Test
	public void testToArrayObjectArray() {
		fail("Not yet implemented"); // TODO
	}

}
