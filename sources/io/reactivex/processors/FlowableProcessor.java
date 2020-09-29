package io.reactivex.processors;

import io.reactivex.Flowable;
import io.reactivex.FlowableSubscriber;

public abstract class FlowableProcessor<T> extends Flowable<T> implements FlowableSubscriber<T>, wre<T, T> {
    public final FlowableProcessor<T> l() {
        return new SerializedProcessor(this);
    }
}
