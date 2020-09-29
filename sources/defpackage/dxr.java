package defpackage;

import java.util.concurrent.Future;

/* renamed from: dxr reason: default package */
final /* synthetic */ class dxr implements Runnable {
    private final cqc a;
    private final Future b;

    dxr(cqc cqc, Future future) {
        this.a = cqc;
        this.b = future;
    }

    public final void run() {
        cqc cqc = this.a;
        Future future = this.b;
        if (cqc.isCancelled()) {
            future.cancel(true);
        }
    }
}
