package defpackage;

import android.util.DisplayMetrics;

/* renamed from: ncm reason: default package */
public final class ncm implements wig<Integer> {
    private final wzi<DisplayMetrics> a;

    private ncm(wzi<DisplayMetrics> wzi) {
        this.a = wzi;
    }

    public static ncm a(wzi<DisplayMetrics> wzi) {
        return new ncm(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((DisplayMetrics) this.a.get()).heightPixels);
    }
}
