package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;

public final class FlowableFromPublisher<T> extends Flowable<T> {
    private xfk<? extends T> b;

    public FlowableFromPublisher(xfk<? extends T> xfk) {
        this.b = xfk;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.b(xfl);
    }
}
