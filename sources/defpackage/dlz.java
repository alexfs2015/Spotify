package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: dlz reason: default package */
final class dlz implements ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public dlz(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(dmh dmh) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                dmh.a(activityLifecycleCallbacks);
                return;
            }
            if (!this.c) {
                this.a.unregisterActivityLifecycleCallbacks(this);
                this.c = true;
            }
        } catch (Exception e) {
            cml.a("Error while dispatching lifecycle callback.", e);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new dma(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new dmg(activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new dmd(activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new dmc(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new dmf(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new dmb(activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new dme(activity));
    }
}
