package defpackage;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;
import okio.ByteString;

/* renamed from: xbh reason: default package */
public final class xbh {
    static {
        ByteString.a("\"\\");
        ByteString.a("\t ,=");
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

    public static int a(String str, int i, String str2) {
        while (i < str.length() && str2.indexOf(str.charAt(i)) == -1) {
            i++;
        }
        return i;
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

    public static long a(xal xal) {
        return a(xal.f.a("Content-Length"));
    }

    private static Set<String> a(xac xac) {
        int length = xac.a.length / 2;
        Set emptySet = Collections.emptySet();
        for (int i = 0; i < length; i++) {
            if ("Vary".equalsIgnoreCase(xac.a(i))) {
                String b = xac.b(i);
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

    public static void a(wzw wzw, xad xad, xac xac) {
        if (wzw != wzw.a && wzv.a(xad, xac).isEmpty()) {
        }
    }

    public static boolean a(xal xal, xac xac, xaj xaj) {
        for (String str : a(xal.f)) {
            if (!xaq.a((Object) xac.b(str), (Object) xaj.c.b(str))) {
                return false;
            }
        }
        return true;
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

    public static boolean b(xal xal) {
        return a(xal.f).contains("*");
    }

    public static xac c(xal xal) {
        xac xac = xal.h.a.c;
        Set a = a(xal.f);
        if (a.isEmpty()) {
            return new a().a();
        }
        a aVar = new a();
        int length = xac.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a2 = xac.a(i);
            if (a.contains(a2)) {
                aVar.a(a2, xac.b(i));
            }
        }
        return aVar.a();
    }

    public static boolean d(xal xal) {
        if (xal.a.b.equals("HEAD")) {
            return false;
        }
        int i = xal.c;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && a(xal) == -1) {
            return "chunked".equalsIgnoreCase(xal.a("Transfer-Encoding", null));
        }
    }
}
