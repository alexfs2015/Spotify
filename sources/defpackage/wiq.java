package defpackage;

import io.reactivex.disposables.Disposable;

/* renamed from: wiq reason: default package */
final class wiq implements xip {
    private final Disposable a;

    wiq(Disposable disposable) {
        this.a = disposable;
    }

    public final boolean isUnsubscribed() {
        return this.a.b();
    }

    public final void unsubscribe() {
        this.a.bd_();
    }
}
