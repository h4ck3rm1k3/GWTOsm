package org.openstreetmap.josm.data.osm.visitor.paint;


////import java.awt.Component;
////import java.awt.Point;
////import java.awt.Rectangle;
import java.util.Collection;
import java.util.List;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.ProjectionBounds;
import org.openstreetmap.josm.data.coor.EastNorth;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.Component;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Point;
import org.openstreetmap.josm.data.osm.Predicate;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.WaySegment;
import org.openstreetmap.josm.data.projection.Projection;

public interface INavigatableComponent {

	public static final int snapDistance = 10; // Main.pref.getInteger("node.snap-distance", );
	//public static final int snapDistanceSq = sqr(snapDistance);

	public abstract String getDist100PixelText();

	//public abstract static int sqr(int snapdistance2);

	public abstract double getDist100Pixel();

	/**
	 * @return Returns the center point. A copy is returned, so users cannot
	 *      change the center by accessing the return value. Use zoomTo instead.
	 */
	public abstract EastNorth getCenter();

	/**
	 * @param x X-Pixelposition to get coordinate from
	 * @param y Y-Pixelposition to get coordinate from
	 *
	 * @return Geographic coordinates from a specific pixel coordination
	 *      on the screen.
	 */
	public abstract EastNorth getEastNorth(int x, int y);

	public abstract ProjectionBounds getProjectionBounds();

	/* FIXME: replace with better method - used by MapSlider */
	public abstract ProjectionBounds getMaxProjectionBounds();

	/* FIXME: replace with better method - used by Main to reset Bounds when projection changes, don't use otherwise */
	public abstract Bounds getRealBounds();

	/**
	 * @param x X-Pixelposition to get coordinate from
	 * @param y Y-Pixelposition to get coordinate from
	 *
	 * @return Geographic unprojected coordinates from a specific pixel coordination
	 *      on the screen.
	 */
	public abstract LatLon getLatLon(int x, int y);

	/**
	 * @param r
	 * @return Minimum bounds that will cover rectangle
	 */
	public abstract Bounds getLatLonBounds(Rectangle r);

	/**
	 * Return the point on the screen where this Coordinate would be.
	 * @param p The point, where this geopoint would be drawn.
	 * @return The point on screen where "point" would be drawn, relative
	 *      to the own top/left.
	 */
	public abstract Point getPoint(EastNorth p);

	public abstract Point getPoint(LatLon latlon);

	public abstract Point getPoint(Node n);

	public abstract void zoomTo(EastNorth newCenter);

	public abstract void zoomTo(LatLon newCenter);

	public abstract void zoomToFactor(double x, double y, double factor);

	public abstract void zoomToFactor(EastNorth newCenter, double factor);

	public abstract void zoomToFactor(double factor);

	public abstract void zoomTo(ProjectionBounds box);

	public abstract void zoomTo(Bounds box);

	public abstract void zoomPrevious();

	public abstract void zoomNext();

	public abstract boolean hasZoomUndoEntries();

	public abstract boolean hasZoomRedoEntries();

	@Deprecated
	public abstract Node getNearestNode(Point p);

	/**
	 * Return the nearest node to the screen point given.
	 * If more then one node within snapDistance pixel is found,
	 * the nearest node is returned.
	 * @param p the screen point
	 * @param predicate this parameter imposes a condition on the returned object, e.g.
	 *        give the nearest node that is tagged.
	 */
	public abstract Node getNearestNode(Point p,
			Predicate<OsmPrimitive> predicate);

	/**
	 * @return all way segments within 10px of p, sorted by their
	 * perpendicular distance.
	 *
	 * @param p the point for which to search the nearest segment.
	 * @param predicate the returned objects have to fulfill certain properties.
	 */
	public abstract List<WaySegment> getNearestWaySegments(Point p,
			Predicate<OsmPrimitive> predicate);

	/**
	 * @return the nearest way segment to the screen point given that is not
	 * in ignore.
	 *
	 * @param p the point for which to search the nearest segment.
	 * @param ignore a collection of segments which are not to be returned.
	 * @param predicate the returned object has to fulfill certain properties.
	 * May be null.
	 */
	public abstract WaySegment getNearestWaySegment(Point p,
			Collection<WaySegment> ignore, Predicate<OsmPrimitive> predicate);

	/**
	 * @return the nearest way segment to the screen point given.
	 */
	public abstract WaySegment getNearestWaySegment(Point p,
			Predicate<OsmPrimitive> predicate);

	@Deprecated
	public abstract Way getNearestWay(Point p);

	/**
	 * @return the nearest way to the screen point given.
	 */
	public abstract Way getNearestWay(Point p, Predicate<OsmPrimitive> predicate);

	/**
	 * Return the object, that is nearest to the given screen point.
	 *
	 * First, a node will be searched. If a node within 10 pixel is found, the
	 * nearest node is returned.
	 *
	 * If no node is found, search for near ways.
	 *
	 * If nothing is found, return <code>null</code>.
	 *
	 * @param p The point on screen.
	 * @param predicate the returned object has to fulfill certain properties.
	 * @return  The primitive that is nearest to the point p.
	 */
	public abstract OsmPrimitive getNearest(Point p,
			Predicate<OsmPrimitive> predicate);

	/**
	 * Returns a singleton of the nearest object, or else an empty collection.
	 */
	public abstract Collection<OsmPrimitive> getNearestCollection(Point p,
			Predicate<OsmPrimitive> predicate);

	/**
	 * @return A list of all objects that are nearest to
	 * the mouse.
	 *
	 * @return A collection of all items or <code>null</code>
	 *      if no item under or near the point. The returned
	 *      list is never empty.
	 */
//	public abstract Collection<OsmPrimitive> getAllNearest(Point p,
//			Predicate<OsmPrimitive> predicate);

	/**
	 * @return A list of all nodes that are nearest to
	 * the mouse.
	 *
	 * @return A collection of all nodes or <code>null</code>
	 *      if no node under or near the point. The returned
	 *      list is never empty.
	 */
	public abstract Collection<Node> getNearestNodes(Point p,
			Predicate<OsmPrimitive> predicate);

	/**
	 * @return the nearest nodes to the screen point given that is not
	 * in ignore.
	 *
	 * @param p the point for which to search the nearest segment.
	 * @param ignore a collection of nodes which are not to be returned.
	 * @param predicate the returned objects have to fulfill certain properties.
	 * May be null.
	 */
	public abstract Collection<Node> getNearestNodes(Point p,
			Collection<Node> ignore, Predicate<OsmPrimitive> predicate);

	/**
	 * @return The projection to be used in calculating stuff.
	 */
	public abstract Projection getProjection();

	public abstract String helpTopic();

	/**
	 * Return a ID which is unique as long as viewport dimensions are the same
	 */
	public abstract int getViewID();

	public abstract int getHeight();

	public abstract int getWidth();

	public abstract Component getComp();

	Collection<OsmPrimitive> getAllNearest(Point p,
			Predicate<OsmPrimitive> predicate);

}