package defpackage;

import android.view.View;

/* renamed from: sjr reason: default package */
public final class sjr implements vua<sjq> {
    private final wlc<View> a;
    private final wlc<sjs> b;
    private final wlc<sjh> c;
    private final wlc<sjk> d;
    private final wlc<sjx> e;
    private final wlc<String> f;
    private final wlc<sjo> g;

    private sjr(wlc<View> wlc, wlc<sjs> wlc2, wlc<sjh> wlc3, wlc<sjk> wlc4, wlc<sjx> wlc5, wlc<String> wlc6, wlc<sjo> wlc7) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
        this.g = wlc7;
    }

    public static sjr a(wlc<View> wlc, wlc<sjs> wlc2, wlc<sjh> wlc3, wlc<sjk> wlc4, wlc<sjx> wlc5, wlc<String> wlc6, wlc<sjo> wlc7) {
        sjr sjr = new sjr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6, wlc7);
        return sjr;
    }

    public final /* synthetic */ Object get() {
        sjq sjq = new sjq(vtz.b(this.a), (sjs) this.b.get(), (sjh) this.c.get(), (sjk) this.d.get(), (sjx) this.e.get(), (String) this.f.get(), (sjo) this.g.get());
        return sjq;
    }
}
