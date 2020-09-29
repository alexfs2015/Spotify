package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import okio.ByteString;

/* renamed from: wnb reason: default package */
public final class wnb {
    static {
        ByteString.a("\"\\");
        ByteString.a("\t ,=");
    }

    private static long a(String str) {
        long j = -1;
        if (str == null) {
            return -1;
        }
        try {
            j = Long.parseLong(str);
        } catch (NumberFormatException unused) {
        }
        return j;
    }

    private static Set<String> a(wlw wlw) {
        int length = wlw.a.length / 2;
        Set emptySet = Collections.emptySet();
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(wlw.a(i))) {
                String b = wlw.b(i);
                if (emptySet.isEmpty()) {
                    emptySet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                for (String trim : b.split(",")) {
                    emptySet.add(trim.trim());
                }
            }
        }
        return emptySet;
    }

    public static void a(wlq wlq, wlx wlx, wlw wlw) {
        if (wlq != wlq.a && wlp.a(wlx, wlw).isEmpty()) {
        }
    }

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
    }

    public static int a(String str, int i) {
        while (i < str.length()) {
            char charAt = str.charAt(i);
            if (charAt != ' ' && charAt != 9) {
                break;
            }
            i++;
        }
        return i;
    }

    public static int b(String str, int i) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong > 2147483647L) {
                return Integer.MAX_VALUE;
            }
            if (parseLong < 0) {
                return 0;
            }
            i = (int) parseLong;
            return i;
        } catch (NumberFormatException unused) {
        }
    }

    public static long a(wmf wmf) {
        return a(wmf.f.a("Content-Length"));
    }

    public static boolean a(wmf wmf, wlw wlw, wmd wmd) {
        for (String str : a(wmf.f)) {
            if (!wmk.a((Object) wlw.b(str), (Object) wmd.c.b(str))) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(wmf wmf) {
        return a(wmf.f).contains("*");
    }

    public static wlw c(wmf wmf) {
        wlw wlw = wmf.h.a.c;
        Set a = a(wmf.f);
        if (a.isEmpty()) {
            return new a().a();
        }
        a aVar = new a();
        int length = wlw.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = wlw.a(i);
            if (a.contains(a2)) {
                aVar.a(a2, wlw.b(i));
            }
        }
        return aVar.a();
    }

    public static boolean d(wmf wmf) {
        if (wmf.a.b.equals("HEAD")) {
            return false;
        }
        int i = wmf.c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(wmf) == -1) {
            if ("chunked".equalsIgnoreCase(wmf.a("Transfer-Encoding", null))) {
                return true;
            }
            return false;
        }
        return true;
    }
}
