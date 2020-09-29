package defpackage;

import android.content.Context;

/* renamed from: pfs reason: default package */
public final class pfs implements wig<pfr> {
    private final wzi<Context> a;
    private final wzi<pfl> b;
    private final wzi<pfo> c;
    private final wzi<Boolean> d;
    private final wzi<Boolean> e;
    private final wzi<Boolean> f;

    private pfs(wzi<Context> wzi, wzi<pfl> wzi2, wzi<pfo> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static pfs a(wzi<Context> wzi, wzi<pfl> wzi2, wzi<pfo> wzi3, wzi<Boolean> wzi4, wzi<Boolean> wzi5, wzi<Boolean> wzi6) {
        pfs pfs = new pfs(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return pfs;
    }

    public final /* synthetic */ Object get() {
        pfr pfr = new pfr((Context) this.a.get(), (pfl) this.b.get(), (pfo) this.c.get(), ((Boolean) this.d.get()).booleanValue(), ((Boolean) this.e.get()).booleanValue(), ((Boolean) this.f.get()).booleanValue());
        return pfr;
    }
}
