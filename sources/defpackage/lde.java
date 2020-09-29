package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: lde reason: default package */
public final class lde implements wig<DisplayMetrics> {
    private final wzi<Context> a;

    private lde(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static DisplayMetrics a(Context context) {
        return (DisplayMetrics) wil.a(context.getResources().getDisplayMetrics(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lde a(wzi<Context> wzi) {
        return new lde(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
