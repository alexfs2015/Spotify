package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: lgt reason: default package */
public final class lgt implements wig<Resources> {
    private final wzi<Context> a;

    public static Resources a(Context context) {
        return (Resources) wil.a(context.getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
