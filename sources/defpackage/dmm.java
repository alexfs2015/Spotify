package defpackage;

import android.app.Activity;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: dmm reason: default package */
public final class dmm implements ActivityLifecycleCallbacks {
    Activity a;
    public Context b;
    public boolean c = false;
    public long d;
    /* access modifiers changed from: private */
    public final Object e = new Object();
    /* access modifiers changed from: private */
    public boolean f = true;
    /* access modifiers changed from: private */
    public boolean g = false;
    /* access modifiers changed from: private */
    public final List<dmo> h = new ArrayList();
    private final List<dnb> i = new ArrayList();
    private Runnable j;

    public final void a(Activity activity) {
        synchronized (this.e) {
            if (!activity.getClass().getName().startsWith("com.google.android.gms.ads")) {
                this.a = activity;
            }
        }
    }

    public final void a(dmo dmo) {
        synchronized (this.e) {
            this.h.add(dmo);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.e) {
            if (this.a != null) {
                if (this.a.equals(activity)) {
                    this.a = null;
                }
                Iterator it = this.i.iterator();
                while (it.hasNext()) {
                    try {
                        if (((dnb) it.next()).a()) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        bkc.i().a((Throwable) e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        cpn.a("", e2);
                    }
                }
            }
        }
    }

    public final void onActivityPaused(Activity activity) {
        a(activity);
        synchronized (this.e) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                it.next();
            }
        }
        this.g = true;
        if (this.j != null) {
            cmu.a.removeCallbacks(this.j);
        }
        Handler handler = cmu.a;
        dmn dmn = new dmn(this);
        this.j = dmn;
        handler.postDelayed(dmn, this.d);
    }

    public final void onActivityResumed(Activity activity) {
        a(activity);
        this.g = false;
        boolean z = !this.f;
        this.f = true;
        if (this.j != null) {
            cmu.a.removeCallbacks(this.j);
        }
        synchronized (this.e) {
            Iterator it = this.i.iterator();
            while (it.hasNext()) {
                it.next();
            }
            if (z) {
                for (dmo a2 : this.h) {
                    try {
                        a2.a(true);
                    } catch (Exception e2) {
                        cpn.a("", e2);
                    }
                }
            } else {
                cpn.a(3);
            }
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
        a(activity);
    }

    public final void onActivityStopped(Activity activity) {
    }
}
