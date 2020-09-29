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

/* renamed from: alu reason: default package */
public class alu {
    /* access modifiers changed from: private */
    public static final String a = alu.class.getCanonicalName();
    /* access modifiers changed from: private */
    public static final ScheduledExecutorService b = Executors.newSingleThreadScheduledExecutor();
    /* access modifiers changed from: private */
    public static volatile ScheduledFuture c;
    /* access modifiers changed from: private */
    public static final Object d = new Object();
    /* access modifiers changed from: private */
    public static AtomicInteger e = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public static volatile alz f;
    private static AtomicBoolean g = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public static String h;
    /* access modifiers changed from: private */
    public static long i;
    private static final alo j = new alo();
    private static final alr k = new alr();
    private static SensorManager l;
    /* access modifiers changed from: private */
    public static alq m;
    /* access modifiers changed from: private */
    public static String n = null;
    /* access modifiers changed from: private */
    public static Boolean o = Boolean.FALSE;
    /* access modifiers changed from: private */
    public static volatile Boolean p = Boolean.FALSE;
    private static int q = 0;

    public static void a(Activity activity) {
        e.incrementAndGet();
        r();
        final long currentTimeMillis = System.currentTimeMillis();
        i = currentTimeMillis;
        final String c2 = ank.c((Context) activity);
        alo alo = j;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            alo.b.add(activity);
            alo.d.clear();
            if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
                alo.a();
            } else {
                alo.a.post(new Runnable() {
                    public final void run() {
                        alo.this.a();
                    }
                });
            }
            b.execute(new Runnable() {
                public final void run() {
                    if (alu.f == null) {
                        alu.f = new alz(Long.valueOf(currentTimeMillis), null);
                        ama.a(c2, (amb) null, alu.h);
                    } else if (alu.f.b != null) {
                        long longValue = currentTimeMillis - alu.f.b.longValue();
                        if (longValue > ((long) (alu.k() * 1000))) {
                            ama.a(c2, alu.f, alu.h);
                            ama.a(c2, (amb) null, alu.h);
                            alu.f = new alz(Long.valueOf(currentTimeMillis), null);
                        } else if (longValue > 1000) {
                            alz i = alu.f;
                            i.c++;
                        }
                    }
                    alu.f.b = Long.valueOf(currentTimeMillis);
                    alu.f.a();
                }
            });
            Context applicationContext = activity.getApplicationContext();
            final String k2 = akq.k();
            final amu a2 = FetchedAppSettingsManager.a(k2);
            if (a2 != null && a2.j) {
                SensorManager sensorManager = (SensorManager) applicationContext.getSystemService("sensor");
                l = sensorManager;
                if (sensorManager != null) {
                    Sensor defaultSensor = l.getDefaultSensor(1);
                    m = new alq(activity);
                    k.a = new a() {
                        public final void a() {
                            amu amu = a2;
                            boolean z = amu != null && amu.j;
                            boolean o = akq.o();
                            if (z && o) {
                                alu.a(k2);
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

    public static void a(Application application, String str) {
        if (g.compareAndSet(false, true)) {
            h = str;
            application.registerActivityLifecycleCallbacks(new ActivityLifecycleCallbacks() {
                public final void onActivityCreated(Activity activity, Bundle bundle) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityCreated");
                    alu.c();
                }

                public final void onActivityDestroyed(Activity activity) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityDestroyed");
                }

                public final void onActivityPaused(Activity activity) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityPaused");
                    alu.b(activity);
                }

                public final void onActivityResumed(Activity activity) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityResumed");
                    alu.a(activity);
                }

                public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivitySaveInstanceState");
                }

                public final void onActivityStarted(Activity activity) {
                    alu.g();
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityStarted");
                }

                public final void onActivityStopped(Activity activity) {
                    and.a(LoggingBehavior.APP_EVENTS, alu.a, "onActivityStopped");
                    AppEventsLogger.b();
                    alu.h();
                }
            });
        }
    }

    public static void a(Boolean bool) {
        o = bool;
    }

