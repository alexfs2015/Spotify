package defpackage;

import android.content.Context;

/* renamed from: ntc reason: default package */
public final class ntc implements vua<gum> {
    private final wlc<Context> a;
    private final wlc<a> b;
    private final wlc<jnv> c;
    private final wlc<spi> d;
    private final wlc<gvv> e;
    private final wlc<gxz> f;

    private ntc(wlc<Context> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<spi> wlc4, wlc<gvv> wlc5, wlc<gxz> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static ntc a(wlc<Context> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<spi> wlc4, wlc<gvv> wlc5, wlc<gxz> wlc6) {
        ntc ntc = new ntc(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return ntc;
    }

    public final /* synthetic */ Object get() {
        gxz gxz = (gxz) this.f.get();
        return (gum) vuf.a(((gvv) this.e.get()).a((Context) this.a.get(), (a) this.b.get()).a(gxz).a((jnv) this.c.get(), (spi) this.d.get(), gxz).a.a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
