package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.Callable;

public final class ObservableScanSeed<T, R> extends AbstractObservableWithUpstream<T, R> {
    private BiFunction<R, ? super T, R> b;
    private Callable<R> c;

    static final class ScanSeedObserver<T, R> implements Observer<T>, Disposable {
        private Observer<? super R> a;
        private BiFunction<R, ? super T, R> b;
        private R c;
        private Disposable d;
        private boolean e;

        ScanSeedObserver(Observer<? super R> observer, BiFunction<R, ? super T, R> biFunction, R r) {
            this.a = observer;
            this.b = biFunction;
            this.c = r;
        }

        public final boolean b() {
            return this.d.b();
        }

        public final void bd_() {
            this.d.bd_();
        }

        public final void onComplete() {
            if (!this.e) {
                this.e = true;
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.e) {
                RxJavaPlugins.a(th);
                return;
            }
            this.e = true;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.e) {
                try {
                    R a2 = ObjectHelper.a(this.b.apply(this.c, t), "The accumulator returned a null value");
                    this.c = a2;
                    this.a.onNext(a2);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.d.bd_();
                    onError(th);
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
                this.a.onNext(this.c);
            }
        }
    }

    public ObservableScanSeed(ObservableSource<T> observableSource, Callable<R> callable, BiFunction<R, ? super T, R> biFunction) {
        super(observableSource);
        this.b = biFunction;
        this.c = callable;
    }

    public final void a(Observer<? super R> observer) {
        try {
            this.a.subscribe(new ScanSeedObserver(observer, this.b, ObjectHelper.a(this.c.call(), "The seed supplied is null")));
        } catch (Throwable th) {
            Exceptions.b(th);
            EmptyDisposable.a(th, observer);
        }
    }
}
