package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.reflect.Method;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

@cfp
/* renamed from: clg reason: default package */
public final class clg {
    public final AtomicReference<Object> a = new AtomicReference<>(null);
    private final AtomicReference<ThreadPoolExecutor> b = new AtomicReference<>(null);
    private final Object c = new Object();
    private String d = null;
    private final AtomicBoolean e = new AtomicBoolean(false);
    private final AtomicInteger f = new AtomicInteger(-1);
    private final AtomicReference<Object> g = new AtomicReference<>(null);
    private ConcurrentMap<String, Method> h = new ConcurrentHashMap(9);

    static Bundle a(String str, boolean z) {
        Bundle bundle = new Bundle();
        try {
            bundle.putLong("_aeid", Long.parseLong(str));
        } catch (NullPointerException | NumberFormatException e2) {
            String str2 = "Invalid event ID: ";
            String valueOf = String.valueOf(str);
            cml.a(valueOf.length() != 0 ? str2.concat(valueOf) : new String(str2), e2);
        }
        if (z) {
            bundle.putInt("_r", 1);
        }
        return bundle;
    }

    private final void b(Context context, String str, String str2) {
        if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            Method g2 = g(context, str2);
            try {
                g2.invoke(this.g.get(), new Object[]{str});
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 37 + String.valueOf(str).length());
                sb.append("Invoke Firebase method ");
                sb.append(str2);
                sb.append(", Ad Unit Id: ");
                sb.append(str);
                sb.toString();
                cml.a();
            } catch (Exception unused) {
                b(str2, false);
            }
        }
    }

    private final Method g(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class});
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            b(str, false);
            return null;
        }
    }

    private final Method h(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[0]);
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            b(str, false);
            return null;
        }
    }

    private final Method j(Context context) {
        String str = "logEventInternal";
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.android.gms.measurement.AppMeasurement").getDeclaredMethod(str, new Class[]{String.class, String.class, Bundle.class});
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            b(str, true);
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final Object a(String str, Context context) {
        Object obj = null;
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return null;
        }
        try {
            obj = h(context, str).invoke(this.g.get(), new Object[0]);
        } catch (Exception unused) {
            b(str, true);
        }
        return obj;
    }

    public final void a(Context context, String str) {
        if (a(context)) {
            b(context, str, "beginAdUnitExposure");
        }
    }

    /* access modifiers changed from: 0000 */
    public final void a(Context context, String str, Bundle bundle) {
        if (a(context)) {
            if (a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
                Method j = j(context);
                try {
                    j.invoke(this.g.get(), new Object[]{"am", str, bundle});
                } catch (Exception unused) {
                    b("logEventInternal", true);
                }
            }
        }
    }

    public final void a(Context context, String str, String str2) {
        if (a(context)) {
            a(context, str, a(str2, "_ac".equals(str)));
        }
    }

    public final boolean a(Context context) {
        if (((Boolean) dqe.f().a(dtg.aj)).booleanValue() && !this.e.get()) {
            if (this.f.get() == -1) {
                dqe.a();
                if (!cpc.c(context)) {
                    dqe.a();
                    if (cpc.f(context)) {
                        cpn.a(5);
                        this.f.set(0);
                    }
                }
                this.f.set(1);
            }
            if (this.f.get() == 1) {
                return true;
            }
        }
        return false;
    }

    public final boolean a(Context context, String str, AtomicReference<Object> atomicReference, boolean z) {
        String str2 = "getInstance";
        if (atomicReference.get() == null) {
            try {
                atomicReference.compareAndSet(null, context.getClassLoader().loadClass(str).getDeclaredMethod(str2, new Class[]{Context.class}).invoke(null, new Object[]{context}));
            } catch (Exception unused) {
                b(str2, z);
                return false;
            }
        }
        return true;
    }

    public final void b(Context context, String str) {
        if (a(context)) {
            b(context, str, "endAdUnitExposure");
        }
    }

    public final void b(String str, boolean z) {
        if (!this.e.get()) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 30);
            sb.append("Invoke Firebase method ");
            sb.append(str);
            sb.append(" error.");
            sb.toString();
            cpn.a(5);
            if (z) {
                cpn.a(5);
                this.e.set(true);
            }
        }
    }

    public final boolean b(Context context) {
        return ((Boolean) dqe.f().a(dtg.ak)).booleanValue() && a(context);
    }

    public final void c(Context context, String str) {
        a(context, "_ac", str);
    }

    public final boolean c(Context context) {
        return ((Boolean) dqe.f().a(dtg.al)).booleanValue() && a(context);
    }

    public final void d(Context context, String str) {
        a(context, "_ai", str);
    }

    public final boolean d(Context context) {
        return ((Boolean) dqe.f().a(dtg.am)).booleanValue() && a(context);
    }

    public final void e(Context context, String str) {
        a(context, "_aq", str);
    }

    public final boolean e(Context context) {
        return ((Boolean) dqe.f().a(dtg.an)).booleanValue() && a(context);
    }

    public final String f(Context context) {
        String str = "getCurrentScreenName";
        String str2 = "";
        if (!a(context)) {
            return str2;
        }
        if (!a(context, "com.google.android.gms.measurement.AppMeasurement", this.g, true)) {
            return str2;
        }
        try {
            String str3 = (String) h(context, str).invoke(this.g.get(), new Object[0]);
            if (str3 == null) {
                str3 = (String) h(context, "getCurrentScreenClass").invoke(this.g.get(), new Object[0]);
            }
            return str3 != null ? str3 : str2;
        } catch (Exception unused) {
            b(str, false);
            return str2;
        }
    }

    public final Method f(Context context, String str) {
        Method method = (Method) this.h.get(str);
        if (method != null) {
            return method;
        }
        try {
            Method declaredMethod = context.getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod(str, new Class[]{Activity.class, String.class, String.class});
            this.h.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception unused) {
            b(str, false);
            return null;
        }
    }

    public final String g(Context context) {
        if (!a(context)) {
            return null;
        }
        synchronized (this.c) {
            if (this.d != null) {
                String str = this.d;
                return str;
            }
            this.d = (String) a("getGmpAppId", context);
            String str2 = this.d;
            return str2;
        }
    }

    public final String h(Context context) {
        if (!a(context)) {
            return null;
        }
        long longValue = ((Long) dqe.f().a(dtg.at)).longValue();
        if (longValue < 0) {
            return (String) a("getAppInstanceId", context);
        }
        if (this.b.get() == null) {
            AtomicReference<ThreadPoolExecutor> atomicReference = this.b;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(((Integer) dqe.f().a(dtg.au)).intValue(), ((Integer) dqe.f().a(dtg.au)).intValue(), 1, TimeUnit.MINUTES, new LinkedBlockingQueue(), new clj());
            atomicReference.compareAndSet(null, threadPoolExecutor);
        }
        Future submit = ((ThreadPoolExecutor) this.b.get()).submit(new clh(this, context));
        try {
            return (String) submit.get(longValue, TimeUnit.MILLISECONDS);
        } catch (Exception e2) {
            submit.cancel(true);
            if (e2 instanceof TimeoutException) {
                return "TIME_OUT";
            }
            return null;
        }
    }

    public final String i(Context context) {
        if (!a(context)) {
            return null;
        }
        Object a2 = a("generateEventId", context);
        if (a2 != null) {
            return a2.toString();
        }
        return null;
    }
}
