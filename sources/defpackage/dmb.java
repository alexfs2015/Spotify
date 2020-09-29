package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: dmb reason: default package */
final class dmb implements dmh {
    private final /* synthetic */ Activity a;

    dmb(Activity activity) {
        this.a = activity;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}
