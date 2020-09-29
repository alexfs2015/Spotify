package defpackage;

import java.util.concurrent.Future;

/* renamed from: cpl reason: default package */
final /* synthetic */ class cpl implements Runnable {
    private final Future a;

    cpl(Future future) {
        this.a = future;
    }

    public final void run() {
        Future future = this.a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
