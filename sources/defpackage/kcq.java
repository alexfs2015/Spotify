package defpackage;

import android.content.Context;

/* renamed from: kcq reason: default package */
public final class kcq implements vua<kcp> {
    private final wlc<Context> a;
    private final wlc<jjf> b;
    private final wlc<gbd> c;

    private kcq(wlc<Context> wlc, wlc<jjf> wlc2, wlc<gbd> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static kcq a(wlc<Context> wlc, wlc<jjf> wlc2, wlc<gbd> wlc3) {
        return new kcq(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new kcp((Context) this.a.get(), (jjf) this.b.get(), (gbd) this.c.get());
    }
}
