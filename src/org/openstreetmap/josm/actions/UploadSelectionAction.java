// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.actions;

import static org.openstreetmap.josm.gui.help.HelpUtil.ht;
import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.event.ActionEvent;
import java.io.IOException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.APIDataSet;
import org.openstreetmap.josm.data.osm.Changeset;
import org.openstreetmap.josm.data.osm.DataSet;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Relation;
import org.openstreetmap.josm.data.osm.Way;
import org.openstreetmap.josm.data.osm.visitor.Visitor;
import org.openstreetmap.josm.gui.DefaultNameFormatter;
import org.openstreetmap.josm.gui.PleaseWaitRunnable;
import org.openstreetmap.josm.gui.io.UploadSelectionDialog;
import org.openstreetmap.josm.gui.layer.OsmDataLayer;
import org.openstreetmap.josm.io.OsmServerBackreferenceReader;
import org.openstreetmap.josm.io.OsmTransferException;
import org.openstreetmap.josm.tools.CheckParameterUtil;
import org.openstreetmap.josm.tools.ExceptionUtil;
import org.xml.sax.SAXException;

/**
 * Uploads the current selection to the server.
 *
 */
public class UploadSelectionAction extends JosmAction{
    //static private Logger logger = Logger.getLogger(UploadSelectionAction.class.getName());

    public UploadSelectionAction() {
        super(
                tr("Upload selection"),
                "uploadselection",
                tr("Upload all changes in the current selection to the OSM server."),
                null, /* no shortcut */
                true);
        putValue("help", ht("/Action/UploadSelection"));
    }

    @Override
    protected void updateEnabledState() {
        if (getCurrentDataSet() == null) {
            setEnabled(false);
        } else {
            updateEnabledState(getCurrentDataSet().getSelected());
        }
    }

    @Override
    protected void updateEnabledState(Collection<? extends OsmPrimitive> selection) {
        setEnabled(selection != null && !selection.isEmpty());
    }

    protected Set<OsmPrimitive> getDeletedPrimitives(DataSet ds) {
        HashSet<OsmPrimitive> ret = new HashSet<OsmPrimitive>();
        for (OsmPrimitive p: ds.allPrimitives()) {
            if (p.isDeleted() && !p.isNew() && p.isVisible() && p.isModified()) {
                ret.add(p);
            }
        }
        return ret;
    }

    protected Set<OsmPrimitive> getModifiedPrimitives(Collection<OsmPrimitive> primitives) {
        HashSet<OsmPrimitive> ret = new HashSet<OsmPrimitive>();
        for (OsmPrimitive p: primitives) {
            if (p.isNew()) {
                ret.add(p);
            } else if (p.isVisible() && p.isModified() && !p.isIncomplete()) {
                ret.add(p);
            }
        }
        return ret;
    }

