package io.reactivex.internal.operators.observable;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.internal.disposables.EmptyDisposable;
import io.reactivex.internal.fuseable.ScalarCallable;

public final class ObservableEmpty extends Observable<Object> implements ScalarCallable<Object> {
    public static final Observable<Object> a = new ObservableEmpty();

    private ObservableEmpty() {
    }

    public final void a(Observer<? super Object> observer) {
        EmptyDisposable.a(observer);
    }

    public final Object call() {
        return null;
    }
}
