package org.openstreetmap.gwt.client;

import org.openstreetmap.gwt.server.GreetingServiceImpl;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;

public class LiveRequestCallback implements RequestCallback {

	GWTOSM mygwtosm;
	
public LiveRequestCallback(GWTOSM gwtosm) {
		mygwtosm=gwtosm;
	}

	
	@Override
	public void onError(Request request, Throwable exception) {
		// TODO Auto-generated method stub
		GWT.log("error"+request.toString() , exception);
	}

	@Override
	public void onResponseReceived(Request request, Response response) {
		// TODO Auto-generated method stub
		 if (200 == response.getStatusCode()) {
	          // Process the response in response.getText()
				String text =response.getText();
				GWT.log("Headers"+response.getHeadersAsString());
				GWT.log("Status" + response.getStatusText());
				if (text.length()>1)
				{
					GWT.log("got response" + text);
					mygwtosm.renderXML(text);
					mygwtosm.drawmap();
				}
				else
				{
					GWT.log("got empty response!");
					
				}

	      } else {
	    		GWT.log("got strange response" + response.getStatusCode());
	    	  GWT.log("Headers"+response.getHeadersAsString());
			try {
				GWT.log("Status" + response.getStatusText());
			}catch(Exception e)
			{
				GWT.log("funny",e);
				
			}
		
			
	      }

	}

}
