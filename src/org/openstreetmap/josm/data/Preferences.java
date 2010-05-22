// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.data;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import org.openstreetmap.josm.Main;
import org.openstreetmap.josm.tools.ColorHelper;

/**
 * This class holds all preferences for JOSM.
 *
 * Other classes can register their beloved properties here. All properties will be
 * saved upon set-access.
 *
 * @author imi
 */
public class Preferences {
    //static private final Logger logger = Logger.getLogger(Preferences.class.getName());

    /**
     * Internal storage for the preference directory.
     * Do not access this variable directly!
     * @see #getPreferencesDirFile()
     */
    private File preferencesDirFile = null;

    public interface PreferenceChangeEvent{
        String getKey();
        String getOldValue();
        String getNewValue();
    }

    public interface PreferenceChangedListener {
        void preferenceChanged(PreferenceChangeEvent e);
    }

    private static class DefaultPreferenceChangeEvent implements PreferenceChangeEvent {
        private final String key;
        private final String oldValue;
        private final String newValue;

        public DefaultPreferenceChangeEvent(String key, String oldValue, String newValue) {
            this.key = key;
            this.oldValue = oldValue;
            this.newValue = newValue;
        }

        public String getKey() {
            return key;
        }
        public String getOldValue() {
            return oldValue;
        }
        public String getNewValue() {
            return newValue;
        }
    }

    /**
     * Class holding one bookmarkentry.
     * @author imi
     */
    public static class Bookmark implements Comparable<Bookmark> {
        private String name;
        private Bounds area;

        public Bookmark() {
            area = null;
            name = null;
        }

        public Bookmark(Bounds area) {
            this.area = area;
        }

        @Override public String toString() {
            return name;
        }

        public int compareTo(Bookmark b) {
            return name.toLowerCase().compareTo(b.name.toLowerCase());
        }

        public Bounds getArea() {
            return area;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setArea(Bounds area) {
            this.area = area;
        }
    }

    public interface ColorKey {
        String getColorName();
        String getSpecialName();
        Color getDefault();
    }

    private final CopyOnWriteArrayList<PreferenceChangedListener> listeners = new CopyOnWriteArrayList<PreferenceChangedListener>();

    public void addPreferenceChangeListener(PreferenceChangedListener listener) {
        if (listener != null) {
            listeners.addIfAbsent(listener);
        }
    }

    public void removePreferenceChangeListener(PreferenceChangedListener listener) {
        listeners.remove(listener);
    }

    protected void firePrefrenceChanged(String key, String oldValue, String newValue) {
        PreferenceChangeEvent evt = new DefaultPreferenceChangeEvent(key, oldValue, newValue);
        for (PreferenceChangedListener l : listeners) {
            l.preferenceChanged(evt);
        }
    }

    /**
     * Map the property name to the property object.
     */
    protected final SortedMap<String, String> properties = new TreeMap<String, String>();
    protected final SortedMap<String, String> defaults = new TreeMap<String, String>();

    /**
     * Override some values on read. This is intended to be used for technology previews
     * where we want to temporarily modify things without changing the user's preferences
     * file.
     */
    protected static final SortedMap<String, String> override = new TreeMap<String, String>();
    static {
        //override.put("osm-server.version", "0.5");
        //override.put("osm-server.additional-versions", "");
        //override.put("osm-server.url", "http://openstreetmap.gryph.de/api");
        //override.put("plugins", null);
    }

    /**
     * Return the location of the user defined preferences file
     */
    public String getPreferencesDir() {
        final String path = getPreferencesDirFile().getPath();
        if (path.endsWith(File.separator))
            return path;
        return path + File.separator;
    }

    public File getPreferencesDirFile() {
        if (preferencesDirFile != null)
            return preferencesDirFile;
        String path;
        path = System.getProperty("josm.home");
        if (path != null) {
            preferencesDirFile = new File(path);
        } else {
            path = System.getenv("APPDATA");
            if (path != null) {
                preferencesDirFile = new File(path, "JOSM");
            } else {
                preferencesDirFile = new File(System.getProperty("user.home"), ".josm");
            }
        }
        return preferencesDirFile;
    }

    public File getPreferenceFile() {
        return new File(getPreferencesDirFile(), "preferences");
    }

    public File getPluginsDirectory() {
        return new File(getPreferencesDirFile(), "plugins");
    }

