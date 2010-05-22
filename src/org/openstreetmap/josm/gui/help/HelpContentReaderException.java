// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.gui.help;

public class HelpContentReaderException extends Exception {
    private int responseCode;

    public HelpContentReaderException() {
        super();
        // TODO Auto-generated constructor stub
    }

    public HelpContentReaderException(String message, Throwable cause) {
        super(message, cause);
        // TODO Auto-generated constructor stub
    }

    public HelpContentReaderException(String message) {
        super(message);
        // TODO Auto-generated constructor stub
    }

    public HelpContentReaderException(Throwable cause) {
        super(cause);
        // TODO Auto-generated constructor stub
    }

    /**
     * Replies the HTTP response code related to the wiki access exception.
     * If no HTTP response code is available, 0 is replied.
     *
     * @return the http response code
     */
    public int getResponseCode() {
        return responseCode;
    }

    /**
     * Sets the HTTP response code
     *
     * @param responseCode the response code
     */
    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

}
