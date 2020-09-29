package io.reactivex.internal.operators.flowable;

import io.reactivex.Flowable;
import io.reactivex.functions.Function;
import io.reactivex.internal.util.ErrorMode;

public final class FlowableConcatMapPublisher<T, R> extends Flowable<R> {
    private xfk<T> b;
    private Function<? super T, ? extends xfk<? extends R>> c;
    private int d;
    private ErrorMode e;

    public FlowableConcatMapPublisher(xfk<T> xfk, Function<? super T, ? extends xfk<? extends R>> function, int i, ErrorMode errorMode) {
        this.b = xfk;
        this.c = function;
        this.d = i;
        this.e = errorMode;
    }

    public final void a(xfl<? super R> xfl) {
        if (!FlowableScalarXMap.a(this.b, xfl, this.c)) {
            this.b.b(FlowableConcatMap.a(xfl, this.c, this.d, this.e));
        }
    }
}
