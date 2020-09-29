package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xof reason: default package */
public final class xof<T> {
    private final xim<? extends T> a;

    private xof(xim<? extends T> xim) {
        this.a = xim;
    }

    public static <T> xof<T> a(xim<? extends T> xim) {
        return new xof<>(xim);
    }

    public final T a() {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        xls.a(countDownLatch, this.a.a((xin<? super T>) new xin<T>() {
            public final void a(T t) {
                atomicReference.set(t);
                countDownLatch.countDown();
            }

            public final void a(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }
        }));
        Throwable th = (Throwable) atomicReference2.get();
        if (th == null) {
            return atomicReference.get();
        }
        throw xiq.a(th);
    }
}