    public static void a(final String str) {
        if (!p.booleanValue()) {
            p = Boolean.TRUE;
            akq.e().execute(new Runnable() {
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
                        akr r0 = defpackage.akr.a(r2, r0, r2, r2)
                        android.os.Bundle r3 = r0.d
                        if (r3 != 0) goto L_0x001e
                        android.os.Bundle r3 = new android.os.Bundle
                        r3.<init>()
                    L_0x001e:
                        android.content.Context r5 = defpackage.akq.g()
                        ami r5 = defpackage.ami.a(r5)
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
                        java.util.Locale r5 = defpackage.ank.a()
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
                        java.lang.String r6 = defpackage.alu.d()
                        java.lang.String r7 = "device_session_id"
                        r3.putString(r7, r6)
                        java.lang.String r6 = "extinfo"
                        r3.putString(r6, r5)
                        r0.d = r3
                        aku r0 = defpackage.akr.a(r0)
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
                        defpackage.alu.o = r0
                        java.lang.Boolean r0 = defpackage.alu.o
                        boolean r0 = r0.booleanValue()
                        if (r0 != 0) goto L_0x010d
                        defpackage.alu.n = null
                        goto L_0x0114
                    L_0x010d:
                        alq r0 = defpackage.alu.m
                        r0.a()
                    L_0x0114:
                        java.lang.Boolean r0 = java.lang.Boolean.FALSE
                        defpackage.alu.p = r0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.alu.AnonymousClass6.run():void");
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

    static /* synthetic */ void b(Activity activity) {
        if (e.decrementAndGet() < 0) {
            e.set(0);
        }
        r();
        final long currentTimeMillis = System.currentTimeMillis();
        final String c2 = ank.c((Context) activity);
        alo alo = j;
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            alo.b.remove(activity);
            alo.c.clear();
            alo.d.clear();
            b.execute(new Runnable() {
                public final void run() {
                    if (alu.f == null) {
                        alu.f = new alz(Long.valueOf(currentTimeMillis), null);
                    }
                    alu.f.b = Long.valueOf(currentTimeMillis);
                    if (alu.e.get() <= 0) {
                        AnonymousClass1 r0 = new Runnable() {
                            public final void run() {
                                if (alu.e.get() <= 0) {
                                    ama.a(c2, alu.f, alu.h);
                                    Editor edit = PreferenceManager.getDefaultSharedPreferences(akq.g()).edit();
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionStartTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionEndTime");
                                    edit.remove("com.facebook.appevents.SessionInfo.interruptionCount");
                                    edit.remove("com.facebook.appevents.SessionInfo.sessionId");
                                    edit.apply();
                                    Editor edit2 = PreferenceManager.getDefaultSharedPreferences(akq.g()).edit();
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage");
                                    edit2.remove("com.facebook.appevents.SourceApplicationInfo.openedByApplink");
                                    edit2.apply();
                                    alu.f = null;
                                }
                                synchronized (alu.d) {
                                    alu.c = null;
                                }
                            }
                        };
                        synchronized (alu.d) {
                            alu.c = alu.b.schedule(r0, (long) alu.k(), TimeUnit.SECONDS);
                        }
                    }
                    long o = alu.i;
                    long j = 0;
                    if (o > 0) {
                        j = (currentTimeMillis - o) / 1000;
                    }
                    alw.a(c2, j);
                    alu.f.a();
                }
            });
            alq alq = m;
            if (!(alq == null || ((Activity) alq.b.get()) == null || alq.c == null)) {
                try {
                    alq.c.cancel();
                    alq.c = null;
                } catch (Exception e2) {
                    Log.e(alq.a, "Error unscheduling indexing job", e2);
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

    public static void c() {
        b.execute(new Runnable() {
            public final void run() {
                alz alz;
                if (alu.f == null) {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(akq.g());
                    long j = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionStartTime", 0);
                    long j2 = defaultSharedPreferences.getLong("com.facebook.appevents.SessionInfo.sessionEndTime", 0);
                    amb amb = null;
                    String string = defaultSharedPreferences.getString("com.facebook.appevents.SessionInfo.sessionId", null);
                    if (j == 0 || j2 == 0 || string == null) {
                        alz = null;
                    } else {
                        alz = new alz(Long.valueOf(j), Long.valueOf(j2));
                        alz.c = defaultSharedPreferences.getInt("com.facebook.appevents.SessionInfo.interruptionCount", 0);
                        SharedPreferences defaultSharedPreferences2 = PreferenceManager.getDefaultSharedPreferences(akq.g());
                        String str = "com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage";
                        if (defaultSharedPreferences2.contains(str)) {
                            amb = new amb(defaultSharedPreferences2.getString(str, null), defaultSharedPreferences2.getBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", false));
                        }
                        alz.e = amb;
                        alz.d = Long.valueOf(System.currentTimeMillis());
                        alz.f = UUID.fromString(string);
                    }
                    alu.f = alz;
                }
            }
        });
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

    static /* synthetic */ int k() {
        amu a2 = FetchedAppSettingsManager.a(akq.k());
        if (a2 == null) {
            return 60;
        }
        return a2.e;
    }

    private static void r() {
        synchronized (d) {
            if (c != null) {
                c.cancel(false);
            }
            c = null;
        }
    }
}
