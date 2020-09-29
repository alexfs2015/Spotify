package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: lar reason: default package */
public final class lar implements vua<Resources> {
    private final wlc<Context> a;

    private lar(wlc<Context> wlc) {
        this.a = wlc;
    }

    public static lar a(wlc<Context> wlc) {
        return new lar(wlc);
    }

    public static Resources a(Context context) {
        return (Resources) vuf.a(context.getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
