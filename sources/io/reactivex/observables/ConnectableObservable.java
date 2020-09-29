package io.reactivex.observables;

import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.internal.operators.observable.ObservableRefCount;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class ConnectableObservable<T> extends Observable<T> {
    public final Observable<T> a() {
        return RxJavaPlugins.a((Observable<T>) new ObservableRefCount<T>(this));
    }

    public abstract void e(Consumer<? super Disposable> consumer);
}
