package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: osq reason: default package */
public final class osq implements vua<osp> {
    private final wlc<a> a;
    private final wlc<rwr> b;
    private final wlc<sih> c;
    private final wlc<rdh> d;

    private osq(wlc<a> wlc, wlc<rwr> wlc2, wlc<sih> wlc3, wlc<rdh> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static osq a(wlc<a> wlc, wlc<rwr> wlc2, wlc<sih> wlc3, wlc<rdh> wlc4) {
        return new osq(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new osp((a) this.a.get(), (rwr) this.b.get(), (sih) this.c.get(), (rdh) this.d.get());
    }
}
