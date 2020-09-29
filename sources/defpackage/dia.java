package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: dia reason: default package */
final class dia implements ActivityLifecycleCallbacks {
    private final Application a;
    private final WeakReference<ActivityLifecycleCallbacks> b;
    private boolean c = false;

    public dia(Application application, ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = new WeakReference<>(activityLifecycleCallbacks);
        this.a = application;
    }

    private final void a(dii dii) {
        try {
            ActivityLifecycleCallbacks activityLifecycleCallbacks = (ActivityLifecycleCallbacks) this.b.get();
            if (activityLifecycleCallbacks != null) {
                dii.a(activityLifecycleCallbacks);
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
        a(new dib(activity, bundle));
    }

    public final void onActivityDestroyed(Activity activity) {
        a(new dih(activity));
    }

    public final void onActivityPaused(Activity activity) {
        a(new die(activity));
    }

    public final void onActivityResumed(Activity activity) {
        a(new did(activity));
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new dig(activity, bundle));
    }

    public final void onActivityStarted(Activity activity) {
        a(new dic(activity));
    }

    public final void onActivityStopped(Activity activity) {
        a(new dif(activity));
    }
}
