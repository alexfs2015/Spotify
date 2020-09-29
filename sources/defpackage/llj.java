package defpackage;

import android.app.Activity;

/* renamed from: llj reason: default package */
public final class llj implements vua<vof> {
    private final wlc<Activity> a;

    private llj(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static llj a(wlc<Activity> wlc) {
        return new llj(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vof) vuf.a(new vof((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
