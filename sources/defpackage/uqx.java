package defpackage;

import android.content.Context;

/* renamed from: uqx reason: default package */
public final class uqx implements vua<uqw> {
    private final wlc<Context> a;
    private final wlc<jvy> b;
    private final wlc<rnf> c;

    private uqx(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static uqx a(wlc<Context> wlc, wlc<jvy> wlc2, wlc<rnf> wlc3) {
        return new uqx(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new uqw((Context) this.a.get(), (jvy) this.b.get(), (rnf) this.c.get());
    }
}
