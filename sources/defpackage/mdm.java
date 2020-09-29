package defpackage;

import android.app.Application;

/* renamed from: mdm reason: default package */
public final class mdm implements vua<mdl> {
    private final wlc<hfx> a;
    private final wlc<Application> b;

    private mdm(wlc<hfx> wlc, wlc<Application> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static mdm a(wlc<hfx> wlc, wlc<Application> wlc2) {
        return new mdm(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new mdl((hfx) this.a.get(), (Application) this.b.get());
    }
}
