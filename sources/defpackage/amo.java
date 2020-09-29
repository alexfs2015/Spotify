package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: amo reason: default package */
public final class amo<T> {
    public T a;
    CountDownLatch b = new CountDownLatch(1);

    public amo(final Callable<T> callable) {
        akc.e().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                try {
                    amo.this.a = callable.call();
                    amo.this.b.countDown();
                    return null;
                } catch (Throwable th) {
                    amo.this.b.countDown();
                    throw th;
                }
            }
        }));
    }

    public void a() {
        CountDownLatch countDownLatch = this.b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException unused) {
            }
        }
    }
}
