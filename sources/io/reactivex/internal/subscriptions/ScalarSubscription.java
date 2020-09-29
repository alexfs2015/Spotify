package io.reactivex.internal.subscriptions;

import io.reactivex.internal.fuseable.QueueSubscription;
import java.util.concurrent.atomic.AtomicInteger;

public final class ScalarSubscription<T> extends AtomicInteger implements QueueSubscription<T> {
    private static final long serialVersionUID = -3830916580126663321L;
    final wrg<? super T> subscriber;
    final T value;

    public final int a(int i) {
        return i & 1;
    }

    public ScalarSubscription(wrg<? super T> wrg, T t) {
        this.subscriber = wrg;
        this.value = t;
    }

    public final void a(long j) {
        if (SubscriptionHelper.b(j) && compareAndSet(0, 1)) {
            wrg<? super T> wrg = this.subscriber;
            wrg.b_(this.value);
            if (get() != 2) {
                wrg.c();
            }
        }
    }

    public final void a() {
        lazySet(2);
    }

    public final boolean a(T t) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    public final T bc_() {
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
