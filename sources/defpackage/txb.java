package defpackage;

import android.content.Context;

/* renamed from: txb reason: default package */
public final class txb implements vua<twz> {
    private final wlc<Context> a;
    private final wlc<txc> b;
    private final wlc<jrp> c;
    private final wlc<heg> d;

    private txb(wlc<Context> wlc, wlc<txc> wlc2, wlc<jrp> wlc3, wlc<heg> wlc4) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
        this.d = wlc4;
    }

    public static txb a(wlc<Context> wlc, wlc<txc> wlc2, wlc<jrp> wlc3, wlc<heg> wlc4) {
        return new txb(wlc, wlc2, wlc3, wlc4);
    }

    public final /* synthetic */ Object get() {
        return new twz((Context) this.a.get(), (txc) this.b.get(), (jrp) this.c.get(), (heg) this.d.get());
    }
}
