package defpackage;

/* renamed from: isl reason: default package */
public final class isl implements vua<gum> {
    private final wlc<isi> a;
    private final wlc<spi> b;
    private final wlc<jnv> c;
    private final wlc<gvv> d;
    private final wlc<gyl> e;
    private final wlc<gxz> f;

    private isl(wlc<isi> wlc, wlc<spi> wlc2, wlc<jnv> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5, wlc<gxz> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static isl a(wlc<isi> wlc, wlc<spi> wlc2, wlc<jnv> wlc3, wlc<gvv> wlc4, wlc<gyl> wlc5, wlc<gxz> wlc6) {
        isl isl = new isl(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return isl;
    }

    public final /* synthetic */ Object get() {
        gxz gxz = (gxz) this.f.get();
        return (gum) vuf.a(((gvv) this.d.get()).a((isi) this.a.get()).a(gxz).a((jnv) this.c.get(), (spi) this.b.get(), gxz).a((gyl) this.e.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
