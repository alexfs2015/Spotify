package defpackage;

import android.content.Context;

/* renamed from: rgu reason: default package */
public final class rgu implements vua<rgt> {
    private final wlc<hec> a;
    private final wlc<String> b;
    private final wlc<Context> c;
    private final wlc<kvb> d;
    private final wlc<snx> e;

    private rgu(wlc<hec> wlc, wlc<String> wlc2, wlc<Context> wlc3, wlc<kvb> wlc4, wlc<snx> wlc5) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
        this.e = wlc5;
    }

    public static rgu a(wlc<hec> wlc, wlc<String> wlc2, wlc<Context> wlc3, wlc<kvb> wlc4, wlc<snx> wlc5) {
        rgu rgu = new rgu(wlc, wlc2, wlc3, wlc4, wlc5);
        return rgu;
    }

    public final /* synthetic */ Object get() {
        rgt rgt = new rgt((hec) this.a.get(), (String) this.b.get(), (Context) this.c.get(), (kvb) this.d.get(), (snx) this.e.get());
        return rgt;
    }
}
