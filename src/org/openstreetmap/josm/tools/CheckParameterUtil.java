// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.tools;

import java.text.MessageFormat;

import org.openstreetmap.josm.data.osm.OsmPrimitiveType;
import org.openstreetmap.josm.data.osm.PrimitiveId;

/**
 * This utility class provides a collection of static helper methods for checking
 * parameters at run-time.
 *
 */
public class CheckParameterUtil {

    private CheckParameterUtil(){}

    public static void ensureValidPrimitiveId(PrimitiveId id, String parameterName) throws IllegalArgumentException {
        ensureParameterNotNull(id, parameterName);
        if (id.getUniqueId() <= 0)
            throw new IllegalArgumentException(MessageFormat.format("Expected unique id > 0 for primitive ''{1}'', got {0}", id.getUniqueId(), parameterName));
    }

    public static void ensureValidVersion(long version, String parameterName) throws IllegalArgumentException {
        if (version < 0)
            throw new IllegalArgumentException(MessageFormat.format("Expected value of type long > 0 for parameter ''{0}'', got {1}", parameterName, version));
    }

    public static void ensureParameterNotNull(Object value, String parameterName) {
        if (value == null)
            throw new IllegalArgumentException(MessageFormat.format("Parameter ''{0}'' must not be null", parameterName));
    }

    /**
     * Ensures that <code>id</code> is non-null primitive id of type {@see OsmPrimitiveType#NODE}
     *
     * @param id  the primitive  id
     * @param parameterName the name of the parameter to be checked
     * @throws IllegalArgumentException thrown if id is null
     * @throws IllegalArgumentException thrown if id.getType() != NODE
     */
    public static void ensureValidNodeId(PrimitiveId id, String parameterName) throws IllegalArgumentException {
        ensureParameterNotNull(id, parameterName);
        if (! id.getType().equals(OsmPrimitiveType.NODE))
            throw new IllegalArgumentException(MessageFormat.format("Parameter ''{0}'' of type node expected, got ''{1}''", parameterName, id.getType().getAPIName()));
    }
}
