// License: GPL. Copyright 2007 by Immanuel Scholz and others
package org.openstreetmap.josm.tools;

import java.nio.ByteBuffer;

public class Base64 {

    private static String enc = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";

    public static String encode(String s) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < (s.length()+2)/3; ++i) {
            int l = Math.min(3, s.length()-i*3);
            String buf = s.substring(i*3, i*3+l);
            out.append(enc.charAt(buf.charAt(0)>>2));
            out.append(enc.charAt(
                                  (buf.charAt(0) & 0x03) << 4 |
                                  (l==1?
                                   0:
                                   (buf.charAt(1) & 0xf0) >> 4)));
            out.append(l>1?enc.charAt((buf.charAt(1) & 0x0f) << 2 | (l==2?0:(buf.charAt(2) & 0xc0) >> 6)):'=');
            out.append(l>2?enc.charAt(buf.charAt(2) & 0x3f):'=');
        }
        return out.toString();
    }

    public static String encode(ByteBuffer s) {
        StringBuilder out = new StringBuilder();
        // Read 3 bytes at a time.
        for (int i = 0; i < (s.limit()+2)/3; ++i) {
            int l = Math.min(3, s.limit()-i*3);
            int byte0 = s.get() & 0xff;
            int byte1 = l>1? s.get() & 0xff : 0;
            int byte2 = l>2? s.get() & 0xff : 0;

            out.append(enc.charAt(byte0>>2));
            out.append(enc.charAt(
                                  (byte0 & 0x03) << 4 |
                                  (l==1?
                                   0:
                                   (byte1 & 0xf0) >> 4)));
            out.append(l>1?enc.charAt((byte1 & 0x0f) << 2 | (l==2?0:(byte2 & 0xc0) >> 6)):'=');
            out.append(l>2?enc.charAt(byte2 & 0x3f):'=');
        }
        return out.toString();
    }
}
