package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import rx.internal.util.UtilityFunctions.Identity;

/* renamed from: wzi reason: default package */
public final class wzi<T> {
    public final wud<? extends T> a;

    static {
        new Object();
        new Object();
        new Object();
    }

    private wzi(wud<? extends T> wud) {
        this.a = wud;
    }

    public static <T> wzi<T> a(wud<? extends T> wud) {
        return new wzi<>(wud);
    }

    public final T a(T t) {
        return b(this.a.f(Identity.INSTANCE).b(t));
    }

    public T b(wud<? extends T> wud) {
        final AtomicReference atomicReference = new AtomicReference();
        final AtomicReference atomicReference2 = new AtomicReference();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        wxn.a(countDownLatch, wud.a((wuj<? super T>) new wuj<T>() {
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
        }, wud));
        if (atomicReference2.get() != null) {
            wul.a((Throwable) atomicReference2.get());
        }
        return atomicReference.get();
    }
}
