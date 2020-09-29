package defpackage;

import io.reactivex.Observable;

/* renamed from: lyy reason: default package */
public final class lyy implements vua<lyt> {
    private final wlc<kxz> a;
    private final wlc<Observable<lym>> b;
    private final wlc<lzb> c;
    private final wlc<lyz> d;
    private final wlc<lyk> e;
    private final wlc<vim<gzz>> f;
    private final wlc<lyi> g;
    private final wlc<rfd> h;
    private final wlc<gzz> i;

    private lyy(wlc<kxz> wlc, wlc<Observable<lym>> wlc2, wlc<lzb> wlc3, wlc<lyz> wlc4, wlc<lyk> wlc5, wlc<vim<gzz>> wlc6, wlc<lyi> wlc7, wlc<rfd> wlc8, wlc<gzz> wlc9) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
        this.i = wlc9;
    }

    public static lyy a(wlc<kxz> wlc, wlc<Observable<lym>> wlc2, wlc<lzb> wlc3, wlc<lyz> wlc4, wlc<lyk> wlc5, wlc<vim<gzz>> wlc6, wlc<lyi> wlc7, wlc<rfd> wlc8, wlc<gzz> wlc9) {
        lyy lyy = new lyy(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return lyy;
    }

    public final /* synthetic */ Object get() {
        lyt lyt = new lyt((kxz) this.a.get(), (Observable) this.b.get(), (lzb) this.c.get(), (lyz) this.d.get(), (lyk) this.e.get(), (vim) this.f.get(), (lyi) this.g.get(), (rfd) this.h.get(), (gzz) this.i.get());
        return lyt;
    }
}
