package org.openstreetmap.josm.data.osm.visitor.paint;

import org.vaadin.gwtgraphics.client.VectorObject;

public class Polygon extends VectorObject{

	//public List<int> ypoints;
	//public List<int> xpoints;
	public int npoints;
	public int[] ypoints;
	public int[] xpoints;

	public Polygon(int[] xpoints2, int[] ypoints2, int npoints2) {
		// TODO Auto-generated constructor stub
	}

	public Polygon() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean contains(Rectangle centeredNBounds) {
		// TODO Auto-generated method stub
		return false;
	}

	public void addPoint(long x, long y) {
		// TODO Auto-generated method stub
		
	}

	public boolean contains(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected Class<? extends VectorObject> getType() {
		// TODO Auto-generated method stub
		return null;
	}

}