    public void actionPerformed(ActionEvent e) {
        if (!isEnabled())
            return;
        UploadHullBuilder builder = new UploadHullBuilder();
        UploadSelectionDialog dialog = new UploadSelectionDialog();
        Collection<OsmPrimitive> modifiedCandidates = getModifiedPrimitives(getEditLayer().data.getSelected());
        Collection<OsmPrimitive> deletedCandiates = getDeletedPrimitives(getEditLayer().data);
        if (modifiedCandidates.isEmpty() && deletedCandiates.isEmpty()) {
            JOptionPane.showMessageDialog(
                    Main.parent,
                    tr("No changes to upload."),
                    tr("Warning"),
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        dialog.populate(
                modifiedCandidates,
                deletedCandiates
        );
        dialog.setVisible(true);
        if (dialog.isCanceled())
            return;
        Collection<OsmPrimitive> toUpload = builder.build(dialog.getSelectedPrimitives());
        if (toUpload.isEmpty()) {
            JOptionPane.showMessageDialog(
                    Main.parent,
                    tr("No changes to upload."),
                    tr("Warning"),
                    JOptionPane.INFORMATION_MESSAGE
            );
            return;
        }
        uploadPrimitives(getEditLayer(), toUpload);
    }

    /**
     * Replies true if there is at least one non-new, deleted primitive in
     * <code>primitives</code>
     *
     * @param primitives the primitives to scan
     * @return true if there is at least one non-new, deleted primitive in
     * <code>primitives</code>
     */
    protected boolean hasPrimitivesToDelete(Collection<OsmPrimitive> primitives) {
        for (OsmPrimitive p: primitives)
            if (p.isDeleted() && p.isModified() && !p.isNew())
                return true;
        return false;
    }

    /**
     * Uploads the primitives in <code>toUpload</code> to the server. Only
     * uploads primitives which are either new, modified or deleted.
     *
     * Also checks whether <code>toUpload</code> has to be extended with
     * deleted parents in order to avoid precondition violations on the server.
     *
     * @param layer the data layer from which we upload a subset of primitives
     * @param toUpload the primitives to upload. If null or empty returns immediatelly
     */
    public void uploadPrimitives(OsmDataLayer layer, Collection<OsmPrimitive> toUpload) {
        if (toUpload == null || toUpload.isEmpty()) return;
        UploadHullBuilder builder = new UploadHullBuilder();
        toUpload = builder.build(toUpload);
        if (hasPrimitivesToDelete(toUpload)) {
            // runs the check for deleted parents and then invokes
            // processPostParentChecker()
            //
            Main.worker.submit(new DeletedParentsChecker(layer, toUpload));
        } else {
            processPostParentChecker(layer, toUpload);
        }
    }

    protected void processPostParentChecker(OsmDataLayer layer, Collection<OsmPrimitive> toUpload) {
        APIDataSet ds = new APIDataSet(toUpload);
        UploadAction action = new UploadAction();
        action.uploadData(layer, ds);
    }

    /**
     * Computes the collection of primitives to upload, given a collection of candidate
     * primitives.
     * Some of the candidates are excluded, i.e. if they aren't modified or if they
     * aren't visible.
     * Other primitives are added. A typical case is a primitive which is new and and
     * which is referred by a modified relation. In order to upload the relation the
     * new primitive has to be uploaded as well, even if it isn't included in the
     * list of candidate primitives.
     *
     */
    static class UploadHullBuilder implements Visitor {
        private Set<OsmPrimitive> hull;

        public UploadHullBuilder(){
            hull = new HashSet<OsmPrimitive>();
        }

        public void visit(Node n) {
            if (n.isNew() || ((n.isModified() || n.isDeleted()) && n.isVisible())) {
                // upload new nodes as well as modified and deleted ones
                hull.add(n);
            }
        }

        public void visit(Way w) {
            if (w.isNew() || ((w.isModified() || w.isDeleted()) && w.isVisible())) {
                // upload new ways as well as modified and deleted ones
                hull.add(w);
                for (Node n: w.getNodes()) {
                    // we upload modified nodes even if they aren't in the current
                    // selection.
                    n.visit(this);
                }
            }
        }

        public void visit(Relation r) {
            if (r.isNew() || ((r.isModified() || r.isDeleted()) && r.isVisible())) {
                hull.add(r);
                for (OsmPrimitive p : r.getMemberPrimitives()) {
                    // add new relation members. Don't include modified
                    // relation members. r shouldn't refer to deleted primitives,
                    // so wont check here for deleted primitives here
                    //
                    if (p.isNew()) {
                        p.visit(this);
                    }
                }
            }
        }

        public void visit(Changeset cs) {
            // do nothing
        }

        /**
         * Builds the "hull" of primitives to be uploaded given a base collection
         * of osm primitives.
         *
         * @param base the base collection. Must not be null.
         * @return the "hull"
         * @throws IllegalArgumentException thrown if base is null
         */
        public Set<OsmPrimitive> build(Collection<OsmPrimitive> base) throws IllegalArgumentException{
            CheckParameterUtil.ensureParameterNotNull(base, "base");
            hull = new HashSet<OsmPrimitive>();
            for (OsmPrimitive p: base) {
                p.visit(this);
            }
            return hull;
        }
    }

    class DeletedParentsChecker extends PleaseWaitRunnable {
        private boolean canceled;
        private Exception lastException;
        private Collection<OsmPrimitive> toUpload;
        private OsmDataLayer layer;
        private OsmServerBackreferenceReader reader;

        /**
         *
         * @param layer the data layer for which a collection of selected primitives is uploaded
         * @param toUpload the collection of primitives to upload
         */
        public DeletedParentsChecker(OsmDataLayer layer, Collection<OsmPrimitive> toUpload) {
            super(tr("Checking parents for deleted objects"));
            this.toUpload = toUpload;
            this.layer = layer;
        }

        @Override
        protected void cancel() {
            this.canceled = true;
            synchronized (this) {
                if (reader != null) {
                    reader.cancel();
                }
            }
        }

        @Override
        protected void finish() {
            if (canceled)
                return;
            if (lastException != null) {
                ExceptionUtil.explainException(lastException);
                return;
            }
            Runnable r = new Runnable() {
                public void run() {
                    processPostParentChecker(layer, toUpload);
                }
            };
            SwingUtilities.invokeLater(r);
        }

        /**
         * Replies the collection of deleted OSM primitives for which we have to check whether
         * there are dangling references on the server.
         *
         * @return
         */
        protected Set<OsmPrimitive> getPrimitivesToCheckForParents() {
            HashSet<OsmPrimitive> ret = new HashSet<OsmPrimitive>();
            for (OsmPrimitive p: toUpload) {
                if (p.isDeleted() && !p.isNew()) {
                    ret.add(p);
                }
            }
            return ret;
        }

        @Override
        protected void realRun() throws SAXException, IOException, OsmTransferException {
            try {
                Stack<OsmPrimitive> toCheck = new Stack<OsmPrimitive>();
                toCheck.addAll(getPrimitivesToCheckForParents());
                Set<OsmPrimitive> checked = new HashSet<OsmPrimitive>();
                while(!toCheck.isEmpty()) {
                    if (canceled) return;
                    OsmPrimitive current = toCheck.pop();
                    synchronized(this) {
                        reader = new OsmServerBackreferenceReader(current);
                    }
                    getProgressMonitor().subTask(tr("Reading parents of ''{0}''", current.getDisplayName(DefaultNameFormatter.getInstance())));
                    DataSet ds = reader.parseOsm(getProgressMonitor().createSubTaskMonitor(1, false));
                    synchronized(this) {
                        reader = null;
                    }
                    checked.add(current);
                    getProgressMonitor().subTask(tr("Checking for deleted parents in the local dataset"));
                    for (OsmPrimitive p: ds.allPrimitives()) {
                        if (canceled) return;
                        OsmPrimitive myDeletedParent = layer.data.getPrimitiveById(p);
                        // our local dataset includes a deleted parent of a primitive we want
                        // to delete. Include this parent in the collection of uploaded primitives
                        //
                        if (myDeletedParent != null && myDeletedParent.isDeleted()) {
                            if (!toUpload.contains(myDeletedParent)) {
                                toUpload.add(myDeletedParent);
                            }
                            if (!checked.contains(myDeletedParent)) {
                                toCheck.push(myDeletedParent);
                            }
                        }
                    }
                }
            } catch(Exception e) {
                if (canceled)
                    // ignore exception
                    return;
                lastException = e;
            }
        }
    }
}
