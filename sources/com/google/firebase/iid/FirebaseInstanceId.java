package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.os.Build.VERSION;
import android.util.Log;
import com.google.firebase.FirebaseApp;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FirebaseInstanceId {
    public static fgp a;
    private static final long g = TimeUnit.HOURS.toSeconds(8);
    private static ScheduledThreadPoolExecutor h;
    public final Executor b;
    public final FirebaseApp c;
    public final fgg d;
    public fft e;
    public final fgj f;
    private final fgu i;
    private boolean j;
    private final a k;

    public class a {
        private final boolean b = c();
        private final ffr c;
        private ffp<feq> d;
        private Boolean e = b();

        a(ffr ffr) {
            this.c = ffr;
            if (this.e == null && this.b) {
                this.d = new fhj(this);
                ffr.a(feq.class, this.d);
            }
        }

        public final synchronized boolean a() {
            if (this.e == null) {
                return this.b && FirebaseInstanceId.this.c.isDataCollectionDefaultEnabled();
            }
            return this.e.booleanValue();
        }

        private final Boolean b() {
            String str = "firebase_messaging_auto_init_enabled";
            Context a2 = FirebaseInstanceId.this.c.a();
            SharedPreferences sharedPreferences = a2.getSharedPreferences("com.google.firebase.messaging", 0);
            String str2 = "auto_init";
            if (sharedPreferences.contains(str2)) {
                return Boolean.valueOf(sharedPreferences.getBoolean(str2, false));
            }
            try {
                PackageManager packageManager = a2.getPackageManager();
                if (packageManager != null) {
                    ApplicationInfo applicationInfo = packageManager.getApplicationInfo(a2.getPackageName(), 128);
                    if (!(applicationInfo == null || applicationInfo.metaData == null || !applicationInfo.metaData.containsKey(str))) {
                        return Boolean.valueOf(applicationInfo.metaData.getBoolean(str));
                    }
                }
            } catch (NameNotFoundException unused) {
            }
            return null;
        }

        private final boolean c() {
            try {
                Class.forName("fhv");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a2 = FirebaseInstanceId.this.c.a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a2.getPackageName());
                ResolveInfo resolveService = a2.getPackageManager().resolveService(intent, 0);
                if (resolveService == null || resolveService.serviceInfo == null) {
                    return false;
                }
                return true;
            }
        }
    }

    public static FirebaseInstanceId a() {
        return getInstance(FirebaseApp.getInstance());
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.a(FirebaseInstanceId.class);
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, ffr ffr) {
        this(firebaseApp, new fgg(firebaseApp.a()), fhb.b(), fhb.b(), ffr);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, fgg fgg, Executor executor, Executor executor2, ffr ffr) {
        this.j = false;
        if (fgg.a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (a == null) {
                    a = new fgp(firebaseApp.a());
                }
            }
            this.c = firebaseApp;
            this.d = fgg;
            if (this.e == null) {
                fft fft = (fft) firebaseApp.a(fft.class);
                if (fft == null || !fft.a()) {
                    this.e = new fhk(firebaseApp, fgg, executor);
                } else {
                    this.e = fft;
                }
            }
            this.e = this.e;
            this.b = executor2;
            this.i = new fgu(a);
            this.k = new a(ffr);
            this.f = new fgj(executor);
            if (this.k.a()) {
                b();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public final void b() {
        fgq e2 = e();
        if (e2 == null || e2.b(this.d.b()) || this.i.a()) {
            c();
        }
    }

    public final synchronized void a(boolean z) {
        this.j = z;
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void c() {
        if (!this.j) {
            a(0);
        }
    }

    public final synchronized void a(long j2) {
        fgr fgr = new fgr(this, this.d, this.i, Math.min(Math.max(30, j2 << 1), g));
        a((Runnable) fgr, j2);
        this.j = true;
    }

    public static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (h == null) {
                h = new ScheduledThreadPoolExecutor(1, new bzu("FirebaseInstanceId"));
            }
            h.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static String d() {
        return fgg.a(a.b("").a);
    }

    public final exi<ffs> a(String str, String str2) {
        String a2 = a(str2);
        exj exj = new exj();
        Executor executor = this.b;
        fhg fhg = new fhg(this, str, str2, exj, a2);
        executor.execute(fhg);
        return exj.a;
    }

    public final fgq e() {
        return b(fgg.a(this.c), "*");
    }

    public static fgq b(String str, String str2) {
        return a.a("", str, str2);
    }

    public final <T> T a(exi<T> exi) {
        try {
            return exl.a(exi, 30000, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof IOException) {
                if ("INSTANCE_ID_RESET".equals(cause.getMessage())) {
                    g();
                }
                throw ((IOException) cause);
            } else if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            } else {
                throw new IOException(e2);
            }
        } catch (InterruptedException | TimeoutException unused) {
            throw new IOException("SERVICE_NOT_AVAILABLE");
        }
    }

    public static boolean f() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    public final synchronized void g() {
        a.b();
        if (this.k.a()) {
            c();
        }
    }

    private static String a(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }
}
