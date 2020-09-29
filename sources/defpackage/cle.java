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

@cey
/* renamed from: cle reason: default package */
public final class cle implements cma {
    final Object a = new Object();
    public dkf b;
    public final cll c = new cll();
    public final clw d = new clw();
    Context e;
    coy f;
    dss g = null;
    final AtomicInteger h = new AtomicInteger(0);
    public final clh i = new clh(0);
    private boolean j = false;
    private dly k = null;
    private dlt l = null;
    private Boolean m = null;
    private String n;
    private final Object o = new Object();
    private cpr<ArrayList<String>> p;

    static ArrayList<String> a(Context context) {
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            PackageInfo b2 = cab.a(context).b(context.getApplicationInfo().packageName, 4096);
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

    public final dss a() {
        dss dss;
        synchronized (this.a) {
            dss = this.g;
        }
        return dss;
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
        ces.a(this.e, this.f).a(th, str);
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
        ces.a(this.e, this.f).a(th, str, ((Float) dpn.f().a(dsp.f)).floatValue());
    }

    public final void e() {
        this.h.incrementAndGet();
    }

    public final void f() {
        this.h.decrementAndGet();
    }

    public final clw g() {
        clw clw;
        synchronized (this.a) {
            clw = this.d;
        }
        return clw;
    }

    public final cpr<ArrayList<String>> h() {
        if (this.e != null && bzo.b()) {
            if (!((Boolean) dpn.f().a(dsp.bF)).booleanValue()) {
                synchronized (this.o) {
                    if (this.p != null) {
                        cpr<ArrayList<String>> cpr = this.p;
                        return cpr;
                    }
                    cpr<ArrayList<String>> a2 = cmb.a((Callable<T>) new clf<T>(this));
                    this.p = a2;
                    return a2;
                }
            }
        }
        return cpg.a(new ArrayList());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x008a, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.dly a(android.content.Context r4, boolean r5, boolean r6) {
        /*
            r3 = this;
            dsf<java.lang.Boolean> r0 = defpackage.dsp.Q
            dsn r1 = defpackage.dpn.f()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 != 0) goto L_0x0014
            return r1
        L_0x0014:
            dsf<java.lang.Boolean> r0 = defpackage.dsp.Y
            dsn r2 = defpackage.dpn.f()
            java.lang.Object r0 = r2.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0039
            dsf<java.lang.Boolean> r0 = defpackage.dsp.W
            dsn r2 = defpackage.dpn.f()
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
            dlt r6 = r3.l     // Catch:{ all -> 0x008b }
            if (r6 != 0) goto L_0x0055
            dlt r6 = new dlt     // Catch:{ all -> 0x008b }
            r6.<init>()     // Catch:{ all -> 0x008b }
            r3.l = r6     // Catch:{ all -> 0x008b }
        L_0x0055:
            dly r6 = r3.k     // Catch:{ all -> 0x008b }
            if (r6 != 0) goto L_0x0068
            dly r6 = new dly     // Catch:{ all -> 0x008b }
            dlt r0 = r3.l     // Catch:{ all -> 0x008b }
            coy r1 = r3.f     // Catch:{ all -> 0x008b }
            cew r4 = defpackage.ces.a(r4, r1)     // Catch:{ all -> 0x008b }
            r6.<init>(r0, r4)     // Catch:{ all -> 0x008b }
            r3.k = r6     // Catch:{ all -> 0x008b }
        L_0x0068:
            dly r4 = r3.k     // Catch:{ all -> 0x008b }
            java.lang.Object r6 = r4.c     // Catch:{ all -> 0x008b }
            monitor-enter(r6)     // Catch:{ all -> 0x008b }
            boolean r0 = r4.a     // Catch:{ all -> 0x0086 }
            if (r0 == 0) goto L_0x0077
            r4 = 3
            defpackage.cow.a(r4)     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            goto L_0x007e
        L_0x0077:
            r0 = 1
            r4.a = r0     // Catch:{ all -> 0x0086 }
            monitor-exit(r6)     // Catch:{ all -> 0x0086 }
            r4.start()     // Catch:{ all -> 0x008b }
        L_0x007e:
            r4 = 4
            defpackage.cow.a(r4)     // Catch:{ all -> 0x008b }
            dly r4 = r3.k     // Catch:{ all -> 0x008b }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cle.a(android.content.Context, boolean, boolean):dly");
    }

    public final void c() {
        this.i.a(cli.b, cli.c);
    }

    public final void a(Context context, coy coy) {
        dss dss;
        synchronized (this.a) {
            if (!this.j) {
                this.e = context.getApplicationContext();
                this.f = coy;
                bjl.h().a(bjl.j());
                this.d.a(this.e);
                this.d.a((cma) this);
                ces.a(this.e, this.f);
                this.n = bjl.e().b(context, coy.a);
                this.b = new dkf(context.getApplicationContext(), this.f);
                bjl.n();
                if (!((Boolean) dpn.f().a(dsp.N)).booleanValue()) {
                    clu.a();
                    dss = null;
                } else {
                    dss = new dss();
                }
                this.g = dss;
                cpe.a((cpr) new clg(this).c(), "AppState.registerCsiReporter");
                this.j = true;
                h();
            }
        }
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
            cow.a(5);
            return null;
        }
    }
}
