// License: GPL. For details, see LICENSE file.
package org.openstreetmap.josm.data.osm.visitor.paint;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.ImageProvider;
import org.openstreetmap.josm.data.osm.LanguageInfo;
import org.openstreetmap.josm.data.osm.Main;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.Point;
import org.openstreetmap.josm.data.osm.Way;
import org.vaadin.gwtgraphics.client.impl.util.SVGUtil;

import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.MouseOutHandler;
import com.google.gwt.event.dom.client.MouseOverHandler;

public class MapPainter {
    private final IGwtGraphics2DSimple g;
    private final INavigatableComponent nc;
    private final boolean inactive;

    private final boolean useStrokes;
    private final boolean showNames;
    private final boolean showIcons;

    private final Color inactiveColor;
    private final Color textColor;
    private final Color selectedColor;
    private final Color areaTextColor;
    private final Color nodeColor;
    private final Color backgroundColor;

    private final Font orderFont;
    private final int fillAlpha;
    private final int virtualNodeSize;
    private final int virtualNodeSpace;
    private final int segmentNumberSpace;

    private final double circum;

    private final Collection<String> regionalNameOrder;
	private int mappaint_fontsize=8;
	private int mappaint_node_virtual_size=8;
	private int mappaint_node_virtual_space=70;
	private int mappaint_segmentnumber_space=40;
	private String mappaint_font="Helvetica";
	private int mappaint_fillalpha=50;
	private MouseOverHandler wayOverHandler = new WayMouseOverHandler();
	private MouseOutHandler wayOutHandler = new WayMouseOutHandler();
	private ClickHandler wayClickHandler = new WayClickHandler();

    public MapPainter(MapPaintSettings settings, IGwtGraphics2DSimple g2, boolean inactive, INavigatableComponent nc2, boolean virtual, double dist, double circum) {
        this.g = g2;
        this.inactive = inactive;
        this.nc = nc2;
        this.useStrokes = settings.getUseStrokesDistance() > dist;
        this.showNames = settings.getShowNamesDistance() > dist;
        this.showIcons = settings.getShowIconsDistance() > dist;

        this.inactiveColor = PaintColors.INACTIVE.get();
        this.textColor = PaintColors.TEXT.get();
        this.selectedColor = PaintColors.SELECTED.get();
        this.areaTextColor = PaintColors.AREA_TEXT.get();
        this.nodeColor = PaintColors.NODE.get();
        this.backgroundColor = PaintColors.BACKGROUND.get();

        // ,8
        this.orderFont = new Font(mappaint_font, Font.PLAIN, mappaint_fontsize);
        
		this.fillAlpha = Math.min(255, Math.max(0, mappaint_fillalpha)); //", 50
        this.virtualNodeSize = virtual ? mappaint_node_virtual_size / 2 : 0; //", 8)
        this.virtualNodeSpace = mappaint_node_virtual_space;//", 70);
        this.segmentNumberSpace = mappaint_segmentnumber_space;//&&, 40);

        String[] names = {"name:" + LanguageInfo.getJOSMLocaleCode(), "name", "int_name", "ref", "operator", "brand", "addr:housenumber"};
        this.regionalNameOrder = Arrays.asList(names);// TODO: localize
        this.circum = circum;
    }

	public void drawWay(Way way, Color color, int width, float dashed[], Color dashedColor, boolean showDirection,
            boolean reversedDirection, boolean showHeadArrowOnly) {

        GeneralPath path = new GeneralPath();
        path.setTitle(way.getName());
        path.setStyleName("osm_way");
        
        //path.setImageHref();
        SVGUtil.setAttributeNS(SVGUtil.XLINK_NS, path.getElement(), "href", "http://www.openstreetmap.org/browse/way/" + way.getId());
        //path.getElement().addClassName(className);
        
        path.addMouseOverHandler(wayOverHandler);
        path.addMouseOutHandler(wayOutHandler);
        path.addClickHandler(wayClickHandler);
        
        Point lastPoint = null;
        Iterator<Node> it = way.getNodes().iterator();
        while (it.hasNext()) {
            Node n = it.next();
            Point p = nc.getPoint(n);
            if(lastPoint != null) {
                drawSegment(path, lastPoint, p, showHeadArrowOnly ? !it.hasNext() : showDirection, reversedDirection);
            }
            lastPoint = p;
        }
        displaySegments(path, color, width, dashed, dashedColor);
    }

