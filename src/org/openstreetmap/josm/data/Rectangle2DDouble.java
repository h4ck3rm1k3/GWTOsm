package org.openstreetmap.josm.data;



public class Rectangle2DDouble {
//19.503809999999998,42.06783 , 19.509729999999998,42.07183
	public Rectangle2DDouble(double minLon, double minLat, double maxLon, double maxLat) {
		nx=minLon;
		mx=maxLon;
		
		ny=minLat;
		my=maxLat;
		
	}
	private double ny;
	private double my;
	private double nx;
	private double mx;
	
	public double getWidth() {
		// TODO Auto-generated method stub
		return mx-nx;
	}

	public double getHeight() {
		// TODO Auto-generated method stub
		return my-ny;
	}

	public double getMinX() {
		// TODO Auto-generated method stub
		return nx;
	}

	public double getY() {
		// TODO Auto-generated method stub
		return ny;
	}

	public double getMaxY() {
		// TODO Auto-generated method stub
		return my;
	}

	public double getMaxX() {
		// TODO Auto-generated method stub
		return mx;
	}

	public double getMinY() {
		// TODO Auto-generated method stub
		return ny;
	}

	public void add(Rectangle2DDouble max) {
		if (max.nx < nx)
		{
			nx =	max.nx;		
		}	
		if (max.ny < ny)
		{
			ny =	max.ny;		
		}
		
		if (max.mx > mx)
		{
			mx =	max.mx;		
		}	
		if (max.my > my)
		{
			my =	max.my;		
		}
		
	}
}
