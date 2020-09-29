package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final xfl<? super T> subscriber;
    final T value;

    public ScalarSubscription(xfl<? super T> xfl, T t) {
        this.subscriber = xfl;
        this.value = t;
    }

    public final int a(int i) {
        return i & 1;
    }

    public final void a() {
        lazySet(2);
    }

    public final void a(long j) {
        if (SubscriptionHelper.b(j) && compareAndSet(0, 1)) {
            xfl<? super T> xfl = this.subscriber;
            xfl.b_(this.value);
            if (get() != 2) {
                xfl.c();
            }
        }
    }

    public final boolean a(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final T ba_() {
        if (get() != 0) {
            return null;
        }
        lazySet(1);
        return this.value;
    }

    public final boolean d() {
        return get() != 0;
    }

    public final void e() {
        lazySet(1);
    }
}
