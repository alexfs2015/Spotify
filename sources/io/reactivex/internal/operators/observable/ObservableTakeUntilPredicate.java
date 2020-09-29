package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.plugins.RxJavaPlugins;

public final class ObservableTakeUntilPredicate<T> extends AbstractObservableWithUpstream<T, T> {
    private Predicate<? super T> b;

    static final class TakeUntilPredicateObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Predicate<? super T> b;
        private Disposable c;
        private boolean d;

        TakeUntilPredicateObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            this.a = observer;
            this.b = predicate;
        }

        public final boolean b() {
            return this.c.b();
        }

        public final void bd_() {
            this.c.bd_();
        }

        public final void onComplete() {
            if (!this.d) {
                this.d = true;
                this.a.onComplete();
            }
        }

        public final void onError(Throwable th) {
            if (!this.d) {
                this.d = true;
                this.a.onError(th);
                return;
            }
            RxJavaPlugins.a(th);
        }

        public final void onNext(T t) {
            if (!this.d) {
                this.a.onNext(t);
                try {
                    if (this.b.test(t)) {
                        this.d = true;
                        this.c.bd_();
                        this.a.onComplete();
                    }
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

    public ObservableTakeUntilPredicate(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.b = predicate;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new TakeUntilPredicateObserver(observer, this.b));
    }
}
