package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: rhv reason: default package */
public final class rhv implements vua<rhu> {
    private final wlc<DisplayMetrics> a;
    private final wlc<Resources> b;

    private rhv(wlc<DisplayMetrics> wlc, wlc<Resources> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rhv a(wlc<DisplayMetrics> wlc, wlc<Resources> wlc2) {
        return new rhv(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new rhu((DisplayMetrics) this.a.get(), (Resources) this.b.get());
    }
}
