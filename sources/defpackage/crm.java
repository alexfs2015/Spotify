package defpackage;

import android.os.Looper;

/* renamed from: crm reason: default package */
final class crm implements Runnable {
    crm() {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
