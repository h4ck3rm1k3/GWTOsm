package org.openstreetmap.gwt.client;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.MessageFormat;
import org.openstreetmap.josm.data.coor.LatLon;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.DataSource;
import org.openstreetmap.josm.data.osm.Logger;
import org.openstreetmap.josm.data.osm.NodeData;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.OsmPrimitiveType;
import org.openstreetmap.josm.data.osm.PrimitiveData;
import org.openstreetmap.josm.data.osm.PrimitiveId;
import org.openstreetmap.josm.data.osm.ProgressMonitor;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.RelationData;
import org.openstreetmap.josm.data.osm.RelationMember;
import org.openstreetmap.josm.data.osm.SimplePrimitiveId;
import org.openstreetmap.josm.data.osm.Storage;
import org.openstreetmap.josm.data.osm.User;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.WayData;
import org.openstreetmap.josm.data.projection.InputStream;

import com.google.gwt.core.client.GWT;
import com.google.gwt.xml.client.DOMException;
import com.google.gwt.xml.client.Document;
import com.google.gwt.xml.client.Element;
import com.google.gwt.xml.client.NamedNodeMap;
import com.google.gwt.xml.client.Node;
import com.google.gwt.xml.client.NodeList;
import com.google.gwt.xml.client.XMLParser;

public class OsmReader {
	 static private final Logger logger = Logger.getLogger(OsmReader.class.getName());

	    /**
	     * The dataset to add parsed objects to.
	     */
	    private DataSet ds ;

	    /**
	     * Replies the parsed data set
	     *
	     * @return the parsed data set
	     */
	    public DataSet getDataSet() {
	        return ds;
	    }

	    /** the map from external ids to read OsmPrimitives. External ids are
	     * longs too, but in contrast to internal ids negative values are used
	     * to identify primitives unknown to the OSM server
	     */
	    private Map<PrimitiveId, OsmPrimitive> externalIdMap = new HashMap<PrimitiveId, OsmPrimitive>();

	    /**
	     * constructor (for private use only)
	     *
	     * @see #parseDataSet(InputStream, DataSet, ProgressMonitor)
	     * @see #parseDataSetOsm(InputStream, DataSet, ProgressMonitor)
	     */
	    private OsmReader() {
	        externalIdMap = new HashMap<PrimitiveId, OsmPrimitive>();
	    }

	    /**
	     * Used as a temporary storage for relation members, before they
	     * are resolved into pointers to real objects.
	     */
	    private static class RelationMemberData {
	        public OsmPrimitiveType type;
	        public long id;
	        public String role;
	    }

	    /**
	     * Data structure for the remaining way objects
	     */
	    private Map<Long, Collection<Long>> ways = new HashMap<Long, Collection<Long>>();

	    /**
	     * Data structure for relation objects
	     */
	    private Map<Long, Collection<RelationMemberData>> relations = new HashMap<Long, Collection<RelationMemberData>>();

	    private class Parser // extends DefaultHandler 
	    {
	        private Locator locator;

	        public void setDocumentLocator(Locator locator) {
	            this.locator = locator;
	        }

	        protected void throwException(String msg) throws Exception{
	            throw new OsmDataParsingException(msg).rememberLocation(locator);
	        }
	        /**
	         * The current osm primitive to be read.
	         */
	        private OsmPrimitive currentPrimitive;
	        private long currentExternalId;
	        private String generator;
	        private Storage<String> internedStrings = new Storage<String>();

