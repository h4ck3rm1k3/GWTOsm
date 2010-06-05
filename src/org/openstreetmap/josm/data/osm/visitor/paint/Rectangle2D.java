package org.openstreetmap.josm.data.osm.visitor.paint;

public class Rectangle2D  {

	private int ny;
	private int my;
	private int nx;
	private int mx;
	
	public int getWidth() {
		// TODO Auto-generated method stub
		return mx-nx;
	}

	public int getHeight() {
		// TODO Auto-generated method stub
		return my-ny;
	}

	public int getMinX() {
		// TODO Auto-generated method stub
		return nx;
	}

	public int getY() {
		// TODO Auto-generated method stub
		return ny;
	}

	public int getMaxY() {
		// TODO Auto-generated method stub
		return my;
	}

	public int getMaxX() {
		// TODO Auto-generated method stub
		return mx;
	}

	public int getMinY() {
		// TODO Auto-generated method stub
		return ny;
	}

}
