package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.observers.BasicFuseableObserver;

public final class ObservableFilter<T> extends AbstractObservableWithUpstream<T, T> {
    private Predicate<? super T> b;

    static final class FilterObserver<T> extends BasicFuseableObserver<T, T> {
        private Predicate<? super T> e;

        FilterObserver(Observer<? super T> observer, Predicate<? super T> predicate) {
            super(observer);
            this.e = predicate;
        }

        public final int a(int i) {
            return b(i);
        }

        public final T ba_() {
            T ba_;
            do {
                ba_ = this.b.ba_();
                if (ba_ == null) {
                    break;
                }
            } while (!this.e.test(ba_));
            return ba_;
        }

        public final void onNext(T t) {
            if (this.d == 0) {
                try {
                    if (this.e.test(t)) {
                        this.a.onNext(t);
                    }
                } catch (Throwable th) {
                    a(th);
                }
            } else {
                this.a.onNext(null);
            }
        }
    }

    public ObservableFilter(ObservableSource<T> observableSource, Predicate<? super T> predicate) {
        super(observableSource);
        this.b = predicate;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new FilterObserver(observer, this.b));
    }
}
