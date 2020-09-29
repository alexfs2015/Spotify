package defpackage;

import android.app.Activity;

/* renamed from: ops reason: default package */
public final class ops implements vua<gum> {
    private final wlc<Activity> a;
    private final wlc<a> b;
    private final wlc<jnv> c;
    private final wlc<gyl> d;
    private final wlc<gxz> e;
    private final wlc<gvv> f;
    private final wlc<spi> g;

    private ops(wlc<Activity> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<gyl> wlc4, wlc<gxz> wlc5, wlc<gvv> wlc6, wlc<spi> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static ops a(wlc<Activity> wlc, wlc<a> wlc2, wlc<jnv> wlc3, wlc<gyl> wlc4, wlc<gxz> wlc5, wlc<gvv> wlc6, wlc<spi> wlc7) {
        ops ops = new ops(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return ops;
    }

    public final /* synthetic */ Object get() {
        gxz gxz = (gxz) this.e.get();
        return (gum) vuf.a(((gvv) this.f.get()).a((Activity) this.a.get(), (a) this.b.get()).a(gxz).a((jnv) this.c.get(), (spi) this.g.get(), gxz).a((gyl) this.d.get()).a(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
