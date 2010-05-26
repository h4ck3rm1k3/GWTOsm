package org.openstreetmap.gwt.client;
import com.google.gwt.core.client.GWT;
import com.google.gwt.resources.client.ClientBundle;
import com.google.gwt.resources.client.TextResource;


public interface OSMXMLData extends ClientBundle {
	public static final OSMXMLData INSTANCE =  GWT.create(OSMXMLData.class);

	@Source("Testdata.osm")
	  public TextResource osmData();

}
