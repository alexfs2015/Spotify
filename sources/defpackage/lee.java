package defpackage;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: lee reason: default package */
public final class lee implements wig<Resources> {
    private final wzi<Context> a;

    private lee(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static Resources a(Context context) {
        return (Resources) wil.a(context.getResources(), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lee a(wzi<Context> wzi) {
        return new lee(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((Context) this.a.get());
    }
}
