package defpackage;

import android.content.Context;

/* renamed from: hro reason: default package */
public final class hro implements vua<hrn> {
    private final wlc<Context> a;
    private final wlc<hri> b;
    private final wlc<hqt> c;
    private final wlc<hrg> d;
    private final wlc<hpg> e;

    private hro(wlc<Context> wlc, wlc<hri> wlc2, wlc<hqt> wlc3, wlc<hrg> wlc4, wlc<hpg> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hro a(wlc<Context> wlc, wlc<hri> wlc2, wlc<hqt> wlc3, wlc<hrg> wlc4, wlc<hpg> wlc5) {
        hro hro = new hro(wlc, wlc2, wlc3, wlc4, wlc5);
        return hro;
    }

    public final /* synthetic */ Object get() {
        hrn hrn = new hrn((Context) this.a.get(), (hri) this.b.get(), (hqt) this.c.get(), (hrg) this.d.get(), (hpg) this.e.get());
        return hrn;
    }
}
