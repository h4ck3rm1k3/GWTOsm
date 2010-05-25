package org.openstreetmap.josm.data.osm.visitor.paint;

//import java.awt.Component;
//import java.awt.Point;
//import java.awt.Rectangle;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.ProjectionBounds;
import org.openstreetmap.josm.data.coor.CachedLatLon;
import org.openstreetmap.josm.data.coor.EastNorth;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.BBox;
import org.openstreetmap.josm.data.osm.Component;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Point;
import org.openstreetmap.josm.data.osm.Predicate;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.WaySegment;
import org.openstreetmap.josm.data.projection.Mercator;
import org.openstreetmap.josm.data.projection.Projection;

//import com.google.gwt.dev.util.collect.HashSet;
import java.util.HashSet;

public class NavigatableComponent implements INavigatableComponent {

	int height=400;
	int width=400;
	public int getWidth() {
		// TODO Auto-generated method stub
		return width;
	}
	public int getHeight() {
		// TODO Auto-generated method stub
		return height;
	}

	private double scale ;
	protected EastNorth center ;
	private Projection proj;
	private DataSet dataset;
	private double snapDistanceSq;
	public NavigatableComponent(DataSet adataset)
	{
		proj=new Mercator();
		scale = getProjection().getDefaultZoomInPPD();
		center = calculateDefaultCenter();
		setLayout(null);
		this.dataset=adataset;
	}

	private EastNorth calculateDefaultCenter() {
		 Bounds b = proj.getWorldBoundsLatLon();
	        double lat = (b.getMax().lat() + b.getMin().lat())/2;
	        double lon = (b.getMax().lon() + b.getMin().lon())/2;

	        return proj.latlon2eastNorth(new LatLon(lat, lon));
	}
	private void setLayout(Object object) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public EastNorth getCenter() {
		// TODO Auto-generated method stub
		return center;
		
	}

	@Override
	public double getDist100Pixel() {
		// TODO Auto-generated method stub
		 int w = getWidth()/2;
	        int h = getHeight()/2;
	        LatLon ll1 = getLatLon(w-50,h);
	        LatLon ll2 = getLatLon(w+50,h);
	        return ll1.greatCircleDistance(ll2);
	  
	}

	@Override
	public String getDist100PixelText() {
		double dist = getDist100Pixel();
        return dist >= 2000 ? Math.round(dist/100)/10 +" km" : (dist >= 1
                ? Math.round(dist*10)/10 +" m" : "< 1 m");
	}
	 private static int sqr(int a) { return a*a;}
	   
	@Override
	public EastNorth getEastNorth(int x, int y) {
		  return new EastNorth(
	                center.east() + (x - getWidth()/2.0)*scale,
	                center.north() - (y - getHeight()/2.0)*scale);
	}

	@Override
	public LatLon getLatLon(int x, int y) {
		return getProjection().eastNorth2latlon(getEastNorth(x, y));
	}

	@Override
	public Bounds getLatLonBounds(Rectangle r) {
		 // TODO Maybe this should be (optional) method of Projection implementation
        EastNorth p1 = getEastNorth(r.x, r.y);
        EastNorth p2 = getEastNorth(r.x + r.width, r.y + r.height);

        Bounds result = new Bounds(proj.eastNorth2latlon(p1));

        double eastMin = Math.min(p1.east(), p2.east());
        double eastMax = Math.max(p1.east(), p2.east());
        double northMin = Math.min(p1.north(), p2.north());
        double northMax = Math.max(p1.north(), p2.north());
        double deltaEast = (eastMax - eastMin) / 10;
        double deltaNorth = (northMax - northMin) / 10;

        for (int i=0; i < 10; i++) {
            result.extend(proj.eastNorth2latlon(new EastNorth(eastMin + i * deltaEast, northMin)));
            result.extend(proj.eastNorth2latlon(new EastNorth(eastMin + i * deltaEast, northMax)));
            result.extend(proj.eastNorth2latlon(new EastNorth(eastMin, northMin  + i * deltaNorth)));
            result.extend(proj.eastNorth2latlon(new EastNorth(eastMax, northMin  + i * deltaNorth)));
        }

        return result;
	}

	@Override
	public ProjectionBounds getMaxProjectionBounds() {
        Bounds b = getProjection().getWorldBoundsLatLon();
        return new ProjectionBounds(getProjection().latlon2eastNorth(b.getMin()),
                getProjection().latlon2eastNorth(b.getMax()));
	}

	@Override
	public Point getPoint(EastNorth p) {
		if (null == p)
            return new Point();
        double x = (p.east()-center.east())/scale + getWidth()/2;
        double y = (center.north()-p.north())/scale + getHeight()/2;
        return new Point((int)x,(int)y);
	}

	@Override
	public Point getPoint(LatLon latlon) {
		 if (latlon == null)
	            return new Point();
	        else if (latlon.hasCache())
	            return getPoint(((CachedLatLon)latlon).getEastNorth());
	        else
	            return getPoint(getProjection().latlon2eastNorth(latlon));
	}

	@Override
	public Point getPoint(Node n) {
		   return getPoint(n.getEastNorth());
	}

