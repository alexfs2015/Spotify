package defpackage;

import android.content.Context;

/* renamed from: mds reason: default package */
public final class mds implements wig<mdr> {
    private final wzi<gwm> a;
    private final wzi<Context> b;
    private final wzi<rok> c;
    private final wzi<Boolean> d;
    private final wzi<mbu> e;
    private final wzi<mdn> f;
    private final wzi<b> g;
    private final wzi<lyx> h;

    private mds(wzi<gwm> wzi, wzi<Context> wzi2, wzi<rok> wzi3, wzi<Boolean> wzi4, wzi<mbu> wzi5, wzi<mdn> wzi6, wzi<b> wzi7, wzi<lyx> wzi8) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
        this.g = wzi7;
        this.h = wzi8;
    }

    public static mds a(wzi<gwm> wzi, wzi<Context> wzi2, wzi<rok> wzi3, wzi<Boolean> wzi4, wzi<mbu> wzi5, wzi<mdn> wzi6, wzi<b> wzi7, wzi<lyx> wzi8) {
        mds mds = new mds(wzi, wzi2, wzi3, wzi4, wzi5, wzi6, wzi7, wzi8);
        return mds;
    }

    public final /* synthetic */ Object get() {
        mdr mdr = new mdr((gwm) this.a.get(), (Context) this.b.get(), (rok) this.c.get(), ((Boolean) this.d.get()).booleanValue(), (mbu) this.e.get(), (mdn) this.f.get(), (b) this.g.get(), (lyx) this.h.get());
        return mdr;
    }
}
