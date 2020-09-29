package defpackage;

import android.content.Context;

/* renamed from: cmw reason: default package */
final class cmw implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cmu b;

    cmw(cmu cmu, Context context) {
        this.b = cmu;
        this.a = context;
    }

    public final void run() {
        synchronized (this.b.c) {
            this.b.e = cmu.c(this.a);
            this.b.c.notifyAll();
        }
    }
}
