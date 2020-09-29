package io.reactivex.internal.operators.single;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleInternalHelper {

    enum ToFlowable implements Function<SingleSource, xfk> {
        INSTANCE
    }

    public static <T> Function<SingleSource<? extends T>, xfk<? extends T>> a() {
        return ToFlowable.INSTANCE;
    }
}
