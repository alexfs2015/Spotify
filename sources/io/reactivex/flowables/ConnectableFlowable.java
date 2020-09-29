package io.reactivex.flowables;

import io.reactivex.Flowable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.flowable.FlowableRefCount;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class ConnectableFlowable<T> extends Flowable<T> {
    public abstract void d(Consumer<? super Disposable> consumer);

    public final Flowable<T> c() {
        return RxJavaPlugins.a((Flowable<T>) new FlowableRefCount<T>(this));
    }
}
