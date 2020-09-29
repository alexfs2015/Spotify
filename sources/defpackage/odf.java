package defpackage;

import android.content.Context;

/* renamed from: odf reason: default package */
public final class odf implements vua<ode> {
    private final wlc<Context> a;
    private final wlc<vhw> b;

    private odf(wlc<Context> wlc, wlc<vhw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static odf a(wlc<Context> wlc, wlc<vhw> wlc2) {
        return new odf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new ode((Context) this.a.get(), (vhw) this.b.get());
    }
}
