package defpackage;

import android.util.DisplayMetrics;

/* renamed from: mxl reason: default package */
public final class mxl implements vua<Integer> {
    private final wlc<DisplayMetrics> a;

    private mxl(wlc<DisplayMetrics> wlc) {
        this.a = wlc;
    }

    public static mxl a(wlc<DisplayMetrics> wlc) {
        return new mxl(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((DisplayMetrics) this.a.get()).heightPixels);
    }
}
