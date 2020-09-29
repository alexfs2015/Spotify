package defpackage;

import android.content.Context;

/* renamed from: tti reason: default package */
public final class tti implements vua<tth> {
    private final wlc<Context> a;
    private final wlc<tmy> b;
    private final wlc<tud> c;

    private tti(wlc<Context> wlc, wlc<tmy> wlc2, wlc<tud> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static tti a(wlc<Context> wlc, wlc<tmy> wlc2, wlc<tud> wlc3) {
        return new tti(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new tth((Context) this.a.get(), (tmy) this.b.get(), (tud) this.c.get());
    }
}
