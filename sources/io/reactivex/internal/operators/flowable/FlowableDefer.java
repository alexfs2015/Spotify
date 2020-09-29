package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

public final class FlowableDefer<T> extends Flowable<T> {
    private Callable<? extends wrf<? extends T>> b;

    public FlowableDefer(Callable<? extends wrf<? extends T>> callable) {
        this.b = callable;
    }

    public final void a(wrg<? super T> wrg) {
        try {
            ((wrf) ObjectHelper.a(this.b.call(), "The publisher supplied is null")).b(wrg);
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptySubscription.a(th, wrg);
        }
    }
}