    private void displaySegments(GeneralPath path, Color color, int width, float dashed[], Color dashedColor) {

    	g.setColor(inactive ? inactiveColor : color);
        path.setStrokeWidth(1);
        path.setStrokeColor("red");
        if (useStrokes) {
            if (dashed.length > 0) {
                g.setStroke(new BasicStroke(width,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0, dashed,0));
            } else {
                g.setStroke(new BasicStroke(width,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
            }
        }
        GeneralPath p = g.draw(path);

        if(!inactive && useStrokes && dashedColor != null) {
            g.setColor(dashedColor);
            if (dashed.length > 0) {
                float[] dashedOffset = new float[dashed.length];
                System.arraycopy(dashed, 1, dashedOffset, 0, dashed.length - 1);
                dashedOffset[dashed.length-1] = dashed[0];
                float offset = dashedOffset[0];
                g.setStroke(new BasicStroke(width,BasicStroke.CAP_BUTT,BasicStroke.JOIN_ROUND,0,dashedOffset,offset));
            } else {
                g.setStroke(new BasicStroke(width,BasicStroke.CAP_ROUND,BasicStroke.JOIN_ROUND));
            }
            g.draw(path);
        }

        if(useStrokes) {
            g.setStroke(new BasicStroke());
        }
    }

    private static final double PHI = Math.toRadians(20);
    private static final double cosPHI = Math.cos(PHI);
    private static final double sinPHI = Math.sin(PHI);

    private void drawSegment(GeneralPath path, Point p1, Point p2, boolean showDirection, boolean reversedDirection) {
        boolean drawIt = false;
        if (Main.isOpenjdk) {
            /**
             * Work around openjdk bug. It leads to drawing artefacts when zooming in a lot. (#4289, #4424)
             * (It looks like int overflow when clipping.) We do custom clipping.
             */
            Rectangle bounds = g.getClipBounds();
            bounds.grow(100, 100);                  // avoid arrow heads at the border
            LineClip clip = new LineClip();
            drawIt = clip.cohenSutherland(p1.x, p1.y, p2.x, p2.y, bounds.x, bounds.y, bounds.x+bounds.width, bounds.y+bounds.height);
            p1 = clip.getP1();
            p2 = clip.getP2();
        } else {
            drawIt = isSegmentVisible(p1, p2);
        }
        if (drawIt) {
            /* draw segment line */
            path.moveTo(p1.x, p1.y);
            path.lineTo(p2.x, p2.y);

            /* draw arrow */
            if (showDirection) {
                Point q1 = p1;
                Point q2 = p2;
                if (reversedDirection) {
                    q1 = p2;
                    q2 = p1;
                    path.moveTo(q2.x, q2.y);
                }
                final double l =  10. / q1.distance(q2);

                final double sx = l * (q1.x - q2.x);
                final double sy = l * (q1.y - q2.y);

                path.lineTo (q2.x + (int) Math.round(cosPHI * sx - sinPHI * sy), q2.y + (int) Math.round(sinPHI * sx + cosPHI * sy));
                path.moveTo (q2.x + (int) Math.round(cosPHI * sx + sinPHI * sy), q2.y + (int) Math.round(- sinPHI * sx + cosPHI * sy));
                path.lineTo(q2.x, q2.y);
            }
        }
    }

    private boolean isSegmentVisible(Point p1, Point p2) {
        if ((p1.x < 0) && (p2.x < 0)) return false;
        if ((p1.y < 0) && (p2.y < 0)) return false;
        if ((p1.x > nc.getWidth()) && (p2.x > nc.getWidth())) return false;
        if ((p1.y > nc.getHeight()) && (p2.y > nc.getHeight())) return false;
        return true;
    }

    public void drawNodeIcon(Node n, ImageIcon icon, boolean annotate, boolean selected, String name) {
        Point p = nc.getPoint(n);
        if ((p.x < 0) || (p.y < 0) || (p.x > nc.getWidth()) || (p.y > nc.getHeight())) return;

        int w = icon.getIconWidth(), h=icon.getIconHeight();
        icon.paintIcon ( nc.getComp(), g, p.x-w/2, p.y-h/2 );
        if(name != null) {
            if (inactive || n.isDisabled()) {
                g.setColor(inactiveColor);
            } else {
                g.setColor(textColor);
            }
            Font defaultFont = g.getFont();
            g.setFont (orderFont);
            g.drawString (name, p.x+w/2+2, p.y+h/2+2);
            g.setFont(defaultFont);
        }
        if (selected)
        {
            g.setColor (  selectedColor );
            Rectangle r= g.drawRect (p.x-w/2-2, p.y-h/2-2, w+4, h+4);
        }
    }

    /**
     * Draw the node as small rectangle with the given color.
     *
     * @param n  The node to draw.
     * @param color The color of the node.
     */
    public void drawNode(Node n, Color color, int size, boolean fill, String name) {
        if (size > 1) {
            int radius = size / 2;
            Point p = nc.getPoint(n);
            if ((p.x < 0) || (p.y < 0) || (p.x > nc.getWidth())
                    || (p.y > nc.getHeight()))
                return;
            Rectangle r=null;
            
            String style= "osm_node";
            
            if (inactive || n.isDisabled()) {
                g.setColor(inactiveColor);
                style += "_inactive";
            } else {
                g.setColor(color);
            }
            if (fill) {
                g.fillRect(p.x - radius, p.y - radius, size, size);
                r= g.drawRect(p.x - radius, p.y - radius, size, size);
                style += "_filled";
            } else {
            	r= g.drawRect(p.x - radius, p.y - radius, size, size);
            	style += "_normal";
            	
            }

            if(name != null)            {
                if (inactive || n.isDisabled()) {
                    g.setColor(inactiveColor);
                } else {
                    g.setColor(textColor);
                }
                Font defaultFont = g.getFont();
                g.setFont (orderFont);
                g.drawString (name, p.x+radius+2, p.y+radius+2);
                g.setFont(defaultFont);
                style += "_title";
                r.setTitle(name);
                
            }
            
            r.setStyleName(style);
         
            SVGUtil.setAttributeNS(SVGUtil.XLINK_NS, r.getElement(), "href", "http://www.openstreetmap.org/browse/node/" + n.getId());
            
        }
    }

    protected void drawArea(Polygon polygon, Color color, String name) {

        /* set the opacity (alpha) level of the filled polygon */
        g.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue(), fillAlpha));
        g.fillPolygon(polygon);

        if (name != null) {
            Rectangle pb = polygon.getBounds();
            FontMetrics fontMetrics = g.getFontMetrics(orderFont); // if slow, use cache
            Rectangle2D nb = fontMetrics.getStringBounds(name, g.g()); // if slow, approximate by strlen()*maxcharbounds(font)

            // Point2D c = getCentroid(polygon);
            // Using the Centroid is Nicer for buildings like: +--------+
            // but this needs to be fast.  As most houses are  |   42   |
            // boxes anyway, the center of the bounding box    +---++---+
            // will have to do.                                    ++
            // Centroids are not optimal either, just imagine a U-shaped house.
            // Point2D c = new Point2D.Double(pb.x + pb.width / 2.0, pb.y + pb.height / 2.0);
            // Rectangle2D.Double centeredNBounds =
            //     new Rectangle2D.Double(c.getX() - nb.getWidth()/2,
            //                            c.getY() - nb.getHeight()/2,
            //                            nb.getWidth(),
            //                            nb.getHeight());

            Rectangle centeredNBounds = new Rectangle(pb.x + (int)((pb.width - nb.getWidth())/2.0),
                    pb.y + (int)((pb.height - nb.getHeight())/2.0),
                    (int)nb.getWidth(),
                    (int)nb.getHeight());

            if ((pb.width >= nb.getWidth() && pb.height >= nb.getHeight()) && // quick check
                    polygon.contains(centeredNBounds) // slow but nice
            ) {
                g.setColor(areaTextColor);
                Font defaultFont = g.getFont();
                g.setFont (orderFont);
                g.drawString (name,
                        (int)(centeredNBounds.getMinX() - nb.getMinX()),
                        (int)(centeredNBounds.getY() - nb.getY()));
                g.setFont(defaultFont);
            }
        }
    }

