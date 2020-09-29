package defpackage;

/* renamed from: mdk reason: default package */
public final class mdk implements vua<a> {
    private final wlc<mdh> a;
    private final wlc<heg> b;
    private final wlc<mdb> c;
    private final wlc<mdl> d;

    private mdk(wlc<mdh> wlc, wlc<heg> wlc2, wlc<mdb> wlc3, wlc<mdl> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static mdk a(wlc<mdh> wlc, wlc<heg> wlc2, wlc<mdb> wlc3, wlc<mdl> wlc4) {
        return new mdk(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return (a) vuf.a(new mdn((mdh) this.a.get(), (mdb) this.c.get(), (heg) this.b.get(), (mdl) this.d.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
