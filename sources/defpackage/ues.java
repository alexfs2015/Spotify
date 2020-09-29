package defpackage;

import android.app.Activity;

/* renamed from: ues reason: default package */
public final class ues implements vua<Boolean> {
    private final wlc<Activity> a;

    private ues(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static ues a(wlc<Activity> wlc) {
        return new ues(wlc);
    }

    public final /* synthetic */ Object get() {
        return Boolean.valueOf(CC.a((Activity) this.a.get()));
    }
}