    public void drawRestriction(ImageIcon icon, Point pVia, double vx, double vx2, double vy, double vy2, double iconAngle, boolean selected) {
        /* rotate icon with direction last node in from to */
        ImageIcon rotatedIcon = ImageProvider.createRotatedImage(null /*icon2*/, icon, iconAngle);

        /* scale down icon to 16*16 pixels */
        ImageIcon smallIcon = new ImageIcon(rotatedIcon.getImage().getScaledInstance(16 , 16, Image.SCALE_SMOOTH));
        int w = smallIcon.getIconWidth(), h=smallIcon.getIconHeight();
        smallIcon.paintIcon (nc.getComp(), g.g(), (int)(pVia.x+vx+vx2)-w/2, (int)(pVia.y+vy+vy2)-h/2 );

        if (selected) {
            g.setColor(selectedColor);
            Rectangle r= g.drawRect((int)(pVia.x+vx+vx2)-w/2-2,(int)(pVia.y+vy+vy2)-h/2-2, w+4, h+4);
        }
    }

    public void drawVirtualNodes(Collection<Way> ways) {

        if (virtualNodeSize != 0) {
            GeneralPath path = new GeneralPath(0,0);
            for (Way osm: ways){
                if (osm.isUsable() && !osm.isFiltered() && !osm.isDisabled()) {
                    visitVirtual(path, osm);
                }
            }
            g.setColor(nodeColor);
            g.draw(path);
        }
    }

