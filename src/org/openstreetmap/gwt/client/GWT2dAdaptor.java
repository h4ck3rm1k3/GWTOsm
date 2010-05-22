package org.openstreetmap.gwt.client;

import org.openstreetmap.gwt.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
//import com.google.gwt.widgetideas.graphics.client.GWTCanvas;
import org.vaadin.gwtgraphics.client.DrawingArea;
import org.vaadin.gwtgraphics.client.animation.Animate;
import org.vaadin.gwtgraphics.client.shape.Circle;
import org.vaadin.gwtgraphics.client.shape.Path;
import org.vaadin.gwtgraphics.client.shape.Text;
import org.vaadin.gwtgraphics.client.shape.Rectangle;
import org.vaadin.gwtgraphics.client.shape.path.LineTo;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWT2dAdaptor  {

    private DrawingArea canvas;

  /**
   * This is the entry point method.
   */
    public void drawString(String t, int x, int y) {
    
	Text o = new Text(x, y, t);
	//	circle.setFillColor(fillColors[i]);
	//  circle.setFillOpacity(0.5);
	//  circle.addClickHandler(handler);
	canvas.add(o);
    }
    
    public GWT2dAdaptor(VerticalPanel parent) {
	canvas = new DrawingArea(400,400);
	parent.add(canvas);   
    }
}
