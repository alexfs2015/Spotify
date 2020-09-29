package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oso reason: default package */
public final class oso implements vua<osn> {
    private final wlc<ofy> a;
    private final wlc<osj> b;
    private final wlc<fpt> c;
    private final wlc<hbj> d;
    private final wlc<gjb> e;
    private final wlc<ofd> f;
    private final wlc<a> g;
    private final wlc<Scheduler> h;
    private final wlc<osh> i;
    private final wlc<ose> j;
    private final wlc<tjv> k;

    private oso(wlc<ofy> wlc, wlc<osj> wlc2, wlc<fpt> wlc3, wlc<hbj> wlc4, wlc<gjb> wlc5, wlc<ofd> wlc6, wlc<a> wlc7, wlc<Scheduler> wlc8, wlc<osh> wlc9, wlc<ose> wlc10, wlc<tjv> wlc11) {
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
        this.k = wlc11;
    }

    public static oso a(wlc<ofy> wlc, wlc<osj> wlc2, wlc<fpt> wlc3, wlc<hbj> wlc4, wlc<gjb> wlc5, wlc<ofd> wlc6, wlc<a> wlc7, wlc<Scheduler> wlc8, wlc<osh> wlc9, wlc<ose> wlc10, wlc<tjv> wlc11) {
        oso oso = new oso(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return oso;
    }

    public final /* synthetic */ Object get() {
        osn osn = new osn((ofy) this.a.get(), (osj) this.b.get(), (fpt) this.c.get(), (hbj) this.d.get(), (gjb) this.e.get(), (ofd) this.f.get(), (a) this.g.get(), (Scheduler) this.h.get(), (osh) this.i.get(), (ose) this.j.get(), (tjv) this.k.get());
        return osn;
    }
}
