package defpackage;

import java.util.concurrent.Future;

/* renamed from: chx reason: default package */
final class chx implements Runnable {
    private final /* synthetic */ Future a;

    chx(Future future) {
        this.a = future;
    }

    public final void run() {
        if (!this.a.isDone()) {
            this.a.cancel(true);
        }
    }
}
