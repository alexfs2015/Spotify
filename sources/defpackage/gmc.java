package defpackage;

import android.content.Context;

/* renamed from: gmc reason: default package */
public final class gmc implements vua<gmb> {
    private final wlc<fss> a;
    private final wlc<Context> b;
    private final wlc<a> c;

    private gmc(wlc<fss> wlc, wlc<Context> wlc2, wlc<a> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static gmc a(wlc<fss> wlc, wlc<Context> wlc2, wlc<a> wlc3) {
        return new gmc(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new gmb((fss) this.a.get(), (Context) this.b.get(), (a) this.c.get());
    }
}
