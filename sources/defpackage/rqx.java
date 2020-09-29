package defpackage;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: rqx reason: default package */
public final class rqx implements wig<rqw> {
    private final wzi<DisplayMetrics> a;
    private final wzi<Resources> b;

    private rqx(wzi<DisplayMetrics> wzi, wzi<Resources> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static rqx a(wzi<DisplayMetrics> wzi, wzi<Resources> wzi2) {
        return new rqx(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return new rqw((DisplayMetrics) this.a.get(), (Resources) this.b.get());
    }
}
