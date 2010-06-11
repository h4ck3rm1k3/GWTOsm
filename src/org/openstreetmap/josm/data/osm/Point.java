package org.openstreetmap.josm.data.osm;

import org.openstreetmap.model.Yes;

public class Point {

	public long y;
	public long x;

	public Point(int i, int j) {
		// TODO Auto-generated constructor stub
		x=i;
		y=j;
	}

	public Point(Point p) {
		// TODO Auto-generated constructor stub
		x=p.x;
		y=p.y;
	}

	public Point() {
		// TODO Auto-generated constructor stub
	}

	public double distance(Point q2) {
		// TODO Auto-generated method stub
		return 0;
	}

	public double distanceSq(Point b) {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean equals_(Yes constYes) {
		// TODO Auto-generated method stub
		return false;
	}

}
