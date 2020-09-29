package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: nce reason: default package */
public final class nce implements vua<ncd> {
    private final wlc<lkn> a;
    private final wlc<a> b;

    private nce(wlc<lkn> wlc, wlc<a> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static nce a(wlc<lkn> wlc, wlc<a> wlc2) {
        return new nce(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ncd((lkn) this.a.get(), (a) this.b.get());
    }
}
