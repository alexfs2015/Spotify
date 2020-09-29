package defpackage;

import android.os.SystemClock;

/* renamed from: bzj reason: default package */
public final class bzj implements bzg {
    private static final bzj a = new bzj();

    public static bzg d() {
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

    private bzj() {
    }
}
