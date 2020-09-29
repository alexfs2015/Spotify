package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.firebase.iid.zzal;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: fgr reason: default package */
final class fgr implements ServiceConnection {
    int a;
    final Messenger b;
    fgw c;
    final Queue<fgy<?>> d;
    final SparseArray<fgy<?>> e;
    final /* synthetic */ fgq f;

    private fgr(fgq fgq) {
        this.f = fgq;
        this.a = 0;
        this.b = new Messenger(new ejs(Looper.getMainLooper(), new fgs(this)));
        this.d = new ArrayDeque();
        this.e = new SparseArray<>();
    }

    /* synthetic */ fgr(fgq fgq, byte b2) {
        this(fgq);
    }

    private final void c() {
        this.f.b.execute(new fgu(this));
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a() {
        if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 3;
            bzs.a();
            bzs.a(this.f.a, this);
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(int i) {
        fgy fgy = (fgy) this.e.get(i);
        if (fgy != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i);
            this.e.remove(i);
            fgy.a(new zzal(3, "Timed out waiting for response"));
            a();
        }
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void a(int i, String str) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String str2 = "Disconnected: ";
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2.concat(valueOf);
            } else {
                new String(str2);
            }
        }
        int i2 = this.a;
        if (i2 == 0) {
            throw new IllegalStateException();
        } else if (i2 == 1 || i2 == 2) {
            Log.isLoggable("MessengerIpcClient", 2);
            this.a = 4;
            bzs.a();
            bzs.a(this.f.a, this);
            zzal zzal = new zzal(i, str);
            for (fgy a2 : this.d) {
                a2.a(zzal);
            }
            this.d.clear();
            for (int i3 = 0; i3 < this.e.size(); i3++) {
                ((fgy) this.e.valueAt(i3)).a(zzal);
            }
            this.e.clear();
        } else if (i2 == 3) {
            this.a = 4;
        } else if (i2 != 4) {
            int i4 = this.a;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Unknown state: ");
            sb.append(i4);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* JADX INFO: used method not loaded: fgy.a(com.google.firebase.iid.zzal):null, types can be incorrect */
    /* JADX INFO: used method not loaded: fgy.a(android.os.Bundle):null, types can be incorrect */
    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0040, code lost:
        r5 = r5.getData();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x004b, code lost:
        if (r5.getBoolean("unsupported", false) == false) goto L_0x0059;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004d, code lost:
        r1.a(new com.google.firebase.iid.zzal(4, "Not supported by GmsCore"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0059, code lost:
        r1.a(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.os.Message r5) {
        /*
            r4 = this;
            int r0 = r5.arg1
            java.lang.String r1 = "MessengerIpcClient"
            r2 = 3
            boolean r1 = android.util.Log.isLoggable(r1, r2)
            if (r1 == 0) goto L_0x001a
            r1 = 41
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            java.lang.String r1 = "Received response to request: "
            r2.append(r1)
            r2.append(r0)
        L_0x001a:
            monitor-enter(r4)
            android.util.SparseArray<fgy<?>> r1 = r4.e     // Catch:{ all -> 0x005d }
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x005d }
            fgy r1 = (defpackage.fgy) r1     // Catch:{ all -> 0x005d }
            r2 = 1
            if (r1 != 0) goto L_0x0037
            r5 = 50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x005d }
            r1.<init>(r5)     // Catch:{ all -> 0x005d }
            java.lang.String r5 = "Received response for unknown request: "
            r1.append(r5)     // Catch:{ all -> 0x005d }
            r1.append(r0)     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            return r2
        L_0x0037:
            android.util.SparseArray<fgy<?>> r3 = r4.e     // Catch:{ all -> 0x005d }
            r3.remove(r0)     // Catch:{ all -> 0x005d }
            r4.a()     // Catch:{ all -> 0x005d }
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            android.os.Bundle r5 = r5.getData()
            r0 = 0
            java.lang.String r3 = "unsupported"
            boolean r0 = r5.getBoolean(r3, r0)
            if (r0 == 0) goto L_0x0059
            com.google.firebase.iid.zzal r5 = new com.google.firebase.iid.zzal
            r0 = 4
            java.lang.String r3 = "Not supported by GmsCore"
            r5.<init>(r0, r3)
            r1.a(r5)
            goto L_0x005c
        L_0x0059:
            r1.a(r5)
        L_0x005c:
            return r2
        L_0x005d:
            r5 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x005d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgr.a(android.os.Message):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002f, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0088, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(defpackage.fgy r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            int r0 = r5.a     // Catch:{ all -> 0x0089 }
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r3) goto L_0x003a
            if (r0 == r1) goto L_0x0030
            r6 = 3
            if (r0 == r6) goto L_0x002e
            r6 = 4
            if (r0 != r6) goto L_0x0013
            goto L_0x002e
        L_0x0013:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0089 }
            int r0 = r5.a     // Catch:{ all -> 0x0089 }
            r1 = 26
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0089 }
            r2.<init>(r1)     // Catch:{ all -> 0x0089 }
            java.lang.String r1 = "Unknown state: "
            r2.append(r1)     // Catch:{ all -> 0x0089 }
            r2.append(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0089 }
            r6.<init>(r0)     // Catch:{ all -> 0x0089 }
            throw r6     // Catch:{ all -> 0x0089 }
        L_0x002e:
            monitor-exit(r5)
            return r2
        L_0x0030:
            java.util.Queue<fgy<?>> r0 = r5.d     // Catch:{ all -> 0x0089 }
            r0.add(r6)     // Catch:{ all -> 0x0089 }
            r5.c()     // Catch:{ all -> 0x0089 }
            monitor-exit(r5)
            return r3
        L_0x003a:
            java.util.Queue<fgy<?>> r0 = r5.d     // Catch:{ all -> 0x0089 }
            r0.add(r6)     // Catch:{ all -> 0x0089 }
            monitor-exit(r5)
            return r3
        L_0x0041:
            java.util.Queue<fgy<?>> r0 = r5.d     // Catch:{ all -> 0x0089 }
            r0.add(r6)     // Catch:{ all -> 0x0089 }
            int r6 = r5.a     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x004c
            r6 = 1
            goto L_0x004d
        L_0x004c:
            r6 = 0
        L_0x004d:
            defpackage.bxo.a(r6)     // Catch:{ all -> 0x0089 }
            java.lang.String r6 = "MessengerIpcClient"
            android.util.Log.isLoggable(r6, r1)     // Catch:{ all -> 0x0089 }
            r5.a = r3     // Catch:{ all -> 0x0089 }
            android.content.Intent r6 = new android.content.Intent     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "com.google.android.c2dm.intent.REGISTER"
            r6.<init>(r0)     // Catch:{ all -> 0x0089 }
            java.lang.String r0 = "com.google.android.gms"
            r6.setPackage(r0)     // Catch:{ all -> 0x0089 }
            bzs r0 = defpackage.bzs.a()     // Catch:{ all -> 0x0089 }
            fgq r1 = r5.f     // Catch:{ all -> 0x0089 }
            android.content.Context r1 = r1.a     // Catch:{ all -> 0x0089 }
            boolean r6 = r0.b(r1, r6, r5, r3)     // Catch:{ all -> 0x0089 }
            if (r6 != 0) goto L_0x0077
            java.lang.String r6 = "Unable to bind to service"
            r5.a(r2, r6)     // Catch:{ all -> 0x0089 }
            goto L_0x0087
        L_0x0077:
            fgq r6 = r5.f     // Catch:{ all -> 0x0089 }
            java.util.concurrent.ScheduledExecutorService r6 = r6.b     // Catch:{ all -> 0x0089 }
            fgt r0 = new fgt     // Catch:{ all -> 0x0089 }
            r0.<init>(r5)     // Catch:{ all -> 0x0089 }
            r1 = 30
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0089 }
            r6.schedule(r0, r1, r4)     // Catch:{ all -> 0x0089 }
        L_0x0087:
            monitor-exit(r5)
            return r3
        L_0x0089:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fgr.a(fgy):boolean");
    }

    /* access modifiers changed from: 0000 */
    public final synchronized void b() {
        if (this.a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        Log.isLoggable("MessengerIpcClient", 2);
        if (iBinder == null) {
            a(0, "Null service connection");
            return;
        }
        try {
            this.c = new fgw(iBinder);
            this.a = 2;
            c();
        } catch (RemoteException e2) {
            a(0, e2.getMessage());
        }
    }

    public final synchronized void onServiceDisconnected(ComponentName componentName) {
        Log.isLoggable("MessengerIpcClient", 2);
        a(2, "Service disconnected");
    }
}
