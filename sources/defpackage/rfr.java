package defpackage;

import android.content.Context;

/* renamed from: rfr reason: default package */
public final class rfr implements vua<rfn> {
    private final wlc<sih> a;
    private final wlc<Context> b;
    private final wlc<txm> c;
    private final wlc<fyz> d;
    private final wlc<rfp> e;
    private final wlc<uhs> f;

    private rfr(wlc<sih> wlc, wlc<Context> wlc2, wlc<txm> wlc3, wlc<fyz> wlc4, wlc<rfp> wlc5, wlc<uhs> wlc6) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
        this.f = wlc6;
    }

    public static rfr a(wlc<sih> wlc, wlc<Context> wlc2, wlc<txm> wlc3, wlc<fyz> wlc4, wlc<rfp> wlc5, wlc<uhs> wlc6) {
        rfr rfr = new rfr(wlc, wlc2, wlc3, wlc4, wlc5, wlc6);
        return rfr;
    }

    public final /* synthetic */ Object get() {
        rfn rfn = new rfn((sih) this.a.get(), (Context) this.b.get(), (txm) this.c.get(), (fyz) this.d.get(), (rfp) this.e.get(), (uhs) this.f.get());
        return rfn;
    }
}
