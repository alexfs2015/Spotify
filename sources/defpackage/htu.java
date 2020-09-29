package defpackage;

import android.content.Context;

/* renamed from: htu reason: default package */
public final class htu implements vua<hts> {
    private final wlc<Context> a;
    private final wlc<ghm> b;
    private final wlc<rnf> c;
    private final wlc<gbd> d;
    private final wlc<gho> e;
    private final wlc<jvy> f;

    private htu(wlc<Context> wlc, wlc<ghm> wlc2, wlc<rnf> wlc3, wlc<gbd> wlc4, wlc<gho> wlc5, wlc<jvy> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static htu a(wlc<Context> wlc, wlc<ghm> wlc2, wlc<rnf> wlc3, wlc<gbd> wlc4, wlc<gho> wlc5, wlc<jvy> wlc6) {
        htu htu = new htu(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return htu;
    }

    public final /* synthetic */ Object get() {
        hts hts = new hts((Context) this.a.get(), (ghm) this.b.get(), (rnf) this.c.get(), (gbd) this.d.get(), (gho) this.e.get(), (jvy) this.f.get());
        return hts;
    }
}
