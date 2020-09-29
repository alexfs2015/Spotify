package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: pyz reason: default package */
public final class pyz implements vua<pyy> {
    private final wlc<a> a;
    private final wlc<rwr> b;
    private final wlc<rdh> c;
    private final wlc<sih> d;

    private pyz(wlc<a> wlc, wlc<rwr> wlc2, wlc<rdh> wlc3, wlc<sih> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static pyz a(wlc<a> wlc, wlc<rwr> wlc2, wlc<rdh> wlc3, wlc<sih> wlc4) {
        return new pyz(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new pyy((a) this.a.get(), (rwr) this.b.get(), (rdh) this.c.get(), (sih) this.d.get());
    }
}
