package defpackage;

import android.app.Activity;

/* renamed from: jjc reason: default package */
public final class jjc implements vua<jjb> {
    private final wlc<Activity> a;

    private jjc(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static jjc a(wlc<Activity> wlc) {
        return new jjc(wlc);
    }

    public final /* synthetic */ Object get() {
        return new jjb((Activity) this.a.get());
    }
}
