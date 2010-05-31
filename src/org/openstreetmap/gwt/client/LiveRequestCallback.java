package org.openstreetmap.gwt.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.http.client.Request;
import com.google.gwt.http.client.RequestCallback;
import com.google.gwt.http.client.Response;

public class LiveRequestCallback implements RequestCallback {

	private GWTOSM mygwtosm;
	public LiveRequestCallback(GWTOSM gwtosm) {
		mygwtosm=gwtosm;
	}

	@Override
	public void onError(Request request, Throwable exception) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onResponseReceived(Request request, Response response) {
		// TODO Auto-generated method stub
		
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
	}

}