	@Override
	public Projection getProjection() {
		// TODO Auto-generated method stub
		return proj;
	}

	@Override
	public ProjectionBounds getProjectionBounds() {
	    return new ProjectionBounds(
                new EastNorth(
                        center.east() - getWidth()/2.0*scale,
                        center.north() - getHeight()/2.0*scale),
                        new EastNorth(
                                center.east() + getWidth()/2.0*scale,
                                center.north() + getHeight()/2.0*scale));
	}

	@Override
	public Bounds getRealBounds() {
		 return new Bounds(
	                getProjection().eastNorth2latlon(new EastNorth(
	                        center.east() - getWidth()/2.0*scale,
	                        center.north() - getHeight()/2.0*scale)),
	                        getProjection().eastNorth2latlon(new EastNorth(
	                                center.east() + getWidth()/2.0*scale,
	                                center.north() + getHeight()/2.0*scale)));
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
		return "No help";
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

	
	public Component getComp() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<OsmPrimitive> getAllNearest(Point p,
			Predicate<OsmPrimitive> predicate) {
		
		 Collection<OsmPrimitive> nearest = new HashSet<OsmPrimitive>();
	        DataSet ds = getCurrentDataSet();
	        if (ds == null)
	            return null;
	        for (Way w : ds.searchWays(getSnapDistanceBBox(p))) {
	            if (!predicate.evaluate(w))
	                continue;
	            Node lastN = null;
	            for (Node n : w.getNodes()) {
	                if (!predicate.evaluate(n))
	                    continue;
	                if (lastN == null) {
	                    lastN = n;
	                    continue;
	                }
	                Point A = getPoint(lastN);
	                Point B = getPoint(n);
	                double c = A.distanceSq(B);
	                double a = p.distanceSq(B);
	                double b = p.distanceSq(A);
	                double perDist = a - (a - b + c) * (a - b + c) / 4 / c; // perpendicular distance squared
	                if (perDist < snapDistanceSq && a < c + snapDistanceSq && b < c + snapDistanceSq) {
	                    nearest.add(w);
	                    break;
	                }
	                lastN = n;
	            }
	        }
	        for (Node n : ds.searchNodes(getSnapDistanceBBox(p))) {
	            if (n.isUsable()
	                    && getPoint(n).distanceSq(p) < snapDistanceSq) {
	                nearest.add(n);
	            }
	        }
	        return nearest.isEmpty() ? null : nearest;
	}

	private BBox getSnapDistanceBBox(Point p) {
		// TODO Auto-generated method stub
		return null;
	}


	private DataSet getCurrentDataSet() {
		// TODO Auto-generated method stub
		return dataset;
	}


	@Override
	public OsmPrimitive getNearest(Point p, Predicate<OsmPrimitive> predicate) {

		 OsmPrimitive osm = getNearestNode(p, predicate);
	        if (osm == null)
	        {
	            osm = getNearestWay(p, predicate);
	        }
	        return osm;
	}

	@Override
	public Collection<OsmPrimitive> getNearestCollection(Point p,
			Predicate<OsmPrimitive> predicate) {
		 OsmPrimitive osm = getNearest(p, predicate);
	        if (osm == null)
	            return Collections.emptySet();
	        return Collections.singleton(osm);
	}

	@Override
	public Node getNearestNode(Point p, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		 DataSet ds = getCurrentDataSet();
	        if (ds == null)
	            return null;

	        double minDistanceSq = snapDistanceSq;
	        Node minPrimitive = null;
	        for (Node n : ds.searchNodes(getSnapDistanceBBox(p))) {
	            if (! predicate.evaluate(n))
	                continue;
	            Point sp = getPoint(n);
	            double dist = p.distanceSq(sp);
	            if (dist < minDistanceSq) {
	                minDistanceSq = dist;
	                minPrimitive = n;
	            }
	            // when multiple nodes on one point, prefer new or selected nodes
	            else if (dist == minDistanceSq && minPrimitive != null
	                    && ((n.isNew() && ds.isSelected(n))
	                            || (!ds.isSelected(minPrimitive) && (ds.isSelected(n) || n.isNew())))) {
	                minPrimitive = n;
	            }
	        }
	        return minPrimitive;
	}

	@Override
	public Collection<Node> getNearestNodes(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		
		 Collection<Node> nearest = new HashSet<Node>();
	        DataSet ds = getCurrentDataSet();
	        if (ds == null)
	            return null;

	        for (Node n : ds.searchNodes(getSnapDistanceBBox(p))) {
	            if (!predicate.evaluate(n))
	                continue;
	            if (getPoint(n).distanceSq(p) < snapDistanceSq) {
	                nearest.add(n);
	            }
	        }
	        return nearest.isEmpty() ? null : nearest;
	}

	@Override
	public Collection<Node> getNearestNodes(Point p, Collection<Node> ignore,
			Predicate<OsmPrimitive> predicate) {
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
	public Node getNearestNode(Point p) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public Way getNearestWay(Point p) {
		// TODO Auto-generated method stub
		return null;
	}


}
