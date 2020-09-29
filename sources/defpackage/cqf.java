package defpackage;

import java.util.concurrent.Future;

/* renamed from: cqf reason: default package */
final /* synthetic */ class cqf implements Runnable {
    private final cqi a;
    private final Future b;

    cqf(cqi cqi, Future future) {
        this.a = cqi;
        this.b = future;
    }

    public final void run() {
        cqi cqi = this.a;
        Future future = this.b;
        if (cqi.isCancelled()) {
            future.cancel(true);
        }
    }
}
