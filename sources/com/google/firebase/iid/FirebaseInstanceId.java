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
    public static fhj a;
    private static final long g = TimeUnit.HOURS.toSeconds(8);
    private static ScheduledThreadPoolExecutor h;
    public final Executor b;
    public final FirebaseApp c;
    public final fha d;
    public fgn e;
    public final fhd f;
    private final fho i;
    private boolean j;
    private final a k;

    public class a {
        private final boolean b = c();
        private final fgl c;
        private fgj<ffk> d;
        private Boolean e = b();

        a(fgl fgl) {
            this.c = fgl;
            if (this.e == null && this.b) {
                this.d = new fid(this);
                fgl.a(ffk.class, this.d);
            }
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
                Class.forName("fip");
                return true;
            } catch (ClassNotFoundException unused) {
                Context a2 = FirebaseInstanceId.this.c.a();
                Intent intent = new Intent("com.google.firebase.MESSAGING_EVENT");
                intent.setPackage(a2.getPackageName());
                ResolveInfo resolveService = a2.getPackageManager().resolveService(intent, 0);
                return (resolveService == null || resolveService.serviceInfo == null) ? false : true;
            }
        }

        public final synchronized boolean a() {
            if (this.e == null) {
                return this.b && FirebaseInstanceId.this.c.isDataCollectionDefaultEnabled();
            }
            return this.e.booleanValue();
        }
    }

    public FirebaseInstanceId(FirebaseApp firebaseApp, fgl fgl) {
        this(firebaseApp, new fha(firebaseApp.a()), fhv.b(), fhv.b(), fgl);
    }

    private FirebaseInstanceId(FirebaseApp firebaseApp, fha fha, Executor executor, Executor executor2, fgl fgl) {
        this.j = false;
        if (fha.a(firebaseApp) != null) {
            synchronized (FirebaseInstanceId.class) {
                if (a == null) {
                    a = new fhj(firebaseApp.a());
                }
            }
            this.c = firebaseApp;
            this.d = fha;
            if (this.e == null) {
                fgn fgn = (fgn) firebaseApp.a(fgn.class);
                if (fgn == null || !fgn.a()) {
                    this.e = new fie(firebaseApp, fha, executor);
                } else {
                    this.e = fgn;
                }
            }
            this.e = this.e;
            this.b = executor2;
            this.i = new fho(a);
            this.k = new a(fgl);
            this.f = new fhd(executor);
            if (this.k.a()) {
                b();
                return;
            }
            return;
        }
        throw new IllegalStateException("FirebaseInstanceId failed to initialize, FirebaseApp is missing project ID");
    }

    public static FirebaseInstanceId a() {
        return getInstance(FirebaseApp.getInstance());
    }

    private static String a(String str) {
        return (str.isEmpty() || str.equalsIgnoreCase("fcm") || str.equalsIgnoreCase("gcm")) ? "*" : str;
    }

    public static void a(Runnable runnable, long j2) {
        synchronized (FirebaseInstanceId.class) {
            if (h == null) {
                h = new ScheduledThreadPoolExecutor(1, new cal("FirebaseInstanceId"));
            }
            h.schedule(runnable, j2, TimeUnit.SECONDS);
        }
    }

    public static fhk b(String str, String str2) {
        return a.a("", str, str2);
    }

    public static String d() {
        return fha.a(a.b("").a);
    }

    public static boolean f() {
        String str = "FirebaseInstanceId";
        return Log.isLoggable(str, 3) || (VERSION.SDK_INT == 23 && Log.isLoggable(str, 3));
    }

    public static FirebaseInstanceId getInstance(FirebaseApp firebaseApp) {
        return (FirebaseInstanceId) firebaseApp.a(FirebaseInstanceId.class);
    }

    public final exz<fgm> a(String str, String str2) {
        String a2 = a(str2);
        eya eya = new eya();
        Executor executor = this.b;
        fia fia = new fia(this, str, str2, eya, a2);
        executor.execute(fia);
        return eya.a;
    }

    public final <T> T a(exz<T> exz) {
        try {
            return eyc.a(exz, 30000, TimeUnit.MILLISECONDS);
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

    public final synchronized void a(long j2) {
        fhl fhl = new fhl(this, this.d, this.i, Math.min(Math.max(30, j2 << 1), g));
        a((Runnable) fhl, j2);
        this.j = true;
    }

    public final synchronized void a(boolean z) {
        this.j = z;
    }

    public final void b() {
        fhk e2 = e();
        if (e2 == null || e2.b(this.d.b()) || this.i.a()) {
            c();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void c() {
        if (!this.j) {
            a(0);
        }
    }

    public final fhk e() {
        return b(fha.a(this.c), "*");
    }

    public final synchronized void g() {
        a.b();
        if (this.k.a()) {
            c();
        }
    }
}
