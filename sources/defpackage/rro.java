package defpackage;

import android.app.Activity;

/* renamed from: rro reason: default package */
public final class rro implements vua<rrj> {
    private final wlc<rrk> a;
    private final wlc<Activity> b;

    private rro(wlc<rrk> wlc, wlc<Activity> wlc2) {
        this.a = wlc;
        this.b = wlc2;
    }

    public static rro a(wlc<rrk> wlc, wlc<Activity> wlc2) {
        return new rro(wlc, wlc2);
    }

    public final /* synthetic */ Object get() {
        return (rrj) vuf.a(((rrk) this.a.get()).a(((Activity) this.b.get()).getClass().getSimpleName()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
