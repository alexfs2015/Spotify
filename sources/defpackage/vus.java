package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Set;

/* renamed from: vus reason: default package */
public final class vus {
    private final Application a;
    private a b;

    /* renamed from: vus$a */
    static class a {
        private final Set<ActivityLifecycleCallbacks> a = new HashSet();
        private final Application b;

        a(Application application) {
            this.b = application;
        }

        /* access modifiers changed from: 0000 */
        public void a() {
            for (ActivityLifecycleCallbacks unregisterActivityLifecycleCallbacks : this.a) {
                this.b.unregisterActivityLifecycleCallbacks(unregisterActivityLifecycleCallbacks);
            }
        }

        /* access modifiers changed from: 0000 */
        public boolean a(final b bVar) {
            if (this.b == null) {
                return false;
            }
            AnonymousClass1 r0 = new ActivityLifecycleCallbacks() {
                public final void onActivityDestroyed(Activity activity) {
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                }

                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    bVar.a(activity);
                }

                public final void onActivityStarted(Activity activity) {
                    bVar.b(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    bVar.c(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    bVar.d(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    bVar.e(activity);
                }
            };
            this.b.registerActivityLifecycleCallbacks(r0);
            this.a.add(r0);
            return true;
        }
    }

    /* renamed from: vus$b */
    public static abstract class b {
        public void a(Activity activity) {
        }

        public void b(Activity activity) {
        }

        public void c(Activity activity) {
        }

        public void d(Activity activity) {
        }

        public void e(Activity activity) {
        }
    }

    public vus(Context context) {
        this.a = (Application) context.getApplicationContext();
        if (VERSION.SDK_INT >= 14) {
            this.b = new a(this.a);
        }
    }

    public final boolean a(b bVar) {
        a aVar = this.b;
        return aVar != null && aVar.a(bVar);
    }

    public final void a() {
        a aVar = this.b;
        if (aVar != null) {
            aVar.a();
        }
    }
}
