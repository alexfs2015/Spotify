package defpackage;

import android.content.Context;

/* renamed from: mbl reason: default package */
public final class mbl implements wig<lyx> {
    private final wzi<Context> a;
    private final wzi<szl> b;

    private mbl(wzi<Context> wzi, wzi<szl> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static mbl a(wzi<Context> wzi, wzi<szl> wzi2) {
        return new mbl(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (lyx) wil.a(new lyu((Context) this.a.get(), (szl) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
