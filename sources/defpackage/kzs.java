package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;

/* renamed from: kzs reason: default package */
public final class kzs implements vua<DisplayMetrics> {
    private final wlc<Context> a;

    private kzs(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static kzs a(wlc<Context> wlc) {
        return new kzs(wlc);
    }

    public static DisplayMetrics a(Context context) {
        return (DisplayMetrics) vuf.a(context.getResources().getDisplayMetrics(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
