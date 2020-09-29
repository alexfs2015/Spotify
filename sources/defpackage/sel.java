package defpackage;

import io.reactivex.Observable;

/* renamed from: sel reason: default package */
public final class sel implements vua<sdw> {
    private final wlc<Observable<kxx>> a;
    private final wlc<Observable<sfa>> b;
    private final wlc<sex> c;
    private final wlc<sgx> d;
    private final wlc<lky> e;
    private final wlc<vim<gzz>> f;
    private final wlc<sfe> g;

    private sel(wlc<Observable<kxx>> wlc, wlc<Observable<sfa>> wlc2, wlc<sex> wlc3, wlc<sgx> wlc4, wlc<lky> wlc5, wlc<vim<gzz>> wlc6, wlc<sfe> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static sel a(wlc<Observable<kxx>> wlc, wlc<Observable<sfa>> wlc2, wlc<sex> wlc3, wlc<sgx> wlc4, wlc<lky> wlc5, wlc<vim<gzz>> wlc6, wlc<sfe> wlc7) {
        sel sel = new sel(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return sel;
    }

    public final /* synthetic */ Object get() {
        sdw sdw = new sdw((Observable) this.a.get(), (Observable) this.b.get(), (sex) this.c.get(), (sgx) this.d.get(), (lky) this.e.get(), (vim) this.f.get(), (sfe) this.g.get());
        return sdw;
    }
}
