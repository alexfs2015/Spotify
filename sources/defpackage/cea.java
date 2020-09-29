package defpackage;

import java.util.concurrent.CountDownLatch;

/* renamed from: cea reason: default package */
final class cea implements Runnable {
    private final /* synthetic */ CountDownLatch a;
    private final /* synthetic */ cdz b;

    cea(cdz cdz, CountDownLatch countDownLatch) {
        this.b = cdz;
        this.a = countDownLatch;
    }

    public final void run() {
        synchronized (this.b.d) {
            this.b.i = biy.a(this.b.h, this.b.g, this.a);
        }
    }
}
