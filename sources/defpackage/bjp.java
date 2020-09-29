package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@cey
/* renamed from: bjp reason: default package */
public abstract class bjp extends bho implements bhc, bje, eca {
    private transient boolean j;
    protected final ecp o;

    public bjp(Context context, dpc dpc, String str, ecp ecp, coy coy, bki bki) {
        this(new bjm(context, dpc, str, coy), ecp, bki);
    }

    private bjp(bjm bjm, ecp ecp, bki bki) {
        super(bjm, bki);
        this.o = ecp;
        this.j = false;
    }

    static String c(ckz ckz) {
        if (ckz == null) {
            return null;
        }
        String str = ckz.q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && ckz.o != null) {
            try {
                return new JSONObject(ckz.o.k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    public final String J_() {
        if (this.e.j == null) {
            return null;
        }
        return c(this.e.j);
    }

    public void S() {
        e();
    }

    public void T() {
        aa();
    }

    /* access modifiers changed from: protected */
    public boolean V() {
        bjl.e();
        if (cmd.a(this.e.c, "android.permission.INTERNET")) {
            bjl.e();
            if (cmd.a(this.e.c)) {
                return true;
            }
        }
        return false;
    }

    public final void W() {
        I_();
    }

    public final void X() {
        v();
    }

    public final void Y() {
        g();
    }

    public final String a() {
        if (this.e.j == null) {
            return null;
        }
        return this.e.j.q;
    }

    public final boolean a(cfv cfv, dtc dtc) {
        this.a = dtc;
        dtc.a("seq_num", cfv.g);
        dtc.a("request_id", cfv.v);
        dtc.a("session_id", cfv.h);
        if (cfv.f != null) {
            dtc.a("app_version", String.valueOf(cfv.f.versionCode));
        }
        bjm bjm = this.e;
        bjl.a();
        Context context = this.e.c;
        dnl dnl = this.i.d;
        clp cgq = cfv.b.c.getBundle("sdk_less_server_data") != null ? new cgq(context, cfv, this, dnl) : new cfb(context, cfv, this, dnl);
        cgq.h();
        bjm.g = cgq;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(ckz ckz) {
        doy doy;
        boolean z = false;
        if (this.f != null) {
            doy = this.f;
            this.f = null;
        } else {
            doy = ckz.a;
            if (doy.c != null) {
                z = doy.c.getBoolean("_noRefresh", false);
            }
        }
        return a(doy, ckz, z);
    }

    public boolean a(doy doy, dtc dtc) {
        return a(doy, dtc, 1);
    }

    public final void aa() {
        a(this.e.j, false);
    }

    /* access modifiers changed from: protected */
    public final void b(ckz ckz, boolean z) {
        if (ckz != null) {
            if (!(ckz == null || ckz.f == null || ckz.E)) {
                bjl.e();
                cmd.a(this.e.c, this.e.e.a, a(ckz.f));
                ckz.E = true;
            }
            if (!ckz.G || z) {
                if (!(ckz.r == null || ckz.r.e == null)) {
                    bjl.x();
                    eci.a(this.e.c, this.e.e.a, ckz, this.e.b, z, a(ckz.r.e));
                }
                if (!(ckz.o == null || ckz.o.h == null)) {
                    bjl.x();
                    eci.a(this.e.c, this.e.e.a, ckz, this.e.b, z, ckz.o.h);
                }
                ckz.G = true;
            }
        }
    }

    public final void b(String str, String str2) {
        a(str, str2);
    }

    /* access modifiers changed from: protected */
    public final boolean c(doy doy) {
        return super.c(doy) && !this.j;
    }

    public final void d() {
        this.g.b(this.e.j);
    }

    public final void f() {
        this.g.c(this.e.j);
    }

    public void g() {
        this.j = true;
        w();
    }

    public final void x_() {
        Executor executor = cpx.a;
        bjb bjb = this.d;
        bjb.getClass();
        executor.execute(bjq.a(bjb));
    }

    public final void y_() {
        Executor executor = cpx.a;
        bjb bjb = this.d;
        bjb.getClass();
        executor.execute(bjr.a(bjb));
    }

    public final boolean a(doy doy, dtc dtc, int i) {
        cld cld;
        if (!V()) {
            return false;
        }
        bjl.e();
        Context context = this.e.c;
        cle i2 = bjl.i();
        dly a = i2.a(context, i2.d.d(), i2.d.f());
        Bundle a2 = a == null ? null : cmd.a(a);
        this.d.a();
        this.e.I = 0;
        if (((Boolean) dpn.f().a(dsp.cq)).booleanValue()) {
            cld = bjl.i().g().j();
            bjl.m().a(this.e.c, this.e.e, false, cld, cld.c, this.e.b, null);
        } else {
            cld = null;
        }
        return a(a(doy, a2, cld, i), dtc);
    }

    public final void b(ckz ckz) {
        super.b(ckz);
        if (ckz.o != null) {
            cow.a(3);
            if (this.e.f != null) {
                bjn bjn = this.e.f;
                clu.a();
                bjn.c = false;
            }
            cow.a(3);
            bjl.x();
            eci.a(this.e.c, this.e.e.a, ckz, this.e.b, false, ckz.o.j);
            if (!(ckz.r == null || ckz.r.g == null || ckz.r.g.size() <= 0)) {
                cow.a(3);
                bjl.e().a(this.e.c, ckz.r.g);
            }
        } else {
            cow.a(3);
            if (this.e.f != null) {
                bjn bjn2 = this.e.f;
                clu.a();
                bjn2.c = true;
            }
        }
        if (ckz.d == 3 && ckz.r != null && ckz.r.f != null) {
            cow.a(3);
            bjl.x();
            eci.a(this.e.c, this.e.e.a, ckz, this.e.b, false, ckz.r.f);
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(ckz ckz, ckz ckz2) {
        int i;
        if (!(ckz == null || ckz.s == null)) {
            ckz.s.a((eca) null);
        }
        if (ckz2.s != null) {
            ckz2.s.a((eca) this);
        }
        int i2 = 0;
        if (ckz2.r != null) {
            i2 = ckz2.r.r;
            i = ckz2.r.s;
        } else {
            i = 0;
        }
        clm clm = this.e.G;
        synchronized (clm.a) {
            clm.b = i2;
            clm.c = i;
            clm.d.a(clm);
        }
        return true;
    }

    public final void e() {
        if (this.e.j == null) {
            cow.a(5);
            return;
        }
        if (!(this.e.j.r == null || this.e.j.r.c == null)) {
            bjl.x();
            eci.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, b(this.e.j.r.c));
        }
        if (!(this.e.j.o == null || this.e.j.o.f == null)) {
            bjl.x();
            eci.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, this.e.j.o.f);
        }
        super.e();
    }

    /* access modifiers changed from: protected */
    public boolean a(doy doy, ckz ckz, boolean z) {
        bjb bjb;
        long j2;
        if (!z && this.e.c()) {
            if (ckz.i > 0) {
                bjb = this.d;
                j2 = ckz.i;
            } else if (ckz.r != null && ckz.r.j > 0) {
                bjb = this.d;
                j2 = ckz.r.j;
            } else if (!ckz.n && ckz.d == 2) {
                this.d.a(doy);
            }
            bjb.a(doy, j2);
        }
        return this.d.b;
    }

    public void o() {
        bwx.b("pause must be called on the main UI thread.");
        if (!(this.e.j == null || this.e.j.b == null || !this.e.c())) {
            bjl.g();
            cmj.a(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.p == null)) {
            try {
                this.e.j.p.d();
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
        this.g.b(this.e.j);
        this.d.b();
    }

    public void p() {
        bwx.b("resume must be called on the main UI thread.");
        csr csr = (this.e.j == null || this.e.j.b == null) ? null : this.e.j.b;
        if (csr != null && this.e.c()) {
            bjl.g();
            cmj.b(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.p == null)) {
            try {
                this.e.j.p.e();
            } catch (RemoteException unused) {
                cow.a(5);
            }
        }
        if (csr == null || !csr.G()) {
            this.d.c();
        }
        this.g.c(this.e.j);
    }

    public void I_() {
        this.j = false;
        u();
        clb clb = this.e.l;
        synchronized (clb.c) {
            if (clb.j != -1 && !clb.b.isEmpty()) {
                clc clc = (clc) clb.b.getLast();
                if (clc.b == -1) {
                    clc.b = SystemClock.elapsedRealtime();
                    clb.a.a(clb);
                }
            }
        }
    }

    public void U() {
        cow.a(5);
    }

    public final void Z() {
        if (this.e.j != null) {
            String str = this.e.j.q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            sb.toString();
            cow.a(5);
        }
        a(this.e.j, true);
        b(this.e.j, true);
        x();
    }

    public final void a(dvw dvw, String str) {
        Object obj;
        dwh dwh = null;
        if (dvw != null) {
            try {
                obj = dvw.l();
            } catch (RemoteException unused) {
                cow.a(5);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.e.u == null || obj == null)) {
            dwh = (dwh) this.e.u.get(obj);
        }
        if (dwh == null) {
            cow.a(5);
        } else {
            dwh.a(dvw, str);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x0266  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02c4  */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x034a  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x034d  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x016e  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0171  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ef  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x025c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.cfv a(defpackage.doy r57, android.os.Bundle r58, defpackage.cld r59, int r60) {
        /*
            r56 = this;
            r1 = r56
            r0 = r59
            bjm r2 = r1.e
            android.content.Context r2 = r2.c
            android.content.pm.ApplicationInfo r8 = r2.getApplicationInfo()
            r3 = 0
            bjm r4 = r1.e     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.Context r4 = r4.c     // Catch:{ NameNotFoundException -> 0x001d }
            caa r4 = defpackage.cab.a(r4)     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r5 = r8.packageName     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.PackageInfo r4 = r4.b(r5, r3)     // Catch:{ NameNotFoundException -> 0x001d }
            r9 = r4
            goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            bjm r4 = r1.e
            android.content.Context r4 = r4.c
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            bjm r5 = r1.e
            bjn r5 = r5.f
            r6 = 5
            r7 = 1
            if (r5 == 0) goto L_0x0096
            bjm r5 = r1.e
            bjn r5 = r5.f
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x0096
            r5 = 2
            int[] r5 = new int[r5]
            bjm r10 = r1.e
            bjn r10 = r10.f
            r10.getLocationOnScreen(r5)
            r10 = r5[r3]
            r5 = r5[r7]
            bjm r11 = r1.e
            bjn r11 = r11.f
            int r11 = r11.getWidth()
            bjm r12 = r1.e
            bjn r12 = r12.f
            int r12 = r12.getHeight()
            bjm r13 = r1.e
            bjn r13 = r13.f
            boolean r13 = r13.isShown()
            if (r13 == 0) goto L_0x0076
            int r13 = r10 + r11
            if (r13 <= 0) goto L_0x0076
            int r13 = r5 + r12
            if (r13 <= 0) goto L_0x0076
            int r13 = r4.widthPixels
            if (r10 > r13) goto L_0x0076
            int r13 = r4.heightPixels
            if (r5 > r13) goto L_0x0076
            r13 = 1
            goto L_0x0077
        L_0x0076:
            r13 = 0
        L_0x0077:
            android.os.Bundle r14 = new android.os.Bundle
            r14.<init>(r6)
            java.lang.String r15 = "x"
            r14.putInt(r15, r10)
            java.lang.String r10 = "y"
            r14.putInt(r10, r5)
            java.lang.String r5 = "width"
            r14.putInt(r5, r11)
            java.lang.String r5 = "height"
            r14.putInt(r5, r12)
            java.lang.String r5 = "visible"
            r14.putInt(r5, r13)
            goto L_0x0097
        L_0x0096:
            r14 = 0
        L_0x0097:
            cle r5 = defpackage.bjl.i()
            cll r5 = r5.c
            java.lang.String r10 = r5.a()
            bjm r5 = r1.e
            clb r11 = new clb
            bjm r12 = r1.e
            java.lang.String r12 = r12.b
            r11.<init>(r10, r12)
            r5.l = r11
            bjm r5 = r1.e
            clb r5 = r5.l
            java.lang.Object r11 = r5.c
            monitor-enter(r11)
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03be }
            r5.i = r12     // Catch:{ all -> 0x03be }
            cln r12 = r5.a     // Catch:{ all -> 0x03be }
            r13 = r8
            long r7 = r5.i     // Catch:{ all -> 0x03be }
            r5 = r57
            r12.a(r5, r7)     // Catch:{ all -> 0x03be }
            monitor-exit(r11)     // Catch:{ all -> 0x03be }
            defpackage.bjl.e()
            bjm r7 = r1.e
            android.content.Context r7 = r7.c
            bjm r8 = r1.e
            bjn r8 = r8.f
            bjm r11 = r1.e
            dpc r11 = r11.i
            java.lang.String r21 = defpackage.cmd.a(r7, r8, r11)
            r7 = 0
            bjm r11 = r1.e
            dqs r11 = r11.q
            if (r11 == 0) goto L_0x00ef
            bjm r11 = r1.e     // Catch:{ RemoteException -> 0x00ec }
            dqs r11 = r11.q     // Catch:{ RemoteException -> 0x00ec }
            long r6 = r11.a()     // Catch:{ RemoteException -> 0x00ec }
            r22 = r6
            goto L_0x00f1
        L_0x00ec:
            defpackage.cow.a(r6)
        L_0x00ef:
            r22 = r7
        L_0x00f1:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r24 = r6.toString()
            cln r6 = defpackage.bjl.j()
            bjm r7 = r1.e
            android.content.Context r7 = r7.c
            android.os.Bundle r16 = r6.a(r7, r1, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r6 = 0
        L_0x0110:
            bjm r7 = r1.e
            dv<java.lang.String, dwk> r7 = r7.v
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0141
            bjm r7 = r1.e
            dv<java.lang.String, dwk> r7 = r7.v
            java.lang.Object r7 = r7.b(r6)
            java.lang.String r7 = (java.lang.String) r7
            r12.add(r7)
            bjm r8 = r1.e
            dv<java.lang.String, dwh> r8 = r8.u
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x013e
            bjm r8 = r1.e
            dv<java.lang.String, dwh> r8 = r8.u
            java.lang.Object r8 = r8.get(r7)
            if (r8 == 0) goto L_0x013e
            r11.add(r7)
        L_0x013e:
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0141:
            bjs r6 = new bjs
            r6.<init>(r1)
            cpr r35 = defpackage.cmb.a(r6)
            bjt r6 = new bjt
            r6.<init>(r1)
            cpr r45 = defpackage.cmb.a(r6)
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = r0.d
            r36 = r0
            goto L_0x015c
        L_0x015a:
            r36 = 0
        L_0x015c:
            bjm r0 = r1.e
            java.util.List<java.lang.String> r0 = r0.F
            if (r0 == 0) goto L_0x020e
            bjm r0 = r1.e
            java.util.List<java.lang.String> r0 = r0.F
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x020e
            if (r9 == 0) goto L_0x0171
            int r0 = r9.versionCode
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            cle r6 = defpackage.bjl.i()
            clw r6 = r6.g()
            int r6 = r6.i()
            if (r0 <= r6) goto L_0x01ef
            cle r6 = defpackage.bjl.i()
            clw r6 = r6.g()
            r6.a()
            java.lang.Object r7 = r6.a
            monitor-enter(r7)
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ all -> 0x01ec }
            r8.<init>()     // Catch:{ all -> 0x01ec }
            r6.q = r8     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences$Editor r8 = r6.d     // Catch:{ all -> 0x01ec }
            if (r8 == 0) goto L_0x01a5
            android.content.SharedPreferences$Editor r8 = r6.d     // Catch:{ all -> 0x01ec }
            java.lang.String r3 = "native_advanced_settings"
            r8.remove(r3)     // Catch:{ all -> 0x01ec }
            android.content.SharedPreferences$Editor r3 = r6.d     // Catch:{ all -> 0x01ec }
            r3.apply()     // Catch:{ all -> 0x01ec }
        L_0x01a5:
            android.os.Bundle r3 = new android.os.Bundle     // Catch:{ all -> 0x01ec }
            r3.<init>()     // Catch:{ all -> 0x01ec }
            java.lang.String r8 = "native_advanced_settings"
            java.lang.String r15 = "{}"
            r3.putString(r8, r15)     // Catch:{ all -> 0x01ec }
            r6.a(r3)     // Catch:{ all -> 0x01ec }
            monitor-exit(r7)     // Catch:{ all -> 0x01ec }
            cle r3 = defpackage.bjl.i()
            clw r3 = r3.g()
            r3.a()
            java.lang.Object r6 = r3.a
            monitor-enter(r6)
            int r7 = r3.o     // Catch:{ all -> 0x01e9 }
            if (r7 != r0) goto L_0x01c9
        L_0x01c7:
            monitor-exit(r6)     // Catch:{ all -> 0x01e9 }
            goto L_0x020e
        L_0x01c9:
            r3.o = r0     // Catch:{ all -> 0x01e9 }
            android.content.SharedPreferences$Editor r7 = r3.d     // Catch:{ all -> 0x01e9 }
            if (r7 == 0) goto L_0x01db
            android.content.SharedPreferences$Editor r7 = r3.d     // Catch:{ all -> 0x01e9 }
            java.lang.String r8 = "version_code"
            r7.putInt(r8, r0)     // Catch:{ all -> 0x01e9 }
            android.content.SharedPreferences$Editor r7 = r3.d     // Catch:{ all -> 0x01e9 }
            r7.apply()     // Catch:{ all -> 0x01e9 }
        L_0x01db:
            android.os.Bundle r7 = new android.os.Bundle     // Catch:{ all -> 0x01e9 }
            r7.<init>()     // Catch:{ all -> 0x01e9 }
            java.lang.String r8 = "version_code"
            r7.putInt(r8, r0)     // Catch:{ all -> 0x01e9 }
            r3.a(r7)     // Catch:{ all -> 0x01e9 }
            goto L_0x01c7
        L_0x01e9:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x01e9 }
            throw r0
        L_0x01ec:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x01ec }
            throw r0
        L_0x01ef:
            cle r0 = defpackage.bjl.i()
            clw r0 = r0.g()
            org.json.JSONObject r0 = r0.n()
            if (r0 == 0) goto L_0x020e
            bjm r3 = r1.e
            java.lang.String r3 = r3.b
            org.json.JSONArray r0 = r0.optJSONArray(r3)
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = r0.toString()
            r47 = r0
            goto L_0x0210
        L_0x020e:
            r47 = 0
        L_0x0210:
            cfv r0 = new cfv
            bjm r3 = r1.e
            dpc r6 = r3.i
            bjm r3 = r1.e
            java.lang.String r7 = r3.b
            java.lang.String r15 = defpackage.dpn.c()
            bjm r3 = r1.e
            coy r8 = r3.e
            bjm r3 = r1.e
            java.util.List<java.lang.String> r3 = r3.F
            cle r19 = defpackage.bjl.i()
            clw r19 = r19.g()
            boolean r19 = r19.c()
            int r2 = r4.widthPixels
            r25 = r2
            int r2 = r4.heightPixels
            float r4 = r4.density
            java.util.List r26 = defpackage.dsp.a()
            r27 = r3
            bjm r3 = r1.e
            java.lang.String r3 = r3.a
            r28 = r3
            bjm r3 = r1.e
            dup r3 = r3.w
            r29 = r3
            bjm r3 = r1.e
            r30 = r4
            boolean r4 = r3.L
            if (r4 == 0) goto L_0x0258
            boolean r4 = r3.M
            if (r4 != 0) goto L_0x0274
        L_0x0258:
            boolean r4 = r3.L
            if (r4 == 0) goto L_0x0266
            boolean r3 = r3.N
            if (r3 == 0) goto L_0x0263
            java.lang.String r3 = "top-scrollable"
            goto L_0x0276
        L_0x0263:
            java.lang.String r3 = "top-locked"
            goto L_0x0276
        L_0x0266:
            boolean r4 = r3.M
            if (r4 == 0) goto L_0x0274
            boolean r3 = r3.N
            if (r3 == 0) goto L_0x0271
            java.lang.String r3 = "bottom-scrollable"
            goto L_0x0276
        L_0x0271:
            java.lang.String r3 = "bottom-locked"
            goto L_0x0276
        L_0x0274:
            java.lang.String r3 = ""
        L_0x0276:
            r31 = r3
            cmu r3 = defpackage.bjl.D()
            float r32 = r3.a()
            cmu r3 = defpackage.bjl.D()
            boolean r33 = r3.b()
            defpackage.bjl.e()
            bjm r3 = r1.e
            android.content.Context r3 = r3.c
            int r34 = defpackage.cmd.h(r3)
            defpackage.bjl.e()
            bjm r3 = r1.e
            bjn r3 = r3.f
            int r37 = defpackage.cmd.d(r3)
            bjm r3 = r1.e
            android.content.Context r3 = r3.c
            boolean r4 = r3 instanceof android.app.Activity
            cle r3 = defpackage.bjl.i()
            clw r3 = r3.g()
            boolean r38 = r3.h()
            cle r3 = defpackage.bjl.i()
            clh r3 = r3.i
            r3.a()
            int r3 = r3.a
            r39 = r4
            int r4 = defpackage.cli.b
            if (r3 != r4) goto L_0x02c4
            r40 = 1
            goto L_0x02c6
        L_0x02c4:
            r40 = 0
        L_0x02c6:
            csb r3 = defpackage.bjl.z()
            java.util.List<crz> r3 = r3.a
            int r41 = r3.size()
            defpackage.bjl.e()
            android.os.Bundle r42 = defpackage.cmd.c()
            cnd r3 = defpackage.bjl.o()
            java.lang.String r43 = r3.a()
            bjm r3 = r1.e
            drf r4 = r3.y
            cnd r3 = defpackage.bjl.o()
            boolean r44 = r3.b()
            dzc r3 = defpackage.dzc.a()
            r46 = r2
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            r48 = r4
            int r4 = r3.a
            java.lang.String r5 = "ipl"
            r2.putInt(r5, r4)
            int r4 = r3.b
            java.lang.String r5 = "ipds"
            r2.putInt(r5, r4)
            int r4 = r3.c
            java.lang.String r5 = "ipde"
            r2.putInt(r5, r4)
            int r4 = r3.d
            java.lang.String r5 = "iph"
            r2.putInt(r5, r4)
            int r3 = r3.e
            java.lang.String r4 = "ipm"
            r2.putInt(r4, r3)
            cle r3 = defpackage.bjl.i()
            clw r3 = r3.g()
            bjm r4 = r1.e
            java.lang.String r4 = r4.b
            boolean r49 = r3.c(r4)
            bjm r3 = r1.e
            java.util.List<java.lang.Integer> r5 = r3.A
            bjm r3 = r1.e
            android.content.Context r3 = r3.c
            caa r3 = defpackage.cab.a(r3)
            boolean r50 = r3.a()
            cle r3 = defpackage.bjl.i()
            clh r3 = r3.i
            r3.a()
            int r3 = r3.a
            int r4 = defpackage.cli.c
            if (r3 != r4) goto L_0x034d
            r51 = 1
            goto L_0x034f
        L_0x034d:
            r51 = 0
        L_0x034f:
            defpackage.bjl.g()
            boolean r52 = defpackage.cmj.e()
            cle r3 = defpackage.bjl.i()
            cpr r3 = r3.h()
            r17 = r5
            r4 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r18 = r8
            r8 = 0
            java.lang.Object r1 = defpackage.cpg.a(r3, r8, r4, r1)
            r53 = r1
            java.util.ArrayList r53 = (java.util.ArrayList) r53
            r1 = r27
            r27 = r28
            r28 = r29
            r3 = r0
            r20 = r30
            r4 = r14
            r54 = r17
            r5 = r57
            r14 = r18
            r8 = r13
            r55 = r11
            r11 = r15
            r15 = r12
            r12 = r14
            r13 = r16
            r14 = r1
            r16 = r58
            r17 = r19
            r18 = r25
            r19 = r46
            r25 = r26
            r26 = r27
            r27 = r28
            r28 = r31
            r29 = r32
            r30 = r33
            r31 = r34
            r32 = r37
            r33 = r39
            r34 = r38
            r37 = r40
            r38 = r41
            r39 = r42
            r40 = r43
            r41 = r48
            r42 = r44
            r43 = r2
            r44 = r49
            r46 = r54
            r48 = r55
            r49 = r60
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            return r0
        L_0x03be:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x03be }
            goto L_0x03c2
        L_0x03c1:
            throw r0
        L_0x03c2:
            goto L_0x03c1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bjp.a(doy, android.os.Bundle, cld, int):cfv");
    }

    /* access modifiers changed from: protected */
    public void a(ckz ckz, boolean z) {
        if (ckz == null) {
            cow.a(5);
            return;
        }
        if (ckz == null) {
            cow.a(5);
        } else {
            cow.a(3);
            if (this.e.l != null) {
                clb clb = this.e.l;
                synchronized (clb.c) {
                    if (clb.j != -1 && clb.e == -1) {
                        clb.e = SystemClock.elapsedRealtime();
                        clb.a.a(clb);
                    }
                    clb.a.b();
                }
            }
            ckz.K.a(zzb.AD_IMPRESSION);
            if (ckz.e != null && !ckz.D) {
                bjl.e();
                cmd.a(this.e.c, this.e.e.a, b(ckz.e));
                ckz.D = true;
            }
        }
        if (!ckz.F || z) {
            if (!(ckz.r == null || ckz.r.d == null)) {
                bjl.x();
                eci.a(this.e.c, this.e.e.a, ckz, this.e.b, z, b(ckz.r.d));
            }
            if (!(ckz.o == null || ckz.o.g == null)) {
                bjl.x();
                eci.a(this.e.c, this.e.e.a, ckz, this.e.b, z, ckz.o.g);
            }
            ckz.F = true;
        }
    }

    public void I() {
        cow.a(5);
    }
}
