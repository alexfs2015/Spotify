package io.reactivex.disposables;

import io.reactivex.internal.disposables.DisposableHelper;
import java.util.concurrent.atomic.AtomicReference;

public final class SerialDisposable implements Disposable {
    private AtomicReference<Disposable> a = new AtomicReference<>();

    public final boolean a(Disposable disposable) {
        return DisposableHelper.a(this.a, disposable);
    }

    public final void bf_() {
        DisposableHelper.a(this.a);
    }

    public final boolean b() {
        return DisposableHelper.a((Disposable) this.a.get());
    }
}