    /**
     * @return A list of all existing directories where resources could be stored.
     */
    public Collection<String> getAllPossiblePreferenceDirs() {
        LinkedList<String> locations = new LinkedList<String>();
        // locations.add(Main.pref.getPreferencesDir());
        // String s;
        // if ((s = System.getenv("JOSM_RESOURCES")) != null) {
        //     if (!s.endsWith(File.separator)) {
        //         s = s + File.separator;
        //     }
        //     locations.add(s);
        // }
        // if ((s = System.getProperty("josm.resources")) != null) {
        //     if (!s.endsWith(File.separator)) {
        //         s = s + File.separator;
        //     }
        //     locations.add(s);
        // }
        // String appdata = System.getenv("APPDATA");
        // if (System.getenv("ALLUSERSPROFILE") != null && appdata != null
        //         && appdata.lastIndexOf(File.separator) != -1) {
        //     appdata = appdata.substring(appdata.lastIndexOf(File.separator));
        //     locations.add(new File(new File(System.getenv("ALLUSERSPROFILE"),
        //             appdata), "JOSM").getPath());
        // }
        // locations.add("/usr/local/share/josm/");
        // locations.add("/usr/local/lib/josm/");
        // locations.add("/usr/share/josm/");
        // locations.add("/usr/lib/josm/");
        return locations;
    }

    synchronized public boolean hasKey(final String key) {
        return override.containsKey(key) ? override.get(key) != null : properties.containsKey(key);
    }

    synchronized public String get(final String key) {
        putDefault(key, null);
        if (override.containsKey(key))
            return override.get(key);
        if (!properties.containsKey(key))
            return "";
        return properties.get(key);
    }

    synchronized public String get(final String key, final String def) {
        putDefault(key, def);
        if (override.containsKey(key))
            return override.get(key);
        final String prop = properties.get(key);
        if (prop == null || prop.equals(""))
            return def;
        return prop;
    }

    synchronized public Map<String, String> getAllPrefix(final String prefix) {
        final Map<String,String> all = new TreeMap<String,String>();
        for (final Entry<String,String> e : properties.entrySet())
            if (e.getKey().startsWith(prefix)) {
                all.put(e.getKey(), e.getValue());
            }
        for (final Entry<String,String> e : override.entrySet())
            if (e.getKey().startsWith(prefix))
                if (e.getValue() == null) {
                    all.remove(e.getKey());
                } else {
                    all.put(e.getKey(), e.getValue());
                }
        return all;
    }

    synchronized public TreeMap<String, String> getAllColors() {
        final TreeMap<String,String> all = new TreeMap<String,String>();
        for (final Entry<String,String> e : defaults.entrySet())
            if (e.getKey().startsWith("color.") && e.getValue() != null) {
                all.put(e.getKey().substring(6), e.getValue());
            }
        for (final Entry<String,String> e : properties.entrySet())
            if (e.getKey().startsWith("color.")) {
                all.put(e.getKey().substring(6), e.getValue());
            }
        for (final Entry<String,String> e : override.entrySet())
            if (e.getKey().startsWith("color."))
                if (e.getValue() == null) {
                    all.remove(e.getKey().substring(6));
                } else {
                    all.put(e.getKey().substring(6), e.getValue());
                }
        return all;
    }

    synchronized public Map<String, String> getDefaults() {
        return defaults;
    }

    synchronized public void putDefault(final String key, final String def) {
        if(!defaults.containsKey(key) || defaults.get(key) == null) {
            defaults.put(key, def);
        } else if(def != null && !defaults.get(key).equals(def)) {
            System.out.println("Defaults for " + key + " differ: " + def + " != " + defaults.get(key));
        }
    }

    synchronized public boolean getBoolean(final String key) {
        putDefault(key, null);
        if (override.containsKey(key))
            return override.get(key) == null ? false : Boolean.parseBoolean(override.get(key));
        return properties.containsKey(key) ? Boolean.parseBoolean(properties.get(key)) : false;
    }

    synchronized public boolean getBoolean(final String key, final boolean def) {
        putDefault(key, Boolean.toString(def));
        if (override.containsKey(key))
            return override.get(key) == null ? def : Boolean.parseBoolean(override.get(key));
        return properties.containsKey(key) ? Boolean.parseBoolean(properties.get(key)) : def;
    }

    synchronized public boolean put(final String key, String value) {
        String oldvalue = properties.get(key);
        if(value != null && value.length() == 0) {
            value = null;
        }
        if(!((oldvalue == null && (value == null || value.equals(defaults.get(key))))
                || (value != null && oldvalue != null && oldvalue.equals(value))))
        {
            if (value == null) {
                properties.remove(key);
            } else {
                properties.put(key, value);
            }
            try {
                save();
            } catch(IOException e){
                System.out.println(tr("Warning: failed to persist preferences to ''{0}''", getPreferenceFile().getAbsoluteFile()));
            }
            firePrefrenceChanged(key, oldvalue, value);
            return true;
        }
        return false;
    }

