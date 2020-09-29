package defpackage;

import android.content.Context;

/* renamed from: nrt reason: default package */
public final class nrt implements vua<nrs> {
    private final wlc<jrp> a;
    private final wlc<Context> b;
    private final wlc<ujc> c;
    private final wlc<hee> d;
    private final wlc<jvy> e;
    private final wlc<jsi> f;

    private nrt(wlc<jrp> wlc, wlc<Context> wlc2, wlc<ujc> wlc3, wlc<hee> wlc4, wlc<jvy> wlc5, wlc<jsi> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static nrt a(wlc<jrp> wlc, wlc<Context> wlc2, wlc<ujc> wlc3, wlc<hee> wlc4, wlc<jvy> wlc5, wlc<jsi> wlc6) {
        nrt nrt = new nrt(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return nrt;
    }

    public final /* synthetic */ Object get() {
        nrs nrs = new nrs((jrp) this.a.get(), (Context) this.b.get(), (ujc) this.c.get(), (hee) this.d.get(), (jvy) this.e.get(), (jsi) this.f.get());
        return nrs;
    }
}
