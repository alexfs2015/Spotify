package io.reactivex.internal.observers;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.Exceptions;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.fuseable.QueueDisposable;
import io.reactivex.plugins.RxJavaPlugins;

public abstract class BasicFuseableObserver<T, R> implements Observer<T>, QueueDisposable<R> {
    protected final Observer<? super R> a;
    protected QueueDisposable<T> b;
    protected boolean c;
    protected int d;
    private Disposable e;

    public BasicFuseableObserver(Observer<? super R> observer) {
        this.a = observer;
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.a(this.e, disposable)) {
            this.e = disposable;
            if (disposable instanceof QueueDisposable) {
                this.b = (QueueDisposable) disposable;
            }
            this.a.onSubscribe(this);
        }
    }

    public void onError(Throwable th) {
        if (this.c) {
            RxJavaPlugins.a(th);
            return;
        }
        this.c = true;
        this.a.onError(th);
    }

    /* access modifiers changed from: protected */
    public final void a(Throwable th) {
        Exceptions.b(th);
        this.e.bf_();
        onError(th);
    }

    public void onComplete() {
        if (!this.c) {
            this.c = true;
            this.a.onComplete();
        }
    }

    /* access modifiers changed from: protected */
    public final int b(int i) {
        QueueDisposable<T> queueDisposable = this.b;
        if (queueDisposable == null || (i & 4) != 0) {
            return 0;
        }
        int a2 = queueDisposable.a(i);
        if (a2 != 0) {
            this.d = a2;
        }
        return a2;
    }

    public void bf_() {
        this.e.bf_();
    }

    public final boolean b() {
        return this.e.b();
    }

    public final boolean d() {
        return this.b.d();
    }

    public final void e() {
        this.b.e();
    }

    public final boolean a(R r) {
        throw new UnsupportedOperationException("Should not be called!");
    }
}
