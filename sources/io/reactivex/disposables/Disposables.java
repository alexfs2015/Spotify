package io.reactivex.disposables;

import io.reactivex.functions.Action;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;

public final class Disposables {
    public static Disposable a(Runnable runnable) {
        ObjectHelper.a(runnable, "run is null");
        return new RunnableDisposable(runnable);
    }

    public static Disposable a(Action action) {
        ObjectHelper.a(action, "run is null");
        return new ActionDisposable(action);
    }

    public static Disposable a() {
        return a(Functions.a);
    }

    public static Disposable b() {
        return EmptyDisposable.INSTANCE;
    }
}
