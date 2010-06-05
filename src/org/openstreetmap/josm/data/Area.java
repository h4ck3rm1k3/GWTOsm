package org.openstreetmap.josm.data;


public class Area {
	public Rectangle2DDouble max;
	
	public Area() {
		// TODO Auto-generated constructor stub
	}

	public Area(Rectangle2DDouble asRect) {
		max =asRect;
	}

	public void add(Area area) {
		// TODO Auto-generated method stub
		if (max != null)
		{	
			max.add(area.max);
		}
		else
		{
			max=area.max;
			
		}
		
		
	}

	public Bounds bounds() {
		// TODO Auto-generated method stub
		return new Bounds(max.getMinX(),max.getMinY(),max.getMaxX(),max.getMaxY());
	}

}
