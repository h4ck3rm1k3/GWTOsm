package org.openstreetmap.josm.gui.bbox;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.util.Vector;

import org.openstreetmap.gui.jmapviewer.Coordinate;
import org.openstreetmap.gui.jmapviewer.JMapViewer;
import org.openstreetmap.gui.jmapviewer.MapMarkerDot;
import org.openstreetmap.gui.jmapviewer.MemoryTileCache;
import org.openstreetmap.gui.jmapviewer.OsmFileCacheTileLoader;
import org.openstreetmap.gui.jmapviewer.OsmMercator;
import org.openstreetmap.gui.jmapviewer.OsmTileLoader;
import org.openstreetmap.gui.jmapviewer.OsmTileSource;
import org.openstreetmap.gui.jmapviewer.interfaces.MapMarker;
import org.openstreetmap.gui.jmapviewer.interfaces.TileLoader;
import org.openstreetmap.gui.jmapviewer.interfaces.TileSource;
import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.data.Bounds;
import org.openstreetmap.josm.data.coor.LatLon;

public class SlippyMapBBoxChooser extends JMapViewer implements BBoxChooser{
    static private TileSource[] TILE_SOURCES = { new OsmTileSource.Mapnik(),
        new OsmTileSource.TilesAtHome(), new OsmTileSource.CycleMap() };

    // standard dimension
    private Dimension iDownloadDialogDimension;

    private TileLoader cachedLoader;
    private TileLoader uncachedLoader;

    private SizeButton iSizeButton = new SizeButton();
    private SourceButton iSourceButton = new SourceButton();
    private Bounds bbox;

    // upper left and lower right corners of the selection rectangle (x/y on
    // ZOOM_MAX)
    Point iSelectionRectStart;
    Point iSelectionRectEnd;

    public SlippyMapBBoxChooser() {
        super();
        try {
            cachedLoader = new OsmFileCacheTileLoader(this);
        } catch (SecurityException e) {
            // set to null if a SecurityException was thrown
            // while creating the cachedLoader
            //
            cachedLoader = null;
        }
        uncachedLoader = new OsmTileLoader(this);
        setZoomContolsVisible(false);
        setMapMarkerVisible(false);
        setMinimumSize(new Dimension(350, 350 / 2));
        // We need to set an initial size - this prevents a wrong zoom selection
        // for
        // the area before the component has been displayed the first time
        setBounds(new Rectangle(getMinimumSize()));
        if (cachedLoader == null) {
            setFileCacheEnabled(false);
        } else {
            setFileCacheEnabled(Main.pref.getBoolean("slippy_map_chooser.file_cache", true));
        }
        setMaxTilesInMemory(Main.pref.getInteger("slippy_map_chooser.max_tiles", 1000));

        String mapStyle = Main.pref.get("slippy_map_chooser.mapstyle", "mapnik");
        if (mapStyle.equals("osmarender")) {
            iSourceButton.setMapStyle(SourceButton.OSMARENDER);
            this.setTileSource(TILE_SOURCES[1]);
        } else if (mapStyle.equals("cyclemap")) {
            iSourceButton.setMapStyle(SourceButton.CYCLEMAP);
            this.setTileSource(TILE_SOURCES[2]);
        } else {
            if (!mapStyle.equals("mapnik")) {
                Main.pref.put("slippy_map_chooser", "mapnik");
            }
        }

        new SlippyMapControler(this, this, iSizeButton, iSourceButton);
    }

    protected Point getTopLeftCoordinates() {
        return new Point(center.x - (getWidth() / 2), center.y - (getHeight() / 2));
    }

