package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: cdj reason: default package */
final class cdj implements Runnable {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ cdi b;

    cdj(cdi cdi, CountDownLatch countDownLatch) {
        this.b = cdi;
        this.a = countDownLatch;
    }

    public final void run() {
        synchronized (this.b.d) {
            this.b.i = bih.a(this.b.h, this.b.g, this.a);
        }
    }
}
