package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: xaa reason: default package */
public final class xaa<T> {
    private final wuh<? extends T> a;

    private xaa(wuh<? extends T> wuh) {
        this.a = wuh;
    }

    public static <T> xaa<T> a(wuh<? extends T> wuh) {
        return new xaa<>(wuh);
    }

    public final T a() {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        wxn.a(countDownLatch, this.a.a((wui<? super T>) new wui<T>() {
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
        throw wul.a(th);
    }
}
