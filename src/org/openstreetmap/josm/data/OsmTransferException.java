package org.openstreetmap.josm.data;

public class OsmTransferException extends Exception {
	 public OsmTransferException() {
	    }

	    public OsmTransferException(String message) {
	        super(message);
	    }

	    public OsmTransferException(Throwable cause) {
	        super(cause);
	    }

	    public OsmTransferException(String message, Throwable cause) {
	        super(message, cause);
	    }

}
