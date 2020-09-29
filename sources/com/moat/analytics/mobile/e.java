package com.moat.analytics.mobile;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.os.Bundle;
import com.moat.analytics.mobile.base.exception.a;

class e implements ActivityLifecycleCallbacks {
    final /* synthetic */ c a;

    private e(c cVar) {
        this.a = cVar;
    }

    private boolean a(Activity activity) {
        Activity activity2 = (Activity) this.a.b.get();
        return activity2 != null && activity2.equals(activity);
    }

    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public void onActivityDestroyed(Activity activity) {
        try {
            if (this.a.d.b()) {
                StringBuilder sb = new StringBuilder("Activity destroyed: ");
                sb.append(activity.getClass());
                sb.append("@");
                sb.append(activity.hashCode());
            }
            if (a(activity)) {
                this.a.e = false;
                ((Application) this.a.a.get()).unregisterActivityLifecycleCallbacks(this);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }

    public void onActivityPaused(Activity activity) {
        if (this.a.d.b()) {
            StringBuilder sb = new StringBuilder("Activity paused: ");
            sb.append(activity.getClass());
            sb.append("@");
            sb.append(activity.hashCode());
        }
        if (a(activity)) {
            this.a.e = true;
        }
    }

    public void onActivityResumed(Activity activity) {
        if (this.a.d.b()) {
            StringBuilder sb = new StringBuilder("Activity resumed: ");
            sb.append(activity.getClass());
            sb.append("@");
            sb.append(activity.hashCode());
        }
        if (a(activity)) {
            this.a.e = false;
        }
    }

    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public void onActivityStarted(Activity activity) {
        if (this.a.d.b()) {
            StringBuilder sb = new StringBuilder("Activity started: ");
            sb.append(activity.getClass());
            sb.append("@");
            sb.append(activity.hashCode());
        }
        if (a(activity)) {
            this.a.e = false;
        }
    }

    public void onActivityStopped(Activity activity) {
        if (this.a.d.b()) {
            StringBuilder sb = new StringBuilder("Activity stopped: ");
            sb.append(activity.getClass());
            sb.append("@");
            sb.append(activity.hashCode());
        }
        if (a(activity)) {
            this.a.e = true;
        }
    }
}
