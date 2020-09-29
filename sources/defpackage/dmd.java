package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: dmd reason: default package */
final class dmd implements dmh {
    private final /* synthetic */ Activity a;

    dmd(Activity activity) {
        this.a = activity;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