    synchronized public boolean put(final String key, final boolean value) {
        return put(key, Boolean.toString(value));
    }

    synchronized public boolean putInteger(final String key, final Integer value) {
        return put(key, Integer.toString(value));
    }

    synchronized public boolean putDouble(final String key, final Double value) {
        return put(key, Double.toString(value));
    }

    synchronized public boolean putLong(final String key, final Long value) {
        return put(key, Long.toString(value));
    }

    /**
     * Called after every put. In case of a problem, do nothing but output the error
     * in log.
     */
    public void save() throws IOException {
        /* currently unused, but may help to fix configuration issues in future */
        putInteger("josm.version", Version.getInstance().getVersion());

        updateSystemProperties();
        File prefFile = new File(getPreferencesDirFile(), "preferences");

        // Backup old preferences if there are old preferences
        if(prefFile.exists()) {
            copyFile(prefFile, new File(prefFile + "_backup"));
        }

        final PrintWriter out = new PrintWriter(new OutputStreamWriter(
                new FileOutputStream(prefFile + "_tmp"), "utf-8"), false);
        for (final Entry<String, String> e : properties.entrySet()) {
            String s = defaults.get(e.getKey());
            /* don't save default values */
            if(s == null || !s.equals(e.getValue())) {
                out.println(e.getKey() + "=" + e.getValue());
            }
        }
        out.close();

        File tmpFile = new File(prefFile + "_tmp");
        copyFile(tmpFile, prefFile);
        tmpFile.delete();
    }

    /**
     * Simple file copy function that will overwrite the target file
     * Taken from http://www.rgagnon.com/javadetails/java-0064.html (CC-NC-BY-SA)
     * @param in
     * @param out
     * @throws IOException
     */
    public static void copyFile(File in, File out) throws IOException  {
        FileChannel inChannel = new FileInputStream(in).getChannel();
        FileChannel outChannel = new FileOutputStream(out).getChannel();
        try {
            inChannel.transferTo(0, inChannel.size(),
                    outChannel);
        }
        catch (IOException e) {
            throw e;
        }
        finally {
            if (inChannel != null) {
                inChannel.close();
            }
            if (outChannel != null) {
                outChannel.close();
            }
        }
    }

