package defpackage;

/* renamed from: myi reason: default package */
public final class myi implements vua<myh> {
    private final wlc<ufy> a;
    private final wlc<mwt> b;
    private final wlc<heg> c;
    private final wlc<mxt> d;
    private final wlc<rfk> e;
    private final wlc<iww> f;
    private final wlc<ruz> g;
    private final wlc<sje> h;
    private final wlc<Boolean> i;

    private myi(wlc<ufy> wlc, wlc<mwt> wlc2, wlc<heg> wlc3, wlc<mxt> wlc4, wlc<rfk> wlc5, wlc<iww> wlc6, wlc<ruz> wlc7, wlc<sje> wlc8, wlc<Boolean> wlc9) {
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

    public static myi a(wlc<ufy> wlc, wlc<mwt> wlc2, wlc<heg> wlc3, wlc<mxt> wlc4, wlc<rfk> wlc5, wlc<iww> wlc6, wlc<ruz> wlc7, wlc<sje> wlc8, wlc<Boolean> wlc9) {
        myi myi = new myi(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8, wlc9);
        return myi;
    }

    public final /* synthetic */ Object get() {
        myh myh = new myh((ufy) this.a.get(), (mwt) this.b.get(), (heg) this.c.get(), (mxt) this.d.get(), (rfk) this.e.get(), (iww) this.f.get(), (ruz) this.g.get(), (sje) this.h.get(), ((Boolean) this.i.get()).booleanValue());
        return myh;
    }
}
