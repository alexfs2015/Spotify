package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: fbo reason: default package */
public final class fbo {

    /* renamed from: fbo$a */
    static final class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        Logger.getLogger(fbo.class.getName());
        new a(0);
    }

    private fbo() {
    }

    static long a() {
        return System.nanoTime();
    }

    static String a(double d) {
        return String.format(Locale.ROOT, "%.4g", new Object[]{Double.valueOf(d)});
    }

    public static boolean a(String str) {
        return str == null || str.isEmpty();
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    public static String c(String str) {
        if (a(str)) {
            return null;
        }
        return str;
    }
}
