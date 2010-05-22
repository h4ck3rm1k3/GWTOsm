// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.io;

import static org.openstreetmap.josm.tools.I18n.tr;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

import org.openstreetmap.josm.Main;

/**
 * Mirrors a file to a local file.
 * <p>
 * The file mirrored is only downloaded if it has been more than one day since last download
 */
public class MirroredInputStream extends InputStream {
    InputStream fs = null;
    File file = null;

    public MirroredInputStream(String name) throws IOException {
        this(name, null, -1L);
    }

    public MirroredInputStream(String name, long maxTime) throws IOException {
        this(name, null, maxTime);
    }

    public MirroredInputStream(String name, String destDir) throws IOException {
        this(name, destDir, -1L);
    }

    public MirroredInputStream(String name, String destDir, long maxTime) throws IOException {
        URL url;
        try {
            url = new URL(name);
            if (url.getProtocol().equals("file")) {
                file = new File(name.substring("file:/".length()));
                if (!file.exists()) {
                    file = new File(name.substring("file://".length()));
                }
            } else {
                file = checkLocal(url, destDir, maxTime);
            }
        } catch (java.net.MalformedURLException e) {
            if(name.startsWith("resource://")) {
                fs = getClass().getResourceAsStream(
                        name.substring("resource:/".length()));
                if (fs == null)
                    throw new IOException(tr("Failed to open input stream for resource ''{0}''", name));
                return;
            }
            file = new File(name);
        }
        if (file == null)
            throw new IOException();
        fs = new FileInputStream(file);
    }

    /**
     * Replies an input stream for a file in a ZIP-file. Replies a file in the top
     * level directory of the ZIP file which has an extension <code>extension</code>. If more
     * than one files have this extension, the last file whose name includes <code>namepart</code>
     * is opened.
     * 
     * @param extension  the extension of the file we're looking for
     * @param namepart the name part
     * @return an input stream. Null if this mirrored input stream doesn't represent a zip file or if
     * there was no matching file in the ZIP file
     */
    public InputStream getZipEntry(String extension, String namepart) {
        if (file == null)
            return null;
        InputStream res = null;
        try {
            ZipFile zipFile = new ZipFile(file);
            ZipEntry resentry = null;
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry entry = entries.nextElement();
                if (entry.getName().endsWith("." + extension)) {
                    /* choose any file with correct extension. When more than
                        one file, prefer the one which matches namepart */
                    if (resentry == null || entry.getName().indexOf(namepart) >= 0) {
                        resentry = entry;
                    }
                }
            }
            if (resentry != null) {
                res = zipFile.getInputStream(resentry);
            } else {
                zipFile.close();
            }
        } catch (Exception e) {
            if(file.getName().endsWith(".zip")) {
                System.err.println(tr("Warning: failed to open file with extension ''{2}'' and namepart ''{3}'' in zip file ''{0}''. Exception was: {1}",
                file.getName(), e.toString(), extension, namepart));
            }
        }
        return res;
    }

    public File getFile()
    {
        return file;
    }

    static public void cleanup(String name)
    {
        cleanup(name, null);
    }
    static public void cleanup(String name, String destDir)
    {
        URL url;
        try {
            url = new URL(name);
            if (!url.getProtocol().equals("file"))
            {
                String localPath = Main.pref.get("mirror." + url);
                if (localPath != null && localPath.length() > 0)
                {
                    String[] lp = localPath.split(";");
                    File lfile = new File(lp[1]);
                    if(lfile.exists()) {
                        lfile.delete();
                    }
                }
                Main.pref.put("mirror." + url, null);
            }
        } catch (java.net.MalformedURLException e) {}
    }

    private File checkLocal(URL url, String destDir, long maxTime) {
        String localPath = Main.pref.get("mirror." + url);
        File file = null;
        if (localPath != null && localPath.length() > 0) {
            String[] lp = localPath.split(";");
            file = new File(lp[1]);
            if (maxTime <= 0) {
                maxTime = Main.pref.getInteger("mirror.maxtime", 7*24*60*60);
            }
            if (System.currentTimeMillis() - Long.parseLong(lp[0]) < maxTime*1000) {
                if(file.exists())
                    return file;
            }
        }
        if(destDir == null) {
            destDir = Main.pref.getPreferencesDir();
        }

        File destDirFile = new File(destDir);
        if (!destDirFile.exists()) {
            destDirFile.mkdirs();
        }

        String a = url.toString().replaceAll("[^A-Za-z0-9_.-]", "_");
        localPath = "mirror_" + a;
        destDirFile = new File(destDir, localPath + ".tmp");
        BufferedOutputStream bos = null;
        BufferedInputStream bis = null;
        try {
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(5000);
            bis = new BufferedInputStream(conn.getInputStream());
            bos = new BufferedOutputStream( new FileOutputStream(destDirFile));
            byte[] buffer = new byte[4096];
            int length;
            while ((length = bis.read(buffer)) > -1) {
                bos.write(buffer, 0, length);
            }
        } catch(IOException ioe) {
            if (file != null)
                return file;
            return null;
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            file = new File(destDir, localPath);
            destDirFile.renameTo(file);
            Main.pref.put("mirror." + url, System.currentTimeMillis() + ";" + file);
        }

        return file;
    }
    @Override
    public int available() throws IOException
    { return fs.available(); }
    @Override
    public void close() throws IOException
    { fs.close(); }
    @Override
    public int read() throws IOException
    { return fs.read(); }
    @Override
    public int read(byte[] b) throws IOException
    { return fs.read(b); }
    @Override
    public int read(byte[] b, int off, int len) throws IOException
    { return fs.read(b,off, len); }
    @Override
    public long skip(long n) throws IOException
    { return fs.skip(n); }
}
