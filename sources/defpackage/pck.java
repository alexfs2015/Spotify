package defpackage;

import android.content.Context;

/* renamed from: pck reason: default package */
public final class pck implements vua<pcj> {
    private final wlc<Context> a;
    private final wlc<txm> b;

    private pck(wlc<Context> wlc, wlc<txm> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pck a(wlc<Context> wlc, wlc<txm> wlc2) {
        return new pck(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new pcj((Context) this.a.get(), (txm) this.b.get());
    }
}
