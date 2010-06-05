package org.openstreetmap.gwt.client;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;

public class WayClickHandler implements ClickHandler {

	@Override
	public void onClick(ClickEvent event) {
		String href = event.getRelativeElement().getAttribute("href");
		if (href != null)
		{
			Window.open(href, "osm window", "");
		}
		
	}
	GWTOSM window;
	public void setwindow(GWTOSM win) {
		// TODO Auto-generated method stub
		window=win;
	}

}
