package defpackage;

import io.reactivex.disposables.Disposable;

/* renamed from: vuk reason: default package */
final class vuk implements wuk {
    private final Disposable a;

    vuk(Disposable disposable) {
        this.a = disposable;
    }

    public final void unsubscribe() {
        this.a.bf_();
    }

    public final boolean isUnsubscribed() {
        return this.a.b();
    }
}
