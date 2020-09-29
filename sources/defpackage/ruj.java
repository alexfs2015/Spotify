package defpackage;

import android.app.Application;

/* renamed from: ruj reason: default package */
public final class ruj implements vua<rui> {
    private final wlc<Application> a;

    private ruj(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static ruj a(wlc<Application> wlc) {
        return new ruj(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rui((Application) this.a.get());
    }
}
