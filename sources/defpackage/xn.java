package defpackage;

import java.util.HashSet;
import java.util.Set;

/* renamed from: xn reason: default package */
public final class xn {
    public static boolean a;
    private static final Set<String> b = new HashSet();
    private static boolean c = false;
    private static int d = 0;
    private static int e = 0;

    public static void a(String str) {
    }

    public static void b(String str) {
        if (!b.contains(str)) {
            b.add(str);
        }
    }

    public static void c(String str) {
    }

    public static float d(String str) {
        int i = e;
        if (i > 0) {
            e = i - 1;
        }
        return 0.0f;
    }
}
