package defpackage;

import android.os.Looper;

/* renamed from: csd reason: default package */
final class csd implements Runnable {
    csd() {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
