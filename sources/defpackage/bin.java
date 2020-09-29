package defpackage;

import android.content.Context;
import android.os.RemoteException;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@cfp
/* renamed from: bin reason: default package */
public final class bin extends dqn {
    private final Context a;
    private final dqj b;
    private final edg c;
    private final dwr d;
    private final dxg e;
    private final dwu f;
    private final dxe g;
    private final dpt h;
    private final bfv i;
    private final dv<String, dxb> j;
    private final dv<String, dwy> k;
    private final dvg l;
    private final List<String> m;
    private final drj n;
    private final String o;
    private final cpp p;
    private WeakReference<bkg> q;
    private final bkz r;
    /* access modifiers changed from: private */
    public final Object s = new Object();

    bin(Context context, String str, edg edg, cpp cpp, dqj dqj, dwr dwr, dxg dxg, dwu dwu, dv<String, dxb> dvVar, dv<String, dwy> dvVar2, dvg dvg, drj drj, bkz bkz, dxe dxe, dpt dpt, bfv bfv) {
        this.a = context;
        this.o = str;
        this.c = edg;
        this.p = cpp;
        this.b = dqj;
        this.f = dwu;
        this.d = dwr;
        this.e = dxg;
        this.j = dvVar;
        this.k = dvVar2;
        this.l = dvg;
        this.m = f();
        this.n = drj;
        this.r = bkz;
        this.g = dxe;
        this.h = dpt;
        this.i = bfv;
        dtg.a(this.a);
    }

    static /* synthetic */ void a(bin bin, dpp dpp) {
        if (((Boolean) dqe.f().a(dtg.cj)).booleanValue() || bin.e == null) {
            bkt bkt = new bkt(bin.a, bin.r, bin.h, bin.o, bin.c, bin.p);
            bin.q = new WeakReference<>(bkt);
            dxe dxe = bin.g;
            bxo.b("setOnPublisherAdViewLoadedListener must be called on the main UI thread.");
            bkt.e.z = dxe;
            bfv bfv = bin.i;
            if (bfv != null) {
                if (bfv.b != null) {
                    bkt.a(bin.i.b);
                }
                bkt.b(bin.i.a);
            }
            dwr dwr = bin.d;
            bxo.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            bkt.e.r = dwr;
            dxg dxg = bin.e;
            bxo.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            bkt.e.t = dxg;
            dwu dwu = bin.f;
            bxo.b("setOnContentAdLoadedListener must be called on the main UI thread.");
            bkt.e.s = dwu;
            dv<String, dxb> dvVar = bin.j;
            bxo.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            bkt.e.v = dvVar;
            dv<String, dwy> dvVar2 = bin.k;
            bxo.b("setOnCustomClickListener must be called on the main UI thread.");
            bkt.e.u = dvVar2;
            dvg dvg = bin.l;
            bxo.b("setNativeAdOptions must be called on the main UI thread.");
            bkt.e.w = dvg;
            bkt.c(bin.f());
            bkt.a(bin.b);
            bkt.a(bin.n);
            ArrayList arrayList = new ArrayList();
            if (bin.e()) {
                arrayList.add(Integer.valueOf(1));
            }
            if (bin.g != null) {
                arrayList.add(Integer.valueOf(2));
            }
            bkt.d(arrayList);
            if (bin.e()) {
                dpp.c.putBoolean("ina", true);
            }
            if (bin.g != null) {
                dpp.c.putBoolean("iba", true);
            }
            bkt.b(dpp);
            return;
        }
        bin.d();
    }

    static /* synthetic */ void a(bin bin, dpp dpp, int i2) {
        if (((Boolean) dqe.f().a(dtg.cj)).booleanValue() || bin.e == null) {
            bjj bjj = new bjj(bin.a, bin.r, dpt.a(), bin.o, bin.c, bin.p);
            bin.q = new WeakReference<>(bjj);
            dwr dwr = bin.d;
            bxo.b("setOnAppInstallAdLoadedListener must be called on the main UI thread.");
            bjj.e.r = dwr;
            dxg dxg = bin.e;
            bxo.b("setOnUnifiedNativeAdLoadedListener must be called on the main UI thread.");
            bjj.e.t = dxg;
            dwu dwu = bin.f;
            bxo.b("setOnContentAdLoadedListener must be called on the main UI thread.");
            bjj.e.s = dwu;
            dv<String, dxb> dvVar = bin.j;
            bxo.b("setOnCustomTemplateAdLoadedListeners must be called on the main UI thread.");
            bjj.e.v = dvVar;
            bjj.a(bin.b);
            dv<String, dwy> dvVar2 = bin.k;
            bxo.b("setOnCustomClickListener must be called on the main UI thread.");
            bjj.e.u = dvVar2;
            bjj.c(bin.f());
            dvg dvg = bin.l;
            bxo.b("setNativeAdOptions must be called on the main UI thread.");
            bjj.e.w = dvg;
            bjj.a(bin.n);
            bxo.b("setMaxNumberOfAds must be called on the main UI thread.");
            bjj.m = i2;
            bjj.b(dpp);
            return;
        }
        bin.d();
    }

    private static void a(Runnable runnable) {
        cmu.a.post(runnable);
    }

    static /* synthetic */ boolean b(bin bin) {
        return ((Boolean) dqe.f().a(dtg.aK)).booleanValue() && bin.g != null;
    }

    private final void d() {
        dqj dqj = this.b;
        if (dqj != null) {
            try {
                dqj.a(0);
            } catch (RemoteException unused) {
                cpn.a(5);
            }
        }
    }

    private final boolean e() {
        if (this.d == null && this.f == null && this.e == null) {
            dv<String, dxb> dvVar = this.j;
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
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bkg r1 = (defpackage.bkg) r1     // Catch:{ all -> 0x001a }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bin.a():java.lang.String");
    }

    public final void a(dpp dpp) {
        a((Runnable) new bio(this, dpp));
    }

    public final void a(dpp dpp, int i2) {
        if (i2 > 0) {
            a((Runnable) new bip(this, dpp, i2));
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
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bkg r1 = (defpackage.bkg) r1     // Catch:{ all -> 0x001a }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bin.b():java.lang.String");
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
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            java.lang.ref.WeakReference<bkg> r1 = r3.q     // Catch:{ all -> 0x001a }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x001a }
            bkg r1 = (defpackage.bkg) r1     // Catch:{ all -> 0x001a }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bin.c():boolean");
    }
}
