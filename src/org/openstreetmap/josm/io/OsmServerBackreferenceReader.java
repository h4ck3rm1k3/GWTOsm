// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.io;

import static org.openstreetmap.josm.data.osm.I18n.tr;

import java.io.InputStream;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Collection;

import org.openstreetmap.josm.data.osm.CheckParameterUtil;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.DataSetMerger;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.OsmPrimitiveType;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
//import org.openstreetmap.josm.gui.progress.NullProgressMonitor;
//import org.openstreetmap.josm.gui.progress.ProgressMonitor;

/**
 * OsmServerBackreferenceReader fetches the primitives from the OSM server which
 * refer to a specific primitive. For a {@see Node}, ways and relations are retrieved
 * which refer to the node. For a {@see Way} or a {@see Relation}, only relations are
 * read.
 *
 * OsmServerBackreferenceReader uses the API calls <code>[node|way|relation]/#id/relations</code>
 * and  <code>node/#id/ways</code> to retrieve the referring primitives. The default behaviour
 * of these calls is to reply incomplete primitives only.
 *
 * If you set {@see #setReadFull(boolean)} to true this reader uses a {@see MultiFetchServerObjectReader}
 * to complete incomplete primitives.
 *
 *
 */
public class OsmServerBackreferenceReader extends OsmServerReader {

    /** the id of the primitive whose referrers are to be read */
    private long id;
    /** the type of the primitive */
    private OsmPrimitiveType primitiveType;
    /** true if this reader should complete incomplete primitives */
    private boolean readFull;

    /**
     * constructor
     *
     * @param primitive  the primitive to be read. Must not be null. primitive.id > 0 expected
     *
     * @exception IllegalArgumentException thrown if primitive is null
     * @exception IllegalArgumentException thrown if primitive.id <= 0
     */
    public OsmServerBackreferenceReader(OsmPrimitive primitive) throws IllegalArgumentException {
        CheckParameterUtil.ensureValidPrimitiveId(primitive, "primitive");
        this.id = primitive.getId();
        this.primitiveType = OsmPrimitiveType.from(primitive);
        this.readFull = false;
    }

    /**
     * constructor
     *
     * @param id  the id of the primitive. > 0 expected
     * @param type the type of the primitive. Must not be null.
     *
     * @exception IllegalArgumentException thrown if id <= 0
     * @exception IllegalArgumentException thrown if type is null
     *
     */
    public OsmServerBackreferenceReader(long id, OsmPrimitiveType type) throws IllegalArgumentException   {
        if (id <= 0)
            throw new IllegalArgumentException(MessageFormat.format("Parameter ''{0}'' > 0 expected. Got ''{1}''.", "id", id));
        CheckParameterUtil.ensureParameterNotNull(type, "type");
        this.id = id;
        this.primitiveType = type;
        this.readFull = false;
    }

    /**
     * constructor
     *
     * @param id  the id of the primitive. > 0 expected
     * @param readFull true, if referers should be read fully (i.e. including their immediate children)
     *
     */
    public OsmServerBackreferenceReader(OsmPrimitive primitive, boolean readFull) {
        this(primitive);
        this.readFull = readFull;
    }

    /**
     * constructor
     *
     * @param primitive the primitive whose referers are to be read
     * @param readFull true, if referers should be read fully (i.e. including their immediate children)
     *
     * @exception IllegalArgumentException thrown if id <= 0
     * @exception IllegalArgumentException thrown if type is null
     *
     */
    public OsmServerBackreferenceReader(long id, OsmPrimitiveType type, boolean readFull) throws IllegalArgumentException  {
        this(id, type);
        this.readFull = false;
    }

    /**
     * Replies true if this reader also reads immediate children of referring primitives
     *
     * @return true if this reader also reads immediate children of referring primitives
     */
    public boolean isReadFull() {
        return readFull;
    }

    /**
     * Set true if this reader should reads immediate children of referring primitives too. False, otherweise.
     *
     * @param readFull true if this reader should reads immediate children of referring primitives too. False, otherweise.
     */
    public void setReadFull(boolean readFull) {
        this.readFull = readFull;
    }

    /**
     * Reads referring ways from the API server and replies them in a {@see DataSet}
     *
     * @return the data set
     * @throws OsmTransferException
     */
    protected DataSet getReferringWays(ProgressMonitor progressMonitor) throws OsmTransferException {
        InputStream in = null;
        progressMonitor.beginTask(null, 2);
        try {
            progressMonitor.indeterminateSubTask(tr("Downloading from OSM Server..."));
            StringBuffer sb = new StringBuffer();
            sb.append(primitiveType.getAPIName())
            .append("/").append(id).append("/ways");

            in = getInputStream(sb.toString(), progressMonitor.createSubTaskMonitor(1, true));
            if (in == null)
                return null;
            progressMonitor.subTask(tr("Downloading referring ways ..."));
            return OsmReader.parseDataSet(in, progressMonitor.createSubTaskMonitor(1, true));
        } catch(OsmTransferException e) {
            throw e;
        } catch (Exception e) {
            if (cancel)
                return null;
            throw new OsmTransferException(e);
        } finally {
            progressMonitor.finishTask();
            if (in != null) {
                try {
                    in.close();
                } catch(Exception e) {}
                activeConnection = null;
            }
        }
    }

