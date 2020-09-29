package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;

public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public final int a(int i) {
        return i & 2;
    }

    public final void a() {
    }

    public final Object bc_() {
        return null;
    }

    public final boolean d() {
        return true;
    }

    public final void e() {
    }

    public final String toString() {
        return "EmptySubscription";
    }

    public final void a(long j) {
        SubscriptionHelper.b(j);
    }

    public static void a(Throwable th, wrg<?> wrg) {
        wrg.a(INSTANCE);
        wrg.onError(th);
    }

    public static void a(wrg<?> wrg) {
        wrg.a(INSTANCE);
        wrg.c();
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
