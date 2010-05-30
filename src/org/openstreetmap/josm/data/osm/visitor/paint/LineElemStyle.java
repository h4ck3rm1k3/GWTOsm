package org.openstreetmap.josm.data.osm.visitor.paint;

import org.openstreetmap.josm.data.osm.Color;
import org.openstreetmap.josm.data.osm.ElemStyle;
import org.openstreetmap.josm.data.osm.Node;
import org.openstreetmap.josm.data.osm.OsmPrimitive;
import org.openstreetmap.josm.data.osm.Way;

public class LineElemStyle extends ElemStyle{

	public static final ElemStyle UNTAGGED_WAY = new LineElemStyle();
	private Color color;
	  private int width;
	    public int realWidth; //the real width of this line in meter
	  
	    private float[] dashed;
	    public Color dashedColor;

	    public boolean over;
	    public enum WidthMode { ABSOLUTE, PERCENT, OFFSET }
	    public WidthMode widthMode;
		private Object overlays;
	    
	    public LineElemStyle() { init(); }

	    public void init()
	    {
	        width = -1;
	        realWidth = 0;
	        dashed = new float[0];
	        dashedColor = null;
	        priority = 0;
	        color = PaintColors.UNTAGGED.get();
	        over = true; // only used for line modifications
	        widthMode = WidthMode.ABSOLUTE;
	        overlays = null;
	    }
	    
	    
	@Override
	
//		painter.drawWay(primitive, color, width, dashed, dashedColor, showDirection, reversedDirection, showHeadArrowOnly)
	  public void paintPrimitive(OsmPrimitive primitive, MapPaintSettings paintSettings, MapPainter painter, boolean selected) {
        Way w = (Way)primitive;
        /* show direction arrows, if draw.segment.relevant_directions_only is not set,
        the way is tagged with a direction key
        (even if the tag is negated as in oneway=false) or the way is selected */
        boolean showDirection = selected || ((!paintSettings.isUseRealWidth()) && (paintSettings.isShowDirectionArrow()
                && (!paintSettings.isShowRelevantDirectionsOnly() || w.hasDirectionKeys())));
        boolean reversedDirection = w.reversedDirection();
        /* head only takes over control if the option is true,
        the direction should be shown at all and not only because it's selected */
        boolean showOnlyHeadArrowOnly = showDirection && !selected && paintSettings.isShowHeadArrowOnly();
        Node lastN;

        Color myColor = color;
        int myWidth = getWidth();

        if (realWidth > 0 && paintSettings.isUseRealWidth() && !showDirection) {

            /* if we have a "width" tag, try use it */
            /* (this might be slow and could be improved by caching the value in the Way, on the other hand only used if "real width" is enabled) */
            String widthTag = w.get("width");
            if(widthTag == null) {
                widthTag = w.get("est_width");
            }
            if(widthTag != null) {
                try {
                    realWidth = Integer.parseInt(widthTag);
                }
                catch(NumberFormatException nfe) {
                }
            }

            myWidth = (int) (100 /  (float) (painter.getCircum() / realWidth));
            if (myWidth < getWidth()) {
                myWidth = getWidth();
            }
        }

        if(w.isHighlighted()) {
            myColor = paintSettings.getHighlightColor();
        } else if (selected) {
            myColor = paintSettings.getSelectedColor();
        } else if(w.isDisabled()) {
            myColor = paintSettings.getInactiveColor();
        }

        /* draw overlays under the way */
//        if(overlays != null) {
//            for(LineElemStyle s : overlays) {
//                if(!s.over) {
//                    painter.drawWay(w, s.color != null && selected ? myColor: s.color, s.getWidth(myWidth),
//                            s.getDashed(), s.dashedColor, false, false, false);
//                }
//            }
//        }

        /* draw the way */
        painter.drawWay(w, myColor, myWidth, dashed, dashedColor, showDirection, selected ? false : reversedDirection, showOnlyHeadArrowOnly);

        /* draw overlays above the way */
//        if(overlays != null)  {
//            for(LineElemStyle s : overlays) {
//                if(s.over) {
//                    painter.drawWay(w, s.color != null && selected ? myColor : s.color, s.getWidth(myWidth),
//                            s.getDashed(), s.dashedColor, false, false, false);
//                }
//            }
//        }

        if(paintSettings.isShowOrderNumber()) {
            int orderNumber = 0;
            lastN = null;
            for(Node n : w.getNodes()) {
                if(lastN != null) {
                    orderNumber++;
                    painter.drawOrderNumber(lastN, n, orderNumber);
                }
                lastN = n;
            }
        }
    }

	private int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	private int getWidth(int myWidth) {
		// TODO Auto-generated method stub
		return 0;
	}

}
