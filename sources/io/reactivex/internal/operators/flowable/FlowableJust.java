package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.ScalarSubscription;

public final class FlowableJust<T> extends Flowable<T> implements ScalarCallable<T> {
    private final T b;

    public FlowableJust(T t) {
        this.b = t;
    }

    public final void a(wrg<? super T> wrg) {
        wrg.a(new ScalarSubscription(wrg, this.b));
    }

    public final T call() {
        return this.b;
    }
}
