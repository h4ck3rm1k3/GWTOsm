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
		return data.getNamedItem(string).getNodeValue();
		
//		if (i != null)
//		{
//			com.google.gwt.xml.client.Node v = i.getAttributes().getNamedItem("value");
//			if (v != null)
//			{
//				return v.toString();
//			}
//			else
//			{
//				return i.toString();
//			}
//		}
	//	return null;
			
	}
}
