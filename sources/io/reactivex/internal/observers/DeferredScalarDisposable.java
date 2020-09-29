package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.plugins.RxJavaPlugins;

public class DeferredScalarDisposable<T> extends BasicIntQueueDisposable<T> {
    private static final long serialVersionUID = -5502432239815349361L;
    protected final Observer<? super T> downstream;
    protected T value;

    public DeferredScalarDisposable(Observer<? super T> observer) {
        this.downstream = observer;
    }

    public final int a(int i) {
        if ((i & 2) == 0) {
            return 0;
        }
        lazySet(8);
        return 2;
    }

    public final void a(Throwable th) {
        if ((get() & 54) != 0) {
            RxJavaPlugins.a(th);
            return;
        }
        lazySet(2);
        this.downstream.onError(th);
    }

    public final void b(T t) {
        int i = get();
        if ((i & 54) == 0) {
            Observer<? super T> observer = this.downstream;
            if (i == 8) {
                this.value = t;
                lazySet(16);
                observer.onNext(null);
            } else {
                lazySet(2);
                observer.onNext(t);
            }
            if (get() != 4) {
                observer.onComplete();
            }
        }
    }

    public final boolean b() {
        return get() == 4;
    }

    public final T ba_() {
        if (get() != 16) {
            return null;
        }
        T t = this.value;
        this.value = null;
        lazySet(32);
        return t;
    }

    public void bd_() {
        set(4);
        this.value = null;
    }

    public final boolean d() {
        return get() != 16;
    }

    public final void e() {
        lazySet(32);
        this.value = null;
    }

    public final void f() {
        if ((get() & 54) == 0) {
            lazySet(2);
            this.downstream.onComplete();
        }
    }
}
