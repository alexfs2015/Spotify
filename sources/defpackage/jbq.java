package defpackage;

import android.util.DisplayMetrics;

/* renamed from: jbq reason: default package */
public final class jbq implements wig<jbo> {
    private final wzi<a> a;
    private final wzi<DisplayMetrics> b;

    private jbq(wzi<a> wzi, wzi<DisplayMetrics> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static jbq a(wzi<a> wzi, wzi<DisplayMetrics> wzi2) {
        return new jbq(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new jbo((a) this.a.get(), (DisplayMetrics) this.b.get());
    }
}
