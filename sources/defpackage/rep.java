package defpackage;

import android.content.Context;

/* renamed from: rep reason: default package */
public final class rep implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<gvv> c;
    private final wlc<jnv> d;
    private final wlc<spi> e;
    private final wlc<gxz> f;

    private rep(wlc<Context> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<jnv> wlc4, wlc<spi> wlc5, wlc<gxz> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static rep a(wlc<Context> wlc, wlc<a> wlc2, wlc<gvv> wlc3, wlc<jnv> wlc4, wlc<spi> wlc5, wlc<gxz> wlc6) {
        rep rep = new rep(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return rep;
    }

    public final /* synthetic */ Object get() {
        return (gum) vuf.a(((gvv) this.c.get()).a((Context) this.a.get(), (a) this.b.get()).a((jnv) this.d.get(), (spi) this.e.get(), (gxz) this.f.get()).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
