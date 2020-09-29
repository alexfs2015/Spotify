package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: bdx reason: default package */
public final class bdx {
    private static final ArrayList<a> a = new ArrayList<>();

    /* renamed from: bdx$a */
    static final class a {
        public final String a;
        public final String b;
        public final int c;
    }

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i != 64) {
            if (i == 163) {
                return "video/wvc1";
            }
            if (i == 177) {
                return "video/x-vnd.on2.vp9";
            }
            if (i == 165) {
                return "audio/ac3";
            }
            if (i == 166) {
                return "audio/eac3";
            }
            switch (i) {
                case 96:
                case 97:
                case 98:
                case 99:
                case 100:
                case 101:
                    return "video/mpeg2";
                case 102:
                case 103:
                case 104:
                    break;
                case 105:
                case 107:
                    return "audio/mpeg";
                case 106:
                    return "video/mpeg";
                default:
                    switch (i) {
                        case 169:
                        case 172:
                            return "audio/vnd.dts";
                        case 170:
                        case 171:
                            return "audio/vnd.dts.hd";
                        case 173:
                            return "audio/opus";
                        default:
                            return null;
                    }
            }
        }
        return "audio/mp4a-latm";
    }

    public static boolean a(String str) {
        return "audio".equals(j(str));
    }

    public static boolean b(String str) {
        return "video".equals(j(str));
    }

    public static boolean c(String str) {
        return "text".equals(j(str));
    }

    public static String d(String str) {
        if (str == null) {
            return null;
        }
        for (String f : ben.i(str)) {
            String f2 = f(f);
            if (f2 != null && b(f2)) {
                return f2;
            }
        }
        return null;
    }

    public static String e(String str) {
        if (str == null) {
            return null;
        }
        for (String f : ben.i(str)) {
            String f2 = f(f);
            if (f2 != null && a(f2)) {
                return f2;
            }
        }
        return null;
    }

    public static String f(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("avc1") || trim.startsWith("avc3")) {
            return "video/avc";
        }
        if (trim.startsWith("hev1") || trim.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (trim.startsWith("vp9") || trim.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (trim.startsWith("vp8") || trim.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (trim.startsWith("mp4a")) {
            if (trim.startsWith("mp4a.")) {
                String substring = trim.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = a(Integer.parseInt(ben.e(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException unused) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (trim.startsWith("ac-3") || trim.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (trim.startsWith("ec-3") || trim.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (trim.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (trim.startsWith("dtsc") || trim.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (trim.startsWith("dtsh") || trim.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (trim.startsWith("opus")) {
                return "audio/opus";
            }
            if (trim.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            int size = a.size();
            for (int i = 0; i < size; i++) {
                a aVar = (a) a.get(i);
                if (trim.startsWith(aVar.b)) {
                    return aVar.a;
                }
            }
            return null;
        }
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            a aVar = (a) a.get(i);
            if (str.equals(aVar.a)) {
                return aVar.c;
            }
        }
        return -1;
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int h(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 5
            switch(r0) {
                case -2123537834: goto L_0x0040;
                case -1095064472: goto L_0x0036;
                case 187078296: goto L_0x002c;
                case 1504578661: goto L_0x0022;
                case 1505942594: goto L_0x0018;
                case 1556697186: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "audio/true-hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 5
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "audio/vnd.dts.hd"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 4
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "audio/eac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 1
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "audio/ac3"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 0
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "audio/vnd.dts"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 3
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "audio/eac3-joc"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x004a
            r7 = 2
            goto L_0x004b
        L_0x004a:
            r7 = -1
        L_0x004b:
            if (r7 == 0) goto L_0x0062
            if (r7 == r5) goto L_0x0060
            if (r7 == r4) goto L_0x0060
            if (r7 == r3) goto L_0x005e
            if (r7 == r2) goto L_0x005b
            if (r7 == r6) goto L_0x0058
            return r1
        L_0x0058:
            r7 = 14
            return r7
        L_0x005b:
            r7 = 8
            return r7
        L_0x005e:
            r7 = 7
            return r7
        L_0x0060:
            r7 = 6
            return r7
        L_0x0062:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdx.h(java.lang.String):int");
    }

    public static int i(String str) {
        return g(f(str));
    }

    private static String j(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(47);
        if (indexOf != -1) {
            return str.substring(0, indexOf);
        }
        StringBuilder sb = new StringBuilder("Invalid mime type: ");
        sb.append(str);
        throw new IllegalArgumentException(sb.toString());
    }
}