    /**
     * Draw the map.
     */
    @Override
    public void paint(Graphics g) {
        try {
            super.paint(g);

            // draw selection rectangle
            if (iSelectionRectStart != null && iSelectionRectEnd != null) {

                int zoomDiff = MAX_ZOOM - zoom;
                Point tlc = getTopLeftCoordinates();
                int x_min = (iSelectionRectStart.x >> zoomDiff) - tlc.x;
                int y_min = (iSelectionRectStart.y >> zoomDiff) - tlc.y;
                int x_max = (iSelectionRectEnd.x >> zoomDiff) - tlc.x;
                int y_max = (iSelectionRectEnd.y >> zoomDiff) - tlc.y;

                int w = x_max - x_min;
                int h = y_max - y_min;
                g.setColor(new Color(0.9f, 0.7f, 0.7f, 0.6f));
                g.fillRect(x_min, y_min, w, h);

                g.setColor(Color.BLACK);
                g.drawRect(x_min, y_min, w, h);
            }

            iSizeButton.paint(g);
            iSourceButton.paint(g);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setFileCacheEnabled(boolean enabled) {
        if (enabled) {
            setTileLoader(cachedLoader);
        } else {
            setTileLoader(uncachedLoader);
        }
    }

    public void setMaxTilesInMemory(int tiles) {
        ((MemoryTileCache) getTileCache()).setCacheSize(tiles);
    }


    /**
     * Callback for the OsmMapControl. (Re-)Sets the start and end point of the
     * selection rectangle.
     *
     * @param aStart
     * @param aEnd
     */
    public void setSelection(Point aStart, Point aEnd) {
        if (aStart == null || aEnd == null || aStart.x == aEnd.x || aStart.y == aEnd.y)
            return;

        Point p_max = new Point(Math.max(aEnd.x, aStart.x), Math.max(aEnd.y, aStart.y));
        Point p_min = new Point(Math.min(aEnd.x, aStart.x), Math.min(aEnd.y, aStart.y));

        Point tlc = getTopLeftCoordinates();
        int zoomDiff = MAX_ZOOM - zoom;
        Point pEnd = new Point(p_max.x + tlc.x, p_max.y + tlc.y);
        Point pStart = new Point(p_min.x + tlc.x, p_min.y + tlc.y);

        pEnd.x <<= zoomDiff;
        pEnd.y <<= zoomDiff;
        pStart.x <<= zoomDiff;
        pStart.y <<= zoomDiff;

        iSelectionRectStart = pStart;
        iSelectionRectEnd = pEnd;

        Coordinate l1 = getPosition(p_max);
        Coordinate l2 = getPosition(p_min);
        Bounds b = new Bounds(
                new LatLon(
                        Math.min(l2.getLat(), l1.getLat()),
                        Math.min(l1.getLon(), l2.getLon())
                ),
                new LatLon(
                        Math.max(l2.getLat(), l1.getLat()),
                        Math.max(l1.getLon(), l2.getLon()))
        );
        Bounds oldValue = this.bbox;
        this.bbox = b;
        firePropertyChange(BBOX_PROP, oldValue, this.bbox);
        repaint();
    }

    /**
     * Performs resizing of the DownloadDialog in order to enlarge or shrink the
     * map.
     */
    public void resizeSlippyMap() {
        int w, h;

        // retrieve the size of the display
        Dimension iScreenSize = Toolkit.getDefaultToolkit().getScreenSize();

        // enlarge
        if(iDownloadDialogDimension == null) {
            // make the each dimension 90% of the absolute display size
            w = iScreenSize.width * 90 / 100;
            h = iScreenSize.height * 90 / 100;
        }
        // shrink
        else {
            // set the size back to the initial dimensions
            w = iDownloadDialogDimension.width;
            h = iDownloadDialogDimension.height;
            iDownloadDialogDimension = null;
        }

        repaint();
    }

    public void toggleMapSource(int mapSource) {
        this.tileController.setTileCache(new MemoryTileCache());
        if (mapSource == SourceButton.MAPNIK) {
            this.setTileSource(TILE_SOURCES[0]);
            Main.pref.put("slippy_map_chooser.mapstyle", "mapnik");
        } else if (mapSource == SourceButton.CYCLEMAP) {
            this.setTileSource(TILE_SOURCES[2]);
            Main.pref.put("slippy_map_chooser.mapstyle", "cyclemap");
        } else {
            this.setTileSource(TILE_SOURCES[1]);
            Main.pref.put("slippy_map_chooser.mapstyle", "osmarender");
        }
    }

    public Bounds getBoundingBox() {
        return bbox;
    }

    /**
     * Sets the current bounding box in this bbox chooser without
     * emiting a property change event.
     * 
     * @param bbox the bounding box. null to reset the bounding box
     */
    public void setBoundingBox(Bounds bbox) {
        if (bbox == null) {
            this.bbox = null;
            return;
        }
        // test if a bounding box has been set
        if (bbox.getMin().lat() == 0.0 && bbox.getMin().lon() == 0.0 && bbox.getMax().lat() == 0.0 && bbox.getMax().lon() == 0.0) {
            this.bbox = null;
        }

        int y1 = OsmMercator.LatToY(bbox.getMin().lat(), MAX_ZOOM);
        int y2 = OsmMercator.LatToY(bbox.getMax().lat(), MAX_ZOOM);
        int x1 = OsmMercator.LonToX(bbox.getMin().lon(), MAX_ZOOM);
        int x2 = OsmMercator.LonToX(bbox.getMax().lon(), MAX_ZOOM);

        iSelectionRectStart = new Point(Math.min(x1, x2), Math.min(y1, y2));
        iSelectionRectEnd = new Point(Math.max(x1, x2), Math.max(y1, y2));

        // calc the screen coordinates for the new selection rectangle
        MapMarkerDot xmin_ymin = new MapMarkerDot(bbox.getMin().lat(), bbox.getMin().lon());
        MapMarkerDot xmax_ymax = new MapMarkerDot(bbox.getMax().lat(), bbox.getMax().lon());

        Vector<MapMarker> marker = new Vector<MapMarker>(2);
        marker.add(xmin_ymin);
        marker.add(xmax_ymax);
        setMapMarkerList(marker);
        setDisplayToFitMapMarkers();
        zoomOut();
        this.bbox = bbox;
    }
}
