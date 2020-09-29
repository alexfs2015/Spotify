package defpackage;

import android.content.Context;

/* renamed from: mbg reason: default package */
public final class mbg implements vua<gum> {
    private final wlc<gvv> a;
    private final wlc<Context> b;
    private final wlc<a> c;
    private final wlc<spi> d;
    private final wlc<jnv> e;
    private final wlc<gxz> f;

    private mbg(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<spi> wlc4, wlc<jnv> wlc5, wlc<gxz> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static mbg a(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<spi> wlc4, wlc<jnv> wlc5, wlc<gxz> wlc6) {
        mbg mbg = new mbg(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return mbg;
    }

    public final /* synthetic */ Object get() {
        gxz gxz = (gxz) this.f.get();
        return (gum) vuf.a(((gvv) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a(gxz).a((jnv) this.e.get(), (spi) this.d.get(), gxz).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
