package defpackage;

import android.app.Activity;

/* renamed from: mim reason: default package */
public final class mim implements vua<mil> {
    private final wlc<hip> a;
    private final wlc<gkw> b;
    private final wlc<Activity> c;

    private mim(wlc<hip> wlc, wlc<gkw> wlc2, wlc<Activity> wlc3) {
        this.a = wlc;
        this.b = wlc2;
        this.c = wlc3;
    }

    public static mim a(wlc<hip> wlc, wlc<gkw> wlc2, wlc<Activity> wlc3) {
        return new mim(wlc, wlc2, wlc3);
    }

    public final /* synthetic */ Object get() {
        return new mil((hip) this.a.get(), (gkw) this.b.get(), (Activity) this.c.get());
    }
}
