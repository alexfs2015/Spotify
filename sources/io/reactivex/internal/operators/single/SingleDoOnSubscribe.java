package io.reactivex.internal.operators.single;

import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.SingleSource;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class SingleDoOnSubscribe<T> extends Single<T> {
    private SingleSource<T> a;
    private Consumer<? super Disposable> b;

    static final class DoOnSubscribeSingleObserver<T> implements SingleObserver<T> {
        private SingleObserver<? super T> a;
        private Consumer<? super Disposable> b;
        private boolean c;

        DoOnSubscribeSingleObserver(SingleObserver<? super T> singleObserver, Consumer<? super Disposable> consumer) {
            this.a = singleObserver;
            this.b = consumer;
        }

        public final void c_(T t) {
            if (!this.c) {
                this.a.c_(t);
            }
        }

        public final void onError(Throwable th) {
            if (this.c) {
                RxJavaPlugins.a(th);
            } else {
                this.a.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            try {
                this.b.accept(disposable);
                this.a.onSubscribe(disposable);
            } catch (Throwable th) {
                Exceptions.b(th);
                this.c = true;
                disposable.bd_();
                EmptyDisposable.a(th, this.a);
            }
        }
    }

    public SingleDoOnSubscribe(SingleSource<T> singleSource, Consumer<? super Disposable> consumer) {
        this.a = singleSource;
        this.b = consumer;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.b(new DoOnSubscribeSingleObserver(singleObserver, this.b));
    }
}
