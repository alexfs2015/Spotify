package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;

public enum EmptySubscription implements QueueSubscription<Object> {
    INSTANCE;

    public static void a(Throwable th, xfl<?> xfl) {
        xfl.a(INSTANCE);
        xfl.onError(th);
    }

    public static void a(xfl<?> xfl) {
        xfl.a(INSTANCE);
        xfl.c();
    }

    public final int a(int i) {
        return i & 2;
    }

    public final void a() {
    }

    public final void a(long j) {
        SubscriptionHelper.b(j);
    }

    public final boolean a(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final Object ba_() {
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
}
