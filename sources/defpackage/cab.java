package defpackage;

import android.content.Context;

/* renamed from: cab reason: default package */
public final class cab {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a(Context context) {
        if (b == null) {
            b = Boolean.valueOf(caf.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    public static boolean b(Context context) {
        return a(context) && (!caf.h() || (c(context) && !caf.i()));
    }

    public static boolean c(Context context) {
        if (c == null) {
            c = Boolean.valueOf(caf.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue();
    }
}
