package org.openstreetmap.gwt.client;

import org.openstreetmap.josm.data.osm.Node;

import com.google.gwt.xml.client.NamedNodeMap;

public class Attributes {
	com.google.gwt.xml.client.Node node;
	NamedNodeMap data;
	Attributes(NamedNodeMap d)
	{
		data=d;
		
	}
	public Attributes(com.google.gwt.xml.client.Node node) {
		// TODO Auto-generated constructor stub
		data=node.getAttributes();
		this.node = node;
	}
	
	public String getValue(String string) {
		// TODO Auto-generated method stub
		com.google.gwt.xml.client.Node i = data.getNamedItem(string);
		if (i != null)
		{
			return i.toString();
		}
		return null;
			
	}
}
