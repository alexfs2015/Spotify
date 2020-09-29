package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.internal.functions.ObjectHelper;

abstract class AbstractFlowableWithUpstream<T, R> extends Flowable<R> {
    protected final Flowable<T> b;

    AbstractFlowableWithUpstream(Flowable<T> flowable) {
        this.b = (Flowable) ObjectHelper.a(flowable, "source is null");
    }
}
