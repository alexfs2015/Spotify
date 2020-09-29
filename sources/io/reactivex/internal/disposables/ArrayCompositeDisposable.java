package io.reactivex.internal.disposables;

import io.reactivex.disposables.Disposable;
import java.util.concurrent.atomic.AtomicReferenceArray;

public final class ArrayCompositeDisposable extends AtomicReferenceArray<Disposable> implements Disposable {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeDisposable(int i) {
        super(2);
    }

    public final boolean a(int i, Disposable disposable) {
        Disposable disposable2;
        do {
            disposable2 = (Disposable) get(i);
            if (disposable2 == DisposableHelper.DISPOSED) {
                disposable.bd_();
                return false;
            }
        } while (!compareAndSet(i, disposable2, disposable));
        if (disposable2 != null) {
            disposable2.bd_();
        }
        return true;
    }

    public final boolean b() {
        return get(0) == DisposableHelper.DISPOSED;
    }

    public final void bd_() {
        if (get(0) != DisposableHelper.DISPOSED) {
            int length = length();
            for (int i = 0; i < length; i++) {
                if (((Disposable) get(i)) != DisposableHelper.DISPOSED) {
                    Disposable disposable = (Disposable) getAndSet(i, DisposableHelper.DISPOSED);
                    if (!(disposable == DisposableHelper.DISPOSED || disposable == null)) {
                        disposable.bd_();
                    }
                }
            }
        }
    }
}
