package defpackage;

import android.content.Context;

/* renamed from: cmf reason: default package */
final class cmf implements Runnable {
    private final /* synthetic */ Context a;
    private final /* synthetic */ cmd b;

    cmf(cmd cmd, Context context) {
        this.b = cmd;
        this.a = context;
    }

    public final void run() {
        synchronized (this.b.c) {
            this.b.e = cmd.c(this.a);
            this.b.c.notifyAll();
        }
    }
}
