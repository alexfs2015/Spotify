package defpackage;

import android.content.Context;

/* renamed from: bzk reason: default package */
public final class bzk {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;

    public static boolean a(Context context) {
        if (b == null) {
            b = Boolean.valueOf(bzo.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return b.booleanValue();
    }

    public static boolean b(Context context) {
        return a(context) && (!bzo.h() || (c(context) && !bzo.i()));
    }

    public static boolean c(Context context) {
        if (c == null) {
            c = Boolean.valueOf(bzo.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return c.booleanValue();
    }
}
