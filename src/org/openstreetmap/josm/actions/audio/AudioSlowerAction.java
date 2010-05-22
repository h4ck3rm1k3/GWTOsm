// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.actions.audio;

import static org.openstreetmap.josm.tools.I18n.tr;
import static org.openstreetmap.josm.tools.I18n.trc;

import java.awt.event.KeyEvent;

import org.openstreetmap.josm.tools.Shortcut;

public class AudioSlowerAction extends AudioFastSlowAction {

    public AudioSlowerAction() {
        super(trc("audio", "Slower"), "audio-slower", trc("audio", "Slower Forward"),
        Shortcut.registerShortcut("audio:slower", tr("Audio: {0}", trc("audio", "Slower")), KeyEvent.VK_F4, Shortcut.GROUP_DIRECT), true);
    }
}
