package defpackage;

import android.app.Activity;

/* renamed from: kma reason: default package */
public final class kma implements vua<klz> {
    private final wlc<Activity> a;
    private final wlc<spe> b;

    private kma(wlc<Activity> wlc, wlc<spe> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static kma a(wlc<Activity> wlc, wlc<spe> wlc2) {
        return new kma(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new klz((Activity) this.a.get(), (spe) this.b.get());
    }
}
