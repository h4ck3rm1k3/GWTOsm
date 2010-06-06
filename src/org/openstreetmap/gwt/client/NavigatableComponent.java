package org.openstreetmap.gwt.client;

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
import org.openstreetmap.josm.data.projection.Epsg4326;
import org.openstreetmap.josm.data.projection.Mercator;
import org.openstreetmap.josm.data.projection.Projection;

//import com.google.gwt.dev.util.collect.HashSet;
import java.util.HashSet;
import org.openstreetmap.josm.data.osm.Main;
import org.openstreetmap.josm.data.osm.visitor.paint.Rectangle;

import com.google.gwt.core.client.GWT;

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
		//proj=new Mercator();
		proj=Main.proj;
		scale = getProjection().getDefaultZoomInPPD();
		center = calculateDefaultCenter();
		setLayout(null);
		this.dataset=adataset;
	}
	public void setScale(int i)
	{
		scale = i;
		
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
	
	public EastNorth getCenter() {
		// TODO Auto-generated method stub
		return center;
		
	}

	
	public double getDist100Pixel() {
		// TODO Auto-generated method stub
		 int w = getWidth()/2;
	        int h = getHeight()/2;
	        LatLon ll1 = getLatLon(w-50,h);
	        LatLon ll2 = getLatLon(w+50,h);
	        return ll1.greatCircleDistance(ll2);
	  
	}

	
	public String getDist100PixelText() {
		double dist = getDist100Pixel();
        return dist >= 2000 ? Math.round(dist/100)/10 +" km" : (dist >= 1
                ? Math.round(dist*10)/10 +" m" : "< 1 m");
	}
	 private static int sqr(int a) { return a*a;}
	   
	
	public EastNorth getEastNorth(int x, int y) {
		  return new EastNorth(
	                center.east() + (x - getWidth()/2.0)*scale,
	                center.north() - (y - getHeight()/2.0)*scale);
	}

	
	public LatLon getLatLon(int x, int y) {
		return getProjection().eastNorth2latlon(getEastNorth(x, y));
	}

	
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


	public ProjectionBounds getMaxProjectionBounds() {
        Bounds b = getProjection().getWorldBoundsLatLon();
        return new ProjectionBounds(getProjection().latlon2eastNorth(b.getMin()),
                getProjection().latlon2eastNorth(b.getMax()));
	}


	public Point getPoint(EastNorth p) {
		if (null == p)
            return new Point();
        double x = (p.east()-center.east())/scale + getWidth()/2;
        double y = (center.north()-p.north())/scale + getHeight()/2;
       // GWT.log("got x:" + x +" y:" + y);
        return new Point((int)x,(int)y);
	}


	public Point getPoint(LatLon latlon) {
		 if (latlon == null)
	            return new Point();
	        else if (latlon.hasCache())
	            return getPoint(((CachedLatLon)latlon).getEastNorth());
	        else
	            return getPoint(getProjection().latlon2eastNorth(latlon));
	}

	public Point getPoint(Node n) {
		   return getPoint(n.getEastNorth());
	}

	public Projection getProjection() {
		// TODO Auto-generated method stub
		return proj;
	}

	public ProjectionBounds getProjectionBounds() {
	    return new ProjectionBounds(
                new EastNorth(
                        center.east() - getWidth()/2.0*scale,
                        center.north() - getHeight()/2.0*scale),
                        new EastNorth(
                                center.east() + getWidth()/2.0*scale,
                                center.north() + getHeight()/2.0*scale));
	}


	public Bounds getRealBounds() {
		 return new Bounds(
	                getProjection().eastNorth2latlon(new EastNorth(
	                        center.east() - getWidth()/2.0*scale,
	                        center.north() - getHeight()/2.0*scale)),
	                        getProjection().eastNorth2latlon(new EastNorth(
	                                center.east() + getWidth()/2.0*scale,
	                                center.north() + getHeight()/2.0*scale)));
	}


	public int getViewID() {
		// TODO Auto-generated method stub
		return 0;
	}


	public boolean hasZoomRedoEntries() {
		// TODO Auto-generated method stub
		return false;
	}


	public boolean hasZoomUndoEntries() {
		// TODO Auto-generated method stub
		return false;
	}


	public String helpTopic() {
		// TODO Auto-generated method stub
		return "No help";
	}


	public void zoomNext() {
		// TODO Auto-generated method stub
		
	}


	public void zoomPrevious() {
		// TODO Auto-generated method stub
		
	}
	  private void zoomTo(EastNorth newCenter, double newScale) {
	        Bounds b = getProjection().getWorldBoundsLatLon();
	        CachedLatLon cl = new CachedLatLon(newCenter);
	        boolean changed = false;
	        double lat = cl.lat();
	        double lon = cl.lon();
	        if(lat < b.getMin().lat()) {changed = true; lat = b.getMin().lat(); }
	        else if(lat > b.getMax().lat()) {changed = true; lat = b.getMax().lat(); }
	        if(lon < b.getMin().lon()) {changed = true; lon = b.getMin().lon(); }
	        else if(lon > b.getMax().lon()) {changed = true; lon = b.getMax().lon(); }
	        if(changed) {
	            newCenter = new CachedLatLon(lat, lon).getEastNorth();
	        }
	        int width = getWidth()/2;
	        int height = getHeight()/2;
	        LatLon l1 = new LatLon(b.getMin().lat(), lon);
	        LatLon l2 = new LatLon(b.getMax().lat(), lon);
	        EastNorth e1 = getProjection().latlon2eastNorth(l1);
	        EastNorth e2 = getProjection().latlon2eastNorth(l2);
	        double d = e2.north() - e1.north();
	        if(d < height*newScale)
	        {
	            double newScaleH = d/height;
	            e1 = getProjection().latlon2eastNorth(new LatLon(lat, b.getMin().lon()));
	            e2 = getProjection().latlon2eastNorth(new LatLon(lat, b.getMax().lon()));
	            d = e2.east() - e1.east();
	            if(d < width*newScale) {
	                newScale = Math.max(newScaleH, d/width);
	            }
	        }
	        else
	        {
	            d = d/(l1.greatCircleDistance(l2)*height*10);
	            if(newScale < d) {
	                newScale = d;
	            }
	        }

//	        if (!newCenter.equals(center) || (scale != newScale)) {
            //pushZoomUndo(center, scale);
	        center = newCenter;
	        scale = newScale;
//	            zoomNoUndoTo(newCenter, newScale);
//	        }
	    }
	public void zoomTo(EastNorth newCenter) {
		// TODO Auto-generated method stub
		  zoomTo(newCenter, scale);
	}

	
	public void zoomTo(LatLon newCenter) {
		// TODO Auto-generated method stub
		 if(newCenter instanceof CachedLatLon) {
	            zoomTo(((CachedLatLon)newCenter).getEastNorth(), scale);
	        } else {
	            zoomTo(getProjection().latlon2eastNorth(newCenter), scale);
	        }
	}


	
	public void zoomTo(ProjectionBounds box) {
        // -20 to leave some border
        int w = getWidth()-20;
        if (w < 20) {
            w = 20;
        }
        int h = getHeight()-20;
        if (h < 20) {
            h = 20;
        }

        double scaleX = (box.max.east()-box.min.east())/w;
        double scaleY = (box.max.north()-box.min.north())/h;
        double newScale = Math.max(scaleX, scaleY);

        zoomTo(box.getCenter(), newScale);
    }

    public void zoomTo(Bounds box) {
        zoomTo(new ProjectionBounds(getProjection().latlon2eastNorth(box.getMin()),
                getProjection().latlon2eastNorth(box.getMax())));
    }

	 public void zoomToFactor(double x, double y, double factor) {
	        double newScale = scale*factor;
	        // New center position so that point under the mouse pointer stays the same place as it was before zooming
	        // You will get the formula by simplifying this expression: newCenter = oldCenter + mouseCoordinatesInNewZoom - mouseCoordinatesInOldZoom
	        zoomTo(new EastNorth(
	                center.east() - (x - getWidth()/2.0) * (newScale - scale),
	                center.north() + (y - getHeight()/2.0) * (newScale - scale)),
	                newScale);
	    }

	    public void zoomToFactor(EastNorth newCenter, double factor) {
	        zoomTo(newCenter, scale*factor);
	    }

	    public void zoomToFactor(double factor) {
	        zoomTo(center, scale*factor);
	    }
	
	public Component getComp() {
		// TODO Auto-generated method stub
		return null;
	}

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

	public OsmPrimitive getNearest(Point p, Predicate<OsmPrimitive> predicate) {

		 OsmPrimitive osm = getNearestNode(p, predicate);
	        if (osm == null)
	        {
	            osm = getNearestWay(p, predicate);
	        }
	        return osm;
	}

	public Collection<OsmPrimitive> getNearestCollection(Point p,
			Predicate<OsmPrimitive> predicate) {
		 OsmPrimitive osm = getNearest(p, predicate);
	        if (osm == null)
	            return Collections.emptySet();
	        return Collections.singleton(osm);
	}

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

	public Collection<Node> getNearestNodes(Point p, Collection<Node> ignore,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Way getNearestWay(Point p, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public WaySegment getNearestWaySegment(Point p,
			Collection<WaySegment> ignore, Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public WaySegment getNearestWaySegment(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<WaySegment> getNearestWaySegments(Point p,
			Predicate<OsmPrimitive> predicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNearestNode(Point p) {
		// TODO Auto-generated method stub
		return null;
	}

	public Way getNearestWay(Point p) {
		// TODO Auto-generated method stub
		return null;
	}


}
