package io.reactivex.internal.subscriptions;

import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.BackpressureHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

public enum SubscriptionHelper implements xfm {
    CANCELLED;

    public static void a(AtomicReference<xfm> atomicReference, AtomicLong atomicLong, long j) {
        xfm xfm = (xfm) atomicReference.get();
        if (xfm != null) {
            xfm.a(j);
            return;
        }
        if (b(j)) {
            BackpressureHelper.a(atomicLong, j);
            xfm xfm2 = (xfm) atomicReference.get();
            if (xfm2 != null) {
                long andSet = atomicLong.getAndSet(0);
                if (andSet != 0) {
                    xfm2.a(andSet);
                }
            }
        }
    }

    public static boolean a(AtomicReference<xfm> atomicReference) {
        xfm xfm = (xfm) atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (xfm != subscriptionHelper) {
            xfm xfm2 = (xfm) atomicReference.getAndSet(subscriptionHelper);
            if (xfm2 != CANCELLED) {
                if (xfm2 != null) {
                    xfm2.a();
                }
                return true;
            }
        }
        return false;
    }

    public static boolean a(AtomicReference<xfm> atomicReference, AtomicLong atomicLong, xfm xfm) {
        if (!a(atomicReference, xfm)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0);
        if (andSet != 0) {
            xfm.a(andSet);
        }
        return true;
    }

    public static boolean a(AtomicReference<xfm> atomicReference, xfm xfm) {
        ObjectHelper.a(xfm, "s is null");
        if (atomicReference.compareAndSet(null, xfm)) {
            return true;
        }
        xfm.a();
        if (atomicReference.get() != CANCELLED) {
            b();
        }
        return false;
    }

    public static boolean a(AtomicReference<xfm> atomicReference, xfm xfm, long j) {
        if (!a(atomicReference, xfm)) {
            return false;
        }
        xfm.a(j);
        return true;
    }

    public static boolean a(xfm xfm, xfm xfm2) {
        if (xfm2 == null) {
            RxJavaPlugins.a((Throwable) new NullPointerException("next is null"));
            return false;
        } else if (xfm == null) {
            return true;
        } else {
            xfm2.a();
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

    public final void a() {
    }

    public final void a(long j) {
    }
}
