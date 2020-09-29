package defpackage;

import android.content.Context;

/* renamed from: nbw reason: default package */
public final class nbw implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<jnv> c;
    private final wlc<gxz> d;
    private final wlc<gvv> e;
    private final wlc<spi> f;

    private nbw(wlc<Context> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<gxz> wlc4, wlc<gvv> wlc5, wlc<spi> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static nbw a(wlc<Context> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<gxz> wlc4, wlc<gvv> wlc5, wlc<spi> wlc6) {
        nbw nbw = new nbw(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return nbw;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(CC.a((Context) this.a.get(), (a) this.b.get(), (jnv) this.c.get(), (gxz) this.d.get(), (gvv) this.e.get(), (spi) this.f.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
