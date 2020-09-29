package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.Single;
import io.reactivex.SingleObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;
import java.util.NoSuchElementException;

public final class ObservableElementAtSingle<T> extends Single<T> implements FuseToObservable<T> {
    private ObservableSource<T> a;
    private long b;
    private T c;

    static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        private SingleObserver<? super T> a;
        private long b;
        private T c;
        private Disposable d;
        private long e;
        private boolean f;

        ElementAtObserver(SingleObserver<? super T> singleObserver, long j, T t) {
            this.a = singleObserver;
            this.b = j;
            this.c = t;
        }

        public final boolean b() {
            return this.d.b();
        }

        public final void bd_() {
            this.d.bd_();
        }

        public final void onComplete() {
            if (!this.f) {
                this.f = true;
                T t = this.c;
                if (t != null) {
                    this.a.c_(t);
                    return;
                }
                this.a.onError(new NoSuchElementException());
            }
        }

        public final void onError(Throwable th) {
            if (this.f) {
                RxJavaPlugins.a(th);
                return;
            }
            this.f = true;
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.f) {
                long j = this.e;
                if (j == this.b) {
                    this.f = true;
                    this.d.bd_();
                    this.a.c_(t);
                    return;
                }
                this.e = j + 1;
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.d, disposable)) {
                this.d = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableElementAtSingle(ObservableSource<T> observableSource, long j, T t) {
        this.a = observableSource;
        this.b = j;
        this.c = t;
    }

    public final void a(SingleObserver<? super T> singleObserver) {
        this.a.subscribe(new ElementAtObserver(singleObserver, this.b, this.c));
    }

    public final Observable<T> be_() {
        ObservableElementAt observableElementAt = new ObservableElementAt(this.a, this.b, this.c, true);
        return RxJavaPlugins.a((Observable<T>) observableElementAt);
    }
}