    public void visitVirtual(GeneralPath path, Way w) {
        Iterator<Node> it = w.getNodes().iterator();
        if (it.hasNext()) {
            Point lastP = nc.getPoint(it.next());
            while(it.hasNext())
            {
                Point p = nc.getPoint(it.next());
                if(isSegmentVisible(lastP, p) && isLargeSegment(lastP, p, virtualNodeSpace))
                {
                    int x = (int)(p.x+lastP.x)/2;
                    int y = (int)(p.y+lastP.y)/2;
                    path.moveTo(x-virtualNodeSize, y);
                    path.lineTo(x+virtualNodeSize, y);
                    path.moveTo(x, y-virtualNodeSize);
                    path.lineTo(x, y+virtualNodeSize);
                }
                lastP = p;
            }
        }
    }

    private static boolean isLargeSegment(Point p1, Point p2, int space)  {
        int xd = (int) (p1.x-p2.x); if(xd < 0) {
            xd = -xd;
        }
        int yd = (int) (p1.y-p2.y); if(yd < 0) {
            yd = -yd;
        }
        return (xd+yd > space);
    }

    /**
     * Draw a number of the order of the two consecutive nodes within the
     * parents way
     */
    public void drawOrderNumber(Node n1, Node n2, int orderNumber) {
        Point p1 = nc.getPoint(n1);
        Point p2 = nc.getPoint(n2);
        drawOrderNumber(p1, p2, orderNumber);
    }

    /**
     * Draw an number of the order of the two consecutive nodes within the
     * parents way
     */
    protected void drawOrderNumber(Point p1, Point p2, int orderNumber) {
        if (isSegmentVisible(p1, p2) && isLargeSegment(p1, p2, segmentNumberSpace)) {
            String on = Integer.toString(orderNumber);
            int strlen = on.length();
            int x = (int) ((p1.x+p2.x)/2 - 4*strlen);
            int y = (int) ((p1.y+p2.y)/2 + 4);

            if(virtualNodeSize != 0 && isLargeSegment(p1, p2, virtualNodeSpace))
            {
                y = (int) ((p1.y+p2.y)/2 - virtualNodeSize - 3);
            }

            Color c = g.getColor();
            g.setColor(backgroundColor);
            g.fillRect(x-1, y-12, 8*strlen+1, 14);
            g.setColor(c);
            g.drawString(on, x, y);
        }
    }

    //TODO Not a good place for this method
    public String getNodeName(Node n) {
        String name = null;
        if (n.hasKeys()) {
            for (String rn : regionalNameOrder) {
                name = n.get(rn);
                if (name != null) {
                    break;
                }
            }
        }
        return name;
    }

    //TODO Not a good place for this method
    public String getWayName(Way w) {
        String name = null;
        if (w.hasKeys()) {
            for (String rn : regionalNameOrder) {
                name = w.get(rn);
                if (name != null) {
                    break;
                }
            }
        }
        return name;
    }

    public boolean isInactive() {
        return inactive;
    }

    public boolean isShowNames() {
        return showNames;
    }

    public double getCircum() {
        return circum;
    }

    public boolean isShowIcons() {
        return showIcons;
    }

	public void drawArea(Polygon p, Color color, Object name) {
		// TODO Auto-generated method stub
		g.fillPolygon(p);
	}

//	public void drawNodeIcon(Node n, ImageIcon imageIcon, boolean annotate,
//			boolean selected, String name) {
//		// TODO Auto-generated method stub
//		
//	}

	
	

}
