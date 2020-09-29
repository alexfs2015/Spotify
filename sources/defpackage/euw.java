package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: euw reason: default package */
public final class euw implements ServiceConnection, a, b {
    /* access modifiers changed from: 0000 */
    public volatile boolean a;
    volatile erm b;
    final /* synthetic */ euj c;

    protected euw(euj euj) {
        this.c = euj;
    }

    public final void a(int i) {
        bxo.b("MeasurementServiceConnection.onConnectionSuspended");
        this.c.q().j.a("Service connection suspended");
        this.c.p().a((Runnable) new eva(this));
    }

    public final void a(Bundle bundle) {
        bxo.b("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                this.c.p().a((Runnable) new euz(this, (ere) this.b.q()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.b = null;
                this.a = false;
            }
        }
    }

    public final void a(ConnectionResult connectionResult) {
        bxo.b("MeasurementServiceConnection.onConnectionFailed");
        esp esp = this.c.r;
        ern ern = esp.f.v() ? esp.f : null;
        if (ern != null) {
            ern.f.a("Service connection failed", connectionResult);
        }
        synchronized (this) {
            this.a = false;
            this.b = null;
        }
        this.c.p().a((Runnable) new evb(this));
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:22|23) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        r3.c.q().c.a("Service connect failed to get IMeasurementService");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x005c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onServiceConnected(android.content.ComponentName r4, android.os.IBinder r5) {
        /*
            r3 = this;
            java.lang.String r4 = "MeasurementServiceConnection.onServiceConnected"
            defpackage.bxo.b(r4)
            monitor-enter(r3)
            r4 = 0
            if (r5 != 0) goto L_0x001d
            r3.a = r4     // Catch:{ all -> 0x001a }
            euj r4 = r3.c     // Catch:{ all -> 0x001a }
            ern r4 = r4.q()     // Catch:{ all -> 0x001a }
            erp r4 = r4.c     // Catch:{ all -> 0x001a }
            java.lang.String r5 = "Service connected with null binder"
            r4.a(r5)     // Catch:{ all -> 0x001a }
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x001a:
            r4 = move-exception
            goto L_0x008e
        L_0x001d:
            r0 = 0
            java.lang.String r1 = r5.getInterfaceDescriptor()     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r2 = "com.google.android.gms.measurement.internal.IMeasurementService"
            boolean r2 = r2.equals(r1)     // Catch:{ RemoteException -> 0x005c }
            if (r2 == 0) goto L_0x004e
            if (r5 != 0) goto L_0x002d
            goto L_0x0040
        L_0x002d:
            java.lang.String r1 = "com.google.android.gms.measurement.internal.IMeasurementService"
            android.os.IInterface r1 = r5.queryLocalInterface(r1)     // Catch:{ RemoteException -> 0x005c }
            boolean r2 = r1 instanceof defpackage.ere     // Catch:{ RemoteException -> 0x005c }
            if (r2 == 0) goto L_0x003a
            ere r1 = (defpackage.ere) r1     // Catch:{ RemoteException -> 0x005c }
            goto L_0x003f
        L_0x003a:
            erg r1 = new erg     // Catch:{ RemoteException -> 0x005c }
            r1.<init>(r5)     // Catch:{ RemoteException -> 0x005c }
        L_0x003f:
            r0 = r1
        L_0x0040:
            euj r5 = r3.c     // Catch:{ RemoteException -> 0x005c }
            ern r5 = r5.q()     // Catch:{ RemoteException -> 0x005c }
            erp r5 = r5.k     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r1 = "Bound to IMeasurementService interface"
            r5.a(r1)     // Catch:{ RemoteException -> 0x005c }
            goto L_0x0069
        L_0x004e:
            euj r5 = r3.c     // Catch:{ RemoteException -> 0x005c }
            ern r5 = r5.q()     // Catch:{ RemoteException -> 0x005c }
            erp r5 = r5.c     // Catch:{ RemoteException -> 0x005c }
            java.lang.String r2 = "Got binder with a wrong descriptor"
            r5.a(r2, r1)     // Catch:{ RemoteException -> 0x005c }
            goto L_0x0069
        L_0x005c:
            euj r5 = r3.c     // Catch:{ all -> 0x001a }
            ern r5 = r5.q()     // Catch:{ all -> 0x001a }
            erp r5 = r5.c     // Catch:{ all -> 0x001a }
            java.lang.String r1 = "Service connect failed to get IMeasurementService"
            r5.a(r1)     // Catch:{ all -> 0x001a }
        L_0x0069:
            if (r0 != 0) goto L_0x007e
            r3.a = r4     // Catch:{ all -> 0x001a }
            defpackage.bzs.a()     // Catch:{ IllegalArgumentException -> 0x008c }
            euj r4 = r3.c     // Catch:{ IllegalArgumentException -> 0x008c }
            android.content.Context r4 = r4.m()     // Catch:{ IllegalArgumentException -> 0x008c }
            euj r5 = r3.c     // Catch:{ IllegalArgumentException -> 0x008c }
            euw r5 = r5.a     // Catch:{ IllegalArgumentException -> 0x008c }
            defpackage.bzs.a(r4, r5)     // Catch:{ IllegalArgumentException -> 0x008c }
            goto L_0x008c
        L_0x007e:
            euj r4 = r3.c     // Catch:{ all -> 0x001a }
            esl r4 = r4.p()     // Catch:{ all -> 0x001a }
            eux r5 = new eux     // Catch:{ all -> 0x001a }
            r5.<init>(r3, r0)     // Catch:{ all -> 0x001a }
            r4.a(r5)     // Catch:{ all -> 0x001a }
        L_0x008c:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            return
        L_0x008e:
            monitor-exit(r3)     // Catch:{ all -> 0x001a }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euw.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bxo.b("MeasurementServiceConnection.onServiceDisconnected");
        this.c.q().j.a("Service disconnected");
        this.c.p().a((Runnable) new euy(this, componentName));
    }
}
