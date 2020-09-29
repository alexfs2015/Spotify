package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;

public final class ObservableNever extends Observable<Object> {
    public static final Observable<Object> a = new ObservableNever();

    private ObservableNever() {
    }

    public final void a(Observer<? super Object> observer) {
        observer.onSubscribe(EmptyDisposable.NEVER);
    }
}
