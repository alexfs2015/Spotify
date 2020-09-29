package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: euj reason: default package */
public final class euj extends evi {
    final euw a;
    ere b;
    volatile Boolean c;
    private final ewv d;
    private final evo e;
    private final List<Runnable> f = new ArrayList();
    private final ewv g;

    protected euj(esp esp) {
        super(esp);
        this.e = new evo(esp.l());
        this.a = new euw(this);
        this.d = new eul(this, esp);
        this.g = new eup(this, esp);
    }

    private final ewh a(boolean z) {
        return f().a(z ? q().M_() : null);
    }

    static /* synthetic */ void a(euj euj) {
        euj.c();
        if (euj.v()) {
            euj.q().k.a("Inactivity, disconnecting from the service");
            euj.A();
        }
    }

    static /* synthetic */ void a(euj euj, ComponentName componentName) {
        euj.c();
        if (euj.b != null) {
            euj.b = null;
            euj.q().k.a("Disconnected from device MeasurementService", componentName);
            euj.c();
            euj.z();
        }
    }

    private final void a(Runnable runnable) {
        c();
        if (v()) {
            runnable.run();
        } else if (((long) this.f.size()) >= 1000) {
            q().c.a("Discarding data. Max runnable queue size reached");
        } else {
            this.f.add(runnable);
            this.g.a(60000);
            z();
        }
    }

