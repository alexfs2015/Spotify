package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: npb reason: default package */
public final class npb implements vua<Integer> {
    private final wlc<Context> a;
    private final wlc<DisplayMetrics> b;
    private final wlc<Integer> c;

    private npb(wlc<Context> wlc, wlc<DisplayMetrics> wlc2, wlc<Integer> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static npb a(wlc<Context> wlc, wlc<DisplayMetrics> wlc2, wlc<Integer> wlc3) {
        return new npb(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(CC.a((Context) this.a.get(), (DisplayMetrics) this.b.get(), ((Integer) this.c.get()).intValue()));
    }
}
