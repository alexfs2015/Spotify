package io.reactivex.internal.operators.observable;

import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import io.reactivex.internal.functions.ObjectHelper;

public final class ObservableInternalHelper {

    static final class FlatMapWithCombinerInner<U, R, T> implements Function<U, R> {
        private final BiFunction<? super T, ? super U, ? extends R> a;
        private final T b;

        FlatMapWithCombinerInner(BiFunction<? super T, ? super U, ? extends R> biFunction, T t) {
            this.a = biFunction;
            this.b = t;
        }

        public final R apply(U u) {
            return this.a.apply(this.b, u);
        }
    }

    static final class FlatMapWithCombinerOuter<T, R, U> implements Function<T, ObservableSource<R>> {
        private final BiFunction<? super T, ? super U, ? extends R> a;
        private final Function<? super T, ? extends ObservableSource<? extends U>> b;

        FlatMapWithCombinerOuter(BiFunction<? super T, ? super U, ? extends R> biFunction, Function<? super T, ? extends ObservableSource<? extends U>> function) {
            this.a = biFunction;
            this.b = function;
        }

        public final /* synthetic */ Object apply(Object obj) {
            return new ObservableMap((ObservableSource) ObjectHelper.a(this.b.apply(obj), "The mapper returned a null ObservableSource"), new FlatMapWithCombinerInner(this.a, obj));
        }
    }

    public static <T, U, R> Function<T, ObservableSource<R>> a(Function<? super T, ? extends ObservableSource<? extends U>> function, BiFunction<? super T, ? super U, ? extends R> biFunction) {
        return new FlatMapWithCombinerOuter(biFunction, function);
    }
}
