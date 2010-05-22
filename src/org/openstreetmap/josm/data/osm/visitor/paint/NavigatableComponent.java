package org.openstreetmap.josm.data.osm.visitor.paint;

import java.awt.Component;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.Collection;
import java.util.List;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.ProjectionBounds;
import org.openstreetmap.josm.data.coor.EastNorth;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.WaySegment;
import org.openstreetmap.josm.data.projection.Projection;
import org.openstreetmap.josm.tools.Predicate;

public class NavigatableComponent implements INavigatableComponent {

	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Collection<OsmPrimitive> getAllNearest(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EastNorth getCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double getDist100Pixel() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getDist100PixelText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EastNorth getEastNorth(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LatLon getLatLon(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bounds getLatLonBounds(Rectangle r) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectionBounds getMaxProjectionBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OsmPrimitive getNearest(Point p, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<OsmPrimitive> getNearestCollection(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getNearestNode(Point p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Node getNearestNode(Point p, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Node> getNearestNodes(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Node> getNearestNodes(Point p, Collection<Node> ignore,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Way getNearestWay(Point p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Way getNearestWay(Point p, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WaySegment getNearestWaySegment(Point p,
			Collection<WaySegment> ignore, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WaySegment getNearestWaySegment(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<WaySegment> getNearestWaySegments(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPoint(EastNorth p) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPoint(LatLon latlon) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Point getPoint(Node n) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Projection getProjection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectionBounds getProjectionBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Bounds getRealBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getViewID() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean hasZoomRedoEntries() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean hasZoomUndoEntries() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String helpTopic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void zoomNext() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomPrevious() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomTo(EastNorth newCenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomTo(LatLon newCenter) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomTo(ProjectionBounds box) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomTo(Bounds box) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomToFactor(double x, double y, double factor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomToFactor(EastNorth newCenter, double factor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void zoomToFactor(double factor) {
		// TODO Auto-generated method stub
		
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Component getComp() {
		// TODO Auto-generated method stub
		return null;
	}

}
