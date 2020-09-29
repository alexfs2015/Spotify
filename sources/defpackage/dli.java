package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: dli reason: default package */
final class dli implements ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public dli(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(dlq dlq) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                dlq.a(activityLifecycleCallbacks);
                return;
            }
            if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception e) {
            clu.a("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new dlj(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new dlp(activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new dlm(activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new dll(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new dlo(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new dlk(activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new dln(activity));
    }
}
