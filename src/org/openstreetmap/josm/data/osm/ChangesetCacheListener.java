// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm;

public interface ChangesetCacheListener {

    void changesetCacheUpdated(ChangesetCacheEvent event);
}
