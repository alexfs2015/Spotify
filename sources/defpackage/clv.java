package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.DynamiteModule.LoadingException;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicInteger;

@cfp
/* renamed from: clv reason: default package */
public final class clv implements cmr {
    final Object a = new Object();
    public dkw b;
    public final cmc c = new cmc();
    public final cmn d = new cmn();
    Context e;
    cpp f;
    dtj g = null;
    final AtomicInteger h = new AtomicInteger(0);
    public final cly i = new cly(0);
    private boolean j = false;
    private dmp k = null;
    private dmk l = null;
    private Boolean m = null;
    private String n;
    private final Object o = new Object();
    private cqi<ArrayList<String>> p;

    static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = cas.a(context).b(context.getApplicationInfo().packageName, 4096);
            if (!(b2.requestedPermissions == null || b2.requestedPermissionsFlags == null)) {
                for (int i2 = 0; i2 < b2.requestedPermissions.length; i2++) {
                    if ((b2.requestedPermissionsFlags[i2] & 2) != 0) {
                        arrayList.add(b2.requestedPermissions[i2]);
                    }
                }
            }
        } catch (NameNotFoundException unused) {
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dmp a(android.content.Context r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            dsw<java.lang.Boolean> r0 = defpackage.dtg.Q
            dte r1 = defpackage.dqe.f()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            dsw<java.lang.Boolean> r0 = defpackage.dtg.Y
            dte r2 = defpackage.dqe.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            dsw<java.lang.Boolean> r0 = defpackage.dtg.W
            dte r2 = defpackage.dqe.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            return r1
        L_0x0039:
            if (r5 == 0) goto L_0x003e
            if (r6 == 0) goto L_0x003e
            return r1
        L_0x003e:
            java.lang.Object r5 = r3.a
            monitor-enter(r5)
            android.os.Looper r6 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x008b }
            if (r6 == 0) goto L_0x0089
            if (r4 != 0) goto L_0x004a
            goto L_0x0089
        L_0x004a:
            dmk r6 = r3.l     // Catch:{ all -> 0x008b }
            if (r6 != 0) goto L_0x0055
            dmk r6 = new dmk     // Catch:{ all -> 0x008b }
            r6.<init>()     // Catch:{ all -> 0x008b }
            r3.l = r6     // Catch:{ all -> 0x008b }
        L_0x0055:
            dmp r6 = r3.k     // Catch:{ all -> 0x008b }
            if (r6 != 0) goto L_0x0068
            dmp r6 = new dmp     // Catch:{ all -> 0x008b }
            dmk r0 = r3.l     // Catch:{ all -> 0x008b }
            cpp r1 = r3.f     // Catch:{ all -> 0x008b }
            cfn r4 = defpackage.cfj.a(r4, r1)     // Catch:{ all -> 0x008b }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x008b }
            r3.k = r6     // Catch:{ all -> 0x008b }
        L_0x0068:
            dmp r4 = r3.k     // Catch:{ all -> 0x008b }
            java.lang.Object r6 = r4.c     // Catch:{ all -> 0x008b }
            monitor-enter(r6)     // Catch:{ all -> 0x008b }
            boolean r0 = r4.a     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0077
            r4 = 3
            defpackage.cpn.a(r4)     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            goto L_0x007e
        L_0x0077:
            r0 = 1
            r4.a = r0     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            r4.start()     // Catch:{ all -> 0x008b }
        L_0x007e:
            r4 = 4
            defpackage.cpn.a(r4)     // Catch:{ all -> 0x008b }
            dmp r4 = r3.k     // Catch:{ all -> 0x008b }
            monitor-exit(r5)     // Catch:{ all -> 0x008b }
            return r4
        L_0x0086:
            r4 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            throw r4     // Catch:{ all -> 0x008b }
        L_0x0089:
            monitor-exit(r5)     // Catch:{ all -> 0x008b }
            return r1
        L_0x008b:
            r4 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008b }
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.clv.a(android.content.Context, boolean, boolean):dmp");
    }

    public final dtj a() {
        dtj dtj;
        synchronized (this.a) {
            dtj = this.g;
        }
        return dtj;
    }

    public final void a(Context context, cpp cpp) {
        dtj dtj;
        synchronized (this.a) {
            if (!this.j) {
                this.e = context.getApplicationContext();
                this.f = cpp;
                bkc.h().a(bkc.j());
                this.d.a(this.e);
                this.d.a((cmr) this);
                cfj.a(this.e, this.f);
                this.n = bkc.e().b(context, cpp.a);
                this.b = new dkw(context.getApplicationContext(), this.f);
                bkc.n();
                if (!((Boolean) dqe.f().a(dtg.N)).booleanValue()) {
                    cml.a();
                    dtj = null;
                } else {
                    dtj = new dtj();
                }
                this.g = dtj;
                cpv.a((cqi) new clx(this).c(), "AppState.registerCsiReporter");
                this.j = true;
                h();
            }
        }
    }

    public final void a(Bundle bundle) {
        String str = "content_url_opted_out";
        if (bundle.containsKey(str)) {
            String str2 = "content_vertical_opted_out";
            if (bundle.containsKey(str2)) {
                a(this.e, bundle.getBoolean(str), bundle.getBoolean(str2));
            }
        }
    }

    public final void a(Boolean bool) {
        synchronized (this.a) {
            this.m = bool;
        }
    }

    public final void a(Throwable th, String str) {
        cfj.a(this.e, this.f).a(th, str);
    }

    public final void a(boolean z) {
        this.i.a(z);
    }

    public final Boolean b() {
        Boolean bool;
        synchronized (this.a) {
            bool = this.m;
        }
        return bool;
    }

    public final void b(Throwable th, String str) {
        cfj.a(this.e, this.f).a(th, str, ((Float) dqe.f().a(dtg.f)).floatValue());
    }

    public final void c() {
        this.i.a(clz.b, clz.c);
    }

    public final Resources d() {
        if (this.f.d) {
            return this.e.getResources();
        }
        Resources resources = null;
        try {
            DynamiteModule a2 = DynamiteModule.a(this.e, DynamiteModule.a, ModuleDescriptor.MODULE_ID);
            if (a2 != null) {
                resources = a2.c.getResources();
            }
            return resources;
        } catch (LoadingException unused) {
            cpn.a(5);
            return null;
        }
    }

    public final void e() {
        this.h.incrementAndGet();
    }

    public final void f() {
        this.h.decrementAndGet();
    }

    public final cmn g() {
        cmn cmn;
        synchronized (this.a) {
            cmn = this.d;
        }
        return cmn;
    }

    public final cqi<ArrayList<String>> h() {
        if (this.e != null && caf.b()) {
            if (!((Boolean) dqe.f().a(dtg.bF)).booleanValue()) {
                synchronized (this.o) {
                    if (this.p != null) {
                        cqi<ArrayList<String>> cqi = this.p;
                        return cqi;
                    }
                    cqi<ArrayList<String>> a2 = cms.a((Callable<T>) new clw<T>(this));
                    this.p = a2;
                    return a2;
                }
            }
        }
        return cpx.a(new ArrayList());
    }
}
