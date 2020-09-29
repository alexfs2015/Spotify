package defpackage;

import android.content.Context;

/* renamed from: lzr reason: default package */
public final class lzr implements vua<lzq> {
    private final wlc<gum> a;
    private final wlc<Context> b;
    private final wlc<rfi> c;
    private final wlc<Boolean> d;
    private final wlc<lxt> e;
    private final wlc<lzm> f;
    private final wlc<b> g;
    private final wlc<luy> h;

    private lzr(wlc<gum> wlc, wlc<Context> wlc2, wlc<rfi> wlc3, wlc<Boolean> wlc4, wlc<lxt> wlc5, wlc<lzm> wlc6, wlc<b> wlc7, wlc<luy> wlc8) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
        this.h = wlc8;
    }

    public static lzr a(wlc<gum> wlc, wlc<Context> wlc2, wlc<rfi> wlc3, wlc<Boolean> wlc4, wlc<lxt> wlc5, wlc<lzm> wlc6, wlc<b> wlc7, wlc<luy> wlc8) {
        lzr lzr = new lzr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7, wlc8);
        return lzr;
    }

    public final /* synthetic */ Object get() {
        lzq lzq = new lzq((gum) this.a.get(), (Context) this.b.get(), (rfi) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (lxt) this.e.get(), (lzm) this.f.get(), (b) this.g.get(), (luy) this.h.get());
        return lzq;
    }
}
