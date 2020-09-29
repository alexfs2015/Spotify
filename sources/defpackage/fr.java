package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.util.TypedValue;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* renamed from: fr reason: default package */
public class fr {
    private static final Object a = new Object();
    private static TypedValue b;

    /* renamed from: fr$a */
    static class a implements Executor {
        private final Handler a;

        a(Handler handler) {
            this.a = handler;
        }

        public final void execute(Runnable runnable) {
            if (!this.a.post(runnable)) {
                StringBuilder sb = new StringBuilder();
                sb.append(this.a);
                sb.append(" is shutting down");
                throw new RejectedExecutionException(sb.toString());
            }
        }
    }

    public static Drawable a(Context context, int i) {
        int i2;
        if (VERSION.SDK_INT >= 21) {
            return context.getDrawable(i);
        }
        if (VERSION.SDK_INT >= 16) {
            return context.getResources().getDrawable(i);
        }
        synchronized (a) {
            if (b == null) {
                b = new TypedValue();
            }
            context.getResources().getValue(i, b, true);
            i2 = b.resourceId;
        }
        return context.getResources().getDrawable(i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        return r3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized java.io.File a(java.io.File r3) {
        /*
            java.lang.Class<fr> r0 = defpackage.fr.class
            monitor-enter(r0)
            boolean r1 = r3.exists()     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r3.mkdirs()     // Catch:{ all -> 0x002a }
            if (r1 != 0) goto L_0x0028
            boolean r1 = r3.exists()     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0017
            monitor-exit(r0)
            return r3
        L_0x0017:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x002a }
            java.lang.String r2 = "Unable to create files subdir "
            r1.<init>(r2)     // Catch:{ all -> 0x002a }
            java.lang.String r3 = r3.getPath()     // Catch:{ all -> 0x002a }
            r1.append(r3)     // Catch:{ all -> 0x002a }
            r3 = 0
            monitor-exit(r0)
            return r3
        L_0x0028:
            monitor-exit(r0)
            return r3
        L_0x002a:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fr.a(java.io.File):java.io.File");
    }

    public static void a(Context context, Intent intent) {
        if (VERSION.SDK_INT >= 26) {
            context.startForegroundService(intent);
        } else {
            context.startService(intent);
        }
    }

    public static void a(Context context, Intent intent, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivity(intent, bundle);
        } else {
            context.startActivity(intent);
        }
    }

    public static boolean a(Context context, Intent[] intentArr, Bundle bundle) {
        if (VERSION.SDK_INT >= 16) {
            context.startActivities(intentArr, bundle);
        } else {
            context.startActivities(intentArr);
        }
        return true;
    }

    public static File[] a(Context context) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalCacheDirs();
        }
        return new File[]{context.getExternalCacheDir()};
    }

    public static File[] a(Context context, String str) {
        if (VERSION.SDK_INT >= 19) {
            return context.getExternalFilesDirs(null);
        }
        return new File[]{context.getExternalFilesDir(null)};
    }

    public static int b(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static ColorStateList b(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColorStateList(i) : context.getResources().getColorStateList(i);
    }

    public static File b(Context context) {
        return VERSION.SDK_INT >= 21 ? context.getNoBackupFilesDir() : a(new File(context.getApplicationInfo().dataDir, "no_backup"));
    }

    public static int c(Context context, int i) {
        return VERSION.SDK_INT >= 23 ? context.getColor(i) : context.getResources().getColor(i);
    }

    public static boolean c(Context context) {
        if (VERSION.SDK_INT >= 24) {
            return context.isDeviceProtectedStorage();
        }
        return false;
    }

    public static Executor d(Context context) {
        return VERSION.SDK_INT >= 28 ? context.getMainExecutor() : new a(new Handler(context.getMainLooper()));
    }
}
