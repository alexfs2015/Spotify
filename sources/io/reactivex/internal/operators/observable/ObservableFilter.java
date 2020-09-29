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

        public final int a(int i) {
            return b(i);
        }

        public final T bc_() {
            T bc_;
            do {
                bc_ = this.b.bc_();
                if (bc_ == null) {
                    break;
                }
            } while (!this.e.test(bc_));
            return bc_;
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
