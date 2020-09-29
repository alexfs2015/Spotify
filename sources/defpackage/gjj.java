package defpackage;

import android.content.Context;

/* renamed from: gjj reason: default package */
public final class gjj implements vua<gji> {
    private final wlc<Context> a;
    private final wlc<jjf> b;
    private final wlc<rdh> c;
    private final wlc<jrp> d;
    private final wlc<gjm> e;

    private gjj(wlc<Context> wlc, wlc<jjf> wlc2, wlc<rdh> wlc3, wlc<jrp> wlc4, wlc<gjm> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static gjj a(wlc<Context> wlc, wlc<jjf> wlc2, wlc<rdh> wlc3, wlc<jrp> wlc4, wlc<gjm> wlc5) {
        gjj gjj = new gjj(wlc, wlc2, wlc3, wlc4, wlc5);
        return gjj;
    }

    public final /* synthetic */ Object get() {
        gji gji = new gji((Context) this.a.get(), (jjf) this.b.get(), (rdh) this.c.get(), (jrp) this.d.get(), (gjm) this.e.get());
        return gji;
    }
}
