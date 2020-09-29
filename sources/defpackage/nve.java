package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: nve reason: default package */
public final class nve implements wig<Integer> {
    private final wzi<Context> a;
    private final wzi<DisplayMetrics> b;
    private final wzi<Integer> c;

    private nve(wzi<Context> wzi, wzi<DisplayMetrics> wzi2, wzi<Integer> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nve a(wzi<Context> wzi, wzi<DisplayMetrics> wzi2, wzi<Integer> wzi3) {
        return new nve(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(CC.a((Context) this.a.get(), (DisplayMetrics) this.b.get(), ((Integer) this.c.get()).intValue()));
    }
}
