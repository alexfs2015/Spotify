package defpackage;

import android.os.Looper;

/* renamed from: ewk reason: default package */
public final class ewk {
    private final boolean a = false;

    ewk() {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
