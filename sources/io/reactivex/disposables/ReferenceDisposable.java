package io.reactivex.disposables;

import io.reactivex.internal.functions.ObjectHelper;
import java.util.concurrent.atomic.AtomicReference;

abstract class ReferenceDisposable<T> extends AtomicReference<T> implements Disposable {
    private static final long serialVersionUID = 6537757548749041217L;

    /* access modifiers changed from: protected */
    public abstract void a(T t);

    ReferenceDisposable(T t) {
        super(ObjectHelper.a(t, "value is null"));
    }

    public final void bf_() {
        if (get() != null) {
            Object andSet = getAndSet(null);
            if (andSet != null) {
                a(andSet);
            }
        }
    }

    public final boolean b() {
        return get() == null;
    }
}
