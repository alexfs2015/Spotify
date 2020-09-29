package defpackage;

import android.app.Activity;

/* renamed from: jjo reason: default package */
public final class jjo implements vua<jjn> {
    private final wlc<Activity> a;

    private jjo(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static jjo a(wlc<Activity> wlc) {
        return new jjo(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jjn((Activity) this.a.get());
    }
}
