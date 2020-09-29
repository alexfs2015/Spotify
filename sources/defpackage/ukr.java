package defpackage;

import android.os.Build.VERSION;
import java.util.Locale;

/* renamed from: ukr reason: default package */
public final class ukr {
    public static boolean a(fpt fpt) {
        return (c(fpt) || b(fpt)) && a() && e(fpt);
    }

    private static boolean c(fpt fpt) {
        return !d(fpt) && (fpt.b(ukq.a) || fpt.b(ukq.b));
    }

    private static boolean d(fpt fpt) {
        return !fpt.b(rgy.a);
    }

    public static boolean b(fpt fpt) {
        return a() && e(fpt) && fpt.b(ukq.c);
    }

    private static boolean a() {
        return VERSION.SDK_INT >= 23;
    }

    private static boolean e(fpt fpt) {
        return "en".equals(gnd.a(Locale.getDefault())) || fpt.b(ukq.g);
    }
}
