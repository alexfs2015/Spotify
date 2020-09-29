package defpackage;

import android.app.Activity;

/* renamed from: klk reason: default package */
public final class klk implements vua<klj> {
    private final wlc<Activity> a;
    private final wlc<spe> b;
    private final wlc<kvk> c;

    private klk(wlc<Activity> wlc, wlc<spe> wlc2, wlc<kvk> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static klk a(wlc<Activity> wlc, wlc<spe> wlc2, wlc<kvk> wlc3) {
        return new klk(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new klj((Activity) this.a.get(), (spe) this.b.get(), (kvk) this.c.get());
    }
}
