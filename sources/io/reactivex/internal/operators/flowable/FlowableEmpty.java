package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.fuseable.ScalarCallable;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class FlowableEmpty extends Flowable<Object> implements ScalarCallable<Object> {
    public static final Flowable<Object> b = new FlowableEmpty();

    private FlowableEmpty() {
    }

    public final void a(xfl<? super Object> xfl) {
        EmptySubscription.a(xfl);
    }

    public final Object call() {
        return null;
    }
}
