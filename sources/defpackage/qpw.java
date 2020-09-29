package defpackage;

import android.content.Context;

/* renamed from: qpw reason: default package */
public final class qpw implements vua<qpv> {
    private final wlc<Context> a;
    private final wlc<gbd> b;
    private final wlc<qqf> c;
    private final wlc<qqp> d;

    private qpw(wlc<Context> wlc, wlc<gbd> wlc2, wlc<qqf> wlc3, wlc<qqp> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static qpw a(wlc<Context> wlc, wlc<gbd> wlc2, wlc<qqf> wlc3, wlc<qqp> wlc4) {
        return new qpw(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new qpv((Context) this.a.get(), (gbd) this.b.get(), (qqf) this.c.get(), (qqp) this.d.get());
    }
}
