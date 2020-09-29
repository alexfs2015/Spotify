package defpackage;

import android.app.Application;

/* renamed from: nvh reason: default package */
public final class nvh implements vua<nvg> {
    private final wlc<Application> a;
    private final wlc<rvg> b;
    private final wlc<nvf> c;

    private nvh(wlc<Application> wlc, wlc<rvg> wlc2, wlc<nvf> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static nvh a(wlc<Application> wlc, wlc<rvg> wlc2, wlc<nvf> wlc3) {
        return new nvh(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new nvg((Application) this.a.get(), (rvg) this.b.get(), (nvf) this.c.get());
    }
}
