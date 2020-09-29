package defpackage;

import android.content.Context;

/* renamed from: snn reason: default package */
public final class snn implements vua<snm> {
    private final wlc<Context> a;
    private final wlc<spe> b;

    private snn(wlc<Context> wlc, wlc<spe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static snn a(wlc<Context> wlc, wlc<spe> wlc2) {
        return new snn(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new snm((Context) this.a.get(), (spe) this.b.get());
    }
}
