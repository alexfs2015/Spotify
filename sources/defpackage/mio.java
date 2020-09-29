package defpackage;

/* renamed from: mio reason: default package */
public final class mio implements vua<min> {
    private final wlc<mhh> a;
    private final wlc<iqy> b;
    private final wlc<heg> c;

    private mio(wlc<mhh> wlc, wlc<iqy> wlc2, wlc<heg> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mio a(wlc<mhh> wlc, wlc<iqy> wlc2, wlc<heg> wlc3) {
        return new mio(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new min((mhh) this.a.get(), (iqy) this.b.get(), (heg) this.c.get());
    }
}
