package org.openstreetmap.josm.data.osm.visitor.paint;

public class Rectangle extends org.vaadin.gwtgraphics.client.shape.Rectangle {

	public int height;
	public int x;
	public int y;
	public int width;

	public Rectangle(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}

	public Rectangle(long l, long m, int width2, int height2) {
		// TODO Auto-generated constructor stub
		super((int)l, (int)m, width2, height2);
	}

	public void grow(int i, int j) {
		// TODO Auto-generated method stub
		
	}

	public int getMinX() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean contains(Rectangle innerBox) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean intersects(Rectangle innerBox) {
		// TODO Auto-generated method stub
		return false;
	}

}
