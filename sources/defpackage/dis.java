package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: dis reason: default package */
final class dis implements diz {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ Bundle b;

    dis(Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
    }
}
