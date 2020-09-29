package defpackage;

import android.app.Activity;

/* renamed from: pnx reason: default package */
public final class pnx implements wig<pnw> {
    private final wzi<Activity> a;
    private final wzi<mfo> b;
    private final wzi<jty> c;
    private final wzi<hat> d;
    private final wzi<pnu> e;

    private pnx(wzi<Activity> wzi, wzi<mfo> wzi2, wzi<jty> wzi3, wzi<hat> wzi4, wzi<pnu> wzi5) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
    }

    public static pnx a(wzi<Activity> wzi, wzi<mfo> wzi2, wzi<jty> wzi3, wzi<hat> wzi4, wzi<pnu> wzi5) {
        pnx pnx = new pnx(wzi, wzi2, wzi3, wzi4, wzi5);
        return pnx;
    }

    public final /* synthetic */ Object get() {
        pnw pnw = new pnw((Activity) this.a.get(), (mfo) this.b.get(), (jty) this.c.get(), (hat) this.d.get(), (pnu) this.e.get());
        return pnw;
    }
}
