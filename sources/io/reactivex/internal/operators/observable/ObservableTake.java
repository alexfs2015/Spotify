package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableTake<T> extends AbstractObservableWithUpstream<T, T> {
    private long b;

    static final class TakeObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private boolean b;
        private Disposable c;
        private long d;

        TakeObserver(Observer<? super T> observer, long j) {
            this.a = observer;
            this.d = j;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
        }

        public final void onComplete() {
            if (!this.b) {
                this.b = true;
                this.c.bd_();
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (this.b) {
                RxJavaPlugins.a(th);
                return;
            }
            this.b = true;
            this.c.bd_();
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (!this.b) {
                long j = this.d;
                this.d = j - 1;
                if (j > 0) {
                    boolean z = this.d == 0;
                    this.a.onNext(t);
                    if (z) {
                        onComplete();
                    }
                }
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                if (this.d == 0) {
                    this.b = true;
                    disposable.bd_();
                    EmptyDisposable.a(this.a);
                    return;
                }
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableTake(ObservableSource<T> observableSource, long j) {
        super(observableSource);
        this.b = j;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new TakeObserver(observer, this.b));
    }
}
