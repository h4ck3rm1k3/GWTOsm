package org.openstreetmap.gwt.client;

import org.openstreetmap.gwt.shared.FieldVerifier;
import org.openstreetmap.josm.data.Area;
import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.ProgressMonitor;
import org.openstreetmap.josm.data.osm.visitor.paint.MapPaintVisitor;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestBuilder;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.Widget;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class GWTOSM implements EntryPoint {

    // the canvas!
    //    private GWTCanvas canvas;
    private IGwtGraphics2DSimple canvas;
    MapPaintVisitor painter;
  /**
   * The message displayed to the user when the server cannot be reached or
   * returns an error.
   */
  private static final String SERVER_ERROR = "An error occurred while "
      + "attempting to contact the server. Please check your network "
      + "connection and try again.";

  /**
   * Create a remote service proxy to talk to the server-side Greeting service.
   */
  private final GreetingServiceAsync greetingService = GWT.create(GreetingService.class);
  private DataSet data= new DataSet();

  /**
   * This is the entry point method.
 * @param zoom 
   */
  	private INavigatableComponent nc ;
    private Bounds bounds;
	private String dataUrl;
	   final TextBox mx = new TextBox();
	   final Label mxLabel = new Label();
	    final TextBox my = new TextBox();
	    final Label myLabel = new Label();
	    final TextBox nx = new TextBox();
	    final Label nxLabel = new Label();
	    final TextBox ny = new TextBox();
	    final Label nyLabel = new Label();
    void preparenc()
    {
    	nc = new NavigatableComponent(data );

    	// this is taked from the url now, dont need to set them
		bounds= new Bounds(41,19,42,20);
		dataUrl="http://api.openstreetmap.org/api/0.6/map?bbox=19.50381,42.06783,19.50973,42.07183";

	   
    }
    
    
  public void drawmap(double zoom) {

       try {     
    	   
    	  // data = new DataSet();
    	   GWT.log("going to render at zoom" + zoom + "and bounds " + bounds.toString());
    	   nc.zoomToFactor(zoom);
    	   painter=new MapPaintVisitor (nc);
    	   canvas.clear();
    	   painter.setGraphics(canvas);
    	   boolean virtual=false;
    	
    	   painter.setwindow(this);
    	   painter.visitAll(data, virtual, bounds);
       }
       catch (Exception e)
	   {
	       GWT.log("exception!"  + e.toString());
	   }
  }

	public void renderXML(String text) {
		try {
			ProgressMonitor pm=new ProgressMonitor();
			DataSet ds=	OsmReader.parseDataSet(text, pm);
			
		data.merge(ds);
		
		try{
		Area a = data.getDataSourceArea();
		bounds = a.bounds();
		
		GWT.log("check bounds" + bounds.toString());
		
		nc.zoomTo(bounds);
		GWT.log("Projection bounds"  + nc.getProjectionBounds().toString());
		GWT.log("Real bounds"  + nc.getRealBounds().toString());
		
		  
	    mx.setText("" + bounds.getMax().getX());
	    my.setText("" +bounds.getMax().getY());
	    nx.setText("" +bounds.getMin().getX());
	    ny.setText("" +bounds.getMin().getY());
		}
		catch (Exception r)
		{
			GWT.log("cannot set area", r);			
		}
		
		} catch (IllegalDataException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}
	
  
  private void requestFailed(Throwable exception) {

	
}

  private TextBox zoomField ;
  public TextBox objnameField ;// the name of the current items
  
  private double dZoom;
  private Label nameLabel= new Label("Name:");
  private Label zoomLabel= new Label("Zoom Factor (inverse)");
  public void onModuleLoad() {
	  	dZoom=1;
	  	final Button sendButton = new Button("Send");
    final TextBox nameField = new TextBox();
    
    nameField .setVisibleLength(50);
    
    objnameField = new TextBox();
    final Label errorLabel = new Label();
    
    zoomField = new TextBox();
    zoomField.setText("1");
    
    myLabel.setText("Maximum Y Latitude:");
    nyLabel.setText("Minimum Y Latitude:");
    
    mxLabel.setText("Maximum X Longitude:");
    nxLabel.setText("Minimum X Longitude:");
    
    
    try
	{
	    preparenc();
	    nameField.setText(dataUrl);  
	}
    catch (Exception e)
	{
    	GWT.log(e.getMessage());
	}
    // We can add style names to widgets
    sendButton.addStyleName("sendButton");

    // Add the nameField and sendButton to the RootPanel
    // Use RootPanel.get() to get the entire body element
    final Label uriLabel = new Label();
    
    RootPanel.get("nameFieldContainer").add(uriLabel); 
    RootPanel.get("nameFieldContainer").add(nameField);
    
    RootPanel.get("nameFieldContainer").add(zoomLabel);
    RootPanel.get("nameFieldContainer").add(zoomField);
    RootPanel.get("sendButtonContainer").add(sendButton);
    RootPanel.get("errorLabelContainer").add(errorLabel);

    // Focus the cursor on the name field when the app loads
    nameField.setFocus(true);
    nameField.selectAll();

    // Create the popup dialog box
    final DialogBox dialogBox = new DialogBox();
    dialogBox.setText("Remote Procedure Call");
    dialogBox.setAnimationEnabled(true);
    final Button closeButton = new Button("Close");
    // We can set the id of a widget by accessing its Element
    closeButton.getElement().setId("closeButton");
    final Label textToServerLabel = new Label();
    final HTML serverResponseLabel = new HTML();
    VerticalPanel dialogVPanel = new VerticalPanel();
    dialogVPanel.addStyleName("dialogVPanel");
    
//    final Button getButton = new Button("get osm data");
    
    final TextBox zoomField2 = new TextBox();
    
 
    mx.setText("" + bounds.getMax().getX());
    my.setText("" +bounds.getMax().getY());
    nx.setText("" +bounds.getMin().getX());
    ny.setText("" +bounds.getMin().getY());
    
    ChangeHandler bboxch = new ChangeHandler()
	{
		public void onChange(ChangeEvent event)
		{
			LatLon min,  max;
			min= new LatLon (Double.parseDouble(ny.getText()),Double.parseDouble(nx.getText()));
			max= new LatLon (Double.parseDouble(my.getText()),Double.parseDouble(mx.getText()));
			bounds = new Bounds (min,max);
			nc.zoomTo(bounds);
			dZoom=1;
			drawmap(dZoom);
		}
	};
	mx.addChangeHandler(bboxch);
	my.addChangeHandler(bboxch);
	nx.addChangeHandler(bboxch);
	ny.addChangeHandler(bboxch);
	
	// put the name in first
	dialogVPanel.add(nameLabel);
	dialogVPanel.add(objnameField);
	objnameField.setVisibleLength(150);
	//objnameField.setMaxLength(150);
	
	dialogVPanel.add(mxLabel);
	dialogVPanel.add(mx);
	
	dialogVPanel.add(myLabel);
	dialogVPanel.add(my);
	
	dialogVPanel.add(nxLabel);
	dialogVPanel.add(nx);
	
	dialogVPanel.add(nyLabel);
	dialogVPanel.add(ny);
	
	
	
	
	
	
	
	
	zoomField2.addChangeHandler(new ChangeHandler()
	{
		public void onChange(ChangeEvent event)
		{
			 dZoom = Double.parseDouble(zoomField2.getText());
			 drawmap(dZoom);
		}
		}
	);
    zoomField2.setText("1");
    dialogVPanel.add(zoomLabel);
    dialogVPanel.add(zoomField2);
    dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_RIGHT);


    canvas = new GWTGraphics2D(600,300);
    
    dialogVPanel.add(canvas.getDrawingArea());
    /*drawmap();*/

    dialogVPanel.add(closeButton);
//    dialogVPanel.add(getButton);
    dialogBox.setWidget(dialogVPanel);

    // Add a handler to close the DialogBox
    closeButton.addClickHandler(new ClickHandler() {
      public void onClick(ClickEvent event) {
        dialogBox.hide();
        sendButton.setEnabled(true);
        sendButton.setFocus(true);
      }
    });

   
    
    // Create a handler for the sendButton and nameField
    class MyHandler implements ClickHandler, KeyUpHandler {
      /**
       * Fired when the user clicks on the sendButton.
       */
      public void onClick(ClickEvent event) {
        sendNameToServer();
      }

      /**
       * Fired when the user types in the nameField.
       */
      public void onKeyUp(KeyUpEvent event) {
        if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
          sendNameToServer();
        }
      }

      /**
       * Send the name from the nameField to the server and wait for a response.
       */
      private void sendNameToServer() {
        // First, we validate the input.
        errorLabel.setText("");
        String textToServer = nameField.getText();
        if (!FieldVerifier.isValidName(textToServer)) {
          errorLabel.setText("Please enter at least four characters");
          return;
        }
        
        dZoom = Double.parseDouble(zoomField.getText());
        
        // Then, we send the input to the server.
        sendButton.setEnabled(false);
        textToServerLabel.setText(textToServer);
        serverResponseLabel.setText("");
        greetingService.greetServer(textToServer, new AsyncCallback<String>() {
          public void onFailure(Throwable caught) {
            // Show the RPC error message to the user
            dialogBox.setText("Remote Procedure Call - Failure");
            serverResponseLabel.addStyleName("serverResponseLabelError");
            serverResponseLabel.setHTML(SERVER_ERROR);
            dialogBox.center();
            closeButton.setFocus(true);
          }

          public void onSuccess(String result) {
            //dialogBox.setText("Remote Procedure Call");
        //;
            serverResponseLabel.removeStyleName("serverResponseLabelError");
            //serverResponseLabel.setHTML(result);
            renderXML(result);
            drawmap(dZoom);
            dialogBox.center();
            closeButton.setFocus(true);
          }
        });
      }
    }

    // Add a handler to send the name to the server
    MyHandler handler = new MyHandler();
    sendButton.addClickHandler(handler);
    nameField.addKeyUpHandler(handler);
  }

/// Draw the map at the current zoom level.
public void drawmap() {
	
	drawmap(dZoom);
}
}
