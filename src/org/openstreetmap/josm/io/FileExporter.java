// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.io;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.io.File;
import java.io.IOException;

import org.openstreetmap.josm.Layer;

//import org.openstreetmap.josm.actions.ExtensionFileFilter;
//import org.openstreetmap.josm.gui.layer.Layer;

public abstract class FileExporter {
    public ExtensionFileFilter filter;

    public FileExporter(ExtensionFileFilter filter) {
        this.filter = filter;
    }

   

    public void exportData(File file, Layer layer) throws IOException {
        throw new IOException(tr("Could not export ''{0}''.", file.getName()));
    }

	public boolean acceptFile(File pathname,
			Layer layer) {
		// TODO Auto-generated method stub
		return false;
	}

	
}
