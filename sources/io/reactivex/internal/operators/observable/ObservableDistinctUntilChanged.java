package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Function;
import io.reactivex.internal.observers.BasicFuseableObserver;

public final class ObservableDistinctUntilChanged<T, K> extends AbstractObservableWithUpstream<T, T> {
    private Function<? super T, K> b;
    private BiPredicate<? super K, ? super K> c;

    static final class DistinctUntilChangedObserver<T, K> extends BasicFuseableObserver<T, T> {
        private Function<? super T, K> e;
        private BiPredicate<? super K, ? super K> f;
        private K g;
        private boolean h;

        DistinctUntilChangedObserver(Observer<? super T> observer, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
            super(observer);
            this.e = function;
            this.f = biPredicate;
        }

        public final int a(int i) {
            return b(i);
        }

        public final T ba_() {
            while (true) {
                T ba_ = this.b.ba_();
                if (ba_ == null) {
                    return null;
                }
                K apply = this.e.apply(ba_);
                if (!this.h) {
                    this.h = true;
                    this.g = apply;
                    return ba_;
                } else if (!this.f.test(this.g, apply)) {
                    this.g = apply;
                    return ba_;
                } else {
                    this.g = apply;
                }
            }
        }

        public final void onNext(T t) {
            if (!this.c) {
                if (this.d != 0) {
                    this.a.onNext(t);
                    return;
                }
                try {
                    K apply = this.e.apply(t);
                    if (this.h) {
                        boolean test = this.f.test(this.g, apply);
                        this.g = apply;
                        if (test) {
                            return;
                        }
                    } else {
                        this.h = true;
                        this.g = apply;
                    }
                    this.a.onNext(t);
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    public ObservableDistinctUntilChanged(ObservableSource<T> observableSource, Function<? super T, K> function, BiPredicate<? super K, ? super K> biPredicate) {
        super(observableSource);
        this.b = function;
        this.c = biPredicate;
    }

    public final void a(Observer<? super T> observer) {
        this.a.subscribe(new DistinctUntilChangedObserver(observer, this.b, this.c));
    }
}
