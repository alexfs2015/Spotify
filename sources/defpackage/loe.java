package defpackage;

import android.content.Context;

/* renamed from: loe reason: default package */
public final class loe implements wig<gfn> {
    private final wzi<Context> a;
    private final wzi<giz> b;
    private final wzi<gfz> c;

    private loe(wzi<Context> wzi, wzi<giz> wzi2, wzi<gfz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static loe a(wzi<Context> wzi, wzi<giz> wzi2, wzi<gfz> wzi3) {
        return new loe(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (gfn) wil.a(new gfn((Context) this.a.get(), ((giz) this.b.get()).b, (gfz) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
