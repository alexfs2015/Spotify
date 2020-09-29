package defpackage;

import io.reactivex.disposables.Disposable;

/* renamed from: vuq reason: default package */
public final class vuq implements Disposable {
    private final wuk a;

    public vuq(wuk wuk) {
        this.a = wuk;
    }

    public final void bf_() {
        this.a.unsubscribe();
    }

    public final boolean b() {
        return this.a.isUnsubscribed();
    }
}
