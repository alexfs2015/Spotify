package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public enum SubscriptionHelper implements wrh {
    CANCELLED;

    public final void a() {
    }

    public final void a(long j) {
    }

    public static boolean a(wrh wrh, wrh wrh2) {
        if (wrh2 == null) {
            RxJavaPlugins.a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (wrh == null) {
            return true;
        } else {
            wrh2.a();
            b();
            return false;
        }
    }

    private static void b() {
        RxJavaPlugins.a((Throwable) new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean b(long j) {
        if (j > 0) {
            return true;
        }
        StringBuilder sb = new StringBuilder("n > 0 required but it was ");
        sb.append(j);
        RxJavaPlugins.a((Throwable) new IllegalArgumentException(sb.toString()));
        return false;
    }

    public static void c(long j) {
        StringBuilder sb = new StringBuilder("More produced than requested: ");
        sb.append(j);
        RxJavaPlugins.a((Throwable) new ProtocolViolationException(sb.toString()));
    }

    public static boolean a(AtomicReference<wrh> atomicReference, wrh wrh) {
        ObjectHelper.a(wrh, "s is null");
        if (atomicReference.compareAndSet(null, wrh)) {
            return true;
        }
        wrh.a();
        if (atomicReference.get() != CANCELLED) {
            b();
        }
        return false;
    }

    public static boolean a(AtomicReference<wrh> atomicReference) {
        wrh wrh = (wrh) atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (wrh != subscriptionHelper) {
            wrh wrh2 = (wrh) atomicReference.getAndSet(subscriptionHelper);
            if (wrh2 != CANCELLED) {
                if (wrh2 != null) {
                    wrh2.a();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(AtomicReference<wrh> atomicReference, AtomicLong atomicLong, wrh wrh) {
        if (!a(atomicReference, wrh)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            wrh.a(andSet);
        }
        return true;
    }

    public static void a(AtomicReference<wrh> atomicReference, AtomicLong atomicLong, long j) {
        wrh wrh = (wrh) atomicReference.get();
        if (wrh != null) {
            wrh.a(j);
            return;
        }
        if (b(j)) {
            BackpressureHelper.a(atomicLong, j);
            wrh wrh2 = (wrh) atomicReference.get();
            if (wrh2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    wrh2.a(andSet);
                }
            }
        }
    }

    public static boolean a(AtomicReference<wrh> atomicReference, wrh wrh, long j) {
        if (!a(atomicReference, wrh)) {
            return false;
        }
        wrh.a(j);
        return true;
    }
}
