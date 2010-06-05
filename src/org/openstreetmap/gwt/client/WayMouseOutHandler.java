package org.openstreetmap.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.MouseOutEvent;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.user.client.ui.Widget;

public class WayMouseOutHandler implements MouseOutHandler {

	@Override
	public void onMouseOut(MouseOutEvent event) {
		
		try {
		  Widget widget = (Widget) event.getSource();
		 //   widget.removeStyleName("my-mouse-over");
	//	 widget.setWidth("1");
		  window.objnameField.setText("NOTHING SELECTED");
		}
		catch (Exception e)
		{
			GWT.log("mouse over end",e);
		}

	}

	GWTOSM window;
	public void setwindow(GWTOSM win) {
		// TODO Auto-generated method stub
		window=win;
	}

}
