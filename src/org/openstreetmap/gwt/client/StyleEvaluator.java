package org.openstreetmap.gwt.client;

import org.openstreetmap.josm.data.osm.OsmPrimitiveWrapper;

public abstract class StyleEvaluator 
{

	abstract void ProcessStyle (OsmPrimitiveWrapper obj);
	

	protected boolean Filter(Object concat) {
		// TODO Auto-generated method stub
		return false;
	}

	protected Object Concat(Object or, Object and) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Or(Object concat) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Concat(Object and) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object And(Object not) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Not(Object parens) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Parens(Object condition) {
		// TODO Auto-generated method stub
		return null;
	}

	protected Object Condition(boolean equals) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
