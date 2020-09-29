package defpackage;

import android.util.DisplayMetrics;

/* renamed from: izf reason: default package */
public final class izf implements vua<izd> {
    private final wlc<a> a;
    private final wlc<DisplayMetrics> b;

    private izf(wlc<a> wlc, wlc<DisplayMetrics> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static izf a(wlc<a> wlc, wlc<DisplayMetrics> wlc2) {
        return new izf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new izd((a) this.a.get(), (DisplayMetrics) this.b.get());
    }
}
