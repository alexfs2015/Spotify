package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class ObservableSingleSingle<T> extends Single<T> {
    private ObservableSource<? extends T> a;
    private T b;

    static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        private SingleObserver<? super T> a;
        private T b;
        private Disposable c;
        private T d;
        private boolean e;

        SingleElementObserver(SingleObserver<? super T> singleObserver, T t) {
            this.a = singleObserver;
            this.b = t;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void bf_() {
            this.c.bf_();
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void onNext(T t) {
            if (!this.e) {
                if (this.d != null) {
                    this.e = true;
                    this.c.bf_();
                    this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.d = t;
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

        public final void onComplete() {
            if (!this.e) {
                this.e = true;
                T t = this.d;
                this.d = null;
                if (t == null) {
                    t = this.b;
                }
                if (t != null) {
                    this.a.c_(t);
                } else {
                    this.a.onError(new NoSuchElementException());
                }
            }
        }
    }

    public ObservableSingleSingle(ObservableSource<? extends T> observableSource, T t) {
        this.a = observableSource;
        this.b = t;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.subscribe(new SingleElementObserver(singleObserver, this.b));
    }
}
