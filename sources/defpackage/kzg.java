package defpackage;

import android.app.Activity;
import android.app.ActivityManager;

/* renamed from: kzg reason: default package */
public final class kzg implements vua<ActivityManager> {
    private final wlc<Activity> a;

    public static ActivityManager a(Activity activity) {
        return (ActivityManager) vuf.a(CC.b(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
