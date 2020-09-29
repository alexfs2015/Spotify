package defpackage;

import android.app.Activity;

/* renamed from: tcw reason: default package */
public final class tcw implements vua<tcv> {
    private final wlc<Activity> a;
    private final wlc<tcn> b;

    private tcw(wlc<Activity> wlc, wlc<tcn> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static tcw a(wlc<Activity> wlc, wlc<tcn> wlc2) {
        return new tcw(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return new tcv((Activity) this.a.get(), (tcn) this.b.get());
    }
}
