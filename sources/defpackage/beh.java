package defpackage;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Looper;
import android.os.SystemClock;

/* renamed from: beh reason: default package */
final class beh implements bdn {
    beh() {
    }

    public final long a() {
        return SystemClock.elapsedRealtime();
    }

    public final bdt a(Looper looper, Callback callback) {
        return new bei(new Handler(looper, callback));
    }

    public final long b() {
        return SystemClock.uptimeMillis();
    }
}
