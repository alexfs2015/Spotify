package defpackage;

import android.util.DisplayMetrics;

/* renamed from: ncn reason: default package */
public final class ncn implements wig<Integer> {
    private final wzi<DisplayMetrics> a;

    private ncn(wzi<DisplayMetrics> wzi) {
        this.a = wzi;
    }

    public static ncn a(wzi<DisplayMetrics> wzi) {
        return new ncn(wzi);
    }

    public final /* synthetic */ Object get() {
        return Integer.valueOf(((DisplayMetrics) this.a.get()).widthPixels);
    }
}
