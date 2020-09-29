package defpackage;

import android.app.Application;

/* renamed from: ruh reason: default package */
public final class ruh implements vua<rug> {
    private final wlc<Application> a;

    private ruh(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static ruh a(wlc<Application> wlc) {
        return new ruh(wlc);
    }

    public final /* synthetic */ Object get() {
        return new rug((Application) this.a.get());
    }
}
