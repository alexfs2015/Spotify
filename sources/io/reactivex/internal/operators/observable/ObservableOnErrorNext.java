package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.SequentialDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableOnErrorNext<T> extends AbstractObservableWithUpstream<T, T> {
    private Function<? super Throwable, ? extends ObservableSource<? extends T>> b;
    private boolean c;

    static final class OnErrorNextObserver<T> implements Observer<T> {
        final SequentialDisposable a = new SequentialDisposable();
        private Observer<? super T> b;
        private Function<? super Throwable, ? extends ObservableSource<? extends T>> c;
        private boolean d;
        private boolean e;
        private boolean f;

        OnErrorNextObserver(Observer<? super T> observer, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
            this.b = observer;
            this.c = function;
            this.d = z;
        }

        public final void onSubscribe(Disposable disposable) {
            DisposableHelper.c(this.a, disposable);
        }

        public final void onNext(T t) {
            if (!this.f) {
                this.b.onNext(t);
            }
        }

        public final void onError(Throwable th) {
            if (!this.e) {
                this.e = true;
                if (!this.d || (th instanceof Exception)) {
                    try {
                        ObservableSource observableSource = (ObservableSource) this.c.apply(th);
                        if (observableSource == null) {
                            NullPointerException nullPointerException = new NullPointerException("Observable is null");
                            nullPointerException.initCause(th);
                            this.b.onError(nullPointerException);
                            return;
                        }
                        observableSource.subscribe(this);
                    } catch (Throwable th2) {
                        Exceptions.b(th2);
                        this.b.onError(new CompositeException(th, th2));
                    }
                } else {
                    this.b.onError(th);
                }
            } else if (this.f) {
                RxJavaPlugins.a(th);
            } else {
                this.b.onError(th);
            }
        }

        public final void onComplete() {
            if (!this.f) {
                this.f = true;
                this.e = true;
                this.b.onComplete();
            }
        }
    }

    public ObservableOnErrorNext(ObservableSource<T> observableSource, Function<? super Throwable, ? extends ObservableSource<? extends T>> function, boolean z) {
        super(observableSource);
        this.b = function;
        this.c = z;
    }

    public final void a(Observer<? super T> observer) {
        OnErrorNextObserver onErrorNextObserver = new OnErrorNextObserver(observer, this.b, this.c);
        observer.onSubscribe(onErrorNextObserver.a);
        this.a.subscribe(onErrorNextObserver);
    }
}
