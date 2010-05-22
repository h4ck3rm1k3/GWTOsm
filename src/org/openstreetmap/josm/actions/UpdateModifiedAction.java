// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.actions;

import static org.openstreetmap.josm.gui.help.HelpUtil.ht;
import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.event.KeyEvent;
import java.util.Collection;
import java.util.Collections;

import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.tools.Shortcut;

/**
 * This action synchronizes a set of primitives with their state on the server.
 *
 */
public class UpdateModifiedAction extends UpdateSelectionAction {

    /**
     * constructor
     */
    public UpdateModifiedAction() {
        super(tr("Update modified"),
                "updatemodified",
                tr("Updates the currently modified objects from the server (re-downloads data)"),
                Shortcut.registerShortcut("file:updatemodified",
                        tr("Update modified"),
                        KeyEvent.VK_M,
                        Shortcut.GROUP_HOTKEY + Shortcut.GROUPS_ALT2),
                        true);
        putValue("help", ht("/Action/UpdateModified"));
    }

    // FIXME: overrides the behaviour of UpdateSelectionAction. Doesn't update
    // the enabled state based on the current selection because
    // it doesn't depend on it.
    // The action should be enabled/disabled based on whether there is a least
    // one modified object in the current dataset. Unfortunately, there is no
    // efficient way to find out here. getDataSet().allModifiedPrimitives() is
    // too heavy weight because it loops over the whole dataset.
    // Perhaps this action should  be a DataSetListener? Or it could listen to the
    // REQUIRES_SAVE_TO_DISK_PROP and REQUIRES_UPLOAD_TO_SERVER_PROP properties
    // in the OsmLayer?
    //
    @Override
    protected void updateEnabledState() {
        setEnabled(getCurrentDataSet() != null);
    }

    @Override
    protected void updateEnabledState(Collection<? extends OsmPrimitive> selection) {
    }

    @Override
    public Collection<OsmPrimitive> getData() {
        if (getCurrentDataSet() == null) return Collections.emptyList();
        return getCurrentDataSet().allModifiedPrimitives();
    }
}
