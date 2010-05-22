// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.actions;

import static org.openstreetmap.josm.tools.I18n.tr;
import static org.openstreetmap.josm.gui.help.HelpUtil.ht;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.tools.Shortcut;

public class ToggleGPXLinesAction extends JosmAction {

    public ToggleGPXLinesAction() {
        super(tr("Toggle GPX Lines"), "gps-lines", tr("Toggles the global setting ''{0}''.", tr("Draw lines between raw gps points.")),
        Shortcut.registerShortcut("view:gpxlines", tr("View: {0}", tr("Toggle GPX Lines")), KeyEvent.VK_X, Shortcut.GROUP_MENU, Shortcut.SHIFT_DEFAULT), true);
        putValue("help", ht("/Action/ToggleGPXLines"));
    }

    public void actionPerformed(ActionEvent e) {
        Main.pref.put("draw.rawgps.lines", !Main.pref.getBoolean("draw.rawgps.lines", true));
        if(Main.map != null) {
            Main.map.mapView.repaint();
        }
    }
}
