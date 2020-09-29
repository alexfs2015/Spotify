package defpackage;

import android.app.Application;

/* renamed from: hyw reason: default package */
public final class hyw implements vua<hyv> {
    private final wlc<Application> a;

    private hyw(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static hyw a(wlc<Application> wlc) {
        return new hyw(wlc);
    }

    public final /* synthetic */ Object get() {
        return new hyv((Application) this.a.get());
    }
}
