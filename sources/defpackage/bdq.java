package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: bdq reason: default package */
final class bdq implements bcw {
    bdq() {
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final long b() {
        return SystemClock.uptimeMillis();
    }

    public final bdc a(Looper looper, Callback callback) {
        return new bdr(new Handler(looper, callback));
    }
}
