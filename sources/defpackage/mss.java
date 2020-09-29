package defpackage;

/* renamed from: mss reason: default package */
public final class mss implements msr {
    private final boolean a;
    private final wlc<rfe> b;
    private final vti<msu> c;
    private final skh d;

    public mss(boolean z, wlc<rfe> wlc, vti<msu> vti, skh skh) {
        this.a = z;
        this.b = (wlc) fay.a(wlc);
        this.c = (vti) fay.a(vti);
        this.d = skh;
    }

    public final wud<gzz> a(String str) {
        if (this.a) {
            return vun.a((wrf<T>) ((rfe) this.b.get()).a());
        }
        return ((msu) this.c.get()).a(str).a((c<? super T, ? extends R>) this.d);
    }
}
