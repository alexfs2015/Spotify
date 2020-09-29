package defpackage;

import android.content.res.Resources;

/* renamed from: lhl reason: default package */
public final class lhl implements wig<hvw> {
    private final wzi<Resources> a;
    private final wzi<hvz> b;
    private final wzi<hgz> c;
    private final wzi<jlr> d;

    private lhl(wzi<Resources> wzi, wzi<hvz> wzi2, wzi<hgz> wzi3, wzi<jlr> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static lhl a(wzi<Resources> wzi, wzi<hvz> wzi2, wzi<hgz> wzi3, wzi<jlr> wzi4) {
        return new lhl(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return (hvw) wil.a(new hvx((Resources) this.a.get(), (hvz) this.b.get(), (hgz) this.c.get(), new hqy((jlr) this.d.get())), "Cannot return null from a non-@Nullable @Provides method");
    }
}
