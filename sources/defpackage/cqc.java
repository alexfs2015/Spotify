package defpackage;

import java.util.concurrent.Future;

/* renamed from: cqc reason: default package */
final /* synthetic */ class cqc implements Runnable {
    private final Future a;

    cqc(Future future) {
        this.a = future;
    }

    public final void run() {
        Future future = this.a;
        if (!future.isDone()) {
            future.cancel(true);
        }
    }
}
