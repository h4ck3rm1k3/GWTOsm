// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm.visitor;

import org.openstreetmap.josm.data.osm.Changeset;

/**
 * This class serves as a base class for most simple visitors,
 * blocking out the "changeset" visit so as to avoid cluttering
 * the visitors which are not interested.
 *
 * @author fred
 */
public abstract class AbstractVisitor implements Visitor {

    public void visit(Changeset cs) {
        // do nothing
    }
}
