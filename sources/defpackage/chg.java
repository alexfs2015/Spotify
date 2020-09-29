package defpackage;

import java.util.concurrent.Future;

/* renamed from: chg reason: default package */
final class chg implements Runnable {
    private final /* synthetic */ Future a;

    chg(Future future) {
        this.a = future;
    }

    public final void run() {
        if (!this.a.isDone()) {
            this.a.cancel(true);
        }
    }
}
