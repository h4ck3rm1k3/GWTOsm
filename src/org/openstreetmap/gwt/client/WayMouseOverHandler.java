package org.openstreetmap.gwt.client;


import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPath;
import org.openstreetmap.josm.data.osm.visitor.paint.GeneralPathWay;
import org.vaadin.gwtgraphics.client.impl.util.SVGUtil;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.MouseOverEvent;
import com.google.gwt.event.dom.client.MouseOverHandler;
import com.google.gwt.user.client.ui.Widget;

public class WayMouseOverHandler implements MouseOverHandler {

	GWTOSM window;
	
	public void onMouseOver(MouseOverEvent event) {
		// TODO Auto-generated method stub
		GeneralPathWay widget = (GeneralPathWay) event.getSource();
		//Widget widget = (Widget) event.getSource();
		
		try 
		{
			//widget.addStyleName("my-mouse-over");
			if (window != null)
			{
				String t1 = "";
				try{
					 GWT.log(widget.toString());
					// GWT.log(widget.getElement().toString());
					
					 t1=widget.theway.getName();
					 
//					 if (widget.getElement().hasAttribute("name"))
//					 {
//						 t1 = widget.getElement().getAttribute("name");
//						 //t1 = widget.getElement().getAttribute("name");
//					 }
					 
					 
				if (t1==null)
				{
						t1="NO NAME";
					
				}
				
				} catch (Exception e)
				{
					GWT.log("no get element",e);
				}
				String t2 = "";//widget.getTitle();
				window.objnameField.setText(t1 + t2);
				
			//	widget.setWidth("3");
			}
			
		}   
	    catch (Exception e)
		{
			GWT.log("mouse over end",e);
		}
	    
	}
	
	public void setwindow(GWTOSM win) {
		// TODO Auto-generated method stub
		window=win;
	}

}
