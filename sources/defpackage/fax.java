package defpackage;

import java.util.Locale;
import java.util.logging.Logger;

/* renamed from: fax reason: default package */
public final class fax {

    /* renamed from: fax$a */
    static final class a {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    public static String b(String str) {
        return str == null ? "" : str;
    }

    static {
        Logger.getLogger(fax.class.getName());
        new a(0);
    }

    private fax() {
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

    public static String c(String str) {
        if (a(str)) {
            return null;
        }
        return str;
    }
}
