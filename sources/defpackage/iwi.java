package defpackage;

import android.app.Activity;

/* renamed from: iwi reason: default package */
public final class iwi implements vua<iwh> {
    private final wlc<Activity> a;

    private iwi(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static iwi a(wlc<Activity> wlc) {
        return new iwi(wlc);
    }

    public final /* synthetic */ Object get() {
        return new iwh((Activity) this.a.get());
    }
}
