package defpackage;

import android.app.Application;

/* renamed from: gue reason: default package */
public final class gue implements vua<gud> {
    private final wlc<Application> a;

    private gue(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static gue a(wlc<Application> wlc) {
        return new gue(wlc);
    }

    public final /* synthetic */ Object get() {
        return new gud((Application) this.a.get());
    }
}
