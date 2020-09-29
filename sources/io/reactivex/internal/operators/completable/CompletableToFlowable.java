package io.reactivex.internal.operators.completable;

import io.reactivex.CompletableSource;
import io.reactivex.Flowable;
import io.reactivex.internal.observers.SubscriberCompletableObserver;

public final class CompletableToFlowable<T> extends Flowable<T> {
    private CompletableSource b;

    public CompletableToFlowable(CompletableSource completableSource) {
        this.b = completableSource;
    }

    public final void a(xfl<? super T> xfl) {
        this.b.a(new SubscriberCompletableObserver(xfl));
    }
}
