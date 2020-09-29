package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: dir reason: default package */
final class dir implements ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public dir(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(diz diz) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                diz.a(activityLifecycleCallbacks);
                return;
            }
            if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception unused) {
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new dis(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new diy(activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new div(activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new diu(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new dix(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new dit(activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new diw(activity));
    }
}
