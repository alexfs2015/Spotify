package defpackage;

import android.app.Activity;
import android.app.ActivityManager;

/* renamed from: lcp reason: default package */
public final class lcp implements wig<ActivityManager> {
    private final wzi<Activity> a;

    public static ActivityManager a(Activity activity) {
        return (ActivityManager) wil.a(CC.b(activity), "Cannot return null from a non-@Nullable @Provides method");
    }

    public final /* synthetic */ Object get() {
        return a((Activity) this.a.get());
    }
}
