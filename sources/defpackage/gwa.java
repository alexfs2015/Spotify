package defpackage;

/* renamed from: gwa reason: default package */
public final class gwa implements vua<gvz> {
    private final wlc<spi> a;
    private final wlc<gxz> b;
    private final wlc<gzm> c;
    private final wlc<vol> d;

    private gwa(wlc<spi> wlc, wlc<gxz> wlc2, wlc<gzm> wlc3, wlc<vol> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static gwa a(wlc<spi> wlc, wlc<gxz> wlc2, wlc<gzm> wlc3, wlc<vol> wlc4) {
        return new gwa(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new gvz((spi) this.a.get(), (gxz) this.b.get(), (gzm) this.c.get(), (vol) this.d.get());
    }
}
