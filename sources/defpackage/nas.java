package defpackage;

import android.content.res.Resources;

/* renamed from: nas reason: default package */
public final class nas implements wig<nar> {
    private final wzi<gwr> a;
    private final wzi<gwp> b;
    private final wzi<Resources> c;

    private nas(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nas a(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3) {
        return new nas(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new nar((gwr) this.a.get(), (gwp) this.b.get(), (Resources) this.c.get());
    }
}
