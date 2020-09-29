package defpackage;

import android.os.Build.VERSION;

/* renamed from: jzb reason: default package */
public final class jzb {
    public static boolean a(fpt fpt) {
        return !((Boolean) fpt.a(jyz.c)).booleanValue();
    }

    public static boolean b(fpt fpt) {
        return a(fpt) && VERSION.SDK_INT >= 18;
    }
}
