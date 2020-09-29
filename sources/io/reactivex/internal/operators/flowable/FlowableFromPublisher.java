package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;

public final class FlowableFromPublisher<T> extends Flowable<T> {
    private wrf<? extends T> b;

    public FlowableFromPublisher(wrf<? extends T> wrf) {
        this.b = wrf;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.b(wrg);
    }
}
