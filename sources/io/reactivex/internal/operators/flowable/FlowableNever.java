package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.subscriptions.EmptySubscription;

public final class FlowableNever extends Flowable<Object> {
    public static final Flowable<Object> b = new FlowableNever();

    private FlowableNever() {
    }

    public final void a(xfl<? super Object> xfl) {
        xfl.a(EmptySubscription.INSTANCE);
    }
}
