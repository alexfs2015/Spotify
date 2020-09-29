package defpackage;

import android.app.Activity;

/* renamed from: rte reason: default package */
public final class rte implements wig<rtd> {
    private final wzi<Activity> a;
    private final wzi<mfo> b;
    private final wzi<jty> c;
    private final wzi<hat> d;
    private final wzi<rtb> e;

    private rte(wzi<Activity> wzi, wzi<mfo> wzi2, wzi<jty> wzi3, wzi<hat> wzi4, wzi<rtb> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static rte a(wzi<Activity> wzi, wzi<mfo> wzi2, wzi<jty> wzi3, wzi<hat> wzi4, wzi<rtb> wzi5) {
        rte rte = new rte(wzi, wzi2, wzi3, wzi4, wzi5);
        return rte;
    }

    public final /* synthetic */ Object get() {
        rtd rtd = new rtd((Activity) this.a.get(), (mfo) this.b.get(), (jty) this.c.get(), (hat) this.d.get(), (rtb) this.e.get());
        return rtd;
    }
}
