package defpackage;

/* renamed from: mhl reason: default package */
public final class mhl implements vua<mhk> {
    private final wlc<mgo> a;
    private final wlc<uba> b;
    private final wlc<mgm> c;
    private final wlc<mgq> d;
    private final wlc<mgg> e;
    private final wlc<mgk> f;
    private final wlc<mgi> g;
    private final wlc<uay> h;

    private mhl(wlc<mgo> wlc, wlc<uba> wlc2, wlc<mgm> wlc3, wlc<mgq> wlc4, wlc<mgg> wlc5, wlc<mgk> wlc6, wlc<mgi> wlc7, wlc<uay> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static mhl a(wlc<mgo> wlc, wlc<uba> wlc2, wlc<mgm> wlc3, wlc<mgq> wlc4, wlc<mgg> wlc5, wlc<mgk> wlc6, wlc<mgi> wlc7, wlc<uay> wlc8) {
        mhl mhl = new mhl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return mhl;
    }

    public final /* synthetic */ Object get() {
        mhk mhk = new mhk((mgo) this.a.get(), (uba) this.b.get(), (mgm) this.c.get(), (mgq) this.d.get(), (mgg) this.e.get(), (mgk) this.f.get(), (mgi) this.g.get(), (uay) this.h.get());
        return mhk;
    }
}
