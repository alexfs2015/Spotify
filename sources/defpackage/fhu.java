package defpackage;

import android.content.BroadcastReceiver.PendingResult;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: fhu reason: default package */
public final class fhu implements ServiceConnection {
    private final Context a;
    private final Intent b;
    private final ScheduledExecutorService c;
    private final Queue<fhq> d;
    private fhs e;
    private boolean f;

    public fhu(Context context, String str) {
        this(context, str, new ScheduledThreadPoolExecutor(0, new cal("Firebase-FirebaseInstanceIdServiceConnection")));
    }

    private fhu(Context context, String str, ScheduledExecutorService scheduledExecutorService) {
        this.d = new ArrayDeque();
        this.f = false;
        this.a = context.getApplicationContext();
        this.b = new Intent(str).setPackage(this.a.getPackageName());
        this.c = scheduledExecutorService;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized void a() {
        /*
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "EnhancedIntentService"
            r1 = 3
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b7 }
        L_0x0007:
            java.util.Queue<fhq> r0 = r5.d     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00b5
            java.lang.String r0 = "EnhancedIntentService"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b7 }
            fhs r0 = r5.e     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0066
            fhs r0 = r5.e     // Catch:{ all -> 0x00b7 }
            boolean r0 = r0.isBinderAlive()     // Catch:{ all -> 0x00b7 }
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = "EnhancedIntentService"
            android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b7 }
            java.util.Queue<fhq> r0 = r5.d     // Catch:{ all -> 0x00b7 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x00b7 }
            fhq r0 = (defpackage.fhq) r0     // Catch:{ all -> 0x00b7 }
            fhs r2 = r5.e     // Catch:{ all -> 0x00b7 }
            int r3 = android.os.Binder.getCallingUid()     // Catch:{ all -> 0x00b7 }
            int r4 = android.os.Process.myUid()     // Catch:{ all -> 0x00b7 }
            if (r3 != r4) goto L_0x005e
            java.lang.String r3 = "EnhancedIntentService"
            android.util.Log.isLoggable(r3, r1)     // Catch:{ all -> 0x00b7 }
            fhn r3 = r2.a     // Catch:{ all -> 0x00b7 }
            android.content.Intent r4 = r0.a     // Catch:{ all -> 0x00b7 }
            boolean r3 = r3.c(r4)     // Catch:{ all -> 0x00b7 }
            if (r3 == 0) goto L_0x004c
            r0.a()     // Catch:{ all -> 0x00b7 }
            goto L_0x0007
        L_0x004c:
            java.lang.String r3 = "EnhancedIntentService"
            android.util.Log.isLoggable(r3, r1)     // Catch:{ all -> 0x00b7 }
            fhn r3 = r2.a     // Catch:{ all -> 0x00b7 }
            java.util.concurrent.ExecutorService r3 = r3.a     // Catch:{ all -> 0x00b7 }
            fht r4 = new fht     // Catch:{ all -> 0x00b7 }
            r4.<init>(r2, r0)     // Catch:{ all -> 0x00b7 }
            r3.execute(r4)     // Catch:{ all -> 0x00b7 }
            goto L_0x0007
        L_0x005e:
            java.lang.SecurityException r0 = new java.lang.SecurityException     // Catch:{ all -> 0x00b7 }
            java.lang.String r1 = "Binding only allowed within app"
            r0.<init>(r1)     // Catch:{ all -> 0x00b7 }
            throw r0     // Catch:{ all -> 0x00b7 }
        L_0x0066:
            java.lang.String r0 = "EnhancedIntentService"
            boolean r0 = android.util.Log.isLoggable(r0, r1)     // Catch:{ all -> 0x00b7 }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0086
            boolean r0 = r5.f     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x0076
            r0 = 1
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            r3 = 39
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x00b7 }
            r4.<init>(r3)     // Catch:{ all -> 0x00b7 }
            java.lang.String r3 = "binder is dead. start connection? "
            r4.append(r3)     // Catch:{ all -> 0x00b7 }
            r4.append(r0)     // Catch:{ all -> 0x00b7 }
        L_0x0086:
            boolean r0 = r5.f     // Catch:{ all -> 0x00b7 }
            if (r0 != 0) goto L_0x00b3
            r5.f = r2     // Catch:{ all -> 0x00b7 }
            bzs r0 = defpackage.bzs.a()     // Catch:{ SecurityException -> 0x00a6 }
            android.content.Context r2 = r5.a     // Catch:{ SecurityException -> 0x00a6 }
            android.content.Intent r3 = r5.b     // Catch:{ SecurityException -> 0x00a6 }
            r4 = 65
            boolean r0 = r0.b(r2, r3, r5, r4)     // Catch:{ SecurityException -> 0x00a6 }
            if (r0 == 0) goto L_0x009e
            monitor-exit(r5)
            return
        L_0x009e:
            java.lang.String r0 = "EnhancedIntentService"
            java.lang.String r2 = "binding to the service failed"
            android.util.Log.e(r0, r2)     // Catch:{ SecurityException -> 0x00a6 }
            goto L_0x00ae
        L_0x00a6:
            r0 = move-exception
            java.lang.String r2 = "EnhancedIntentService"
            java.lang.String r3 = "Exception while binding the service"
            android.util.Log.e(r2, r3, r0)     // Catch:{ all -> 0x00b7 }
        L_0x00ae:
            r5.f = r1     // Catch:{ all -> 0x00b7 }
            r5.b()     // Catch:{ all -> 0x00b7 }
        L_0x00b3:
            monitor-exit(r5)
            return
        L_0x00b5:
            monitor-exit(r5)
            return
        L_0x00b7:
            r0 = move-exception
            monitor-exit(r5)
            goto L_0x00bb
        L_0x00ba:
            throw r0
        L_0x00bb:
            goto L_0x00ba
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhu.a():void");
    }

    private final void b() {
        while (!this.d.isEmpty()) {
            ((fhq) this.d.poll()).a();
        }
    }

    public final synchronized void a(Intent intent, PendingResult pendingResult) {
        Log.isLoggable("EnhancedIntentService", 3);
        this.d.add(new fhq(intent, pendingResult, this.c));
        a();
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        synchronized (this) {
            this.f = false;
            this.e = (fhs) iBinder;
            if (Log.isLoggable("EnhancedIntentService", 3)) {
                String valueOf = String.valueOf(componentName);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
                sb.append("onServiceConnected: ");
                sb.append(valueOf);
            }
            if (iBinder == null) {
                Log.e("EnhancedIntentService", "Null service connection");
                b();
            } else {
                a();
            }
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("EnhancedIntentService", 3)) {
            String valueOf = String.valueOf(componentName);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
            sb.append("onServiceDisconnected: ");
            sb.append(valueOf);
        }
        a();
    }
}
