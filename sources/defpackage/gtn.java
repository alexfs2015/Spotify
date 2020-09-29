package defpackage;

import android.content.Context;

/* renamed from: gtn reason: default package */
public final class gtn implements wig<ni> {
    private final wzi<Context> a;

    private gtn(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gtn a(wzi<Context> wzi) {
        return new gtn(wzi);
    }

    public final /* synthetic */ Object get() {
        return (ni) wil.a(ni.a((Context) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
