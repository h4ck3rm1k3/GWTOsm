package org.openstreetmap.gwt.server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.zip.GZIPInputStream;

import java.util.zip.Inflater;
import java.util.zip.InflaterInputStream;
import org.openstreetmap.gwt.client.GreetingService;
import org.openstreetmap.gwt.shared.OsmTransferException;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.http.client.Request;
//import com.google.gwt.http.client.RequestBuilder;
//import com.google.gwt.http.client.RequestCallback;
//import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
public class GreetingServiceImpl extends RemoteServiceServlet implements
    GreetingService {
//public String xmllayerdata;
  public String greetServer(String input) throws IllegalArgumentException {
    // Verify that the input is valid. 
    
    //String serverInfo = getServletContext().getServerInfo();
    //String userAgent = getThreadLocalRequest().getHeader("User-Agent");
  //  return "Hello, " + input + "!<br><br>I am running " + serverInfo
  //      + ".<br><br>It looks like you are using:<br>" + userAgent;
    
	  return fetchDataLive(input);
     
  }
  /** the server URL */
  private String serverUrl;
  
  /**
   * API version used for server communications
   */
  private String version = null;

private HttpURLConnection activeConnection;

private GreetingServiceImpl api;

private boolean cancel;
  /**
   * Returns the base URL for API requests, including the negotiated version number.
   * @return base URL string
   */
  public String getBaseUrl() {
      StringBuffer rv = new StringBuffer(serverUrl);
      if (version != null) {
          rv.append("/");
          rv.append(version);
      }
      rv.append("/");
      // this works around a ruby (or lighttpd) bug where two consecutive slashes in
      // an URL will cause a "404 not found" response.
      int p; while ((p = rv.indexOf("//", 6)) > -1) { rv.delete(p, p + 1); }
      return rv.toString();
  }
  /**
   * Generic method for sending requests to the OSM API.
   *
   * This method will automatically re-try any requests that are answered with a 5xx
   * error code, or that resulted in a timeout exception from the TCP layer.
   *
   * @param requestMethod The http method used when talking with the server.
   * @param urlSuffix The suffix to add at the server url, not including the version number,
   *    but including any object ids (e.g. "/way/1234/history").
   * @param requestBody the body of the HTTP request, if any.
   * @param monitor the progress monitor
   * @param doAuthenticate  set to true, if the request sent to the server shall include authentication
   * credentials;
   *
   * @return the body of the HTTP response, if and only if the response code was "200 OK".
   * @exception OsmTransferException if the HTTP return code was not 200 (and retries have
   *    been exhausted), or rewrapping a Java exception.
 * @throws OsmTransferCancelledException 
 * @throws OsmApiPrimitiveGoneException 
 * @throws OsmApiException 
   */
  private String sendRequest(String requestMethod, String urlSuffix,String requestBody, boolean doAuthenticate) throws OsmTransferException, OsmTransferCancelledException, OsmApiPrimitiveGoneException, OsmApiException {
      StringBuffer responseBody = new StringBuffer();
      int retries = getMaxRetries();

      while(true) { // the retry loop
          try {
              URL url = new URL(new URL(getBaseUrl()), urlSuffix);
              System.out.print(requestMethod + " " + url + "... ");
              activeConnection = (HttpURLConnection)url.openConnection();
              activeConnection.setConnectTimeout(15000);
              activeConnection.setRequestMethod(requestMethod);
              if (doAuthenticate) {
                  addAuth(activeConnection);
              }

//              if (requestMethod.equals("PUT") || requestMethod.equals("POST") || requestMethod.equals("DELETE")) {
//                  activeConnection.setDoOutput(true);
//                  activeConnection.setRequestProperty("Content-type", "text/xml");
//                  OutputStream out = activeConnection.getOutputStream();
//
//                  // It seems that certain bits of the Ruby API are very unhappy upon
//                  // receipt of a PUT/POST message without a Content-length header,
//                  // even if the request has no payload.
//                  // Since Java will not generate a Content-length header unless
//                  // we use the output stream, we create an output stream for PUT/POST
//                  // even if there is no payload.
//                  if (requestBody != null) {
//                      BufferedWriter bwr = new BufferedWriter(new OutputStreamWriter(out, "UTF-8"));
//                      bwr.write(requestBody);
//                      bwr.flush();
//                  }
//                  out.close();
//              }

              activeConnection.connect();
              System.out.println(activeConnection.getResponseMessage());
              int retCode = activeConnection.getResponseCode();

              if (retCode >= 500) {
                  if (retries-- > 0) {
                      sleepAndListen(retries);
                      System.out.println(tr("Starting retry {0} of {1}.", getMaxRetries() - retries,getMaxRetries()));
                      continue;
                  }
              }

              // populate return fields.
              responseBody.setLength(0);

              // If the API returned an error code like 403 forbidden, getInputStream
              // will fail with an IOException.
              InputStream i = null;
              try {
                  i = activeConnection.getInputStream();
              } catch (IOException ioe) {
                  i = activeConnection.getErrorStream();
              }
              if (i != null) {
                  // the input stream can be null if both the input and the error stream
                  // are null. Seems to be the case if the OSM server replies a 401
                  // Unauthorized, see #3887.
                  //
                  BufferedReader in = new BufferedReader(new InputStreamReader(i));
                  String s;
                  while((s = in.readLine()) != null) {
                      responseBody.append(s);
                      responseBody.append("\n");
                  }
              }
              String errorHeader = null;
              // Look for a detailed error message from the server
              if (activeConnection.getHeaderField("Error") != null) {
                  errorHeader = activeConnection.getHeaderField("Error");
                  System.err.println("Error header: " + errorHeader);
              } else if (retCode != 200 && responseBody.length()>0) {
                  System.err.println("Error body: " + responseBody);
              }
              activeConnection.disconnect();

              errorHeader = errorHeader == null? null : errorHeader.trim();
              String errorBody = responseBody.length() == 0? null : responseBody.toString().trim();
              switch(retCode) {
              case HttpURLConnection.HTTP_OK:
                  return responseBody.toString();
              case HttpURLConnection.HTTP_GONE:
                  throw new OsmApiPrimitiveGoneException(errorHeader, errorBody);
              case HttpURLConnection.HTTP_CONFLICT:
//                  if (ChangesetClosedException.errorHeaderMatchesPattern(errorHeader))
//                      throw new ChangesetClosedException(errorBody, ChangesetClosedException.Source.UPLOAD_DATA);
//                  else
                      throw new OsmApiException(retCode, errorHeader, errorBody);
              case HttpURLConnection.HTTP_FORBIDDEN:
                  OsmApiException e = new OsmApiException(retCode, errorHeader, errorBody);
                  e.setAccessedUrl(activeConnection.getURL().toString());
                  throw e;
              default:
                  throw new OsmApiException(retCode, errorHeader, errorBody);
              }
          } catch (UnknownHostException e) {
              throw new OsmTransferException(e);
          } catch (SocketTimeoutException e) {
              if (retries-- > 0) {
                  continue;
              }
              throw new OsmTransferException(e);
          } catch (ConnectException e) {
              if (retries-- > 0) {
                  continue;
              }
              throw new OsmTransferException(e);
          } catch(IOException e){
              throw new OsmTransferException(e);
          }
      }
  }

  private char[] tr(String string, int i, int maxRetries) {
	// TODO Auto-generated method stub
	return null;
}
private void sleepAndListen(int retries) {
	// TODO Auto-generated method stub
	
}
private void addAuth(HttpURLConnection activeConnection2) {
	// TODO Auto-generated method stub
	
}
private int getMaxRetries() {
	// TODO Auto-generated method stub
	return 3;
}
private String sendRequest(String requestMethod, String urlSuffix,String requestBody) throws OsmTransferException {
    
		return sendRequest(requestMethod, urlSuffix, requestBody, true);
	
  }
  
  public String fetchDataLive(String url) 
  {
	  String xmllayerdata=new String();
//	  RequestBuilder requestBuilder = new RequestBuilder(RequestBuilder.GET,
//			  "http://xhema.flossk.org/~mdupont/osmgit/osmgit-test/Tiles/10/566/378.osm");
//        // "http://api.openstreetmap.org/api/0.6/map?bbox=19.508028,42.0629942,19.5137787,42.0668174");  
	  try {
		InputStream i = getInputStream( url);//"http://xhema.flossk.org/~mdupont/osmgit/osmgit-test/Tiles/10/566/378.osm");
		
		BufferedReader in = new BufferedReader(new InputStreamReader(i));
        String s;
        
        while((s = in.readLine()) != null) {
        	xmllayerdata = xmllayerdata.concat(s);
        	xmllayerdata= xmllayerdata.concat("\n");
        }
        
	} catch (OsmTransferException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //BoundingBoxDownloader aBox;
 catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  
//	try {
//		RequestCallback rh = new LiveRequestServerCallback(this);
//        //connection.setRequestProperty("User-Agent", Version.getInstance().getAgentString());
//        //connection.setRequestProperty("Host", connection.getURL().getHost());
//        
////		requestBuilder.setTimeoutMillis(2000);
////		requestBuilder.setHeader("User-Agent", "gwt");
////		requestBuilder.setHeader("Host", "api.openstreetmap.org");
//		Request r= requestBuilder.sendRequest(null, rh);
//		GWT.log("created:" + r.toString());
		//r.wait(2);
//		r.wait();
//		@Override
//		public void onResponseReceived(Request request, Response response) 
//		{
//			// TODO Auto-generated method stub
//		//	GWT.log(Integer.toString(response.getStatusCode()));
//         //   GWT.log(response.getStatusText());
//		//	renderXML(response.getText());
//			
//		}	      
	
//	
//    }
//	catch(Exception e)
//	{
//		GWT.log("caught",e);
//		
//	}
	return xmllayerdata;
	  
  }
  
  /**
   * Open a connection to the given url and return a reader on the input stream
   * from that connection. In case of user cancel, return <code>null</code>.
   * @param urlStr The exact url to connect to.
   * @param pleaseWaitDlg
   * @return An reader reading the input stream (servers answer) or <code>null</code>.
   */
  protected InputStream getInputStream(String urlStr) throws OsmTransferException  {
      try {
         // api.initialize(progressMonitor);
         // urlStr = getBaseUrl() + urlStr;
          return getInputStreamRaw(urlStr);
      } finally {
       
      }
  }
  
private InputStream getInputStreamRaw(String urlStr) throws OsmTransferException {
    try {
        URL url = null;
        try {
            url = new URL(urlStr.replace(" ", "%20"));
        } catch(MalformedURLException e) {
            throw new OsmTransferException(e);
        }
        try {
            activeConnection = (HttpURLConnection)url.openConnection();
        } catch(Exception e) {
            throw new OsmTransferException(tr("Failed to open connection to API {0}.", url.toExternalForm()), e);
        }
        if (cancel) {
            activeConnection.disconnect();
            return null;
        }

        boolean doAuthenticate=false;
		if (doAuthenticate) {
            addAuth(activeConnection);
        }
        if (cancel)
            throw new OsmTransferCancelledException();
        //if (Main.pref.getBoolean("osm-server.use-compression", true)) {
            activeConnection.setRequestProperty("Accept-Encoding", "gzip, deflate");
        //}

        activeConnection.setConnectTimeout(15000);

        try {
            System.out.println("GET " + url);
            activeConnection.connect();
        } catch (Exception e) {
            e.printStackTrace();
            throw new OsmTransferException(tr("Could not connect to the OSM server. Please check your internet connection."), e);
        }
        try {
            if (activeConnection.getResponseCode() == HttpURLConnection.HTTP_UNAUTHORIZED)
                throw new OsmApiException(HttpURLConnection.HTTP_UNAUTHORIZED,null,null);

            if (activeConnection.getResponseCode() == HttpURLConnection.HTTP_PROXY_AUTH)
                throw new OsmTransferCancelledException();

            if (activeConnection.getResponseCode() != HttpURLConnection.HTTP_OK) {
                String errorHeader = activeConnection.getHeaderField("Error");
                InputStream i = null;
                i = activeConnection.getErrorStream();
                StringBuilder errorBody = new StringBuilder();
                if (i != null) {
                    BufferedReader in = new BufferedReader(new InputStreamReader(i));
                    String s;
                    while((s = in.readLine()) != null) {
                        errorBody.append(s);
                        errorBody.append("\n");
                    }
                }

                throw new OsmApiException(activeConnection.getResponseCode(), errorHeader, errorBody.toString());
            }

            String encoding = activeConnection.getContentEncoding();
            InputStream inputStream =  activeConnection.getInputStream(); //new InputStream(activeConnection);
            if (encoding != null && encoding.equalsIgnoreCase("gzip")) {
                inputStream = new GZIPInputStream(inputStream);
            }
            else if (encoding != null && encoding.equalsIgnoreCase("deflate")) {
                inputStream = new InflaterInputStream(inputStream, new Inflater(true));
            }
            return inputStream;
        } catch(Exception e) {
            if (e instanceof OsmTransferException)
                throw (OsmTransferException)e;
            else
                throw new OsmTransferException(e);

        }
    } finally {
       // progressMonitor.invalidate();
    }
}
private String tr(String string) {
	// TODO Auto-generated method stub
	return null;
}
private String tr(String string, String externalForm) {
	// TODO Auto-generated method stub
	return null;
}
@Override
public String zoomServer(String name) throws IllegalArgumentException {
	// TODO Auto-generated method stub
	return null;
}
}
