package defpackage;

import android.content.Context;

/* renamed from: lnn reason: default package */
public final class lnn implements wig<gbv> {
    private final wzi<Context> a;
    private final wzi<hit> b;

    private lnn(wzi<Context> wzi, wzi<hit> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static lnn a(wzi<Context> wzi, wzi<hit> wzi2) {
        return new lnn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (gbv) wil.a(CC.a((Context) this.a.get(), (hit) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
