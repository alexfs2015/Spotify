package defpackage;

import android.app.Activity;

/* renamed from: hge reason: default package */
public final class hge implements vua<hgd> {
    private final wlc<Activity> a;
    private final wlc<gni> b;
    private final wlc<hec> c;
    private final wlc<rrg> d;
    private final wlc<hed> e;
    private final wlc<ujc> f;
    private final wlc<qhr> g;
    private final wlc<twu> h;
    private final wlc<rgz> i;
    private final wlc<gny> j;

    private hge(wlc<Activity> wlc, wlc<gni> wlc2, wlc<hec> wlc3, wlc<rrg> wlc4, wlc<hed> wlc5, wlc<ujc> wlc6, wlc<qhr> wlc7, wlc<twu> wlc8, wlc<rgz> wlc9, wlc<gny> wlc10) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
        this.j = wlc10;
    }

    public static hge a(wlc<Activity> wlc, wlc<gni> wlc2, wlc<hec> wlc3, wlc<rrg> wlc4, wlc<hed> wlc5, wlc<ujc> wlc6, wlc<qhr> wlc7, wlc<twu> wlc8, wlc<rgz> wlc9, wlc<gny> wlc10) {
        hge hge = new hge(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10);
        return hge;
    }

    public final /* synthetic */ Object get() {
        hgd hgd = new hgd((Activity) this.a.get(), (gni) this.b.get(), (hec) this.c.get(), (rrg) this.d.get(), (hed) this.e.get(), (ujc) this.f.get(), (qhr) this.g.get(), (twu) this.h.get(), (rgz) this.i.get(), (gny) this.j.get());
        return hgd;
    }
}
