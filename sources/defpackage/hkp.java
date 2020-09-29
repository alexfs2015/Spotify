package defpackage;

import android.content.Context;

/* renamed from: hkp reason: default package */
public final class hkp implements wig<hko> {
    private final wzi<Context> a;
    private final wzi<mh> b;
    private final wzi<hkm> c;
    private final wzi<vwv> d;
    private final wzi<hit> e;

    private hkp(wzi<Context> wzi, wzi<mh> wzi2, wzi<hkm> wzi3, wzi<vwv> wzi4, wzi<hit> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static hkp a(wzi<Context> wzi, wzi<mh> wzi2, wzi<hkm> wzi3, wzi<vwv> wzi4, wzi<hit> wzi5) {
        hkp hkp = new hkp(wzi, wzi2, wzi3, wzi4, wzi5);
        return hkp;
    }

    public final /* synthetic */ Object get() {
        hko hko = new hko((Context) this.a.get(), (mh) this.b.get(), (hkm) this.c.get(), (vwv) this.d.get(), (hit) this.e.get());
        return hko;
    }
}
