package defpackage;

import android.content.Context;

/* renamed from: mig reason: default package */
public final class mig implements vua<mif> {
    private final wlc<Context> a;
    private final wlc<mia> b;

    private mig(wlc<Context> wlc, wlc<mia> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mig a(wlc<Context> wlc, wlc<mia> wlc2) {
        return new mig(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mif((Context) this.a.get(), (mia) this.b.get());
    }
}
