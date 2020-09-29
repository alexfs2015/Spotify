package defpackage;

import java.util.concurrent.Future;

/* renamed from: cpo reason: default package */
final /* synthetic */ class cpo implements Runnable {
    private final cpr a;
    private final Future b;

    cpo(cpr cpr, Future future) {
        this.a = cpr;
        this.b = future;
    }

    public final void run() {
        cpr cpr = this.a;
        Future future = this.b;
        if (cpr.isCancelled()) {
            future.cancel(true);
        }
    }
}
