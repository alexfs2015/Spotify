package defpackage;

import java.util.concurrent.Future;

/* renamed from: dyi reason: default package */
final /* synthetic */ class dyi implements Runnable {
    private final cqt a;
    private final Future b;

    dyi(cqt cqt, Future future) {
        this.a = cqt;
        this.b = future;
    }

    public final void run() {
        cqt cqt = this.a;
        Future future = this.b;
        if (cqt.isCancelled()) {
            future.cancel(true);
        }
    }
}
