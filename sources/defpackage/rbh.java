package defpackage;

import android.content.Context;

/* renamed from: rbh reason: default package */
public final class rbh implements wig<rbg> {
    private final wzi<Context> a;
    private final wzi<jrn> b;
    private final wzi<vce> c;
    private final wzi<rqb> d;
    private final wzi<uix> e;
    private final wzi<heg> f;

    private rbh(wzi<Context> wzi, wzi<jrn> wzi2, wzi<vce> wzi3, wzi<rqb> wzi4, wzi<uix> wzi5, wzi<heg> wzi6) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
        this.e = wzi5;
        this.f = wzi6;
    }

    public static rbh a(wzi<Context> wzi, wzi<jrn> wzi2, wzi<vce> wzi3, wzi<rqb> wzi4, wzi<uix> wzi5, wzi<heg> wzi6) {
        rbh rbh = new rbh(wzi, wzi2, wzi3, wzi4, wzi5, wzi6);
        return rbh;
    }

    public final /* synthetic */ Object get() {
        rbg rbg = new rbg((Context) this.a.get(), (jrn) this.b.get(), (vce) this.c.get(), (rqb) this.d.get(), (uix) this.e.get(), (heg) this.f.get());
        return rbg;
    }
}
