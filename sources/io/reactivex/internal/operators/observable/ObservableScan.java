package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.BiFunction;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableScan<T> extends AbstractObservableWithUpstream<T, T> {
    private BiFunction<T, T, T> b;

    static final class ScanObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private BiFunction<T, T, T> b;
        private Disposable c;
        private T d;
        private boolean e;

        ScanObserver(Observer<? super T> observer, BiFunction<T, T, T> biFunction) {
            this.a = observer;
            this.b = biFunction;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
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
                Observer<? super T> observer = this.a;
                T t2 = this.d;
                if (t2 == null) {
                    this.d = t;
                    observer.onNext(t);
                    return;
                }
                try {
                    T a2 = ObjectHelper.a(this.b.apply(t2, t), "The value returned by the accumulator is null");
                    this.d = a2;
                    observer.onNext(a2);
                } catch (Throwable th) {
                    Exceptions.b(th);
                    this.c.bd_();
                    onError(th);
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

    public ObservableScan(ObservableSource<T> observableSource, BiFunction<T, T, T> biFunction) {
        super(observableSource);
        this.b = biFunction;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new ScanObserver(observer, this.b));
    }
}
