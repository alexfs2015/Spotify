package defpackage;

/* renamed from: mdj reason: default package */
public final class mdj implements vua<a> {
    private final wlc<mdh> a;
    private final wlc<mdo> b;
    private final wlc<heg> c;
    private final wlc<mdb> d;
    private final wlc<mdl> e;

    private mdj(wlc<mdh> wlc, wlc<mdo> wlc2, wlc<heg> wlc3, wlc<mdb> wlc4, wlc<mdl> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static mdj a(wlc<mdh> wlc, wlc<mdo> wlc2, wlc<heg> wlc3, wlc<mdb> wlc4, wlc<mdl> wlc5) {
        mdj mdj = new mdj(wlc, wlc2, wlc3, wlc4, wlc5);
        return mdj;
    }

    public final /* synthetic */ Object get() {
        mdo mdo = (mdo) this.b.get();
        heg heg = (heg) this.c.get();
        mdq mdq = new mdq((mdb) this.d.get(), mdo, heg, (mdh) this.a.get(), (mdl) this.e.get());
        return (a) vuf.a(mdq, "Cannot return null from a non-@Nullable @Provides method");
    }
}
