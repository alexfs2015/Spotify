package defpackage;

import android.app.Activity;

/* renamed from: qse reason: default package */
public final class qse implements vua<qsd> {
    private final wlc<Activity> a;

    private qse(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static qse a(wlc<Activity> wlc) {
        return new qse(wlc);
    }

    public final /* synthetic */ Object get() {
        return new qsd(this.a);
    }
}
