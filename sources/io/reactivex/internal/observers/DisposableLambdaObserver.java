package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class DisposableLambdaObserver<T> implements Observer<T>, Disposable {
    private Observer<? super T> a;
    private Consumer<? super Disposable> b;
    private Action c;
    private Disposable d;

    public DisposableLambdaObserver(Observer<? super T> observer, Consumer<? super Disposable> consumer, Action action) {
        this.a = observer;
        this.b = consumer;
        this.c = action;
    }

    public final boolean b() {
        return this.d.b();
    }

    public final void bd_() {
        Disposable disposable = this.d;
        if (disposable != DisposableHelper.DISPOSED) {
            this.d = DisposableHelper.DISPOSED;
            try {
                this.c.run();
            } catch (Throwable th) {
                Exceptions.b(th);
                RxJavaPlugins.a(th);
            }
            disposable.bd_();
        }
    }

    public final void onComplete() {
        if (this.d != DisposableHelper.DISPOSED) {
            this.d = DisposableHelper.DISPOSED;
            this.a.onComplete();
        }
    }

    public final void onError(Throwable th) {
        if (this.d != DisposableHelper.DISPOSED) {
            this.d = DisposableHelper.DISPOSED;
            this.a.onError(th);
            return;
        }
        RxJavaPlugins.a(th);
    }

    public final void onNext(T t) {
        this.a.onNext(t);
    }

    public final void onSubscribe(Disposable disposable) {
        try {
            this.b.accept(disposable);
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        } catch (Throwable th) {
            Exceptions.b(th);
            disposable.bd_();
            this.d = DisposableHelper.DISPOSED;
            EmptyDisposable.a(th, this.a);
        }
    }
}
