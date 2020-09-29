package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: tgq reason: default package */
public final class tgq implements vua<tgp> {
    private final wlc<a> a;
    private final wlc<fpt> b;
    private final wlc<tgn> c;
    private final wlc<urj> d;
    private final wlc<urn> e;

    private tgq(wlc<a> wlc, wlc<fpt> wlc2, wlc<tgn> wlc3, wlc<urj> wlc4, wlc<urn> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static tgq a(wlc<a> wlc, wlc<fpt> wlc2, wlc<tgn> wlc3, wlc<urj> wlc4, wlc<urn> wlc5) {
        tgq tgq = new tgq(wlc, wlc2, wlc3, wlc4, wlc5);
        return tgq;
    }

    public final /* synthetic */ Object get() {
        tgp tgp = new tgp((a) this.a.get(), (fpt) this.b.get(), (tgn) this.c.get(), (urj) this.d.get(), (urn) this.e.get());
        return tgp;
    }
}
