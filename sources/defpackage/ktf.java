package defpackage;

import android.app.Application;

/* renamed from: ktf reason: default package */
public final class ktf implements vua<kte> {
    private final wlc<Application> a;
    private final wlc<ksw> b;

    private ktf(wlc<Application> wlc, wlc<ksw> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static ktf a(wlc<Application> wlc, wlc<ksw> wlc2) {
        return new ktf(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new kte((Application) this.a.get(), (ksw) this.b.get());
    }
}