    /**
     * Reads referring relations from the API server and replies them in a {@see DataSet}
     *
     * @param progressMonitor the progress monitor
     * @return the data set
     * @throws OsmTransferException
     */
    protected DataSet getReferringRelations(ProgressMonitor progressMonitor) throws OsmTransferException {
        InputStream in = null;
        progressMonitor.beginTask(null, 2);
        try {
            progressMonitor.subTask(tr("Contacting OSM Server..."));
            StringBuffer sb = new StringBuffer();
            sb.append(primitiveType.getAPIName())
            .append("/").append(id).append("/relations");

            in = getInputStream(sb.toString(), progressMonitor.createSubTaskMonitor(1, true));
            if (in == null)
                return null;
            progressMonitor.subTask(tr("Downloading referring relations ..."));
            return OsmReader.parseDataSet(in, progressMonitor.createSubTaskMonitor(1, true));
        } catch(OsmTransferException e) {
            throw e;
        } catch (Exception e) {
            if (cancel)
                return null;
            throw new OsmTransferException(e);
        } finally {
            progressMonitor.finishTask();
            if (in != null) {
                try {
                    in.close();
                } catch(Exception e) {}
                activeConnection = null;
            }
        }
    }

    /**
     * Scans a dataset for incomplete primitives. Depending on the configuration of this reader
     * incomplete primitives are read from the server with an individual <tt>/api/0.6/[way,relation]/#id/full</tt>
     * request.
     *
     * <ul>
     *   <li>if this reader reads referers for an {@see Node}, referring ways are always
     *     read individually from the server</li>
     *   <li>if this reader reads referers for an {@see Way} or a {@see Relation}, referring relations
     *    are only read fully if {@see #setReadFull(boolean)} is set to true.</li>
     * </ul>
     *
     * The method replies the modified dataset.
     *
     * @param ds the original dataset
     * @param progressMonitor  the progress monitor
     * @return the modified dataset
     * @throws OsmTransferException thrown if an exception occurs.
     */
    protected DataSet readIncompletePrimitives(DataSet ds, ProgressMonitor progressMonitor) throws OsmTransferException {
        progressMonitor.beginTask(null, 2);
        try {
            Collection<Way> waysToCheck = new ArrayList<Way>(ds.getWays());
            if (isReadFull() ||primitiveType.equals(OsmPrimitiveType.NODE)) {
                for (Way way: waysToCheck) {
                    if (!way.isNew() && way.isIncomplete()) {
                        OsmServerObjectReader reader = new OsmServerObjectReader(way.getId(), OsmPrimitiveType.from(way), true /* read full */);
                        DataSet wayDs = reader.parseOsm(progressMonitor.createSubTaskMonitor(1, false));
                        DataSetMerger visitor = new DataSetMerger(ds, wayDs);
                        visitor.merge();
                    }
                }
            }
            if (isReadFull()) {
                Collection<Relation> relationsToCheck  = new ArrayList<Relation>(ds.getRelations());
                for (Relation relation: relationsToCheck) {
                    if (!relation.isNew() && relation.isIncomplete()) {
                        OsmServerObjectReader reader = new OsmServerObjectReader(relation.getId(), OsmPrimitiveType.from(relation), true /* read full */);
                        DataSet wayDs = reader.parseOsm(progressMonitor.createSubTaskMonitor(1, false));
                        DataSetMerger visitor = new DataSetMerger(ds, wayDs);
                        visitor.merge();
                    }
                }
            }
            return ds;
        } finally {
            progressMonitor.finishTask();
        }
    }

    /**
     * Reads the referring primitives from the OSM server, parses them and
     * replies them as {@see DataSet}
     *
     * @param progressMonitor the progress monitor. Set to {@see NullProgressMonitor#INSTANCE} if null.
     * @return the dataset with the referring primitives
     * @exception OsmTransferException thrown if an error occurs while communicating with the server
     */
    @Override
    public DataSet parseOsm(ProgressMonitor progressMonitor) throws OsmTransferException {
        if (progressMonitor == null) {
            progressMonitor = NullProgressMonitor.INSTANCE;
        }
        try {
            progressMonitor.beginTask(null, 3);
            DataSet ret = new DataSet();
            if (primitiveType.equals(OsmPrimitiveType.NODE)) {
                DataSet ds = getReferringWays(progressMonitor.createSubTaskMonitor(1, false));
                DataSetMerger visitor = new DataSetMerger(ret,ds);
                visitor.merge();
                ret = visitor.getTargetDataSet();
            }
            DataSet ds = getReferringRelations(progressMonitor.createSubTaskMonitor(1, false));
            DataSetMerger visitor = new DataSetMerger(ret,ds);
            visitor.merge();
            ret = visitor.getTargetDataSet();
            readIncompletePrimitives(ret, progressMonitor.createSubTaskMonitor(1, false));
            return ret;
        } finally {
            progressMonitor.finishTask();
        }
    }
}
