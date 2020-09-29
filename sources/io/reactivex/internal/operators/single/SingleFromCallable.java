package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class SingleFromCallable<T> extends Single<T> {
    private Callable<? extends T> a;

    public SingleFromCallable(Callable<? extends T> callable) {
        this.a = callable;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        Disposable a2 = Disposables.a();
        singleObserver.onSubscribe(a2);
        if (!a2.b()) {
            try {
                Object a3 = ObjectHelper.a(this.a.call(), "The callable returned a null value");
                if (!a2.b()) {
                    singleObserver.c_(a3);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                if (!a2.b()) {
                    singleObserver.onError(th);
                } else {
                    RxJavaPlugins.a(th);
                }
            }
        }
    }
}
