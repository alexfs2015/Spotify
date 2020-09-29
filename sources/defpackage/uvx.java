package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: uvx reason: default package */
public final class uvx {
    private static boolean a() {
        return VERSION.SDK_INT >= 23;
    }

    public static boolean a(fqn fqn) {
        return (c(fqn) || b(fqn)) && a() && e(fqn);
    }

    public static boolean b(fqn fqn) {
        return a() && e(fqn) && fqn.b(uvw.c);
    }

    private static boolean c(fqn fqn) {
        return !d(fqn) && (fqn.b(uvw.a) || fqn.b(uvw.b));
    }

    private static boolean d(fqn fqn) {
        return !fqn.b(rqa.a);
    }

    private static boolean e(fqn fqn) {
        return "en".equals(gos.a(Locale.getDefault())) || fqn.b(uvw.g);
    }
}
