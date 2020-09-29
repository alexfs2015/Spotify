package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

public final class FlowableDefer<T> extends Flowable<T> {
    private Callable<? extends xfk<? extends T>> b;

    public FlowableDefer(Callable<? extends xfk<? extends T>> callable) {
        this.b = callable;
    }

    public final void a(xfl<? super T> xfl) {
        try {
            ((xfk) ObjectHelper.a(this.b.call(), "The publisher supplied is null")).b(xfl);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, xfl);
        }
    }
}
