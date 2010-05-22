// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openstreetmap.josm.data.osm.visitor.AbstractVisitor;

/**
 * This class allows to create and keep a deep copy of primitives. Provides methods to access directly added
 * primitives and reference primitives
 *
 */
public class PrimitiveDeepCopy {

    private final List<PrimitiveData> directlyAdded = new ArrayList<PrimitiveData>();
    private final List<PrimitiveData> referenced = new ArrayList<PrimitiveData>();

    public PrimitiveDeepCopy() {

    }

    public PrimitiveDeepCopy(final Collection<OsmPrimitive> primitives) {
        makeCopy(primitives);
    }

    /**
     * Replace content of the object with copy of provided primitives
     * @param primitives
     */
    public final void makeCopy(final Collection<OsmPrimitive> primitives) {
        directlyAdded.clear();
        referenced.clear();

        final Set<Long> visitedNodeIds = new HashSet<Long>();
        final Set<Long> visitedWayIds = new HashSet<Long>();
        final Set<Long> visitedRelationIds = new HashSet<Long>();

        new AbstractVisitor() {
            boolean firstIteration;

            public void visit(Node n) {
                if (!visitedNodeIds.add(n.getUniqueId()))
                    return;
                (firstIteration ? directlyAdded : referenced).add(n.save());
            }
            public void visit(Way w) {
                if (!visitedWayIds.add(w.getUniqueId()))
                    return;
                (firstIteration ? directlyAdded : referenced).add(w.save());
                firstIteration = false;
                for (Node n : w.getNodes()) {
                    visit(n);
                }
            }
            public void visit(Relation r) {
                if (!visitedRelationIds.add(r.getUniqueId()))
                    return;
                (firstIteration ? directlyAdded : referenced).add(r.save());
                firstIteration = false;
                for (RelationMember m : r.getMembers()) {
                    m.getMember().visit(this);
                }
            }

            public void visitAll() {
                for (OsmPrimitive osm : primitives) {
                    firstIteration = true;
                    osm.visit(this);
                }
            }
        }.visitAll();
    }

    public List<PrimitiveData> getDirectlyAdded() {
        return directlyAdded;
    }

    public List<PrimitiveData> getReferenced() {
        return referenced;
    }

    public List<PrimitiveData> getAll() {
        List<PrimitiveData> result = new ArrayList<PrimitiveData>(directlyAdded.size() + referenced.size());
        result.addAll(directlyAdded);
        result.addAll(referenced);
        return result;
    }

    public boolean isEmpty() {
        return directlyAdded.isEmpty() && referenced.isEmpty();
    }

}
