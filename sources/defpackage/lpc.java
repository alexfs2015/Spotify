package defpackage;

import android.content.Context;

/* renamed from: lpc reason: default package */
public final class lpc implements vua<lpb> {
    private final wlc<Context> a;
    private final wlc<hec> b;
    private final wlc<wug> c;
    private final wlc<wug> d;
    private final wlc<hrp> e;

    private lpc(wlc<Context> wlc, wlc<hec> wlc2, wlc<wug> wlc3, wlc<wug> wlc4, wlc<hrp> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static lpc a(wlc<Context> wlc, wlc<hec> wlc2, wlc<wug> wlc3, wlc<wug> wlc4, wlc<hrp> wlc5) {
        lpc lpc = new lpc(wlc, wlc2, wlc3, wlc4, wlc5);
        return lpc;
    }

    public final /* synthetic */ Object get() {
        lpb lpb = new lpb(this.a, this.b, this.c, this.d, this.e);
        return lpb;
    }
}
