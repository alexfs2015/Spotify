package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

@cey
/* renamed from: cny reason: default package */
public final class cny {
    Handler a = null;
    private HandlerThread b = null;
    private int c = 0;
    private final Object d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                bwx.a(this.b, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.b == null) {
                clu.a();
                this.b = new HandlerThread("LooperProvider");
                this.b.start();
                this.a = new Handler(this.b.getLooper());
                clu.a();
            } else {
                clu.a();
                this.d.notifyAll();
            }
            this.c++;
            looper = this.b.getLooper();
        }
        return looper;
    }
}
