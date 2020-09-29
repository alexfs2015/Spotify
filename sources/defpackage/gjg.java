package defpackage;

import android.content.Context;

/* renamed from: gjg reason: default package */
public final class gjg implements wig<git> {
    private final wzi<Context> a;

    private gjg(wzi<Context> wzi) {
        this.a = wzi;
    }

    public static gjg a(wzi<Context> wzi) {
        return new gjg(wzi);
    }

    public final /* synthetic */ Object get() {
        return (git) wil.a(new giu(giu.a((Context) this.a.get(), "http-cache"), 5242880), "Cannot return null from a non-@Nullable @Provides method");
    }
}
