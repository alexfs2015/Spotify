package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.subscriptions.EmptySubscription;
import java.util.concurrent.Callable;

public final class FlowableError<T> extends Flowable<T> {
    private Callable<? extends Throwable> b;

    public FlowableError(Callable<? extends Throwable> callable) {
        this.b = callable;
    }

    public final void a(xfl<? super T> xfl) {
        try {
            th = (Throwable) ObjectHelper.a(this.b.call(), "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources.");
        } catch (Throwable th) {
            th = th;
            Exceptions.b(th);
        }
        EmptySubscription.a(th, xfl);
    }
}
