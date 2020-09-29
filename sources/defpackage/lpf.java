package defpackage;

import android.app.Application;

/* renamed from: lpf reason: default package */
public final class lpf implements vua<lpe> {
    private final wlc<Application> a;

    private lpf(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static lpf a(wlc<Application> wlc) {
        return new lpf(wlc);
    }

    public final /* synthetic */ Object get() {
        return new lpe((Application) this.a.get());
    }
}
