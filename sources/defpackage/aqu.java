package defpackage;

import java.util.HashSet;

/* renamed from: aqu reason: default package */
public final class aqu {
    private static final HashSet<String> a = new HashSet<>();
    private static String b = "goog.exo.core";

    public static synchronized String a() {
        String str;
        synchronized (aqu.class) {
            str = b;
        }
        return str;
    }

    public static synchronized void a(String str) {
        synchronized (aqu.class) {
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
