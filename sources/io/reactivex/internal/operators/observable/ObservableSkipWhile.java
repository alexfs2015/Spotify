package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.disposables.DisposableHelper;

public final class ObservableSkipWhile<T> extends AbstractObservableWithUpstream<T, T> {
    private Predicate<? super T> b;

    static final class SkipWhileObserver<T> implements Observer<T>, Disposable {
        private Observer<? super T> a;
        private Predicate<? super T> b;
        private Disposable c;
        private boolean d;

        SkipWhileObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
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
            this.a.onComplete();
        }

        public final void onError(Throwable th) {
            this.a.onError(th);
        }

        public final void onNext(T t) {
            if (this.d) {
                this.a.onNext(t);
                return;
            }
            try {
                if (!this.b.test(t)) {
                    this.d = true;
                    this.a.onNext(t);
                }
            } catch (Throwable th) {
                Exceptions.b(th);
                this.c.bd_();
                this.a.onError(th);
            }
        }

        public final void onSubscribe(Disposable disposable) {
            if (DisposableHelper.a(this.c, disposable)) {
                this.c = disposable;
                this.a.onSubscribe(this);
            }
        }
    }

    public ObservableSkipWhile(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.b = predicate;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new SkipWhileObserver(observer, this.b));
    }
}
