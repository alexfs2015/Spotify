package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReference;

public final class SequentialDisposable extends AtomicReference<Disposable> implements Disposable {
    private static final long serialVersionUID = -754898800686245608L;

    public SequentialDisposable() {
    }

    public SequentialDisposable(Disposable disposable) {
        lazySet(disposable);
    }

    public final void bf_() {
        DisposableHelper.a((AtomicReference<Disposable>) this);
    }

    public final boolean b() {
        return DisposableHelper.a((Disposable) get());
    }
}
