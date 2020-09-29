package defpackage;

import android.app.Activity;

/* renamed from: vkv reason: default package */
public final class vkv implements vua<vof> {
    private final wlc<Activity> a;

    private vkv(wlc<Activity> wlc) {
        this.a = wlc;
    }

    public static vkv a(wlc<Activity> wlc) {
        return new vkv(wlc);
    }

    public final /* synthetic */ Object get() {
        return (vof) vuf.a(new vof((Activity) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
