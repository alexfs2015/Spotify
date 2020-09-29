package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.Observer;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.observers.BasicFuseableObserver;

public final class ObservableMap<T, U> extends AbstractObservableWithUpstream<T, U> {
    private Function<? super T, ? extends U> b;

    static final class MapObserver<T, U> extends BasicFuseableObserver<T, U> {
        private Function<? super T, ? extends U> e;

        MapObserver(Observer<? super U> observer, Function<? super T, ? extends U> function) {
            super(observer);
            this.e = function;
        }

        public final int a(int i) {
            return b(i);
        }

        public final U ba_() {
            Object ba_ = this.b.ba_();
            if (ba_ != null) {
                return ObjectHelper.a(this.e.apply(ba_), "The mapper function returned a null value.");
            }
            return null;
        }

        public final void onNext(T t) {
            if (!this.c) {
                if (this.d != 0) {
                    this.a.onNext(null);
                    return;
                }
                try {
                    this.a.onNext(ObjectHelper.a(this.e.apply(t), "The mapper function returned a null value."));
                } catch (Throwable th) {
                    a(th);
                }
            }
        }
    }

    public ObservableMap(ObservableSource<T> observableSource, Function<? super T, ? extends U> function) {
        super(observableSource);
        this.b = function;
    }

    public final void a(Observer<? super U> observer) {
        this.a.subscribe(new MapObserver(observer, this.b));
    }
}
