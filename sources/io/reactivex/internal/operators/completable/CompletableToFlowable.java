package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;

public final class CompletableToFlowable<T> extends Flowable<T> {
    private CompletableSource b;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.b = completableSource;
    }

    public final void a(wrg<? super T> wrg) {
        this.b.a(new SubscriberCompletableObserver(wrg));
    }
}
