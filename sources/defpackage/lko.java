package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: lko reason: default package */
public final class lko implements vua<lkn> {
    private final wlc<lkk> a;
    private final wlc<lks> b;
    private final wlc<heg> c;
    private final wlc<a> d;

    private lko(wlc<lkk> wlc, wlc<lks> wlc2, wlc<heg> wlc3, wlc<a> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static lko a(wlc<lkk> wlc, wlc<lks> wlc2, wlc<heg> wlc3, wlc<a> wlc4) {
        return new lko(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new lkn((lkk) this.a.get(), (lks) this.b.get(), (heg) this.c.get(), (a) this.d.get());
    }
}
