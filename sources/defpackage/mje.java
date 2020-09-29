package defpackage;

import android.content.Context;

/* renamed from: mje reason: default package */
public final class mje implements vua<mjd> {
    private final wlc<miy> a;
    private final wlc<Context> b;
    private final wlc<jjf> c;
    private final wlc<jrp> d;
    private final wlc<String> e;

    private mje(wlc<miy> wlc, wlc<Context> wlc2, wlc<jjf> wlc3, wlc<jrp> wlc4, wlc<String> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static mje a(wlc<miy> wlc, wlc<Context> wlc2, wlc<jjf> wlc3, wlc<jrp> wlc4, wlc<String> wlc5) {
        mje mje = new mje(wlc, wlc2, wlc3, wlc4, wlc5);
        return mje;
    }

    public final /* synthetic */ Object get() {
        mjd mjd = new mjd(this.a, this.b, this.c, this.d, this.e);
        return mjd;
    }
}