    public final void A() {
        c();
        D();
        euw euw = this.a;
        if (euw.b != null && (euw.b.g() || euw.b.h())) {
            euw.b.f();
        }
        euw.b = null;
        try {
            bzs.a();
            bzs.a(m(), this.a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        this.b = null;
    }

    /* access modifiers changed from: 0000 */
    public final void B() {
        c();
        q().k.a("Processing queued up service tasks", Integer.valueOf(this.f.size()));
        for (Runnable run : this.f) {
            try {
                run.run();
            } catch (Exception e2) {
                q().c.a("Task exception while flushing queue", e2);
            }
        }
        this.f.clear();
        this.g.c();
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    /* access modifiers changed from: protected */
    public final void a(erb erb, String str) {
        boolean z;
        bxo.a(erb);
        c();
        D();
        erj i = i();
        Parcel obtain = Parcel.obtain();
        erb.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.q().f.a("Event is too long for local database. Sending event directly to service");
            z = false;
        } else {
            z = i.a(0, marshall);
        }
        eur eur = new eur(this, true, z, erb, a(true), str);
        a((Runnable) eur);
    }

    /* access modifiers changed from: protected */
    public final void a(ere ere) {
        c();
        bxo.a(ere);
        this.b = ere;
        y();
        B();
    }

    /* access modifiers changed from: 0000 */
    public final void a(ere ere, bxw bxw, ewh ewh) {
        int i;
        c();
        D();
        int i2 = 0;
        int i3 = 100;
        while (i2 < 1001 && i3 == 100) {
            ArrayList arrayList = new ArrayList();
            List v = i().v();
            if (v != null) {
                arrayList.addAll(v);
                i = v.size();
            } else {
                i = 0;
            }
            if (bxw != null && i < 100) {
                arrayList.add(bxw);
            }
            ArrayList arrayList2 = arrayList;
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayList2.get(i4);
                i4++;
                bxw bxw2 = (bxw) obj;
                if (bxw2 instanceof erb) {
                    try {
                        ere.a((erb) bxw2, ewh);
                    } catch (RemoteException e2) {
                        q().c.a("Failed to send event to the service", e2);
                    }
                } else if (bxw2 instanceof ewa) {
                    try {
                        ere.a((ewa) bxw2, ewh);
                    } catch (RemoteException e3) {
                        q().c.a("Failed to send attribute to the service", e3);
                    }
                } else if (bxw2 instanceof ewl) {
                    try {
                        ere.a((ewl) bxw2, ewh);
                    } catch (RemoteException e4) {
                        q().c.a("Failed to send conditional property to the service", e4);
                    }
                } else {
                    q().c.a("Discarding data. Unrecognized parcel type.");
                }
            }
            i2++;
            i3 = i;
        }
    }

    /* access modifiers changed from: protected */
    public final void a(euf euf) {
        c();
        D();
        a((Runnable) new euo(this, euf));
    }

    /* access modifiers changed from: protected */
    public final void a(ewa ewa) {
        c();
        D();
        erj i = i();
        Parcel obtain = Parcel.obtain();
        boolean z = false;
        ewa.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            i.q().f.a("User property too long for local database. Sending directly to service");
        } else {
            z = i.a(1, marshall);
        }
        a((Runnable) new euv(this, z, ewa, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void a(ewl ewl) {
        boolean z;
        bxo.a(ewl);
        c();
        D();
        erj i = i();
        i.o();
        byte[] a2 = ewd.a((Parcelable) ewl);
        if (a2.length > 131072) {
            i.q().f.a("Conditional user property too long for local database. Sending directly to service");
            z = false;
        } else {
            z = i.a(2, a2);
        }
        eus eus = new eus(this, true, z, new ewl(ewl), a(true), ewl);
        a((Runnable) eus);
    }

    public final void a(AtomicReference<String> atomicReference) {
        c();
        D();
        a((Runnable) new eum(this, atomicReference, a(false)));
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<ewl>> atomicReference, String str, String str2, String str3) {
        c();
        D();
        eut eut = new eut(this, atomicReference, str, str2, str3, a(false));
        a((Runnable) eut);
    }

    /* access modifiers changed from: protected */
    public final void a(AtomicReference<List<ewa>> atomicReference, String str, String str2, String str3, boolean z) {
        c();
        D();
        euu euu = new euu(this, atomicReference, str, str2, str3, z, a(false));
        a((Runnable) euu);
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqw d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ ett e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ erh f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ euj g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ eug h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ erj i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ evh j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewx k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzx l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ erl n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ ewd o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ esl p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ ern q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ ery r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ ewn s() {
        return super.s();
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return false;
    }

    public final boolean v() {
        c();
        D();
        return this.b != null;
    }

    /* access modifiers changed from: protected */
    public final void w() {
        c();
        D();
        a((Runnable) new euq(this, a(true)));
    }

    /* access modifiers changed from: protected */
    public final void x() {
        c();
        D();
        a((Runnable) new eun(this, a(true)));
    }

    /* access modifiers changed from: 0000 */
    public final void y() {
        c();
        this.e.a();
        this.d.a(((Long) erd.N.a()).longValue());
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0119  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void z() {
        /*
            r7 = this;
            r7.c()
            r7.D()
            boolean r0 = r7.v()
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            java.lang.Boolean r0 = r7.c
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0126
            r7.c()
            r7.D()
            ery r0 = r7.r()
            java.lang.Boolean r0 = r0.i()
            if (r0 == 0) goto L_0x002c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x002c
            r0 = 1
            goto L_0x0120
        L_0x002c:
            erh r0 = r7.f()
            int r0 = r0.z()
            if (r0 != r2) goto L_0x003a
        L_0x0036:
            r0 = 1
        L_0x0037:
            r3 = 1
            goto L_0x00ff
        L_0x003a:
            ern r0 = r7.q()
            erp r0 = r0.k
            java.lang.String r3 = "Checking service availability"
            r0.a(r3)
            ewd r0 = r7.o()
            bsp r3 = defpackage.bsp.b()
            android.content.Context r0 = r0.m()
            r4 = 12451000(0xbdfcb8, float:1.7447567E-38)
            int r0 = r3.b(r0, r4)
            if (r0 == 0) goto L_0x00f2
            if (r0 == r2) goto L_0x00e4
            r3 = 2
            if (r0 == r3) goto L_0x00a1
            r3 = 3
            if (r0 == r3) goto L_0x0095
            r3 = 9
            if (r0 == r3) goto L_0x0089
            r3 = 18
            if (r0 == r3) goto L_0x007d
            ern r3 = r7.q()
            erp r3 = r3.f
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r4 = "Unexpected service status"
            r3.a(r4, r0)
        L_0x0079:
            r0 = 0
        L_0x007a:
            r3 = 0
            goto L_0x00ff
        L_0x007d:
            ern r0 = r7.q()
            erp r0 = r0.f
            java.lang.String r3 = "Service updating"
            r0.a(r3)
            goto L_0x0036
        L_0x0089:
            ern r0 = r7.q()
            erp r0 = r0.f
            java.lang.String r3 = "Service invalid"
            r0.a(r3)
            goto L_0x0079
        L_0x0095:
            ern r0 = r7.q()
            erp r0 = r0.f
            java.lang.String r3 = "Service disabled"
            r0.a(r3)
            goto L_0x0079
        L_0x00a1:
            ern r0 = r7.q()
            erp r0 = r0.j
            java.lang.String r3 = "Service container out of date"
            r0.a(r3)
            ewd r0 = r7.o()
            java.lang.Integer r3 = r0.a
            if (r3 != 0) goto L_0x00c7
            defpackage.bsp.b()
            android.content.Context r3 = r0.m()
            int r3 = defpackage.bsp.d(r3)
            int r3 = r3 / 1000
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.a = r3
        L_0x00c7:
            java.lang.Integer r0 = r0.a
            int r0 = r0.intValue()
            r3 = 14500(0x38a4, float:2.0319E-41)
            if (r0 >= r3) goto L_0x00d2
            goto L_0x00ef
        L_0x00d2:
            ery r0 = r7.r()
            java.lang.Boolean r0 = r0.i()
            if (r0 == 0) goto L_0x00e2
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
        L_0x00e2:
            r0 = 1
            goto L_0x007a
        L_0x00e4:
            ern r0 = r7.q()
            erp r0 = r0.k
            java.lang.String r3 = "Service missing"
            r0.a(r3)
        L_0x00ef:
            r0 = 0
            goto L_0x0037
        L_0x00f2:
            ern r0 = r7.q()
            erp r0 = r0.k
            java.lang.String r3 = "Service available"
            r0.a(r3)
            goto L_0x0036
        L_0x00ff:
            if (r0 != 0) goto L_0x0117
            ewn r4 = r7.s()
            boolean r4 = r4.t()
            if (r4 == 0) goto L_0x0117
            ern r3 = r7.q()
            erp r3 = r3.c
            java.lang.String r4 = "No way to upload. Consider using the full version of Analytics"
            r3.a(r4)
            r3 = 0
        L_0x0117:
            if (r3 == 0) goto L_0x0120
            ery r3 = r7.r()
            r3.a(r0)
        L_0x0120:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r7.c = r0
        L_0x0126:
            java.lang.Boolean r0 = r7.c
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0196
            euw r0 = r7.a
            euj r1 = r0.c
            r1.c()
            euj r1 = r0.c
            android.content.Context r1 = r1.m()
            monitor-enter(r0)
            boolean r3 = r0.a     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x014f
            euj r1 = r0.c     // Catch:{ all -> 0x0193 }
            ern r1 = r1.q()     // Catch:{ all -> 0x0193 }
            erp r1 = r1.k     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = "Connection attempt already in progress"
            r1.a(r2)     // Catch:{ all -> 0x0193 }
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return
        L_0x014f:
            erm r3 = r0.b     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x0172
            erm r3 = r0.b     // Catch:{ all -> 0x0193 }
            boolean r3 = r3.h()     // Catch:{ all -> 0x0193 }
            if (r3 != 0) goto L_0x0163
            erm r3 = r0.b     // Catch:{ all -> 0x0193 }
            boolean r3 = r3.g()     // Catch:{ all -> 0x0193 }
            if (r3 == 0) goto L_0x0172
        L_0x0163:
            euj r1 = r0.c     // Catch:{ all -> 0x0193 }
            ern r1 = r1.q()     // Catch:{ all -> 0x0193 }
            erp r1 = r1.k     // Catch:{ all -> 0x0193 }
            java.lang.String r2 = "Already awaiting connection attempt"
            r1.a(r2)     // Catch:{ all -> 0x0193 }
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return
        L_0x0172:
            erm r3 = new erm     // Catch:{ all -> 0x0193 }
            android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0193 }
            r3.<init>(r1, r4, r0, r0)     // Catch:{ all -> 0x0193 }
            r0.b = r3     // Catch:{ all -> 0x0193 }
            euj r1 = r0.c     // Catch:{ all -> 0x0193 }
            ern r1 = r1.q()     // Catch:{ all -> 0x0193 }
            erp r1 = r1.k     // Catch:{ all -> 0x0193 }
            java.lang.String r3 = "Connecting to remote service"
            r1.a(r3)     // Catch:{ all -> 0x0193 }
            r0.a = r2     // Catch:{ all -> 0x0193 }
            erm r1 = r0.b     // Catch:{ all -> 0x0193 }
            r1.l()     // Catch:{ all -> 0x0193 }
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            return
        L_0x0193:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0193 }
            throw r1
        L_0x0196:
            ewn r0 = r7.s()
            boolean r0 = r0.t()
            if (r0 != 0) goto L_0x022a
            android.content.Context r0 = r7.m()
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            android.content.Intent r3 = new android.content.Intent
            r3.<init>()
            android.content.Context r4 = r7.m()
            java.lang.String r5 = "com.google.android.gms.measurement.AppMeasurementService"
            android.content.Intent r3 = r3.setClassName(r4, r5)
            r4 = 65536(0x10000, float:9.18355E-41)
            java.util.List r0 = r0.queryIntentServices(r3, r4)
            if (r0 == 0) goto L_0x01c6
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x01c6
            r1 = 1
        L_0x01c6:
            if (r1 == 0) goto L_0x021f
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "com.google.android.gms.measurement.START"
            r0.<init>(r1)
            android.content.ComponentName r1 = new android.content.ComponentName
            android.content.Context r3 = r7.m()
            java.lang.String r4 = "com.google.android.gms.measurement.AppMeasurementService"
            r1.<init>(r3, r4)
            r0.setComponent(r1)
            euw r1 = r7.a
            euj r3 = r1.c
            r3.c()
            euj r3 = r1.c
            android.content.Context r3 = r3.m()
            bzs r4 = defpackage.bzs.a()
            monitor-enter(r1)
            boolean r5 = r1.a     // Catch:{ all -> 0x021c }
            if (r5 == 0) goto L_0x0202
            euj r0 = r1.c     // Catch:{ all -> 0x021c }
            ern r0 = r0.q()     // Catch:{ all -> 0x021c }
            erp r0 = r0.k     // Catch:{ all -> 0x021c }
            java.lang.String r2 = "Connection attempt already in progress"
            r0.a(r2)     // Catch:{ all -> 0x021c }
            monitor-exit(r1)     // Catch:{ all -> 0x021c }
            return
        L_0x0202:
            euj r5 = r1.c     // Catch:{ all -> 0x021c }
            ern r5 = r5.q()     // Catch:{ all -> 0x021c }
            erp r5 = r5.k     // Catch:{ all -> 0x021c }
            java.lang.String r6 = "Using local app measurement service"
            r5.a(r6)     // Catch:{ all -> 0x021c }
            r1.a = r2     // Catch:{ all -> 0x021c }
            euj r2 = r1.c     // Catch:{ all -> 0x021c }
            euw r2 = r2.a     // Catch:{ all -> 0x021c }
            r5 = 129(0x81, float:1.81E-43)
            r4.b(r3, r0, r2, r5)     // Catch:{ all -> 0x021c }
            monitor-exit(r1)     // Catch:{ all -> 0x021c }
            return
        L_0x021c:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x021c }
            throw r0
        L_0x021f:
            ern r0 = r7.q()
            erp r0 = r0.c
            java.lang.String r1 = "Unable to use remote or local measurement implementation. Please register the AppMeasurementService service in the app manifest"
            r0.a(r1)
        L_0x022a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.euj.z():void");
    }
}
