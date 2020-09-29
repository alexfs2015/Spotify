package defpackage;

/* renamed from: myg reason: default package */
public final class myg implements vua<myf> {
    private final wlc<myb> a;
    private final wlc<gup> b;
    private final wlc<c<gzz, gzz>> c;
    private final wlc<String> d;
    private final wlc<String> e;
    private final wlc<heg> f;

    private myg(wlc<myb> wlc, wlc<gup> wlc2, wlc<c<gzz, gzz>> wlc3, wlc<String> wlc4, wlc<String> wlc5, wlc<heg> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static myg a(wlc<myb> wlc, wlc<gup> wlc2, wlc<c<gzz, gzz>> wlc3, wlc<String> wlc4, wlc<String> wlc5, wlc<heg> wlc6) {
        myg myg = new myg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return myg;
    }

    public final /* synthetic */ Object get() {
        myf myf = new myf((myb) this.a.get(), (gup) this.b.get(), (c) this.c.get(), (String) this.d.get(), (String) this.e.get(), (heg) this.f.get());
        return myf;
    }
}
