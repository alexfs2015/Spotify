package defpackage;

import android.os.Build.VERSION;

/* renamed from: kbb reason: default package */
public final class kbb {
    public static boolean a(fqn fqn) {
        return !((Boolean) fqn.a(kaz.c)).booleanValue();
    }

    public static boolean b(fqn fqn) {
        return a(fqn) && VERSION.SDK_INT >= 18;
    }
}
