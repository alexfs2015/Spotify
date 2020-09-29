package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.FuseToObservable;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableElementAtMaybe<T> extends Maybe<T> implements FuseToObservable<T> {
    private ObservableSource<T> a;
    private long b;

    static final class ElementAtObserver<T> implements Observer<T>, Disposable {
        private MaybeObserver<? super T> a;
        private long b;
        private Disposable c;
        private long d;
        private boolean e;

        ElementAtObserver(MaybeObserver<? super T> maybeObserver, long j) {
            this.a = maybeObserver;
            this.b = j;
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
                long j = this.d;
                if (j == this.b) {
                    this.e = true;
                    this.c.bf_();
                    this.a.c_(t);
                    return;
                }
                this.d = j + 1;
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
                this.a.onComplete();
            }
        }
    }

    public ObservableElementAtMaybe(ObservableSource<T> observableSource, long j) {
        this.a = observableSource;
        this.b = j;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new ElementAtObserver(maybeObserver, this.b));
    }

    public final Observable<T> bg_() {
        ObservableElementAt observableElementAt = new ObservableElementAt(this.a, this.b, null, false);
        return RxJavaPlugins.a((Observable<T>) observableElementAt);
    }
}