    public void load() throws IOException {
        properties.clear();
        final BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(getPreferencesDir()+"preferences"), "utf-8"));
        int lineNumber = 0;
        ArrayList<Integer> errLines = new ArrayList<Integer>();
        for (String line = in.readLine(); line != null; line = in.readLine(), lineNumber++) {
            final int i = line.indexOf('=');
            if (i == -1 || i == 0) {
                errLines.add(lineNumber);
                continue;
            }
            properties.put(line.substring(0,i), line.substring(i+1));
        }
        if (!errLines.isEmpty())
            throw new IOException(tr("Malformed config file at lines {0}", errLines));
        updateSystemProperties();
    }

    public void init(boolean reset){
        // get the preferences.
        // File prefDir = getPreferencesDirFile();
        // if (prefDir.exists()) {
        //     if(!prefDir.isDirectory()) {
        //         System.err.println(tr("Warning: Failed to initialize preferences. Preference directory ''{0}'' is not a directory.", prefDir.getAbsoluteFile()));
        //         JOptionPane.showMessageDialog(
        //                 Main.parent,
        //                 tr("<html>Failed to initialize preferences.<br>Preference directory ''{0}'' is not a directory.</html>", prefDir.getAbsoluteFile()),
        //                 tr("Error"),
        //                 JOptionPane.ERROR_MESSAGE
        //         );
        //         return;
        //     }
        // } else {
        //     if (! prefDir.mkdirs()) {
        //         System.err.println(tr("Warning: Failed to initialize preferences. Failed to create missing preference directory: {0}", prefDir.getAbsoluteFile()));
        //         JOptionPane.showMessageDialog(
        //                 Main.parent,
        //                 tr("<html>Failed to initialize preferences.<br>Failed to create missing preference directory: {0}</html>",prefDir.getAbsoluteFile()),
        //                 tr("Error"),
        //                 JOptionPane.ERROR_MESSAGE
        //         );
        //         return;
        //     }
        // }

        // File preferenceFile = getPreferenceFile();
        // try {
        //     if (!preferenceFile.exists()) {
        //         System.out.println(tr("Warning: Missing preference file ''{0}''. Creating a default preference file.", preferenceFile.getAbsoluteFile()));
        //         resetToDefault();
        //         save();
        //     } else if (reset) {
        //         System.out.println(tr("Warning: Replacing existing preference file ''{0}'' with default preference file.", preferenceFile.getAbsoluteFile()));
        //         resetToDefault();
        //         save();
        //     }
        // } catch(IOException e) {
        //     e.printStackTrace();
        //     JOptionPane.showMessageDialog(
        //             Main.parent,
        //             tr("<html>Failed to initialize preferences.<br>Failed to reset preference file to default: {0}</html>",getPreferenceFile().getAbsoluteFile()),
        //             tr("Error"),
        //             JOptionPane.ERROR_MESSAGE
        //     );
        //     return;
        // }
        // try {
        //     load();
        // } catch (IOException e) {
        //     e.printStackTrace();
        //     File backupFile = new File(prefDir,"preferences.bak");
        //     JOptionPane.showMessageDialog(
        //             Main.parent,
        //             tr("<html>Preferences file had errors.<br> Making backup of old one to <br>{0}<br> and creating a new default preference file.</html>", backupFile.getAbsoluteFile()),
        //             tr("Error"),
        //             JOptionPane.ERROR_MESSAGE
        //     );
        //     preferenceFile.renameTo(backupFile);
        //     try {
        //         resetToDefault();
        //         save();
        //     } catch(IOException e1) {
        //         e1.printStackTrace();
        //         System.err.println(tr("Warning: Failed to initialize preferences.Failed to reset preference file to default: {0}", getPreferenceFile()));
        //     }
        // }
    }

    public final void resetToDefault(){
        properties.clear();
    }

    public File getBookmarksFile() {
        return new File(getPreferencesDir(),"bookmarks");
    }

    public Collection<Bookmark> loadBookmarks() throws IOException {
        File bookmarkFile = getBookmarksFile();
        if (!bookmarkFile.exists()) {
            bookmarkFile.createNewFile();
        }
        BufferedReader in = new BufferedReader(new InputStreamReader(
                new FileInputStream(bookmarkFile), "utf-8"));

        LinkedList<Bookmark> bookmarks = new LinkedList<Bookmark>();
        for (String line = in.readLine(); line != null; line = in.readLine()) {
            // FIXME: legacy code using ',' sign, should be \u001e only
            Matcher m = Pattern.compile("^(.+)[,\u001e](-?\\d+.\\d+)[,\u001e](-?\\d+.\\d+)[,\u001e](-?\\d+.\\d+)[,\u001e](-?\\d+.\\d+)$").matcher(line);
            if (!m.matches() || m.groupCount() != 5) {
                System.err.println(tr("Error: Unexpected line ''{0}'' in bookmark file ''{1}''",line, bookmarkFile.toString()));
                continue;
            }
            Bookmark b = new Bookmark();
            b.setName(m.group(1));
            double[] values= new double[4];
            for (int i = 0; i < 4; ++i) {
                try {
                    values[i] = Double.parseDouble(m.group(i+2));
                } catch(NumberFormatException e) {
                    System.err.println(tr("Error: Illegal double value ''{0}'' on line ''{1}'' in bookmark file ''{2}''",m.group(i+2),line, bookmarkFile.toString()));
                    continue;
                }
            }
            b.setArea(new Bounds(values));
            bookmarks.add(b);
        }
        in.close();
        Collections.sort(bookmarks);
        return bookmarks;
    }

    public void saveBookmarks(Collection<Bookmark> bookmarks) throws IOException {
        // File bookmarkFile = new File(Main.pref.getPreferencesDir()+"bookmarks");
        // if (!bookmarkFile.exists()) {
        //     bookmarkFile.createNewFile();
        // }
        // PrintWriter out = new PrintWriter(new OutputStreamWriter(
        //         new FileOutputStream(bookmarkFile), "utf-8"));
        // for (Bookmark b : bookmarks) {
        //     out.print(b.getName()+ "\u001e");
        //     Bounds area = b.getArea();
        //     out.print(area.getMin().lat() +"\u001e");
        //     out.print(area.getMin().lon() +"\u001e");
        //     out.print(area.getMax().lat() +"\u001e");
        //     out.print(area.getMax().lon());
        //     out.println();
        // }
        // out.close();
    }

    /**
     * Convenience method for accessing colour preferences.
     *
     * @param colName name of the colour
     * @param def default value
     * @return a Color object for the configured colour, or the default value if none configured.
     */
    synchronized public Color getColor(String colName, Color def) {
        return getColor(colName, null, def);
    }

    public Color getColor(ColorKey key) {
        return getColor(key.getColorName(), key.getSpecialName(), key.getDefault());
    }

    /**
     * Convenience method for accessing colour preferences.
     *
     * @param colName name of the colour
     * @param specName name of the special colour settings
     * @param def default value
     * @return a Color object for the configured colour, or the default value if none configured.
     */
    synchronized public Color getColor(String colName, String specName, Color def) {
        putDefault("color."+colName, ColorHelper.color2html(def));
        String colStr = specName != null ? get("color."+specName) : "";
        if(colStr.equals("")) {
            colStr = get("color."+colName);
        }
        return colStr.equals("") ? def : ColorHelper.html2color(colStr);
    }

    synchronized public Color getDefaultColor(String colName) {
        String colStr = defaults.get("color."+colName);
        return colStr == null || "".equals(colStr) ? null : ColorHelper.html2color(colStr);
    }

    synchronized public boolean putColor(String colName, Color val) {
        return put("color."+colName, val != null ? ColorHelper.color2html(val) : null);
    }

    synchronized public int getInteger(String key, int def) {
        putDefault(key, Integer.toString(def));
        String v = get(key);
        if(null == v)
            return def;

        try {
            return Integer.parseInt(v);
        } catch(NumberFormatException e) {
            // fall out
        }
        return def;
    }

    synchronized public long getLong(String key, long def) {
        putDefault(key, Long.toString(def));
        String v = get(key);
        if(null == v)
            return def;

        try {
            return Long.parseLong(v);
        } catch(NumberFormatException e) {
            // fall out
        }
        return def;
    }

    synchronized public double getDouble(String key, double def) {
        putDefault(key, Double.toString(def));
        String v = get(key);
        if(null == v)
            return def;

        try {
            return Double.parseDouble(v);
        } catch(NumberFormatException e) {
            // fall out
        }
        return def;
    }

    synchronized public double getDouble(String key, String def) {
        putDefault(key, def);
        String v = get(key);
        if(v != null && v.length() != 0) {
            try { return Double.parseDouble(v); } catch(NumberFormatException e) {}
        }
        try { return Double.parseDouble(def); } catch(NumberFormatException e) {}
        return 0.0;
    }

    synchronized public String getCollectionAsString(final String key) {
        String s = get(key);
        if(s != null && s.length() != 0) {
            s = s.replaceAll("\u001e",",");
        }
        return s;
    }

    public boolean isCollection(String key, boolean def) {
        String s = get(key);
        if (s != null && s.length() != 0)
            return s.indexOf("\u001e") >= 0 || s.indexOf("§§§") >= 0;
            else
                return def;
    }

    synchronized public Collection<String> getCollection(String key, Collection<String> def) {
        String s = get(key);
        if(def != null)
        {
            String d = null;
            for(String a : def)
            {
                if(d != null) {
                    d += "\u001e" + a;
                } else {
                    d = a;
                }
            }
            putDefault(key, d);
        }
        if(s != null && s.length() != 0)
        {
            if(s.indexOf("\u001e") < 0) /* FIXME: legacy code, remove later */
            {
                String r =s;
                if(r.indexOf("§§§") > 0) {
                    r = r.replaceAll("§§§","\u001e");
                } else {
                    r = r.replace(';','\u001e');
                }
                if(!r.equals(s)) /* save the converted string */
                {
                    put(key,r);
                    s = r;
                }
            }
            return Arrays.asList(s.split("\u001e"));
        }
        return def;
    }
    synchronized public void removeFromCollection(String key, String value) {
        List<String> a = new ArrayList<String>(getCollection(key, null));
        a.remove(value);
        putCollection(key, a);
    }
    synchronized public boolean putCollection(String key, Collection<String> val) {
        String s = null;
        if(val != null)
        {
            for(String a : val)
            {
                if(s != null) {
                    s += "\u001e" + a;
                } else {
                    s = a;
                }
            }
        }
        return put(key, s);
    }

    /**
     * Updates system properties with the current values in the preferences.
     *
     */
    public void updateSystemProperties() {
        Properties sysProp = System.getProperties();
        sysProp.put("http.agent", Version.getInstance().getAgentString());
        System.setProperties(sysProp);
    }

    /**
     * The default plugin site
     */
    private final static String[] DEFAULT_PLUGIN_SITE = {"http://josm.openstreetmap.de/plugin"};

    /**
     * Replies the collection of plugin site URLs from where plugin lists can be downloaded
     *
     * @return
     */
    public Collection<String> getPluginSites() {
        return getCollection("pluginmanager.sites", Arrays.asList(DEFAULT_PLUGIN_SITE));
    }

    /**
     * Sets the collection of plugin site URLs.
     *
     * @param sites the site URLs
     */
    public void setPluginSites(Collection<String> sites) {
        putCollection("pluginmanager.sites", sites);
    }

}
