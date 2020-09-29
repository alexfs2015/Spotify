package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.util.Log;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

/* renamed from: fc reason: default package */
final class fc {
    protected static final Method a = a(c);
    protected static final Method b = b(c);
    private static Class<?> c = d();
    private static Field d = b();
    private static Field e = c();
    private static Method f = c(c);
    private static final Handler g = new Handler(Looper.getMainLooper());

    /* renamed from: fc$a */
    static final class a implements ActivityLifecycleCallbacks {
        Object a;
        private Activity b;
        private boolean c = false;
        private boolean d = false;
        private boolean e = false;

        a(Activity activity) {
            this.b = activity;
        }

        public final void onActivityCreated(Activity activity, Bundle bundle) {
        }

        public final void onActivityDestroyed(Activity activity) {
            if (this.b == activity) {
                this.b = null;
                this.d = true;
            }
        }

        public final void onActivityPaused(Activity activity) {
            if (this.d && !this.e && !this.c && fc.a(this.a, activity)) {
                this.e = true;
                this.a = null;
            }
        }

        public final void onActivityResumed(Activity activity) {
        }

        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        public final void onActivityStarted(Activity activity) {
            if (this.b == activity) {
                this.c = true;
            }
        }

        public final void onActivityStopped(Activity activity) {
        }
    }

    private static Method a(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE, String.class});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static boolean a() {
        return VERSION.SDK_INT == 26 || VERSION.SDK_INT == 27;
    }

    static boolean a(Activity activity) {
        final Application application;
        final a aVar;
        if (VERSION.SDK_INT >= 28) {
            activity.recreate();
            return true;
        } else if (a() && f == null) {
            return false;
        } else {
            if (b == null && a == null) {
                return false;
            }
            try {
                final Object obj = e.get(activity);
                if (obj == null) {
                    return false;
                }
                Object obj2 = d.get(activity);
                if (obj2 == null) {
                    return false;
                }
                application = activity.getApplication();
                aVar = new a(activity);
                application.registerActivityLifecycleCallbacks(aVar);
                g.post(new Runnable() {
                    public final void run() {
                        aVar.a = obj;
                    }
                });
                if (a()) {
                    f.invoke(obj2, new Object[]{obj, null, null, Integer.valueOf(0), Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE});
                } else {
                    activity.recreate();
                }
                g.post(new Runnable() {
                    public final void run() {
                        application.unregisterActivityLifecycleCallbacks(aVar);
                    }
                });
                return true;
            } catch (Throwable unused) {
                return false;
            }
        }
    }

    protected static boolean a(Object obj, Activity activity) {
        try {
            final Object obj2 = e.get(activity);
            if (obj2 != obj) {
                return false;
            }
            final Object obj3 = d.get(activity);
            g.postAtFrontOfQueue(new Runnable() {
                public final void run() {
                    try {
                        if (fc.a != null) {
                            fc.a.invoke(obj3, new Object[]{obj2, Boolean.FALSE, "AppCompat recreation"});
                            return;
                        }
                        fc.b.invoke(obj3, new Object[]{obj2, Boolean.FALSE});
                    } catch (RuntimeException e) {
                        if (e.getClass() == RuntimeException.class && e.getMessage() != null && e.getMessage().startsWith("Unable to stop")) {
                            throw e;
                        }
                    } catch (Throwable th) {
                        Log.e("ActivityRecreator", "Exception while invoking performStopActivity", th);
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            Log.e("ActivityRecreator", "Exception while fetching field values", th);
            return false;
        }
    }

    private static Field b() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mMainThread");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method b(Class<?> cls) {
        if (cls == null) {
            return null;
        }
        try {
            Method declaredMethod = cls.getDeclaredMethod("performStopActivity", new Class[]{IBinder.class, Boolean.TYPE});
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Field c() {
        try {
            Field declaredField = Activity.class.getDeclaredField("mToken");
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static Method c(Class<?> cls) {
        if (a() && cls != null) {
            try {
                Method declaredMethod = cls.getDeclaredMethod("requestRelaunchActivity", new Class[]{IBinder.class, List.class, List.class, Integer.TYPE, Boolean.TYPE, Configuration.class, Configuration.class, Boolean.TYPE, Boolean.TYPE});
                declaredMethod.setAccessible(true);
                return declaredMethod;
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    private static Class<?> d() {
        try {
            return Class.forName("android.app.ActivityThread");
        } catch (Throwable unused) {
            return null;
        }
    }
}
