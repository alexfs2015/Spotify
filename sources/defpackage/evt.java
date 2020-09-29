package defpackage;

import android.os.Looper;

/* renamed from: evt reason: default package */
public final class evt {
    private final boolean a = false;

    evt() {
    }

    public static boolean a() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
