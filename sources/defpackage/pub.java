package defpackage;

import android.content.Context;

/* renamed from: pub reason: default package */
public final class pub implements vua<gum> {
    private final wlc<gvv> a;
    private final wlc<Context> b;
    private final wlc<a> c;
    private final wlc<jnv> d;
    private final wlc<spi> e;
    private final wlc<gxz> f;

    private pub(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<jnv> wlc4, wlc<spi> wlc5, wlc<gxz> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static pub a(wlc<gvv> wlc, wlc<Context> wlc2, wlc<a> wlc3, wlc<jnv> wlc4, wlc<spi> wlc5, wlc<gxz> wlc6) {
        pub pub = new pub(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return pub;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.a.get()).a((Context) this.b.get(), (a) this.c.get()).a((jnv) this.d.get(), (spi) this.e.get(), (gxz) this.f.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
