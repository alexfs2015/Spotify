package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: diw reason: default package */
final class diw implements diz {
    private final /* synthetic */ Activity a;

    diw(Activity activity) {
        this.a = activity;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStopped(this.a);
    }
}
