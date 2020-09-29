package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;

/* renamed from: div reason: default package */
final class div implements diz {
    private final /* synthetic */ Activity a;

    div(Activity activity) {
        this.a = activity;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityPaused(this.a);
    }
}
