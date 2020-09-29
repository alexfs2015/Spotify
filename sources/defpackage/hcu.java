package defpackage;

import android.content.Context;

/* renamed from: hcu reason: default package */
public final class hcu implements vua<hct> {
    private final wlc<Context> a;
    private final wlc<jvy> b;
    private final wlc<rnf> c;

    private hcu(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static hcu a(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        return new hcu(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new hct((Context) this.a.get(), (jvy) this.b.get(), (rnf) this.c.get());
    }
}
