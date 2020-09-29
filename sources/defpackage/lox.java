package defpackage;

import android.app.Application;

/* renamed from: lox reason: default package */
public final class lox implements vua<low> {
    private final wlc<Application> a;

    private lox(wlc<Application> wlc) {
        this.a = wlc;
    }

    public static lox a(wlc<Application> wlc) {
        return new lox(wlc);
    }

    public final /* synthetic */ Object get() {
        return new low((Application) this.a.get());
    }
}
