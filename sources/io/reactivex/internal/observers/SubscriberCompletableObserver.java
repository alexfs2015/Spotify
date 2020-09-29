package io.reactivex.internal.observers;

import io.reactivex.CompletableObserver;
import io.reactivex.disposables.Disposable;
import io.reactivex.internal.disposables.DisposableHelper;

public final class SubscriberCompletableObserver<T> implements CompletableObserver, wrh {
    private wrg<? super T> a;
    private Disposable b;

    public final void a(long j) {
    }

    public SubscriberCompletableObserver(wrg<? super T> wrg) {
        this.a = wrg;
    }

    public final void onComplete() {
        this.a.c();
    }

    public final void onError(Throwable th) {
        this.a.onError(th);
    }

    public final void onSubscribe(Disposable disposable) {
        if (DisposableHelper.a(this.b, disposable)) {
            this.b = disposable;
            this.a.a(this);
        }
    }

    public final void a() {
        this.b.bf_();
    }
}
