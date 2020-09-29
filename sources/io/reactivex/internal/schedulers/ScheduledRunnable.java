package io.reactivex.internal.schedulers;

import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableContainer;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ScheduledRunnable extends AtomicReferenceArray<Object> implements Disposable, Runnable, Callable<Object> {
    private static Object a = new Object();
    private static Object b = new Object();
    private static Object c = new Object();
    private static Object d = new Object();
    private static final long serialVersionUID = -6120223772001106981L;
    final Runnable actual;

    public ScheduledRunnable(Runnable runnable, DisposableContainer disposableContainer) {
        super(3);
        this.actual = runnable;
        lazySet(0, disposableContainer);
    }

    public final Object call() {
        run();
        return null;
    }

    public final void run() {
        Object obj;
        Object obj2;
        lazySet(2, Thread.currentThread());
        try {
            this.actual.run();
        } catch (Throwable th) {
            lazySet(2, null);
            Object obj3 = get(0);
            if (!(obj3 == a || !compareAndSet(0, obj3, d) || obj3 == null)) {
                ((DisposableContainer) obj3).c(this);
            }
            do {
                obj2 = get(1);
                if (obj2 == b || obj2 == c) {
                    throw th;
                }
            } while (!compareAndSet(1, obj2, d));
            throw th;
        }
        lazySet(2, null);
        Object obj4 = get(0);
        if (!(obj4 == a || !compareAndSet(0, obj4, d) || obj4 == null)) {
            ((DisposableContainer) obj4).c(this);
        }
        do {
            obj = get(1);
            if (obj == b || obj == c) {
                return;
            }
        } while (!compareAndSet(1, obj, d));
    }

    public final void a(Future<?> future) {
        Object obj;
        do {
            obj = get(1);
            if (obj != d) {
                if (obj == b) {
                    future.cancel(false);
                    return;
                } else if (obj == c) {
                    future.cancel(true);
                    return;
                }
            } else {
                return;
            }
        } while (!compareAndSet(1, obj, future));
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void bf_() {
        /*
            r5 = this;
        L_0x0000:
            r0 = 1
            java.lang.Object r1 = r5.get(r0)
            java.lang.Object r2 = d
            r3 = 0
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = b
            if (r1 == r2) goto L_0x0034
            java.lang.Object r2 = c
            if (r1 == r2) goto L_0x0034
            r2 = 2
            java.lang.Object r2 = r5.get(r2)
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            if (r2 == r4) goto L_0x001f
            r2 = 1
            goto L_0x0020
        L_0x001f:
            r2 = 0
        L_0x0020:
            if (r2 == 0) goto L_0x0025
            java.lang.Object r4 = c
            goto L_0x0027
        L_0x0025:
            java.lang.Object r4 = b
        L_0x0027:
            boolean r0 = r5.compareAndSet(r0, r1, r4)
            if (r0 == 0) goto L_0x0000
            if (r1 == 0) goto L_0x0034
            java.util.concurrent.Future r1 = (java.util.concurrent.Future) r1
            r1.cancel(r2)
        L_0x0034:
            java.lang.Object r0 = r5.get(r3)
            java.lang.Object r1 = d
            if (r0 == r1) goto L_0x004e
            java.lang.Object r1 = a
            if (r0 == r1) goto L_0x004e
            if (r0 != 0) goto L_0x0043
            goto L_0x004e
        L_0x0043:
            boolean r1 = r5.compareAndSet(r3, r0, r1)
            if (r1 == 0) goto L_0x0034
            io.reactivex.internal.disposables.DisposableContainer r0 = (io.reactivex.internal.disposables.DisposableContainer) r0
            r0.c(r5)
        L_0x004e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.reactivex.internal.schedulers.ScheduledRunnable.bf_():void");
    }

    public final boolean b() {
        Object obj = get(0);
        if (obj == a || obj == d) {
            return true;
        }
        return false;
    }
}
