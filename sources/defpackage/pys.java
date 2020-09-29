package defpackage;

import android.app.Application;

/* renamed from: pys reason: default package */
public final class pys implements vua<rzc> {
    private final wlc<Application> a;
    private final wlc<rnf> b;

    private pys(wlc<Application> wlc, wlc<rnf> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static pys a(wlc<Application> wlc, wlc<rnf> wlc2) {
        return new pys(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rzc) vuf.a(new rzd((Application) this.a.get(), (rnf) this.b.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
