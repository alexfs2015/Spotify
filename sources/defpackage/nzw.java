package defpackage;

import android.content.Context;

/* renamed from: nzw reason: default package */
public final class nzw implements vua<nzv> {
    private final wlc<jvy> a;
    private final wlc<Context> b;

    private nzw(wlc<jvy> wlc, wlc<Context> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nzw a(wlc<jvy> wlc, wlc<Context> wlc2) {
        return new nzw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new nzv((jvy) this.a.get(), (Context) this.b.get());
    }
}
