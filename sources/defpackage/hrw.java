package defpackage;

import android.content.Context;

/* renamed from: hrw reason: default package */
public final class hrw implements vua<hrv> {
    private final wlc<Context> a;
    private final wlc<hed> b;
    private final wlc<hth> c;
    private final wlc<ioo> d;
    private final wlc<wud<String>> e;

    private hrw(wlc<Context> wlc, wlc<hed> wlc2, wlc<hth> wlc3, wlc<ioo> wlc4, wlc<wud<String>> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hrw a(wlc<Context> wlc, wlc<hed> wlc2, wlc<hth> wlc3, wlc<ioo> wlc4, wlc<wud<String>> wlc5) {
        hrw hrw = new hrw(wlc, wlc2, wlc3, wlc4, wlc5);
        return hrw;
    }

    public final /* synthetic */ Object get() {
        hrv hrv = new hrv((Context) this.a.get(), (hed) this.b.get(), (hth) this.c.get(), (ioo) this.d.get(), (wud) this.e.get());
        return hrv;
    }
}
