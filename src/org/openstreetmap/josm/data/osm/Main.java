package org.openstreetmap.josm.data.osm;

//import java.awt.Component;

//import org.openstreetmap.josm.PasteObject;
import org.openstreetmap.josm.data.ContentObject;
import org.openstreetmap.josm.data.MainObject;
import org.openstreetmap.josm.data.MapObject;
import org.openstreetmap.josm.data.OsmDataLayer;
import org.openstreetmap.josm.data.PreferenceSettingFactory;
import org.openstreetmap.josm.data.ServerSidePreferences;
import org.openstreetmap.josm.data.WorkerObject;
import org.openstreetmap.josm.data.projection.Epsg4326;
import org.openstreetmap.josm.data.projection.Mercator;
import org.openstreetmap.josm.data.projection.Projection;
//import org.openstreetmap.josm.tools.PlatformHookUnixoid;

public class Main {

	public static boolean applet;
	public static ContentObject contentPane;
	public static MainObject main;
	public static boolean isOpenjdk;
	//public static PasteObject pasteBuffer;
	public static MapObject map;
	public static Component parent;
	public static OsmDataLayer pasteSource;
//	public static PlatformHookUnixoid platform;
	public static ServerSidePreferences pref;
	public static WorkerObject worker;
	public static Projection proj=new Epsg4326();
	public static PreferenceSettingFactory toolbar;
	public static void debug(String string) {
		// TODO Auto-generated method stub
		
	}
	public static void addListener() {
		// TODO Auto-generated method stub
		
	}
	public static void determinePlatformHook() {
		// TODO Auto-generated method stub
		
	}

}
