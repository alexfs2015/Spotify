package defpackage;

import android.content.res.Resources;

/* renamed from: ndy reason: default package */
public final class ndy implements wig<ndx> {
    private final wzi<gwr> a;
    private final wzi<gwp> b;
    private final wzi<Resources> c;
    private final wzi<kts> d;

    private ndy(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3, wzi<kts> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ndy a(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3, wzi<kts> wzi4) {
        return new ndy(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ndx((gwr) this.a.get(), (gwp) this.b.get(), (Resources) this.c.get(), (kts) this.d.get());
    }
}
