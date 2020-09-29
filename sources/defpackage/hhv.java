package defpackage;

import android.content.Context;

/* renamed from: hhv reason: default package */
public final class hhv implements vua<hhu> {
    private final wlc<Context> a;
    private final wlc<mc> b;
    private final wlc<hhs> c;
    private final wlc<vjp> d;
    private final wlc<hfx> e;

    private hhv(wlc<Context> wlc, wlc<mc> wlc2, wlc<hhs> wlc3, wlc<vjp> wlc4, wlc<hfx> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static hhv a(wlc<Context> wlc, wlc<mc> wlc2, wlc<hhs> wlc3, wlc<vjp> wlc4, wlc<hfx> wlc5) {
        hhv hhv = new hhv(wlc, wlc2, wlc3, wlc4, wlc5);
        return hhv;
    }

    public final /* synthetic */ Object get() {
        hhu hhu = new hhu((Context) this.a.get(), (mc) this.b.get(), (hhs) this.c.get(), (vjp) this.d.get(), (hfx) this.e.get());
        return hhu;
    }
}
