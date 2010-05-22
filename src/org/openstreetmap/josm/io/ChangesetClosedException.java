// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.io;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A ChangesetClosedException is thrown if the server replies with a HTTP
 * return code 409 (Conflict) with the error header {@see #ERROR_HEADER_PATTERN}.
 *
 * Depending on the context the exception is thrown in we have to react differently.
 * <ul>
 *   <li>if it is thrown when we try to update a changeset, the changeset was most
 *   likely closed before, either explicitly by the user or because of a timeout</li>
 *   <li>if it is thrown when we try to upload data to the changeset, the changeset
 *   was most likely closed because we reached the servers capability limit for the size
 *   of a changeset.</li>
 *  </ul>
 */
public class ChangesetClosedException extends OsmTransferException {
    /** the error header pattern for in case of HTTP response 409 indicating
     * that a changeset was closed
     */
    final static public String ERROR_HEADER_PATTERN = "The changeset (\\d+) was closed at (.*)";

    public static enum Source {
        /**
         * The exception was thrown when a changeset was updated. This most likely means
         * that the changeset was closed before.
         */
        UPDATE_CHANGESET,
        /**
         * The exception was thrown when data was uploaded to the changeset. This most
         * likely means that the servers capability limits for a changeset have been
         * exceeded.
         */
        UPLOAD_DATA,
        /**
         * Unspecified source
         */
        UNSPECIFIED
    }

    /**
     * Replies true if <code>errorHeader</code> matches with {@see #ERROR_HEADER_PATTERN}
     *
     * @param errorHeader the error header
     * @return true if <code>errorHeader</code> matches with {@see #ERROR_HEADER_PATTERN}
     */
    static public boolean errorHeaderMatchesPattern(String errorHeader) {
        if (errorHeader == null)
            return false;
        Pattern p = Pattern.compile(ERROR_HEADER_PATTERN);
        Matcher m = p.matcher(errorHeader);
        return m.matches();
    }

    /** the changeset id */
    private long changesetId;
    /** the date on which the changeset was closed */
    private Date closedOn;
    /** the source */
    private Source source;

    protected void parseErrorHeader(String errorHeader) {
        Pattern p = Pattern.compile(ERROR_HEADER_PATTERN);
        Matcher m = p.matcher(errorHeader);
        if (m.matches()) {
            changesetId = Long.parseLong(m.group(1));
            // Example: Tue Oct 15 10:00:00 UTC 2009. Always parsed with english locale regardless
            // of the current locale in JOSM
            DateFormat formatter = new SimpleDateFormat("EEE MMM dd HH:mm:ss zzz yyyy",Locale.ENGLISH);
            try {
                closedOn = formatter.parse(m.group(2));
            } catch(ParseException ex) {
                System.err.println(tr("Failed to parse date ''{0}'' replied by server.", m.group(2)));
                ex.printStackTrace();
            }
        } else {
            System.err.println(tr("Unexpected format of error header for conflict in changeset update. Got ''{0}''", errorHeader));
        }
    }

    /**
     * Creates the exception with the given <code>errorHeader</code>
     *
     * @param errorHeader the error header
     */
    public ChangesetClosedException(String errorHeader) {
        super(errorHeader);
        parseErrorHeader(errorHeader);
        this.source = Source.UNSPECIFIED;
    }

    /**
     * Creates the exception with the given error header and the given
     * source.
     *
     * @param errorHeader the error header
     * @param source the source for the exception
     */
    public ChangesetClosedException(String errorHeader, Source source) {
        super(errorHeader);
        parseErrorHeader(errorHeader);
        this.source = source == null ? Source.UNSPECIFIED : source;
    }

    /**
     * Creates the exception
     *
     * @param changesetId the id if the closed changeset
     * @param closedOn the date the changeset was closed on
     * @param source the source for the exception
     */
    public ChangesetClosedException(long changesetId, Date closedOn, Source source) {
        super("");
        this.source = source == null ? Source.UNSPECIFIED : source;
        this.changesetId = changesetId;
        this.closedOn = closedOn;
    }

    /**
     * Replies the id of the changeset which was closed
     *
     * @return the id of the changeset which was closed
     */
    public long getChangesetId() {
        return changesetId;
    }

    /**
     * Replies the date the changeset was closed
     *
     * @return the date the changeset was closed. May be null if the date isn't known.
     */
    public Date getClosedOn() {
        return closedOn;
    }

    /**
     * Replies the source where the exception was thrown
     *
     * @return the source
     */
    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source == null ? Source.UNSPECIFIED : source;
    }
}
