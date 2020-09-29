package defpackage;

import android.app.Activity;

/* renamed from: tyh reason: default package */
public final class tyh implements vua<wum> {
    private final wlc<Activity> a;

    private tyh(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static tyh a(wlc<Activity> wlc) {
        return new tyh(wlc);
    }

    public final /* synthetic */ Object get() {
        return (wum) vuf.a(CC.a((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
