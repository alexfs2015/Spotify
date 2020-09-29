package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: ldf reason: default package */
public final class ldf implements vua<Resources> {
    private final wlc<Context> a;

    public static Resources a(Context context) {
        return (Resources) vuf.a(context.getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
