package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: xnn reason: default package */
public final class xnn<T> {
    public final xii<? extends T> a;

    static {
        new Object();
        new Object();
        new Object();
    }

    private xnn(xii<? extends T> xii) {
        this.a = xii;
    }

    public static <T> xnn<T> a(xii<? extends T> xii) {
        return new xnn<>(xii);
    }

    public final T a(T t) {
        return b(this.a.e((xiy<? super T, ? extends R>) Identity.INSTANCE).b(t));
    }

    public T b(xii<? extends T> xii) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        xls.a(countDownLatch, xii.a((xio<? super T>) new xio<T>() {
            public final void onCompleted() {
                countDownLatch.countDown();
            }

            public final void onError(Throwable th) {
                atomicReference2.set(th);
                countDownLatch.countDown();
            }

            public final void onNext(T t) {
                atomicReference.set(t);
            }
        }, xii));
        if (atomicReference2.get() != null) {
            xiq.a((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }
}
