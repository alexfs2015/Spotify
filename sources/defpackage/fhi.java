package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: fhi reason: default package */
public final class fhi {
    private static fhi c;
    public final Queue<Intent> a = new ArrayDeque();
    public final Queue<Intent> b = new ArrayDeque();
    private final dv<String, String> d = new dv<>();
    private Boolean e = null;

    private fhi() {
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d4 A[Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb A[Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0 A[Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6 A[Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0100  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int a(android.content.Context r6, android.content.Intent r7) {
        /*
            r5 = this;
            dv<java.lang.String, java.lang.String> r0 = r5.d
            monitor-enter(r0)
            dv<java.lang.String, java.lang.String> r1 = r5.d     // Catch:{ all -> 0x0135 }
            java.lang.String r2 = r7.getAction()     // Catch:{ all -> 0x0135 }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0135 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0135 }
            monitor-exit(r0)     // Catch:{ all -> 0x0135 }
            r0 = 0
            if (r1 != 0) goto L_0x00ab
            android.content.pm.PackageManager r1 = r6.getPackageManager()
            android.content.pm.ResolveInfo r1 = r1.resolveService(r7, r0)
            if (r1 == 0) goto L_0x00a3
            android.content.pm.ServiceInfo r2 = r1.serviceInfo
            if (r2 != 0) goto L_0x0023
            goto L_0x00a3
        L_0x0023:
            android.content.pm.ServiceInfo r1 = r1.serviceInfo
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r3 = r1.packageName
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x006d
            java.lang.String r2 = r1.name
            if (r2 != 0) goto L_0x0036
            goto L_0x006d
        L_0x0036:
            java.lang.String r1 = r1.name
            java.lang.String r2 = "."
            boolean r2 = r1.startsWith(r2)
            if (r2 == 0) goto L_0x005c
            java.lang.String r2 = r6.getPackageName()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            int r3 = r1.length()
            if (r3 == 0) goto L_0x0057
            java.lang.String r1 = r2.concat(r1)
            goto L_0x005c
        L_0x0057:
            java.lang.String r1 = new java.lang.String
            r1.<init>(r2)
        L_0x005c:
            dv<java.lang.String, java.lang.String> r2 = r5.d
            monitor-enter(r2)
            dv<java.lang.String, java.lang.String> r3 = r5.d     // Catch:{ all -> 0x006a }
            java.lang.String r4 = r7.getAction()     // Catch:{ all -> 0x006a }
            r3.put(r4, r1)     // Catch:{ all -> 0x006a }
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            goto L_0x00ab
        L_0x006a:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006a }
            throw r6
        L_0x006d:
            java.lang.String r2 = r1.packageName
            java.lang.String r1 = r1.name
            java.lang.String r3 = java.lang.String.valueOf(r2)
            int r3 = r3.length()
            int r3 = r3 + 94
            java.lang.String r4 = java.lang.String.valueOf(r1)
            int r4 = r4.length()
            int r3 = r3 + r4
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>(r3)
            java.lang.String r3 = "Error resolving target intent service, skipping classname enforcement. Resolved service was: "
            r4.append(r3)
            r4.append(r2)
            java.lang.String r2 = "/"
            r4.append(r2)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "FirebaseInstanceId"
            android.util.Log.e(r2, r1)
            goto L_0x00d0
        L_0x00a3:
            java.lang.String r1 = "FirebaseInstanceId"
            java.lang.String r2 = "Failed to resolve target intent service, skipping classname enforcement"
            android.util.Log.e(r1, r2)
            goto L_0x00d0
        L_0x00ab:
            r2 = 3
            java.lang.String r3 = "FirebaseInstanceId"
            boolean r2 = android.util.Log.isLoggable(r3, r2)
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = "Restricting intent to a specific service: "
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r4 = r3.length()
            if (r4 == 0) goto L_0x00c4
            r2.concat(r3)
            goto L_0x00c9
        L_0x00c4:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r2)
        L_0x00c9:
            java.lang.String r2 = r6.getPackageName()
            r7.setClassName(r2, r1)
        L_0x00d0:
            java.lang.Boolean r1 = r5.e     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            if (r1 != 0) goto L_0x00e3
            java.lang.String r1 = "android.permission.WAKE_LOCK"
            int r1 = r6.checkCallingOrSelfPermission(r1)     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            if (r1 != 0) goto L_0x00dd
            r0 = 1
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            r5.e = r0     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
        L_0x00e3:
            java.lang.Boolean r0 = r5.e     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            boolean r0 = r0.booleanValue()     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            if (r0 == 0) goto L_0x00f0
            android.content.ComponentName r6 = defpackage.lb.a_(r6, r7)     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            goto L_0x00f4
        L_0x00f0:
            android.content.ComponentName r6 = r6.startService(r7)     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
        L_0x00f4:
            if (r6 != 0) goto L_0x0100
            java.lang.String r6 = "FirebaseInstanceId"
            java.lang.String r7 = "Error while delivering the message: ServiceIntent not found."
            android.util.Log.e(r6, r7)     // Catch:{ SecurityException -> 0x012a, IllegalStateException -> 0x0102 }
            r6 = 404(0x194, float:5.66E-43)
            return r6
        L_0x0100:
            r6 = -1
            return r6
        L_0x0102:
            r6 = move-exception
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            int r7 = r7.length()
            int r7 = r7 + 45
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r7)
            java.lang.String r7 = "Failed to start service while in background: "
            r0.append(r7)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r7 = "FirebaseInstanceId"
            android.util.Log.e(r7, r6)
            r6 = 402(0x192, float:5.63E-43)
            return r6
        L_0x012a:
            r6 = move-exception
            java.lang.String r7 = "FirebaseInstanceId"
            java.lang.String r0 = "Error while delivering the message to the serviceIntent"
            android.util.Log.e(r7, r0, r6)
            r6 = 401(0x191, float:5.62E-43)
            return r6
        L_0x0135:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0135 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fhi.a(android.content.Context, android.content.Intent):int");
    }

    public static PendingIntent a(Context context, int i, Intent intent) {
        return PendingIntent.getBroadcast(context, i, a(context, "com.google.firebase.MESSAGING_EVENT", intent), 1073741824);
    }

    static Intent a(Context context, String str, Intent intent) {
        Intent intent2 = new Intent(context, FirebaseInstanceIdReceiver.class);
        intent2.setAction(str);
        intent2.putExtra("wrapped_intent", intent);
        return intent2;
    }

    public static synchronized fhi a() {
        fhi fhi;
        synchronized (fhi.class) {
            if (c == null) {
                c = new fhi();
            }
            fhi = c;
        }
        return fhi;
    }

    public final int b(Context context, String str, Intent intent) {
        if (Log.isLoggable("FirebaseInstanceId", 3)) {
            String str2 = "Starting service: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        char c2 = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -842411455) {
            if (hashCode == 41532704 && str.equals("com.google.firebase.MESSAGING_EVENT")) {
                c2 = 1;
            }
        } else if (str.equals("com.google.firebase.INSTANCE_ID_EVENT")) {
            c2 = 0;
        }
        if (c2 == 0) {
            this.a.offer(intent);
        } else if (c2 != 1) {
            String str3 = "Unknown service action: ";
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3.concat(valueOf2);
            } else {
                new String(str3);
            }
            return 500;
        } else {
            this.b.offer(intent);
        }
        Intent intent2 = new Intent(str);
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
