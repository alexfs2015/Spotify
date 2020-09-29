package defpackage;

import android.content.res.Resources;

/* renamed from: nfh reason: default package */
public final class nfh implements wig<nfg> {
    private final wzi<gwr> a;
    private final wzi<gwp> b;
    private final wzi<Resources> c;

    private nfh(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static nfh a(wzi<gwr> wzi, wzi<gwp> wzi2, wzi<Resources> wzi3) {
        return new nfh(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new nfg((gwr) this.a.get(), (gwp) this.b.get(), (Resources) this.c.get());
    }
}
