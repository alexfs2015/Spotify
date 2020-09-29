package defpackage;

/* renamed from: ofe reason: default package */
public final class ofe implements vua<ofd> {
    private final wlc<osf> a;
    private final wlc<hdb> b;
    private final wlc<rgz> c;
    private final wlc<osg> d;
    private final wlc<tjv> e;
    private final wlc<vej> f;

    private ofe(wlc<osf> wlc, wlc<hdb> wlc2, wlc<rgz> wlc3, wlc<osg> wlc4, wlc<tjv> wlc5, wlc<vej> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ofe a(wlc<osf> wlc, wlc<hdb> wlc2, wlc<rgz> wlc3, wlc<osg> wlc4, wlc<tjv> wlc5, wlc<vej> wlc6) {
        ofe ofe = new ofe(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ofe;
    }

    public final /* synthetic */ Object get() {
        ofd ofd = new ofd((osf) this.a.get(), (hdb) this.b.get(), (rgz) this.c.get(), (osg) this.d.get(), (tjv) this.e.get(), (vej) this.f.get());
        return ofd;
    }
}
