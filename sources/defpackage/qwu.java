package defpackage;

import android.content.Context;

/* renamed from: qwu reason: default package */
public final class qwu implements vua<qwt> {
    private final wlc<qsr> a;
    private final wlc<Context> b;
    private final wlc<kf> c;
    private final wlc<rcj> d;

    private qwu(wlc<qsr> wlc, wlc<Context> wlc2, wlc<kf> wlc3, wlc<rcj> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qwu a(wlc<qsr> wlc, wlc<Context> wlc2, wlc<kf> wlc3, wlc<rcj> wlc4) {
        return new qwu(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qwt((qsr) this.a.get(), (Context) this.b.get(), (kf) this.c.get(), (rcj) this.d.get());
    }
}
