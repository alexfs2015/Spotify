package defpackage;

import android.content.Context;

/* renamed from: rbt reason: default package */
public final class rbt implements vua<rbs> {
    private final wlc<Context> a;
    private final wlc<kf> b;
    private final wlc<rcj> c;

    private rbt(wlc<Context> wlc, wlc<kf> wlc2, wlc<rcj> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static rbt a(wlc<Context> wlc, wlc<kf> wlc2, wlc<rcj> wlc3) {
        return new rbt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new rbs((Context) this.a.get(), (kf) this.b.get(), (rcj) this.c.get());
    }
}
