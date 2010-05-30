package org.openstreetmap.josm.data.osm.visitor.paint;

import org.vaadin.gwtgraphics.client.shape.Path;

public class GeneralPath extends Path {

	public GeneralPath() {
		super(0, 0);
		// TODO Auto-generated constructor stub
	}
	public GeneralPath(int x, int y) {
		super(x, y);
		// TODO Auto-generated constructor stub
	}

	public void moveTo(long x, long y) {
		// TODO Auto-generated method stub
		super.moveTo((int)x,(int) y);
	}

	public void lineTo(long x, long y) {
		// TODO Auto-generated method stub
		super.moveTo((int)x,(int) y);
	}

}
