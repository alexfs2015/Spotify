package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bth reason: default package */
public final class bth implements ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private static final bth c = new bth();
    final AtomicBoolean a = new AtomicBoolean();
    final AtomicBoolean b = new AtomicBoolean();
    private final ArrayList<a> d = new ArrayList<>();
    private boolean e = false;

    /* renamed from: bth$a */
    public interface a {
        void a(boolean z);
    }

    private bth() {
    }

    public static bth a() {
        return c;
    }

    public static void a(Application application) {
        synchronized (c) {
            if (!c.e) {
                application.registerActivityLifecycleCallbacks(c);
                application.registerComponentCallbacks(c);
                c.e = true;
            }
        }
    }

    private final void a(boolean z) {
        synchronized (c) {
            ArrayList arrayList = this.d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((a) obj).a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (c) {
            this.d.add(aVar);
        }
    }

    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivityDestroyed(Activity activity) {
    }

    public final void onActivityPaused(Activity activity) {
    }

    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.a.compareAndSet(true, false);
        this.b.set(true);
        if (compareAndSet) {
            a(false);
        }
    }

    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    public final void onActivityStarted(Activity activity) {
    }

    public final void onActivityStopped(Activity activity) {
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
    }

    public final void onTrimMemory(int i) {
        if (i == 20 && this.a.compareAndSet(false, true)) {
            this.b.set(true);
            a(true);
        }
    }
}
