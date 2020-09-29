package defpackage;

import android.os.SystemClock;

/* renamed from: caa reason: default package */
public final class caa implements bzx {
    private static final caa a = new caa();

    private caa() {
    }

    public static bzx d() {
        return a;
    }

    public final long a() {
        return System.currentTimeMillis();
    }

    public final long b() {
        return SystemClock.elapsedRealtime();
    }

    public final long c() {
        return System.nanoTime();
    }
}