	        // Memory optimization - see #2312
	        private String intern(String s) {
	            String result = internedStrings.get(s);
	            if (result == null) {
	                internedStrings.put(s);
	                return s;
	            } else
	                return result;
	        }
	        private void renderXML(String text) {
	    		// TODO Auto-generated method stub
	    		//data
	    		// GWT.log("got this text" + text);
	    		 try {
	    			    // parse the XML document into a DOM
	    			    Document messageDom = XMLParser.parse(text);

	    			    NodeList nodes = messageDom.getElementsByTagName("node");
	    			    
	    			    for (int i =0; i < nodes.getLength(); i++)
	    			    {
	    			    	Node node=nodes.item(i);
	    			    	String lat = ((Element)node).getAttribute("lat");
	    			    	String lon = ((Element)node).getAttribute("lon");
	    			    	String id = ((Element)node).getAttribute("id");
	    			    	String version = ((Element)node).getAttribute("version");
	    			    	//GWT.log(lat);
	    			    	double ilon=Double.parseDouble(lon);
	    			    	double ilat=Double.parseDouble(lat);
	    					int iid=Integer.parseInt(id);
	    					int iversion=Integer.parseInt(version);
	    					OsmPrimitive primitive = new org.openstreetmap.josm.data.osm.Node(new LatLon(ilat,ilon));
	    			    	primitive .setOsmId(iid, iversion);
	    			    	
	    					ds.addPrimitive(primitive );
	    			    }
	    			    
	    		 }	
	    		 catch (DOMException e) {
	    			    //Window.alert("Could not parse XML document.");
	    			 GWT.log("Could not parse XML document.");
	    			  }
	    		
	    			  catch (Exception e) {
	    					// TODO Auto-generated catch block
	    					e.printStackTrace();
	    					//requestFailed(e);
	    				}

	    	}
	        public void startElement(String namespaceURI, String localName, String qName, Node node) throws Exception  {

	            Attributes atts = new Attributes(node.getAttributes());
				if (qName.equals("osm")) {
	                if (atts == null) {
	                    throwException(tr("Missing mandatory attribute ''{0}'' of XML element {1}.", "version", "osm"));
	                }
	                String v = atts.getValue("version");
	                if (v == null) {
	                    throwException(tr("Missing mandatory attribute ''{0}''.", "version"));
	                }
	                if (!(v.equals("0.5") || v.equals("0.6"))) {
	                    throwException(tr("Unsupported version: {0}", v));
	                }
	                // save generator attribute for later use when creating DataSource objects
	                generator = atts.getValue("generator");
	                ds.setVersion(v);

	            } else if (qName.equals("bounds")) {
	                // new style bounds.
	                String minlon = atts.getValue("minlon");
	                String minlat = atts.getValue("minlat");
	                String maxlon = atts.getValue("maxlon");
	                String maxlat = atts.getValue("maxlat");
	                String origin = atts.getValue("origin");
	                if (minlon != null && maxlon != null && minlat != null && maxlat != null) {
	                    if (origin == null) {
	                        origin = generator;
	                    }
	                    Bounds bounds = new Bounds(
	                            new LatLon(Double.parseDouble(minlat), Double.parseDouble(minlon)),
	                            new LatLon(Double.parseDouble(maxlat), Double.parseDouble(maxlon)));
	                    DataSource src = new DataSource(bounds, origin);
	                    ds.dataSources.add(src);
	                } else {
	                    throwException(tr(
	                            "Missing manadatory attributes on element ''bounds''. Got minlon=''{0}'',minlat=''{1}'',maxlon=''{3}'',maxlat=''{4}'', origin=''{5}''.",
	                            minlon, minlat, maxlon, maxlat, origin
	                    ));
	                }

	                // ---- PARSING NODES AND WAYS ----

	            } else if (qName.equals("node")) {
	                NodeData nd = new NodeData();
	                nd.setCoor(new LatLon(getDouble(atts, "lat"), getDouble(atts, "lon")));
	                readCommon(atts, nd);
	                org.openstreetmap.josm.data.osm.Node n = new org.openstreetmap.josm.data.osm.Node(nd.getId(), nd.getVersion());
	                n.load(nd);
	                externalIdMap.put(nd.getPrimitiveId(), n);
	                currentPrimitive = n;
	                currentExternalId = nd.getUniqueId();
	            } else if (qName.equals("way")) {
	                WayData wd = new WayData();
	                readCommon(atts, wd);
	                Way w = new Way(wd.getId(), wd.getVersion());
	                w.load(wd);
	                externalIdMap.put(wd.getPrimitiveId(), w);
	                ways.put(wd.getUniqueId(), new ArrayList<Long>());
	                currentPrimitive = w;
	                currentExternalId = wd.getUniqueId();
	            } else if (qName.equals("nd")) {
	                Collection<Long> list = ways.get(currentExternalId);
	                if (list == null) {
	                    throwException(
	                            tr("Found XML element <nd> not as direct child of element <way>.")
	                    );
	                }
	                if (atts.getValue("ref") == null) {
	                    throwException(
	                            tr("Missing mandatory attribute ''{0}'' on <nd> of way {1}.", "ref", currentPrimitive.getUniqueId())
	                    );
	                }
	                long id = getLong(atts, "ref");
	                if (id == 0) {
	                    throwException(
	                            tr("Illegal value of attribute ''ref'' of element <nd>. Got {0}.", id)
	                    );
	                }
	                if (currentPrimitive.isDeleted()) {
	                    logger.info(tr("Deleted way {0} contains nodes", currentPrimitive.getUniqueId()));
	                } else {
	                    list.add(id);
	                }

	                // ---- PARSING RELATIONS ----

	            } else if (qName.equals("relation")) {
	                RelationData rd = new RelationData();
	                readCommon(atts, rd);
	                Relation r = new Relation(rd.getId(), rd.getVersion());
	                r.load(rd);
	                externalIdMap.put(rd.getPrimitiveId(), r);
	                relations.put(rd.getUniqueId(), new LinkedList<RelationMemberData>());
	                currentPrimitive = r;
	                currentExternalId = rd.getUniqueId();
	            } else if (qName.equals("member")) {
	                Collection<RelationMemberData> list = relations.get(currentExternalId);
	                if (list == null) {
	                    throwException(
	                            tr("Found XML element <member> not as direct child of element <relation>.")
	                    );
	                }
	                RelationMemberData emd = new RelationMemberData();
	                String value = atts.getValue("ref");
	                if (value == null) {
	                    throwException(tr("Missing attribute ''ref'' on member in relation {0}.",currentPrimitive.getUniqueId()));
	                }
	                try {
	                    emd.id = Long.parseLong(value);
	                } catch(NumberFormatException e) {
	                    throwException(tr("Illegal value for attribute ''ref'' on member in relation {0}. Got {1}", Long.toString(currentPrimitive.getUniqueId()),value));
	                }
	                value = atts.getValue("type");
	                if (value == null) {
	                    throwException(tr("Missing attribute ''type'' on member {0} in relation {1}.", Long.toString(emd.id), Long.toString(currentPrimitive.getUniqueId())));
	                }
	                try {
	                    emd.type = OsmPrimitiveType.fromApiTypeName(value);
	                } catch(IllegalArgumentException e) {
	                    throwException(tr("Illegal value for attribute ''type'' on member {0} in relation {1}. Got {2}.", Long.toString(emd.id), Long.toString(currentPrimitive.getUniqueId()), value));
	                }
	                value = atts.getValue("role");
	                emd.role = value;

	                if (emd.id == 0) {
	                    throwException(tr("Incomplete <member> specification with ref=0"));
	                }

	                if (currentPrimitive.isDeleted()) {
	                    logger.info(tr("Deleted relation {0} contains members", currentPrimitive.getUniqueId()));
	                } else {
	                    list.add(emd);
	                }

	                // ---- PARSING TAGS (applicable to all objects) ----

	            } else if (qName.equals("tag")) {
	                String key = atts.getValue("k");
	                String value = atts.getValue("v");
	                currentPrimitive.put(intern(key), intern(value));

	            } else {
	                System.out.println(tr("Undefined element ''{0}'' found in input stream. Skipping.", qName));
	            }
	        }

