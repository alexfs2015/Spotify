package defpackage;

import android.app.Activity;

/* renamed from: vku reason: default package */
public final class vku implements vua<vnk> {
    private final wlc<Activity> a;

    private vku(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static vku a(wlc<Activity> wlc) {
        return new vku(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vnk) vuf.a(new vnk((ka) ((Activity) this.a.get()), brx.a()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
