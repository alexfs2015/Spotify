package io.reactivex.internal.util;

import io.reactivex.functions.Function;
import java.util.List;
import java.util.concurrent.Callable;

public enum ArrayListSupplier implements Function<Object, List<Object>>, Callable<List<Object>> {
    INSTANCE;

    public static <T> Callable<List<T>> a() {
        return INSTANCE;
    }
}