	        private String tr(String string, String string2, String string3,
					String value) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string, long id) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string, String minlon, String minlat,
					String maxlon, String maxlat, String origin) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string, Node v) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string, String string2) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string, String string2, String string3) {
				// TODO Auto-generated method stub
				return null;
			}

			private double getDouble(Attributes atts, String value) {
	            return Double.parseDouble(atts.getValue(value));
	        }

	        private User createUser(String uid, String name) throws Exception {
	            if (uid == null) {
	                if (name == null)
	                    return null;
	                return User.createLocalUser(name);
	            }
	            try {
	                long id = Long.parseLong(uid);
	                return User.createOsmUser(id, name);
	            } catch(NumberFormatException e) {
	                throwException(MessageFormat.format("Illegal value for attribute ''uid''. Got ''{0}''.", uid));
	            }
	            return null;
	        }
	        /**
	         * Read out the common attributes from atts and put them into this.current.
	         * @throws Exception 
	         */
	        void readCommon(Attributes atts, PrimitiveData current) throws Exception  {
	            current.setId(getLong(atts, "id"));
	            if (current.getUniqueId() == 0) {
	                throwException(tr("Illegal object with ID=0."));
	            }

	            String time = atts.getValue("timestamp");
	            if (time != null && time.length() != 0) {
	                current.setTimestamp(DateUtils.fromString(time));
	            }

	            // user attribute added in 0.4 API
	            String user = atts.getValue("user");
	            // uid attribute added in 0.6 API
	            String uid = atts.getValue("uid");
	            current.setUser(createUser(uid, user));

	            // visible attribute added in 0.4 API
	            String visible = atts.getValue("visible");
	            if (visible != null) {
	                current.setVisible(Boolean.parseBoolean(visible));
	            }

	            String versionString = atts.getValue("version");
	            int version = 0;
	            if (versionString != null) {
	                try {
	                    version = Integer.parseInt(versionString);
	                } catch(NumberFormatException e) {
	                    throwException(tr("Illegal value for attribute ''version'' on OSM primitive with ID {0}. Got {1}.", Long.toString(current.getUniqueId()), versionString));
	                }
	                if (ds.getVersion().equals("0.6")){
	                    if (version <= 0 && current.getUniqueId() > 0) {
	                        throwException(tr("Illegal value for attribute ''version'' on OSM primitive with ID {0}. Got {1}.", Long.toString(current.getUniqueId()), versionString));
	                    } else if (version < 0 && current.getUniqueId() <= 0) {
	                        System.out.println(tr("WARNING: Normalizing value of attribute ''version'' of element {0} to {2}, API version is ''{3}''. Got {1}.", current.getUniqueId(), version, 0, "0.6"));
	                        version = 0;
	                    }
	                } else if (ds.getVersion().equals("0.5")) {
	                    if (version <= 0 && current.getUniqueId() > 0) {
	                        System.out.println(tr("WARNING: Normalizing value of attribute ''version'' of element {0} to {2}, API version is ''{3}''. Got {1}.", current.getUniqueId(), version, 1, "0.5"));
	                        version = 1;
	                    } else if (version < 0 && current.getUniqueId() <= 0) {
	                        System.out.println(tr("WARNING: Normalizing value of attribute ''version'' of element {0} to {2}, API version is ''{3}''. Got {1}.", current.getUniqueId(), version, 0, "0.5"));
	                        version = 0;
	                    }
	                } else {
	                    // should not happen. API version has been checked before
	                    throwException(tr("Unknown or unsupported API version. Got {0}.", ds.getVersion()));
	                }
	            } else {
	                // version expected for OSM primitives with an id assigned by the server (id > 0), since API 0.6
	                //
	                if (current.getUniqueId() > 0 && ds.getVersion() != null && ds.getVersion().equals("0.6")) {
	                    throwException(tr("Missing attribute ''version'' on OSM primitive with ID {0}.", Long.toString(current.getUniqueId())));
	                } else if (current.getUniqueId() > 0 && ds.getVersion() != null && ds.getVersion().equals("0.5")) {
	                    // default version in 0.5 files for existing primitives
	                    System.out.println(tr("WARNING: Normalizing value of attribute ''version'' of element {0} to {2}, API version is ''{3}''. Got {1}.", current.getUniqueId(), version, 1, "0.5"));
	                    version= 1;
	                } else if (current.getUniqueId() <= 0 && ds.getVersion() != null && ds.getVersion().equals("0.5")) {
	                    // default version in 0.5 files for new primitives, no warning necessary. This is
	                    // (was) legal in API 0.5
	                    version= 0;
	                }
	            }
	            current.setVersion(version);

	            String action = atts.getValue("action");
	            if (action == null) {
	                // do nothing
	            } else if (action.equals("delete")) {
	                current.setDeleted(true);
	                current.setModified(true);
	            } else if (action.equals("modify")) {
	                current.setModified(true);
	            }

	            String v = atts.getValue("changeset");
	            if (v == null) {
	                current.setChangesetId(0);
	            } else {
	                try {
	                    current.setChangesetId(Integer.parseInt(v));
	                } catch(NumberFormatException e) {
	                    if (current.getUniqueId() <= 0) {
	                        // for a new primitive we just log a warning
	                        System.out.println(tr("Illegal value for attribute ''changeset'' on new object {1}. Got {0}. Resetting to 0.", v, current.getUniqueId()));
	                        current.setChangesetId(0);
	                    } else {
	                        // for an existing primitive this is a problem
	                        throwException(tr("Illegal value for attribute ''changeset''. Got {0}.", v));
	                    }
	                }
	                if (current.getChangesetId() <=0) {
	                    if (current.getUniqueId() <= 0) {
	                        // for a new primitive we just log a warning
	                        System.out.println(tr("Illegal value for attribute ''changeset'' on new object {1}. Got {0}. Resetting to 0.", v, current.getUniqueId()));
	                        current.setChangesetId(0);
	                    } else {
	                        // for an existing primitive this is a problem
	                        throwException(tr("Illegal value for attribute ''changeset''. Got {0}.", v));
	                    }
	                }
	            }
	        }

	        private String tr(String string, String v, long uniqueId) {
				// TODO Auto-generated method stub
				return null;
			}

			private char[] tr(String string, long uniqueId, int version, int i,
					String string2) {
				// TODO Auto-generated method stub
				return null;
			}

			private String tr(String string) {
				// TODO Auto-generated method stub
				return null;
			}

			private long getLong(Attributes atts, String name) throws Exception  {
	            String value = atts.getValue(name);
	            if (value == null) {
	                throwException(tr("Missing required attribute ''{0}''.",name));
	            }
	            try {
	                return Long.parseLong(value);
	            } catch(NumberFormatException e) {
	                throwException(tr("Illegal long value for attribute ''{0}''. Got ''{1}''.",name, value));
	            }
	            return 0; // should not happen
	        }
	    }

	    /**
	     * Processes the ways after parsing. Rebuilds the list of nodes of each way and
	     * adds the way to the dataset
	     *
	     * @throws IllegalDataException thrown if a data integrity problem is detected
	     */
	    protected void processWaysAfterParsing() throws IllegalDataException{
	        for (Long externalWayId: ways.keySet()) {
	            Way w = (Way)externalIdMap.get(new SimplePrimitiveId(externalWayId, OsmPrimitiveType.WAY));
	            List<org.openstreetmap.josm.data.osm.Node> wayNodes = new ArrayList<org.openstreetmap.josm.data.osm.Node>();
	            for (long id : ways.get(externalWayId)) {
	            	org.openstreetmap.josm.data.osm.Node n = (org.openstreetmap.josm.data.osm.Node)externalIdMap.get(new SimplePrimitiveId(id, OsmPrimitiveType.NODE));
	                if (n == null) {
	                    if (id <= 0)
	                        throw new IllegalDataException (
	                                tr("Way with external ID ''{0}'' includes missing node with external ID ''{1}''.",
	                                        externalWayId,
	                                        id));
	                    // create an incomplete node if necessary
	                    //
	                    n = (org.openstreetmap.josm.data.osm.Node)ds.getPrimitiveById(id,OsmPrimitiveType.NODE);
	                    if (n == null) {
	                        n = new org.openstreetmap.josm.data.osm.Node(id);
	                        ds.addPrimitive(n);
	                    }
	                }
	                if (n.isDeleted()) {
	                    logger.warning(tr("Deleted node {0} is part of way {1}", id, w.getId()));
	                } else {
	                    wayNodes.add(n);
	                }
	            }
	            w.setNodes(wayNodes);
	            if (w.hasIncompleteNodes()) {
	                if (logger.isLoggable(Level.FINE)) {
	                    logger.fine(tr("Way {0} with {1} nodes has incomplete nodes because at least one node was missing in the loaded data.",
	                            externalWayId, w.getNodesCount()));
	                }
	            }
	            ds.addPrimitive(w);
	        }
	    }

	    private Exception tr(String string, Long externalWayId, long id) {
			// TODO Auto-generated method stub
			return null;
		}

		private String tr(String string, Long externalWayId, int nodesCount) {
			// TODO Auto-generated method stub
			return null;
		}

		/**
	     * Processes the parsed nodes after parsing. Just adds them to
	     * the dataset
	     *
	     */
	    protected void processNodesAfterParsing() {
	        for (OsmPrimitive primitive: externalIdMap.values()) {
	            if (primitive instanceof org.openstreetmap.josm.data.osm.Node) {
	                this.ds.addPrimitive(primitive);
	            }
	        }
	    }

	    /**
	     * Completes the parsed relations with its members.
	     *
	     * @throws IllegalDataException thrown if a data integrity problem is detected, i.e. if a
	     * relation member refers to a local primitive which wasn't available in the data
	     *
	     */
	    private void processRelationsAfterParsing() throws IllegalDataException {

	        // First add all relations to make sure that when relation reference other relation, the referenced will be already in dataset
	        for (Long externalRelationId : relations.keySet()) {
	            Relation relation = (Relation) externalIdMap.get(
	                    new SimplePrimitiveId(externalRelationId, OsmPrimitiveType.RELATION)
	            );
	            ds.addPrimitive(relation);
	        }

	        for (Long externalRelationId : relations.keySet()) {
	            Relation relation = (Relation) externalIdMap.get(
	                    new SimplePrimitiveId(externalRelationId, OsmPrimitiveType.RELATION)
	            );
	            List<RelationMember> relationMembers = new ArrayList<RelationMember>();
	            for (RelationMemberData rm : relations.get(externalRelationId)) {
	                OsmPrimitive primitive = null;

	                // lookup the member from the map of already created primitives
	                primitive = externalIdMap.get(new SimplePrimitiveId(rm.id, rm.type));

	                if (primitive == null) {
	                    if (rm.id <= 0)
	                        // relation member refers to a primitive with a negative id which was not
	                        // found in the data. This is always a data integrity problem and we abort
	                        // with an exception
	                        //
	                        throw new IllegalDataException(
	                                tr("Relation with external id ''{0}'' refers to a missing primitive with external id ''{1}''.",
	                                        externalRelationId,
	                                        rm.id));

	                    // member refers to OSM primitive which was not present in the parsed data
	                    // -> create a new incomplete primitive and add it to the dataset
	                    //
	                    primitive = ds.getPrimitiveById(rm.id, rm.type);
	                    if (primitive == null) {
	                        switch (rm.type) {
	                        case NODE:
	                            primitive = new org.openstreetmap.josm.data.osm.Node(rm.id); break;
	                        case WAY:
	                            primitive = new Way(rm.id); break;
	                        case RELATION:
	                            primitive = new Relation(rm.id); break;
	                        default: throw new AssertionError(); // can't happen
	                        }

	                        ds.addPrimitive(primitive);
	                        externalIdMap.put(new SimplePrimitiveId(rm.id, rm.type), primitive);
	                    }
	                }
	                if (primitive.isDeleted()) {
	                    logger.warning(tr("Deleted member {0} is used by relation {1}", primitive.getId(), relation.getId()));
	                } else {
	                    relationMembers.add(new RelationMember(rm.role, primitive));
	                }
	            }
	            relation.setMembers(relationMembers);
	        }
	    }

	    /**
	     * Parse the given input source and return the dataset.
	     *
	     * @param source the source input stream. Must not be null.
	     * @param progressMonitor  the progress monitor. If null, {@see NullProgressMonitor#INSTANCE} is assumed
	     *
	     * @return the dataset with the parsed data
	     * @throws IllegalDataException thrown if the an error was found while parsing the data from the source
	     * @throws IllegalArgumentException thrown if source is null
	     */
	    public static DataSet parseDataSet(InputStream source, ProgressMonitor progressMonitor) throws IllegalDataException {
	        if (progressMonitor == null) {
	            progressMonitor = NullProgressMonitor.INSTANCE;
	        }
	        //CheckParameterUtil.ensureParameterNotNull(source, "source");
	        OsmReader reader = new OsmReader();
	        try {
	            progressMonitor.beginTask(tr("Prepare OSM data...", 2));
	            progressMonitor.indeterminateSubTask(tr("Parsing OSM data..."));
	       //     InputSource inputSource = new InputSource(new InputStreamReader(source, "UTF-8"));
	            //SAXParserFactory.newInstance().newSAXParser().parse(inputSource, reader.new Parser());
	            progressMonitor.worked(1);

	            progressMonitor.indeterminateSubTask(tr("Preparing data set..."));
	            reader.ds.beginUpdate();
	            try {
	                reader.processNodesAfterParsing();
	                reader.processWaysAfterParsing();
	                reader.processRelationsAfterParsing();
	            } finally {
	                reader.ds.endUpdate();
	            }
	            progressMonitor.worked(1);
	            return reader.getDataSet();
	        } catch(IllegalDataException e) {
	            throw e;
	        } 
	        //	            catch(ParserConfigurationException e) {
//	            throw new IllegalDataException(e.getMessage(), e);
//	        } catch(SAXException e) {
//	            throw new IllegalDataException(e.getMessage(), e);
	 //   }
	    catch(Exception e) {
	            throw new IllegalDataException(e);
	        } finally {
	            progressMonitor.finishTask();
	        }
	    }

		private static String tr(String string, int i) {
			// TODO Auto-generated method stub
			return null;
		}

		private static String tr(String string) {
			// TODO Auto-generated method stub
			return null;
		}
}