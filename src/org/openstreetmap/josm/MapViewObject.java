package org.openstreetmap.josm;

import java.awt.Cursor;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.util.Collection;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.coor.EastNorth;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.tools.Predicate;

public class MapViewObject {

	public Object lastMEvent;
	public PlayHeadMarker playHeadMarker;

	public EastNorth getCenter() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getAllLayersAsList() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean hasZoomUndoEntries() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean hasLayer(OsmDataLayer layer) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addMouseListener(ExtrudeAction extrudeAction) {
		// TODO Auto-generated method stub
		
	}

	public void addMouseListener(MouseAdapter mouseAdapter) {
		// TODO Auto-generated method stub
		
	}

	public void addMouseListener(DeleteAction deleteAction) {
		// TODO Auto-generated method stub
		
	}

	public void addMouseMotionListener(DeleteAction deleteAction) {
		// TODO Auto-generated method stub
		
	}

	public BoundsObject getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addMouseListener(SelectAction selectAction) {
		// TODO Auto-generated method stub
		
	}

	public Layer getActiveLayer() {
		// TODO Auto-generated method stub
		return null;
	}

	public EastNorth getEastNorth(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

	public OsmDataLayer getEditLayer() {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<Node> getNearestNodes(Point point,
			Collection<Node> affectedNodes,
			Predicate<OsmPrimitive> isSelectablePredicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public Collection<OsmDataLayer> getAllLayers() {
		// TODO Auto-generated method stub
		return null;
	}

	public Node getNearestNode(Point mousePos,
			Predicate<OsmPrimitive> isSelectablePredicate) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addPropertyChangeListener(GeoImageLayer layer) {
		// TODO Auto-generated method stub
		
	}

	public void addMouseListener(DrawAction drawAction) {
		// TODO Auto-generated method stub
		
	}

	public boolean hasZoomRedoEntries() {
		// TODO Auto-generated method stub
		return false;
	}

	public void zoomToFactor(double d) {
		// TODO Auto-generated method stub
		
	}

	public Cursor getCursor() {
		// TODO Auto-generated method stub
		return null;
	}

	public void addTemporaryLayer(DrawAction drawAction) {
		// TODO Auto-generated method stub
		
	}

	public void addMouseMotionListener(SelectAction selectAction) {
		// TODO Auto-generated method stub
		
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean hasLayers() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isActiveLayerVisible() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isActiveLayerDrawable() {
		// TODO Auto-generated method stub
		return false;
	}

	public void addMouseMotionListener(DrawAction drawAction) {
		// TODO Auto-generated method stub
		
	}

	public Bounds getLatLonBounds(BoundsObject bounds) {
		// TODO Auto-generated method stub
		return null;
	}

	public Object getPoint(EastNorth intersection) {
		// TODO Auto-generated method stub
		return null;
	}

	public void addTemporaryLayer(ExtrudeAction extrudeAction) {
		// TODO Auto-generated method stub
		
	}

}
