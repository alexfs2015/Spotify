package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.FutureTask;

/* renamed from: anc reason: default package */
public final class anc<T> {
    public T a;
    CountDownLatch b = new CountDownLatch(1);

    public anc(final Callable<T> callable) {
        akq.e().execute(new FutureTask(new Callable<Void>() {
            /* JADX INFO: finally extract failed */
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void call() {
                try {
                    anc.this.a = callable.call();
                    anc.this.b.countDown();
                    return null;
                } catch (Throwable th) {
                    anc.this.b.countDown();
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
