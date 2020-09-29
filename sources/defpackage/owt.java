package defpackage;

import android.content.Context;

/* renamed from: owt reason: default package */
public final class owt implements vua<ows> {
    private final wlc<Context> a;
    private final wlc<jvy> b;
    private final wlc<rnf> c;

    private owt(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static owt a(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        return new owt(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new ows((Context) this.a.get(), (jvy) this.b.get(), (rnf) this.c.get());
    }
}
