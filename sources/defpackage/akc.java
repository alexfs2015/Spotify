package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.AsyncTask;
import com.facebook.FacebookException;
import com.facebook.LoggingBehavior;
import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.internal.AppEventsLoggerUtility;
import com.facebook.appevents.internal.AppEventsLoggerUtility.GraphAPIActivityType;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;

/* renamed from: akc reason: default package */
public final class akc {
    private static final String a = akc.class.getCanonicalName();
    private static final HashSet<LoggingBehavior> b = new HashSet<>(Arrays.asList(new LoggingBehavior[]{LoggingBehavior.DEVELOPER_ERRORS}));
    private static Executor c;
    /* access modifiers changed from: private */
    public static volatile String d;
    private static volatile String e;
    private static volatile String f;
    private static volatile Boolean g;
    private static volatile String h = "facebook.com";
    private static AtomicLong i = new AtomicLong(65536);
    private static volatile boolean j = false;
    private static boolean k = false;
    private static amo<File> l;
    /* access modifiers changed from: private */
    public static Context m;
    private static int n = 64206;
    private static final Object o = new Object();
    private static String p = amu.d();
    private static Boolean q = Boolean.FALSE;
    private static Boolean r = Boolean.FALSE;

    /* renamed from: akc$a */
    public interface a {
        void onInitialized();
    }

    public static boolean d() {
        return false;
    }

    public static String i() {
        return "5.0.1";
    }

    static {
        new LinkedBlockingQueue(10);
        new ThreadFactory() {
            private final AtomicInteger a = new AtomicInteger(0);

            public final Thread newThread(Runnable runnable) {
                StringBuilder sb = new StringBuilder("FacebookSdk #");
                sb.append(this.a.incrementAndGet());
                return new Thread(runnable, sb.toString());
            }
        };
    }

