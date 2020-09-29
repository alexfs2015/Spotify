package defpackage;

import android.app.Activity;

/* renamed from: hbl reason: default package */
public final class hbl implements vua<hbk> {
    private final wlc<Activity> a;
    private final wlc<spe> b;

    private hbl(wlc<Activity> wlc, wlc<spe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static hbl a(wlc<Activity> wlc, wlc<spe> wlc2) {
        return new hbl(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new hbk((Activity) this.a.get(), (spe) this.b.get());
    }
}
