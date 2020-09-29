package defpackage;

import java.util.HashSet;

/* renamed from: aqd reason: default package */
public final class aqd {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (aqd.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (aqd.class) {
            if (a.add(str)) {
                StringBuilder sb = new StringBuilder();
                sb.append(b);
                sb.append(", ");
                sb.append(str);
                b = sb.toString();
            }
        }
    }
}
