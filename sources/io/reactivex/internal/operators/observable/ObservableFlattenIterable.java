package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Function;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableFlattenIterable<T, R> extends AbstractObservableWithUpstream<T, R> {
    private Function<? super T, ? extends Iterable<? extends R>> b;

    static final class FlattenIterableObserver<T, R> implements Observer<T>, Disposable {
        private Observer<? super R> a;
        private Function<? super T, ? extends Iterable<? extends R>> b;
        private Disposable c;

        FlattenIterableObserver(Observer<? super R> observer, Function<? super T, ? extends Iterable<? extends R>> function) {
            this.a = observer;
            this.b = function;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
            this.c = DisposableHelper.DISPOSED;
        }

        public final void onComplete() {
            if (this.c != DisposableHelper.DISPOSED) {
                this.c = DisposableHelper.DISPOSED;
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.c == DisposableHelper.DISPOSED) {
                RxJavaPlugins.a(th);
                return;
            }
            this.c = DisposableHelper.DISPOSED;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (this.c != DisposableHelper.DISPOSED) {
                try {
                    Observer<? super R> observer = this.a;
                    for (Object a2 : (Iterable) this.b.apply(t)) {
                        try {
                            try {
                                observer.onNext(ObjectHelper.a(a2, "The iterator returned a null value"));
                            } catch (Throwable th) {
                                Exceptions.b(th);
                                this.c.bd_();
                                onError(th);
                            }
                        } catch (Throwable th2) {
                            Exceptions.b(th2);
                            this.c.bd_();
                            onError(th2);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    Exceptions.b(th3);
                    this.c.bd_();
                    onError(th3);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableFlattenIterable(ObservableSource<T> observableSource, Function<? super T, ? extends Iterable<? extends R>> function) {
        super(observableSource);
        this.b = function;
    }

    public final void a(Observer<? super R> observer) {
        this.a.subscribe(new FlattenIterableObserver(observer, this.b));
    }
}
