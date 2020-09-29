package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tpf reason: default package */
public final class tpf implements vua<tpe> {
    private final wlc<tlc> a;
    private final wlc<tkx> b;
    private final wlc<iom> c;
    private final wlc<wug> d;
    private final wlc<a> e;
    private final wlc<tle> f;

    private tpf(wlc<tlc> wlc, wlc<tkx> wlc2, wlc<iom> wlc3, wlc<wug> wlc4, wlc<a> wlc5, wlc<tle> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static tpf a(wlc<tlc> wlc, wlc<tkx> wlc2, wlc<iom> wlc3, wlc<wug> wlc4, wlc<a> wlc5, wlc<tle> wlc6) {
        tpf tpf = new tpf(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return tpf;
    }

    public final /* synthetic */ Object get() {
        tpe tpe = new tpe((tlc) this.a.get(), (tkx) this.b.get(), (iom) this.c.get(), (wug) this.d.get(), (a) this.e.get(), (tle) this.f.get());
        return tpe;
    }
}
