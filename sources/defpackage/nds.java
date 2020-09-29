package defpackage;

/* renamed from: nds reason: default package */
public final class nds implements vua<ndr> {
    private final wlc<ndq> a;
    private final wlc<fpt> b;
    private final wlc<jrp> c;
    private final wlc<Boolean> d;
    private final wlc<String> e;
    private final wlc<String> f;
    private final wlc<String> g;
    private final wlc<Boolean> h;
    private final wlc<Boolean> i;
    private final wlc<Boolean> j;
    private final wlc<net> k;

    private nds(wlc<ndq> wlc, wlc<fpt> wlc2, wlc<jrp> wlc3, wlc<Boolean> wlc4, wlc<String> wlc5, wlc<String> wlc6, wlc<String> wlc7, wlc<Boolean> wlc8, wlc<Boolean> wlc9, wlc<Boolean> wlc10, wlc<net> wlc11) {
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

    public static nds a(wlc<ndq> wlc, wlc<fpt> wlc2, wlc<jrp> wlc3, wlc<Boolean> wlc4, wlc<String> wlc5, wlc<String> wlc6, wlc<String> wlc7, wlc<Boolean> wlc8, wlc<Boolean> wlc9, wlc<Boolean> wlc10, wlc<net> wlc11) {
        nds nds = new nds(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11);
        return nds;
    }

    public final /* synthetic */ Object get() {
        ndr ndr = new ndr((ndq) this.a.get(), (fpt) this.b.get(), (jrp) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (String) this.e.get(), (String) this.f.get(), (String) this.g.get(), ((Boolean) this.h.get()).booleanValue(), ((Boolean) this.i.get()).booleanValue(), ((Boolean) this.j.get()).booleanValue(), (net) this.k.get());
        return ndr;
    }
}
