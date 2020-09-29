package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;

/* renamed from: dmf reason: default package */
final class dmf implements dmh {
    private final /* synthetic */ Activity a;
    private final /* synthetic */ Bundle b;

    dmf(Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    public final void a(ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
    }
}
