package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: njg reason: default package */
public final class njg implements vua<njf> {
    private final wlc<a> a;
    private final wlc<rwr> b;
    private final wlc<sih> c;
    private final wlc<rdh> d;

    private njg(wlc<a> wlc, wlc<rwr> wlc2, wlc<sih> wlc3, wlc<rdh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static njg a(wlc<a> wlc, wlc<rwr> wlc2, wlc<sih> wlc3, wlc<rdh> wlc4) {
        return new njg(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new njf((a) this.a.get(), (rwr) this.b.get(), (sih) this.c.get(), (rdh) this.d.get());
    }
}
