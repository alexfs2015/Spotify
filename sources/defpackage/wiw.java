package defpackage;

import io.reactivex.disposables.Disposable;

/* renamed from: wiw reason: default package */
public final class wiw implements Disposable {
    private final xip a;

    public wiw(xip xip) {
        this.a = xip;
    }

    public final boolean b() {
        return this.a.isUnsubscribed();
    }

    public final void bd_() {
        this.a.unsubscribe();
    }
}
