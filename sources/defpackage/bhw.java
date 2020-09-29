package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@cey
/* renamed from: bhw reason: default package */
public final class bhw extends dpw {
    private final Context a;
    private final dps b;
    private final ecp c;
    private final dwa d;
    private final dwp e;
    private final dwd f;
    private final dwn g;
    private final dpc h;
    private final bfe i;
    private final dv<String, dwk> j;
    private final dv<String, dwh> k;
    private final dup l;
    private final List<String> m;
    private final dqs n;
    private final String o;
    private final coy p;
    private WeakReference<bjp> q;
    private final bki r;
    /* access modifiers changed from: private */
    public final Object s = new Object();

    bhw(Context context, String str, ecp ecp, coy coy, dps dps, dwa dwa, dwp dwp, dwd dwd, dv<String, dwk> dvVar, dv<String, dwh> dvVar2, dup dup, dqs dqs, bki bki, dwn dwn, dpc dpc, bfe bfe) {
        this.a = context;
        this.o = str;
        this.c = ecp;
        this.p = coy;
        this.b = dps;
        this.f = dwd;
        this.d = dwa;
        this.e = dwp;
        this.j = dvVar;
        this.k = dvVar2;
        this.l = dup;
        this.m = f();
        this.n = dqs;
        this.r = bki;
        this.g = dwn;
        this.h = dpc;
        this.i = bfe;
        dsp.a(this.a);
    }

    private static void a(Runnable runnable) {
        cmd.a.post(runnable);
    }

    private final boolean e() {
        if (this.d == null && this.f == null && this.e == null) {
            dv<String, dwk> dvVar = this.j;
            if (dvVar == null || dvVar.size() <= 0) {
                return false;
            }
        }
        return true;
    }

    private final List<String> f() {
        ArrayList arrayList = new ArrayList();
        if (this.f != null) {
            arrayList.add("1");
        }
        if (this.d != null) {
            arrayList.add("2");
        }
        if (this.e != null) {
            arrayList.add("6");
        }
        if (this.j.size() > 0) {
            arrayList.add("3");
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.s
            monitor-enter(r0)
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bjp r1 = (defpackage.bjp) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.a()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhw.a():java.lang.String");
    }

    public final void a(doy doy) {
        a((Runnable) new bhx(this, doy));
    }

    public final void a(doy doy, int i2) {
        if (i2 > 0) {
            a((Runnable) new bhy(this, doy, i2));
            return;
        }
        throw new IllegalArgumentException("Number of ads has to be more than 0");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String b() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.s
            monitor-enter(r0)
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bjp r1 = (defpackage.bjp) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            java.lang.String r2 = r1.J_()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhw.b():java.lang.String");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.s
            monitor-enter(r0)
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bjp> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bjp r1 = (defpackage.bjp) r1     // Catch:{ all -> 0x001a }
            if (r1 == 0) goto L_0x0016
            boolean r2 = r1.s()     // Catch:{ all -> 0x001a }
        L_0x0016:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x0018:
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            return r2
        L_0x001a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x001a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bhw.c():boolean");
    }

    private final void d() {
        dps dps = this.b;
        if (dps != null) {
            try {
                dps.a(0);
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
    }

    static /* synthetic */ boolean b(bhw bhw) {
        return ((Boolean) dpn.f().a(dsp.aK)).booleanValue() && bhw.g != null;
    }

    static /* synthetic */ void a(bhw bhw, doy doy) {
        if (((Boolean) dpn.f().a(dsp.cj)).booleanValue() || bhw.e == null) {
            bkc bkc = new bkc(bhw.a, bhw.r, bhw.h, bhw.o, bhw.c, bhw.p);
            bhw.q = new WeakReference<>(bkc);
            dwn dwn = bhw.g;
            bwx.b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            bkc.e.z = dwn;
            bfe bfe = bhw.i;
            if (bfe != null) {
                if (bfe.b != null) {
                    bkc.a(bhw.i.b);
                }
                bkc.b(bhw.i.a);
            }
            dwa dwa = bhw.d;
            bwx.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            bkc.e.r = dwa;
            dwp dwp = bhw.e;
            bwx.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            bkc.e.t = dwp;
            dwd dwd = bhw.f;
            bwx.b("setOnContentAdLoadedListener must be called on the main UI thread.");
            bkc.e.s = dwd;
            dv<String, dwk> dvVar = bhw.j;
            bwx.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            bkc.e.v = dvVar;
            dv<String, dwh> dvVar2 = bhw.k;
            bwx.b("setOnCustomClickListener must be called on the main UI thread.");
            bkc.e.u = dvVar2;
            dup dup = bhw.l;
            bwx.b("setNativeAdOptions must be called on the main UI thread.");
            bkc.e.w = dup;
            bkc.c(bhw.f());
            bkc.a(bhw.b);
            bkc.a(bhw.n);
            ArrayList arrayList = new ArrayList();
            if (bhw.e()) {
                arrayList.add(Integer.valueOf(1));
            }
            if (bhw.g != null) {
                arrayList.add(Integer.valueOf(2));
            }
            bkc.d(arrayList);
            if (bhw.e()) {
                doy.c.putBoolean("ina", true);
            }
            if (bhw.g != null) {
                doy.c.putBoolean("iba", true);
            }
            bkc.b(doy);
            return;
        }
        bhw.d();
    }

    static /* synthetic */ void a(bhw bhw, doy doy, int i2) {
        if (((Boolean) dpn.f().a(dsp.cj)).booleanValue() || bhw.e == null) {
            bis bis = new bis(bhw.a, bhw.r, dpc.a(), bhw.o, bhw.c, bhw.p);
            bhw.q = new WeakReference<>(bis);
            dwa dwa = bhw.d;
            bwx.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            bis.e.r = dwa;
            dwp dwp = bhw.e;
            bwx.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            bis.e.t = dwp;
            dwd dwd = bhw.f;
            bwx.b("setOnContentAdLoadedListener must be called on the main UI thread.");
            bis.e.s = dwd;
            dv<String, dwk> dvVar = bhw.j;
            bwx.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            bis.e.v = dvVar;
            bis.a(bhw.b);
            dv<String, dwh> dvVar2 = bhw.k;
            bwx.b("setOnCustomClickListener must be called on the main UI thread.");
            bis.e.u = dvVar2;
            bis.c(bhw.f());
            dup dup = bhw.l;
            bwx.b("setNativeAdOptions must be called on the main UI thread.");
            bis.e.w = dup;
            bis.a(bhw.n);
            bwx.b("setMaxNumberOfAds must be called on the main UI thread.");
            bis.m = i2;
            bis.b(doy);
            return;
        }
        bhw.d();
    }
}
