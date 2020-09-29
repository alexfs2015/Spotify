package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.DeferredScalarSubscription;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class FlowableFromCallable<T> extends Flowable<T> implements Callable<T> {
    private Callable<? extends T> b;

    public FlowableFromCallable(Callable<? extends T> callable) {
        this.b = callable;
    }

    public final void a(xfl<? super T> xfl) {
        DeferredScalarSubscription deferredScalarSubscription = new DeferredScalarSubscription(xfl);
        xfl.a(deferredScalarSubscription);
        try {
            deferredScalarSubscription.b(ObjectHelper.a(this.b.call(), "The callable returned a null value"));
        } catch (Throwable th) {
            Exceptions.b(th);
            if (deferredScalarSubscription.get() == 4) {
                RxJavaPlugins.a(th);
            } else {
                xfl.onError(th);
            }
        }
    }

    public final T call() {
        return ObjectHelper.a(this.b.call(), "The callable returned a null value");
    }
}