    @Deprecated
    public static synchronized void a(Context context) {
        synchronized (akc.class) {
            a(context, (a) null);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        return;
     */
    @java.lang.Deprecated
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(final android.content.Context r6, final defpackage.akc.a r7) {
        /*
            java.lang.Class<akc> r0 = defpackage.akc.class
            monitor-enter(r0)
            java.lang.Boolean r1 = q     // Catch:{ all -> 0x0110 }
            boolean r1 = r1.booleanValue()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x0012
            if (r7 == 0) goto L_0x0010
            r7.onInitialized()     // Catch:{ all -> 0x0110 }
        L_0x0010:
            monitor-exit(r0)
            return
        L_0x0012:
            java.lang.String r1 = "applicationContext"
            defpackage.amx.a(r6, r1)     // Catch:{ all -> 0x0110 }
            r1 = 0
            defpackage.amx.b(r6, r1)     // Catch:{ all -> 0x0110 }
            defpackage.amx.a(r6, r1)     // Catch:{ all -> 0x0110 }
            android.content.Context r2 = r6.getApplicationContext()     // Catch:{ all -> 0x0110 }
            m = r2     // Catch:{ all -> 0x0110 }
            if (r2 == 0) goto L_0x00b3
            android.content.pm.PackageManager r3 = r2.getPackageManager()     // Catch:{ NameNotFoundException -> 0x00b3 }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ NameNotFoundException -> 0x00b3 }
            r4 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r2 = r3.getApplicationInfo(r2, r4)     // Catch:{ NameNotFoundException -> 0x00b3 }
            if (r2 == 0) goto L_0x00b3
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x003c
            goto L_0x00b3
        L_0x003c:
            java.lang.String r3 = d     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0074
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "com.facebook.sdk.ApplicationId"
            java.lang.Object r3 = r3.get(r4)     // Catch:{ all -> 0x0110 }
            boolean r4 = r3 instanceof java.lang.String     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0067
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ all -> 0x0110 }
            java.util.Locale r4 = java.util.Locale.ROOT     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = r3.toLowerCase(r4)     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "fb"
            boolean r4 = r4.startsWith(r5)     // Catch:{ all -> 0x0110 }
            if (r4 == 0) goto L_0x0064
            r4 = 2
            java.lang.String r3 = r3.substring(r4)     // Catch:{ all -> 0x0110 }
            d = r3     // Catch:{ all -> 0x0110 }
            goto L_0x0074
        L_0x0064:
            d = r3     // Catch:{ all -> 0x0110 }
            goto L_0x0074
        L_0x0067:
            boolean r3 = r3 instanceof java.lang.Integer     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x006c
            goto L_0x0074
        L_0x006c:
            com.facebook.FacebookException r6 = new com.facebook.FacebookException     // Catch:{ all -> 0x0110 }
            java.lang.String r7 = "App Ids cannot be directly placed in the manifest.They must be prefixed by 'fb' or be placed in the string resource file."
            r6.<init>(r7)     // Catch:{ all -> 0x0110 }
            throw r6     // Catch:{ all -> 0x0110 }
        L_0x0074:
            java.lang.String r3 = e     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0082
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "com.facebook.sdk.ApplicationName"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x0110 }
            e = r3     // Catch:{ all -> 0x0110 }
        L_0x0082:
            java.lang.String r3 = f     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x0090
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x0110 }
            java.lang.String r4 = "com.facebook.sdk.ClientToken"
            java.lang.String r3 = r3.getString(r4)     // Catch:{ all -> 0x0110 }
            f = r3     // Catch:{ all -> 0x0110 }
        L_0x0090:
            int r3 = n     // Catch:{ all -> 0x0110 }
            r4 = 64206(0xface, float:8.9972E-41)
            if (r3 != r4) goto L_0x00a1
            android.os.Bundle r3 = r2.metaData     // Catch:{ all -> 0x0110 }
            java.lang.String r5 = "com.facebook.sdk.CallbackOffset"
            int r3 = r3.getInt(r5, r4)     // Catch:{ all -> 0x0110 }
            n = r3     // Catch:{ all -> 0x0110 }
        L_0x00a1:
            java.lang.Boolean r3 = g     // Catch:{ all -> 0x0110 }
            if (r3 != 0) goto L_0x00b3
            android.os.Bundle r2 = r2.metaData     // Catch:{ all -> 0x0110 }
            java.lang.String r3 = "com.facebook.sdk.CodelessDebugLogEnabled"
            boolean r1 = r2.getBoolean(r3, r1)     // Catch:{ all -> 0x0110 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0110 }
            g = r1     // Catch:{ all -> 0x0110 }
        L_0x00b3:
            java.lang.String r1 = d     // Catch:{ all -> 0x0110 }
            boolean r1 = defpackage.amw.a(r1)     // Catch:{ all -> 0x0110 }
            if (r1 != 0) goto L_0x0108
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0110 }
            q = r1     // Catch:{ all -> 0x0110 }
            boolean r1 = defpackage.akp.a()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00c9
            java.lang.Boolean r1 = java.lang.Boolean.TRUE     // Catch:{ all -> 0x0110 }
            r = r1     // Catch:{ all -> 0x0110 }
        L_0x00c9:
            android.content.Context r1 = m     // Catch:{ all -> 0x0110 }
            boolean r1 = r1 instanceof android.app.Application     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00de
            boolean r1 = defpackage.akp.b()     // Catch:{ all -> 0x0110 }
            if (r1 == 0) goto L_0x00de
            android.content.Context r1 = m     // Catch:{ all -> 0x0110 }
            android.app.Application r1 = (android.app.Application) r1     // Catch:{ all -> 0x0110 }
            java.lang.String r2 = d     // Catch:{ all -> 0x0110 }
            defpackage.alg.a(r1, r2)     // Catch:{ all -> 0x0110 }
        L_0x00de:
            com.facebook.internal.FetchedAppSettingsManager.a()     // Catch:{ all -> 0x0110 }
            defpackage.amr.b()     // Catch:{ all -> 0x0110 }
            android.content.Context r1 = m     // Catch:{ all -> 0x0110 }
            defpackage.alv.a(r1)     // Catch:{ all -> 0x0110 }
            amo r1 = new amo     // Catch:{ all -> 0x0110 }
            akc$2 r2 = new akc$2     // Catch:{ all -> 0x0110 }
            r2.<init>()     // Catch:{ all -> 0x0110 }
            r1.<init>(r2)     // Catch:{ all -> 0x0110 }
            l = r1     // Catch:{ all -> 0x0110 }
            java.util.concurrent.FutureTask r1 = new java.util.concurrent.FutureTask     // Catch:{ all -> 0x0110 }
            akc$3 r2 = new akc$3     // Catch:{ all -> 0x0110 }
            r2.<init>(r7, r6)     // Catch:{ all -> 0x0110 }
            r1.<init>(r2)     // Catch:{ all -> 0x0110 }
            java.util.concurrent.Executor r6 = e()     // Catch:{ all -> 0x0110 }
            r6.execute(r1)     // Catch:{ all -> 0x0110 }
            monitor-exit(r0)
            return
        L_0x0108:
            com.facebook.FacebookException r6 = new com.facebook.FacebookException     // Catch:{ all -> 0x0110 }
            java.lang.String r7 = "A valid Facebook app id must be set in the AndroidManifest.xml or set by calling FacebookSdk.setApplicationId before initializing the sdk."
            r6.<init>(r7)     // Catch:{ all -> 0x0110 }
            throw r6     // Catch:{ all -> 0x0110 }
        L_0x0110:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akc.a(android.content.Context, akc$a):void");
    }

    public static synchronized boolean a() {
        boolean booleanValue;
        synchronized (akc.class) {
            booleanValue = q.booleanValue();
        }
        return booleanValue;
    }

    public static synchronized boolean b() {
        boolean booleanValue;
        synchronized (akc.class) {
            booleanValue = r.booleanValue();
        }
        return booleanValue;
    }

    public static boolean a(LoggingBehavior loggingBehavior) {
        boolean z;
        synchronized (b) {
            z = j && b.contains(loggingBehavior);
        }
        return z;
    }

    public static boolean c() {
        return j;
    }

    public static Executor e() {
        synchronized (o) {
            if (c == null) {
                c = AsyncTask.THREAD_POOL_EXECUTOR;
            }
        }
        return c;
    }

    public static String f() {
        return h;
    }

    public static Context g() {
        amx.a();
        return m;
    }

    public static String h() {
        amw.b(a, String.format("getGraphApiVersion: %s", new Object[]{p}));
        return p;
    }

    public static void a(Context context, final String str) {
        final Context applicationContext = context.getApplicationContext();
        e().execute(new Runnable() {
            public final void run() {
                akc.b(applicationContext, str);
            }
        });
    }

    static void b(Context context, String str) {
        if (context == null || str == null) {
            throw new IllegalArgumentException("Both context and applicationId must be non-null");
        }
        try {
            alu a2 = alu.a(context);
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.facebook.sdk.attributionTracking", 0);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("ping");
            String sb2 = sb.toString();
            long j2 = sharedPreferences.getLong(sb2, 0);
            akd a3 = akd.a((aju) null, String.format("%s/activities", new Object[]{str}), AppEventsLoggerUtility.a(GraphAPIActivityType.MOBILE_INSTALL_EVENT, a2, AppEventsLogger.b(context), b(context), context), (b) null);
            if (j2 == 0) {
                akd.a(a3);
                Editor edit = sharedPreferences.edit();
                edit.putLong(sb2, System.currentTimeMillis());
                edit.apply();
            }
        } catch (JSONException e2) {
            throw new FacebookException("An error occurred while publishing install.", (Throwable) e2);
        } catch (Exception e3) {
            amw.a("Facebook-publish", e3);
        }
    }

    public static boolean b(Context context) {
        amx.a();
        return context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getBoolean("limitEventUsage", false);
    }

    public static long j() {
        amx.a();
        return i.get();
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String c(android.content.Context r3) {
        /*
            defpackage.amx.a()
            r0 = 0
            if (r3 != 0) goto L_0x0007
            return r0
        L_0x0007:
            android.content.pm.PackageManager r1 = r3.getPackageManager()
            if (r1 != 0) goto L_0x000e
            return r0
        L_0x000e:
            java.lang.String r3 = r3.getPackageName()
            r2 = 64
            android.content.pm.PackageInfo r3 = r1.getPackageInfo(r3, r2)     // Catch:{ NameNotFoundException -> 0x003d }
            android.content.pm.Signature[] r1 = r3.signatures
            if (r1 == 0) goto L_0x003d
            int r1 = r1.length
            if (r1 != 0) goto L_0x0020
            goto L_0x003d
        L_0x0020:
            java.lang.String r1 = "SHA-1"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r1)     // Catch:{  }
            android.content.pm.Signature[] r3 = r3.signatures
            r1 = 0
            r3 = r3[r1]
            byte[] r3 = r3.toByteArray()
            r0.update(r3)
            byte[] r3 = r0.digest()
            r0 = 9
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r0)
            return r3
        L_0x003d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akc.c(android.content.Context):java.lang.String");
    }

    public static String k() {
        amx.a();
        return d;
    }

    public static String l() {
        amx.a();
        return e;
    }

    public static String m() {
        amx.a();
        return f;
    }

    public static boolean n() {
        return akp.b();
    }

    public static boolean o() {
        return akp.d();
    }

    public static boolean p() {
        return akp.c();
    }

    public static File q() {
        amx.a();
        amo<File> amo = l;
        amo.a();
        return (File) amo.a;
    }

    public static int r() {
        amx.a();
        return n;
    }
}
