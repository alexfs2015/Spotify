package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    private wrf<T> b;
    private Function<? super T, ? extends wrf<? extends R>> c;
    private int d;
    private ErrorMode e;

    public FlowableConcatMapPublisher(wrf<T> wrf, Function<? super T, ? extends wrf<? extends R>> function, int i, ErrorMode errorMode) {
        this.b = wrf;
        this.c = function;
        this.d = i;
        this.e = errorMode;
    }

    public final void a(wrg<? super R> wrg) {
        if (!FlowableScalarXMap.a(this.b, wrg, this.c)) {
            this.b.b(FlowableConcatMap.a(wrg, this.c, this.d, this.e));
        }
    }
}
