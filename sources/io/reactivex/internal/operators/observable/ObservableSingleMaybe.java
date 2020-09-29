package io.reactivex.internal.operators.observable;

import io.reactivex.Maybe;
import io.reactivex.MaybeObserver;
import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableSingleMaybe<T> extends Maybe<T> {
    private ObservableSource<T> a;

    static final class SingleElementObserver<T> implements Observer<T>, Disposable {
        private MaybeObserver<? super T> a;
        private Disposable b;
        private T c;
        private boolean d;

        SingleElementObserver(MaybeObserver<? super T> maybeObserver) {
            this.a = maybeObserver;
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.b, disposable)) {
                this.b = disposable;
                this.a.onSubscribe(this);
            }
        }

        public final void bf_() {
            this.b.bf_();
        }

        public final boolean b() {
            return this.b.b();
        }

        public final void onNext(T t) {
            if (!this.d) {
                if (this.c != null) {
                    this.d = true;
                    this.b.bf_();
                    this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
                    return;
                }
                this.c = t;
            }
        }

        public final void onError(Throwable th) {
            if (this.d) {
                RxJavaPlugins.a(th);
                return;
            }
            this.d = true;
            this.a.onError(th);
        }

        public final void onComplete() {
            if (!this.d) {
                this.d = true;
                T t = this.c;
                this.c = null;
                if (t == null) {
                    this.a.onComplete();
                } else {
                    this.a.c_(t);
                }
            }
        }
    }

    public ObservableSingleMaybe(ObservableSource<T> observableSource) {
        this.a = observableSource;
    }

    public final void b(MaybeObserver<? super T> maybeObserver) {
        this.a.subscribe(new SingleElementObserver(maybeObserver));
    }
}
