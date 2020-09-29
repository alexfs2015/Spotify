package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: diy reason: default package */
final class diy implements diz {
    private final /* synthetic */ Activity a;

    diy(Activity activity) {
        this.a = activity;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityDestroyed(this.a);
    }
}
