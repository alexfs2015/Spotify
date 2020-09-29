package defpackage;

import androidx.lifecycle.LiveData;
import io.reactivex.Observable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;

/* renamed from: vfb reason: default package */
public final class vfb<T> implements vfa<T> {
    private final Observable<vez<T>> a;
    private final ls<vez<T>> b = new ls<>();
    private Disposable c;

    public vfb(Observable<vez<T>> observable) {
        this.a = observable;
    }

    private void e() {
        if (this.c == null) {
            Observable<vez<T>> observable = this.a;
            ls<vez<T>> lsVar = this.b;
            lsVar.getClass();
            this.c = observable.d((Consumer<? super T>) new $$Lambda$DLIkkXnY7Mk0AiYLWCT38JNNwOY<Object>(lsVar));
            return;
        }
        throw new IllegalStateException("Loader is already running.");
    }

    private void f() {
        this.c.bd_();
        this.c = null;
    }

    public final synchronized void a() {
        e();
    }

    public final synchronized void b() {
        f();
    }

    public final void c() {
        f();
        e();
    }

    public final LiveData<vez<T>> d() {
        return this.b;
    }
}
