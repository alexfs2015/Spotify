package defpackage;

import android.app.Activity;

/* renamed from: nai reason: default package */
public final class nai implements vua<nah> {
    private final wlc<Activity> a;

    private nai(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static nai a(wlc<Activity> wlc) {
        return new nai(wlc);
    }

    public final /* synthetic */ Object get() {
        return new nah((Activity) this.a.get());
    }
}
