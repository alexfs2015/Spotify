package defpackage;

import io.reactivex.Observable;

/* renamed from: sef reason: default package */
public final class sef implements vua<sdz> {
    private final wlc<Observable<kxx>> a;
    private final wlc<Observable<sfa>> b;
    private final wlc<sex> c;
    private final wlc<seq> d;
    private final wlc<rzh> e;
    private final wlc<sgx> f;
    private final wlc<vim<gzz>> g;
    private final wlc<lky> h;
    private final wlc<vim<gzz>> i;

    private sef(wlc<Observable<kxx>> wlc, wlc<Observable<sfa>> wlc2, wlc<sex> wlc3, wlc<seq> wlc4, wlc<rzh> wlc5, wlc<sgx> wlc6, wlc<vim<gzz>> wlc7, wlc<lky> wlc8, wlc<vim<gzz>> wlc9) {
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

    public static sef a(wlc<Observable<kxx>> wlc, wlc<Observable<sfa>> wlc2, wlc<sex> wlc3, wlc<seq> wlc4, wlc<rzh> wlc5, wlc<sgx> wlc6, wlc<vim<gzz>> wlc7, wlc<lky> wlc8, wlc<vim<gzz>> wlc9) {
        sef sef = new sef(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return sef;
    }

    public final /* synthetic */ Object get() {
        sdz sdz = new sdz((Observable) this.a.get(), (Observable) this.b.get(), (sex) this.c.get(), (seq) this.d.get(), (rzh) this.e.get(), (sgx) this.f.get(), (vim) this.g.get(), (lky) this.h.get(), (vim) this.i.get());
        return sdz;
    }
}
