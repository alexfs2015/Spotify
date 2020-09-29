package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;

@cfp
/* renamed from: cop reason: default package */
public final class cop {
    Handler a = null;
    private HandlerThread b = null;
    private int c = 0;
    private final Object d = new Object();

    public final Looper a() {
        Looper looper;
        synchronized (this.d) {
            if (this.c != 0) {
                bxo.a(this.b, (Object) "Invalid state: mHandlerThread should already been initialized.");
            } else if (this.b == null) {
                cml.a();
                this.b = new HandlerThread("LooperProvider");
                this.b.start();
                this.a = new Handler(this.b.getLooper());
                cml.a();
            } else {
                cml.a();
                this.d.notifyAll();
            }
            this.c++;
            looper = this.b.getLooper();
        }
        return looper;
    }
}
