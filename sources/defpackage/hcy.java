package defpackage;

import com.spotify.mobile.android.util.ui.Lifecycle.a;

/* renamed from: hcy reason: default package */
public final class hcy implements vua<hcx> {
    private final wlc<a> a;
    private final wlc<uxh> b;

    private hcy(wlc<a> wlc, wlc<uxh> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hcy a(wlc<a> wlc, wlc<uxh> wlc2) {
        return new hcy(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hcx((a) this.a.get(), (uxh) this.b.get());
    }
}
