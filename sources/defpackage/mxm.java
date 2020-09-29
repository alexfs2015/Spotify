package defpackage;

import android.util.DisplayMetrics;

/* renamed from: mxm reason: default package */
public final class mxm implements vua<Integer> {
    private final wlc<DisplayMetrics> a;

    private mxm(wlc<DisplayMetrics> wlc) {
        this.a = wlc;
    }

    public static mxm a(wlc<DisplayMetrics> wlc) {
        return new mxm(wlc);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((DisplayMetrics) this.a.get()).widthPixels);
    }
}
