package defpackage;

import android.app.Activity;
import android.app.Application;
import android.app.Application.ActivityLifecycleCallbacks;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.util.Log;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.internal.FetchedAppSettingsManager;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: alg reason: default package */
public class alg {
    /* access modifiers changed from: private */
    public static final String a = alg.class.getCanonicalName();
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static volatile ScheduledFuture c;
    /* access modifiers changed from: private */
    public static final Object d = new Object();
    /* access modifiers changed from: private */
    public static AtomicInteger e = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public static volatile all f;
    private static AtomicBoolean g = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static String h;
    /* access modifiers changed from: private */
    public static long i;
    private static final ala j = new ala();
    private static final ald k = new ald();
    private static SensorManager l;
    /* access modifiers changed from: private */
    public static alc m;
    /* access modifiers changed from: private */
    public static String n = null;
    /* access modifiers changed from: private */
    public static Boolean o = Boolean.FALSE;
    /* access modifiers changed from: private */
    public static volatile Boolean p = Boolean.FALSE;
    private static int q = 0;

    static /* synthetic */ int g() {
        int i2 = q;
        q = i2 + 1;
        return i2;
    }

    static /* synthetic */ int h() {
        int i2 = q;
        q = i2 - 1;
        return i2;
    }

    public static void a(Application application, String str) {
        if (g.compareAndSet(false, true)) {
            h = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityCreated");
                    alg.c();
                }

                public final void onActivityStarted(Activity activity) {
                    alg.g();
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityStarted");
                }

                public final void onActivityResumed(Activity activity) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityResumed");
                    alg.a(activity);
                }

