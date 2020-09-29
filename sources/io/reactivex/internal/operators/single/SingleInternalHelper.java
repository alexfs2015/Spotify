package io.reactivex.internal.operators.single;

import io.reactivex.SingleSource;
import io.reactivex.functions.Function;

public final class SingleInternalHelper {

    enum ToFlowable implements Function<SingleSource, wrf> {
        INSTANCE
    }

    public static <T> Function<SingleSource<? extends T>, wrf<? extends T>> a() {
        return ToFlowable.INSTANCE;
    }
}
