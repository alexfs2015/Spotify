package defpackage;

import android.content.Context;

/* renamed from: hnt reason: default package */
public final class hnt implements vua<hob> {
    private final wlc<Context> a;
    private final wlc<hec> b;
    private final wlc<hvl> c;
    private final wlc<jjf> d;
    private final wlc<igh> e;
    private final wlc<hni> f;
    private final wlc<hst> g;
    private final wlc<hnn> h;
    private final wlc<hof> i;
    private final wlc<hoo> j;
    private final wlc<htk> k;
    private final wlc<hok> l;
    private final wlc<tjv> m;

    private hnt(wlc<Context> wlc, wlc<hec> wlc2, wlc<hvl> wlc3, wlc<jjf> wlc4, wlc<igh> wlc5, wlc<hni> wlc6, wlc<hst> wlc7, wlc<hnn> wlc8, wlc<hof> wlc9, wlc<hoo> wlc10, wlc<htk> wlc11, wlc<hok> wlc12, wlc<tjv> wlc13) {
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
        this.l = wlc12;
        this.m = wlc13;
    }

    public static hnt a(wlc<Context> wlc, wlc<hec> wlc2, wlc<hvl> wlc3, wlc<jjf> wlc4, wlc<igh> wlc5, wlc<hni> wlc6, wlc<hst> wlc7, wlc<hnn> wlc8, wlc<hof> wlc9, wlc<hoo> wlc10, wlc<htk> wlc11, wlc<hok> wlc12, wlc<tjv> wlc13) {
        hnt hnt = new hnt(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9, wlc10, wlc11, wlc12, wlc13);
        return hnt;
    }

    public final /* synthetic */ Object get() {
        Context context = (Context) this.a.get();
        hec hec = (hec) this.b.get();
        hvl hvl = (hvl) this.c.get();
        jjf jjf = (jjf) this.d.get();
        igh igh = (igh) this.e.get();
        Object obj = this.f.get();
        hst hst = (hst) this.g.get();
        Object obj2 = this.h.get();
        Object obj3 = this.i.get();
        Object obj4 = this.j.get();
        hni hni = (hni) obj;
        hnn hnn = (hnn) obj2;
        hoc hoc = r2;
        hof hof = (hof) obj3;
        hoo hoo = (hoo) obj4;
        hoc hoc2 = new hoc(context, hec, hvl, jjf, igh, hni, hst, hnn, hof, hoo, (htk) this.k.get(), (hok) this.l.get(), (tjv) this.m.get());
        return (hob) vuf.a(hoc, "Cannot return null from a non-@Nullable @Provides method");
    }
}