                public final void onActivityPaused(Activity activity) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityPaused");
                    alg.b(activity);
                }

                public final void onActivityStopped(Activity activity) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityStopped");
                    AppEventsLogger.b();
                    alg.h();
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivitySaveInstanceState");
                }

                public final void onActivityDestroyed(Activity activity) {
                    amp.a(LoggingBehavior.APP_EVENTS, alg.a, "onActivityDestroyed");
                }
            });
        }
    }

    public static boolean a() {
        return q == 0;
    }

    public static UUID b() {
        if (f != null) {
            return f.f;
        }
        return null;
    }

    public static void c() {
        b.execute(new Runnable() {
            public final void run() {
                all all;
                if (alg.f == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(akc.g());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                    aln aln = null;
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j == 0 || j2 == 0 || string == null) {
                        all = null;
                    } else {
                        all = new all(Long.valueOf(j), Long.valueOf(j2));
                        all.c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(akc.g());
                        String str = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
                        if (defaultSharedPreferences2.contains(str)) {
                            aln = new aln(defaultSharedPreferences2.getString(str, null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        }
                        all.e = aln;
                        all.d = Long.valueOf(System.currentTimeMillis());
                        all.f = UUID.fromString(string);
                    }
                    alg.f = all;
                }
            }
        });
    }

    public static void a(Activity activity) {
        e.incrementAndGet();
        r();
        final long currentTimeMillis = System.currentTimeMillis();
        i = currentTimeMillis;
        final String c2 = amw.c((Context) activity);
        ala ala = j;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ala.b.add(activity);
            ala.d.clear();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                ala.a();
            } else {
                ala.a.post(new Runnable() {
                    public final void run() {
                        ala.this.a();
                    }
                });
            }
            b.execute(new Runnable() {
                public final void run() {
                    if (alg.f == null) {
                        alg.f = new all(Long.valueOf(currentTimeMillis), null);
                        alm.a(c2, (aln) null, alg.h);
                    } else if (alg.f.b != null) {
                        long longValue = currentTimeMillis - alg.f.b.longValue();
                        if (longValue > ((long) (alg.k() * 1000))) {
                            alm.a(c2, alg.f, alg.h);
                            alm.a(c2, (aln) null, alg.h);
                            alg.f = new all(Long.valueOf(currentTimeMillis), null);
                        } else if (longValue > 1000) {
                            all i = alg.f;
                            i.c++;
                        }
                    }
                    alg.f.b = Long.valueOf(currentTimeMillis);
                    alg.f.a();
                }
            });
            Context applicationContext = activity.getApplicationContext();
            final String k2 = akc.k();
            final amg a2 = FetchedAppSettingsManager.a(k2);
            if (a2 != null && a2.j) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                l = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = l.getDefaultSensor(1);
                    m = new alc(activity);
                    k.a = new a() {
                        public final void a() {
                            amg amg = a2;
                            boolean z = amg != null && amg.j;
                            boolean o = akc.o();
                            if (z && o) {
                                alg.a(k2);
                            }
                        }
                    };
                    l.registerListener(k, defaultSensor, 2);
                    if (a2 != null && a2.j) {
                        m.a();
                    }
                } else {
                    return;
                }
            }
            return;
        }
        throw new FacebookException("Can't add activity to CodelessMatcher on non-UI thread");
    }

    private static void r() {
        synchronized (d) {
            if (c != null) {
                c.cancel(false);
            }
            c = null;
        }
    }

    public static void a(final String str) {
        if (!p.booleanValue()) {
            p = Boolean.TRUE;
            akc.e().execute(new Runnable() {
                /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
                /* JADX WARNING: Removed duplicated region for block: B:42:0x0109  */
                /* JADX WARNING: Removed duplicated region for block: B:43:0x010d  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void run() {
                    /*
                        r11 = this;
                        java.util.Locale r0 = java.util.Locale.US
                        r1 = 1
                        java.lang.Object[] r2 = new java.lang.Object[r1]
                        java.lang.String r3 = r2
                        r4 = 0
                        r2[r4] = r3
                        java.lang.String r3 = "%s/app_indexing_session"
                        java.lang.String r0 = java.lang.String.format(r0, r3, r2)
                        r2 = 0
                        akd r0 = defpackage.akd.a(r2, r0, r2, r2)
                        android.os.Bundle r3 = r0.d
                        if (r3 != 0) goto L_0x001e
                        android.os.Bundle r3 = new android.os.Bundle
                        r3.<init>()
                    L_0x001e:
                        android.content.Context r5 = defpackage.akc.g()
                        alu r5 = defpackage.alu.a(r5)
                        org.json.JSONArray r6 = new org.json.JSONArray
                        r6.<init>()
                        java.lang.String r7 = android.os.Build.MODEL
                        java.lang.String r8 = ""
                        if (r7 == 0) goto L_0x0034
                        java.lang.String r7 = android.os.Build.MODEL
                        goto L_0x0035
                    L_0x0034:
                        r7 = r8
                    L_0x0035:
                        r6.put(r7)
                        if (r5 == 0) goto L_0x0048
                        java.lang.String r7 = r5.a()
                        if (r7 == 0) goto L_0x0048
                        java.lang.String r5 = r5.a()
                        r6.put(r5)
                        goto L_0x004b
                    L_0x0048:
                        r6.put(r8)
                    L_0x004b:
                        java.lang.String r5 = "0"
                        r6.put(r5)
                        java.lang.String r7 = android.os.Build.FINGERPRINT
                        java.lang.String r8 = "generic"
                        boolean r7 = r7.startsWith(r8)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.FINGERPRINT
                        java.lang.String r9 = "unknown"
                        boolean r7 = r7.startsWith(r9)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.MODEL
                        java.lang.String r9 = "google_sdk"
                        boolean r7 = r7.contains(r9)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.MODEL
                        java.lang.String r10 = "Emulator"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.MODEL
                        java.lang.String r10 = "Android SDK built for x86"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.MANUFACTURER
                        java.lang.String r10 = "Genymotion"
                        boolean r7 = r7.contains(r10)
                        if (r7 != 0) goto L_0x00a7
                        java.lang.String r7 = android.os.Build.BRAND
                        boolean r7 = r7.startsWith(r8)
                        if (r7 == 0) goto L_0x009c
                        java.lang.String r7 = android.os.Build.DEVICE
                        boolean r7 = r7.startsWith(r8)
                        if (r7 != 0) goto L_0x00a7
                    L_0x009c:
                        java.lang.String r7 = android.os.Build.PRODUCT
                        boolean r7 = r9.equals(r7)
                        if (r7 == 0) goto L_0x00a5
                        goto L_0x00a7
                    L_0x00a5:
                        r7 = 0
                        goto L_0x00a8
                    L_0x00a7:
                        r7 = 1
                    L_0x00a8:
                        if (r7 == 0) goto L_0x00ac
                        java.lang.String r5 = "1"
                    L_0x00ac:
                        r6.put(r5)
                        java.util.Locale r5 = defpackage.amw.a()
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = r5.getLanguage()
                        r7.append(r8)
                        java.lang.String r8 = "_"
                        r7.append(r8)
                        java.lang.String r5 = r5.getCountry()
                        r7.append(r5)
                        java.lang.String r5 = r7.toString()
                        r6.put(r5)
                        java.lang.String r5 = r6.toString()
                        java.lang.String r6 = defpackage.alg.d()
                        java.lang.String r7 = "device_session_id"
                        r3.putString(r7, r6)
                        java.lang.String r6 = "extinfo"
                        r3.putString(r6, r5)
                        r0.d = r3
                        akg r0 = defpackage.akd.a(r0)
                        org.json.JSONObject r0 = r0.a
                        if (r0 == 0) goto L_0x00f7
                        java.lang.String r3 = "is_app_indexing_enabled"
                        boolean r0 = r0.optBoolean(r3, r4)
                        if (r0 == 0) goto L_0x00f7
                        goto L_0x00f8
                    L_0x00f7:
                        r1 = 0
                    L_0x00f8:
                        java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
                        defpackage.alg.o = r0
                        java.lang.Boolean r0 = defpackage.alg.o
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L_0x010d
                        defpackage.alg.n = null
                        goto L_0x0114
                    L_0x010d:
                        alc r0 = defpackage.alg.m
                        r0.a()
                    L_0x0114:
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        defpackage.alg.p = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.alg.AnonymousClass6.run():void");
                }
            });
        }
    }

    public static String d() {
        if (n == null) {
            n = UUID.randomUUID().toString();
        }
        return n;
    }

    public static boolean e() {
        return o.booleanValue();
    }

    public static void a(Boolean bool) {
        o = bool;
    }

    static /* synthetic */ void b(Activity activity) {
        if (e.decrementAndGet() < 0) {
            e.set(0);
        }
        r();
        final long currentTimeMillis = System.currentTimeMillis();
        final String c2 = amw.c((Context) activity);
        ala ala = j;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            ala.b.remove(activity);
            ala.c.clear();
            ala.d.clear();
            b.execute(new Runnable() {
                public final void run() {
                    if (alg.f == null) {
                        alg.f = new all(Long.valueOf(currentTimeMillis), null);
                    }
                    alg.f.b = Long.valueOf(currentTimeMillis);
                    if (alg.e.get() <= 0) {
                        AnonymousClass1 r0 = new Runnable() {
                            public final void run() {
                                if (alg.e.get() <= 0) {
                                    alm.a(c2, alg.f, alg.h);
                                    Editor edit = PreferenceManager.getDefaultSharedPreferences(akc.g()).edit();
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                    edit.apply();
                                    Editor edit2 = PreferenceManager.getDefaultSharedPreferences(akc.g()).edit();
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                    edit2.apply();
                                    alg.f = null;
                                }
                                synchronized (alg.d) {
                                    alg.c = null;
                                }
                            }
                        };
                        synchronized (alg.d) {
                            alg.c = alg.b.schedule(r0, (long) alg.k(), TimeUnit.SECONDS);
                        }
                    }
                    long o = alg.i;
                    long j = 0;
                    if (o > 0) {
                        j = (currentTimeMillis - o) / 1000;
                    }
                    ali.a(c2, j);
                    alg.f.a();
                }
            });
            alc alc = m;
            if (!(alc == null || ((Activity) alc.b.get()) == null || alc.c == null)) {
                try {
                    alc.c.cancel();
                    alc.c = null;
                } catch (Exception e2) {
                    Log.e(alc.a, "Error unscheduling indexing job", e2);
                }
            }
            SensorManager sensorManager = l;
            if (sensorManager != null) {
                sensorManager.unregisterListener(k);
                return;
            }
            return;
        }
        throw new FacebookException("Can't remove activity from CodelessMatcher on non-UI thread");
    }

    static /* synthetic */ int k() {
        amg a2 = FetchedAppSettingsManager.a(akc.k());
        if (a2 == null) {
            return 60;
        }
        return a2.e;
    }
}
