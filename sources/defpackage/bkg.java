package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.internal.ads.zzhu.zza.zzb;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

@cfp
/* renamed from: bkg reason: default package */
public abstract class bkg extends bif implements bht, bjv, ecr {
    private transient boolean j;
    protected final edg o;

    public bkg(Context context, dpt dpt, String str, edg edg, cpp cpp, bkz bkz) {
        this(new bkd(context, dpt, str, cpp), edg, bkz);
    }

    private bkg(bkd bkd, edg edg, bkz bkz) {
        super(bkd, bkz);
        this.o = edg;
        this.j = false;
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
    private final defpackage.cgm a(defpackage.dpp r57, android.os.Bundle r58, defpackage.clu r59, int r60) {
        /*
            r56 = this;
            r1 = r56
            r0 = r59
            bkd r2 = r1.e
            android.content.Context r2 = r2.c
            android.content.pm.ApplicationInfo r8 = r2.getApplicationInfo()
            r3 = 0
            bkd r4 = r1.e     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.Context r4 = r4.c     // Catch:{ NameNotFoundException -> 0x001d }
            car r4 = defpackage.cas.a(r4)     // Catch:{ NameNotFoundException -> 0x001d }
            java.lang.String r5 = r8.packageName     // Catch:{ NameNotFoundException -> 0x001d }
            android.content.pm.PackageInfo r4 = r4.b(r5, r3)     // Catch:{ NameNotFoundException -> 0x001d }
            r9 = r4
            goto L_0x001e
        L_0x001d:
            r9 = 0
        L_0x001e:
            bkd r4 = r1.e
            android.content.Context r4 = r4.c
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            bkd r5 = r1.e
            bke r5 = r5.f
            r6 = 5
            r7 = 1
            if (r5 == 0) goto L_0x0096
            bkd r5 = r1.e
            bke r5 = r5.f
            android.view.ViewParent r5 = r5.getParent()
            if (r5 == 0) goto L_0x0096
            r5 = 2
            int[] r5 = new int[r5]
            bkd r10 = r1.e
            bke r10 = r10.f
            r10.getLocationOnScreen(r5)
            r10 = r5[r3]
            r5 = r5[r7]
            bkd r11 = r1.e
            bke r11 = r11.f
            int r11 = r11.getWidth()
            bkd r12 = r1.e
            bke r12 = r12.f
            int r12 = r12.getHeight()
            bkd r13 = r1.e
            bke r13 = r13.f
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
            clv r5 = defpackage.bkc.i()
            cmc r5 = r5.c
            java.lang.String r10 = r5.a()
            bkd r5 = r1.e
            cls r11 = new cls
            bkd r12 = r1.e
            java.lang.String r12 = r12.b
            r11.<init>(r10, r12)
            r5.l = r11
            bkd r5 = r1.e
            cls r5 = r5.l
            java.lang.Object r11 = r5.c
            monitor-enter(r11)
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x03be }
            r5.i = r12     // Catch:{ all -> 0x03be }
            cme r12 = r5.a     // Catch:{ all -> 0x03be }
            r13 = r8
            long r7 = r5.i     // Catch:{ all -> 0x03be }
            r5 = r57
            r12.a(r5, r7)     // Catch:{ all -> 0x03be }
            monitor-exit(r11)     // Catch:{ all -> 0x03be }
            defpackage.bkc.e()
            bkd r7 = r1.e
            android.content.Context r7 = r7.c
            bkd r8 = r1.e
            bke r8 = r8.f
            bkd r11 = r1.e
            dpt r11 = r11.i
            java.lang.String r21 = defpackage.cmu.a(r7, r8, r11)
            r7 = 0
            bkd r11 = r1.e
            drj r11 = r11.q
            if (r11 == 0) goto L_0x00ef
            bkd r11 = r1.e     // Catch:{ RemoteException -> 0x00ec }
            drj r11 = r11.q     // Catch:{ RemoteException -> 0x00ec }
            long r6 = r11.a()     // Catch:{ RemoteException -> 0x00ec }
            r22 = r6
            goto L_0x00f1
        L_0x00ec:
            defpackage.cpn.a(r6)
        L_0x00ef:
            r22 = r7
        L_0x00f1:
            java.util.UUID r6 = java.util.UUID.randomUUID()
            java.lang.String r24 = r6.toString()
            cme r6 = defpackage.bkc.j()
            bkd r7 = r1.e
            android.content.Context r7 = r7.c
            android.os.Bundle r16 = r6.a(r7, r1, r10)
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r6 = 0
        L_0x0110:
            bkd r7 = r1.e
            dv<java.lang.String, dxb> r7 = r7.v
            int r7 = r7.size()
            if (r6 >= r7) goto L_0x0141
            bkd r7 = r1.e
            dv<java.lang.String, dxb> r7 = r7.v
            java.lang.Object r7 = r7.b(r6)
            java.lang.String r7 = (java.lang.String) r7
            r12.add(r7)
            bkd r8 = r1.e
            dv<java.lang.String, dwy> r8 = r8.u
            boolean r8 = r8.containsKey(r7)
            if (r8 == 0) goto L_0x013e
            bkd r8 = r1.e
            dv<java.lang.String, dwy> r8 = r8.u
            java.lang.Object r8 = r8.get(r7)
            if (r8 == 0) goto L_0x013e
            r11.add(r7)
        L_0x013e:
            int r6 = r6 + 1
            goto L_0x0110
        L_0x0141:
            bkj r6 = new bkj
            r6.<init>(r1)
            cqi r35 = defpackage.cms.a(r6)
            bkk r6 = new bkk
            r6.<init>(r1)
            cqi r45 = defpackage.cms.a(r6)
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = r0.d
            r36 = r0
            goto L_0x015c
        L_0x015a:
            r36 = 0
        L_0x015c:
            bkd r0 = r1.e
            java.util.List<java.lang.String> r0 = r0.F
            if (r0 == 0) goto L_0x020e
            bkd r0 = r1.e
            java.util.List<java.lang.String> r0 = r0.F
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x020e
            if (r9 == 0) goto L_0x0171
            int r0 = r9.versionCode
            goto L_0x0172
        L_0x0171:
            r0 = 0
        L_0x0172:
            clv r6 = defpackage.bkc.i()
            cmn r6 = r6.g()
            int r6 = r6.i()
            if (r0 <= r6) goto L_0x01ef
            clv r6 = defpackage.bkc.i()
            cmn r6 = r6.g()
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
            clv r3 = defpackage.bkc.i()
            cmn r3 = r3.g()
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
            clv r0 = defpackage.bkc.i()
            cmn r0 = r0.g()
            org.json.JSONObject r0 = r0.n()
            if (r0 == 0) goto L_0x020e
            bkd r3 = r1.e
            java.lang.String r3 = r3.b
            org.json.JSONArray r0 = r0.optJSONArray(r3)
            if (r0 == 0) goto L_0x020e
            java.lang.String r0 = r0.toString()
            r47 = r0
            goto L_0x0210
        L_0x020e:
            r47 = 0
        L_0x0210:
            cgm r0 = new cgm
            bkd r3 = r1.e
            dpt r6 = r3.i
            bkd r3 = r1.e
            java.lang.String r7 = r3.b
            java.lang.String r15 = defpackage.dqe.c()
            bkd r3 = r1.e
            cpp r8 = r3.e
            bkd r3 = r1.e
            java.util.List<java.lang.String> r3 = r3.F
            clv r19 = defpackage.bkc.i()
            cmn r19 = r19.g()
            boolean r19 = r19.c()
            int r2 = r4.widthPixels
            r25 = r2
            int r2 = r4.heightPixels
            float r4 = r4.density
            java.util.List r26 = defpackage.dtg.a()
            r27 = r3
            bkd r3 = r1.e
            java.lang.String r3 = r3.a
            r28 = r3
            bkd r3 = r1.e
            dvg r3 = r3.w
            r29 = r3
            bkd r3 = r1.e
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
            cnl r3 = defpackage.bkc.D()
            float r32 = r3.a()
            cnl r3 = defpackage.bkc.D()
            boolean r33 = r3.b()
            defpackage.bkc.e()
            bkd r3 = r1.e
            android.content.Context r3 = r3.c
            int r34 = defpackage.cmu.h(r3)
            defpackage.bkc.e()
            bkd r3 = r1.e
            bke r3 = r3.f
            int r37 = defpackage.cmu.d(r3)
            bkd r3 = r1.e
            android.content.Context r3 = r3.c
            boolean r4 = r3 instanceof android.app.Activity
            clv r3 = defpackage.bkc.i()
            cmn r3 = r3.g()
            boolean r38 = r3.h()
            clv r3 = defpackage.bkc.i()
            cly r3 = r3.i
            r3.a()
            int r3 = r3.a
            r39 = r4
            int r4 = defpackage.clz.b
            if (r3 != r4) goto L_0x02c4
            r40 = 1
            goto L_0x02c6
        L_0x02c4:
            r40 = 0
        L_0x02c6:
            css r3 = defpackage.bkc.z()
            java.util.List<csq> r3 = r3.a
            int r41 = r3.size()
            defpackage.bkc.e()
            android.os.Bundle r42 = defpackage.cmu.c()
            cnu r3 = defpackage.bkc.o()
            java.lang.String r43 = r3.a()
            bkd r3 = r1.e
            drw r4 = r3.y
            cnu r3 = defpackage.bkc.o()
            boolean r44 = r3.b()
            dzt r3 = defpackage.dzt.a()
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
            clv r3 = defpackage.bkc.i()
            cmn r3 = r3.g()
            bkd r4 = r1.e
            java.lang.String r4 = r4.b
            boolean r49 = r3.c(r4)
            bkd r3 = r1.e
            java.util.List<java.lang.Integer> r5 = r3.A
            bkd r3 = r1.e
            android.content.Context r3 = r3.c
            car r3 = defpackage.cas.a(r3)
            boolean r50 = r3.a()
            clv r3 = defpackage.bkc.i()
            cly r3 = r3.i
            r3.a()
            int r3 = r3.a
            int r4 = defpackage.clz.c
            if (r3 != r4) goto L_0x034d
            r51 = 1
            goto L_0x034f
        L_0x034d:
            r51 = 0
        L_0x034f:
            defpackage.bkc.g()
            boolean r52 = defpackage.cna.e()
            clv r3 = defpackage.bkc.i()
            cqi r3 = r3.h()
            r17 = r5
            r4 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS
            r18 = r8
            r8 = 0
            java.lang.Object r1 = defpackage.cpx.a(r3, r8, r4, r1)
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bkg.a(dpp, android.os.Bundle, clu, int):cgm");
    }

    static String c(clq clq) {
        if (clq == null) {
            return null;
        }
        String str = clq.q;
        if (("com.google.android.gms.ads.mediation.customevent.CustomEventAdapter".equals(str) || "com.google.ads.mediation.customevent.CustomEventAdapter".equals(str)) && clq.o != null) {
            try {
                return new JSONObject(clq.o.k).getString("class_name");
            } catch (NullPointerException | JSONException unused) {
            }
        }
        return str;
    }

    public void I() {
        cpn.a(5);
    }

    public void I_() {
        this.j = false;
        u();
        cls cls = this.e.l;
        synchronized (cls.c) {
            if (cls.j != -1 && !cls.b.isEmpty()) {
                clt clt = (clt) cls.b.getLast();
                if (clt.b == -1) {
                    clt.b = SystemClock.elapsedRealtime();
                    cls.a.a(cls);
                }
            }
        }
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

    public void U() {
        cpn.a(5);
    }

    /* access modifiers changed from: protected */
    public boolean V() {
        bkc.e();
        if (cmu.a(this.e.c, "android.permission.INTERNET")) {
            bkc.e();
            if (cmu.a(this.e.c)) {
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

    public final void Z() {
        if (this.e.j != null) {
            String str = this.e.j.q;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74);
            sb.append("Mediation adapter ");
            sb.append(str);
            sb.append(" refreshed, but mediation adapters should never refresh.");
            sb.toString();
            cpn.a(5);
        }
        a(this.e.j, true);
        b(this.e.j, true);
        x();
    }

    public final String a() {
        if (this.e.j == null) {
            return null;
        }
        return this.e.j.q;
    }

    /* access modifiers changed from: protected */
    public void a(clq clq, boolean z) {
        if (clq == null) {
            cpn.a(5);
            return;
        }
        if (clq == null) {
            cpn.a(5);
        } else {
            cpn.a(3);
            if (this.e.l != null) {
                cls cls = this.e.l;
                synchronized (cls.c) {
                    if (cls.j != -1 && cls.e == -1) {
                        cls.e = SystemClock.elapsedRealtime();
                        cls.a.a(cls);
                    }
                    cls.a.b();
                }
            }
            clq.K.a(zzb.AD_IMPRESSION);
            if (clq.e != null && !clq.D) {
                bkc.e();
                cmu.a(this.e.c, this.e.e.a, b(clq.e));
                clq.D = true;
            }
        }
        if (!clq.F || z) {
            if (!(clq.r == null || clq.r.d == null)) {
                bkc.x();
                ecz.a(this.e.c, this.e.e.a, clq, this.e.b, z, b(clq.r.d));
            }
            if (!(clq.o == null || clq.o.g == null)) {
                bkc.x();
                ecz.a(this.e.c, this.e.e.a, clq, this.e.b, z, clq.o.g);
            }
            clq.F = true;
        }
    }

    public final void a(dwn dwn, String str) {
        Object obj;
        dwy dwy = null;
        if (dwn != null) {
            try {
                obj = dwn.l();
            } catch (RemoteException unused) {
                cpn.a(5);
                return;
            }
        } else {
            obj = null;
        }
        if (!(this.e.u == null || obj == null)) {
            dwy = (dwy) this.e.u.get(obj);
        }
        if (dwy == null) {
            cpn.a(5);
        } else {
            dwy.a(dwn, str);
        }
    }

    public final boolean a(cgm cgm, dtt dtt) {
        this.a = dtt;
        dtt.a("seq_num", cgm.g);
        dtt.a("request_id", cgm.v);
        dtt.a("session_id", cgm.h);
        if (cgm.f != null) {
            dtt.a("app_version", String.valueOf(cgm.f.versionCode));
        }
        bkd bkd = this.e;
        bkc.a();
        Context context = this.e.c;
        doc doc = this.i.d;
        cmg chh = cgm.b.c.getBundle("sdk_less_server_data") != null ? new chh(context, cgm, this, doc) : new cfs(context, cgm, this, doc);
        chh.h();
        bkd.g = chh;
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(clq clq) {
        dpp dpp;
        boolean z = false;
        if (this.f != null) {
            dpp = this.f;
            this.f = null;
        } else {
            dpp = clq.a;
            if (dpp.c != null) {
                z = dpp.c.getBoolean("_noRefresh", false);
            }
        }
        return a(dpp, clq, z);
    }

    /* access modifiers changed from: protected */
    public boolean a(clq clq, clq clq2) {
        int i;
        if (!(clq == null || clq.s == null)) {
            clq.s.a((ecr) null);
        }
        if (clq2.s != null) {
            clq2.s.a((ecr) this);
        }
        int i2 = 0;
        if (clq2.r != null) {
            i2 = clq2.r.r;
            i = clq2.r.s;
        } else {
            i = 0;
        }
        cmd cmd = this.e.G;
        synchronized (cmd.a) {
            cmd.b = i2;
            cmd.c = i;
            cmd.d.a(cmd);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public boolean a(dpp dpp, clq clq, boolean z) {
        bjs bjs;
        long j2;
        if (!z && this.e.c()) {
            if (clq.i > 0) {
                bjs = this.d;
                j2 = clq.i;
            } else if (clq.r != null && clq.r.j > 0) {
                bjs = this.d;
                j2 = clq.r.j;
            } else if (!clq.n && clq.d == 2) {
                this.d.a(dpp);
            }
            bjs.a(dpp, j2);
        }
        return this.d.b;
    }

    public boolean a(dpp dpp, dtt dtt) {
        return a(dpp, dtt, 1);
    }

    public final boolean a(dpp dpp, dtt dtt, int i) {
        clu clu;
        if (!V()) {
            return false;
        }
        bkc.e();
        Context context = this.e.c;
        clv i2 = bkc.i();
        dmp a = i2.a(context, i2.d.d(), i2.d.f());
        Bundle a2 = a == null ? null : cmu.a(a);
        this.d.a();
        this.e.I = 0;
        if (((Boolean) dqe.f().a(dtg.cq)).booleanValue()) {
            clu = bkc.i().g().j();
            bkc.m().a(this.e.c, this.e.e, false, clu, clu.c, this.e.b, null);
        } else {
            clu = null;
        }
        return a(a(dpp, a2, clu, i), dtt);
    }

    public final void aa() {
        a(this.e.j, false);
    }

    public final void b(clq clq) {
        super.b(clq);
        if (clq.o != null) {
            cpn.a(3);
            if (this.e.f != null) {
                bke bke = this.e.f;
                cml.a();
                bke.c = false;
            }
            cpn.a(3);
            bkc.x();
            ecz.a(this.e.c, this.e.e.a, clq, this.e.b, false, clq.o.j);
            if (!(clq.r == null || clq.r.g == null || clq.r.g.size() <= 0)) {
                cpn.a(3);
                bkc.e().a(this.e.c, clq.r.g);
            }
        } else {
            cpn.a(3);
            if (this.e.f != null) {
                bke bke2 = this.e.f;
                cml.a();
                bke2.c = true;
            }
        }
        if (clq.d == 3 && clq.r != null && clq.r.f != null) {
            cpn.a(3);
            bkc.x();
            ecz.a(this.e.c, this.e.e.a, clq, this.e.b, false, clq.r.f);
        }
    }

    /* access modifiers changed from: protected */
    public final void b(clq clq, boolean z) {
        if (clq != null) {
            if (!(clq == null || clq.f == null || clq.E)) {
                bkc.e();
                cmu.a(this.e.c, this.e.e.a, a(clq.f));
                clq.E = true;
            }
            if (!clq.G || z) {
                if (!(clq.r == null || clq.r.e == null)) {
                    bkc.x();
                    ecz.a(this.e.c, this.e.e.a, clq, this.e.b, z, a(clq.r.e));
                }
                if (!(clq.o == null || clq.o.h == null)) {
                    bkc.x();
                    ecz.a(this.e.c, this.e.e.a, clq, this.e.b, z, clq.o.h);
                }
                clq.G = true;
            }
        }
    }

    public final void b(String str, String str2) {
        a(str, str2);
    }

    /* access modifiers changed from: protected */
    public final boolean c(dpp dpp) {
        return super.c(dpp) && !this.j;
    }

    public final void d() {
        this.g.b(this.e.j);
    }

    public final void e() {
        if (this.e.j == null) {
            cpn.a(5);
            return;
        }
        if (!(this.e.j.r == null || this.e.j.r.c == null)) {
            bkc.x();
            ecz.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, b(this.e.j.r.c));
        }
        if (!(this.e.j.o == null || this.e.j.o.f == null)) {
            bkc.x();
            ecz.a(this.e.c, this.e.e.a, this.e.j, this.e.b, false, this.e.j.o.f);
        }
        super.e();
    }

    public final void f() {
        this.g.c(this.e.j);
    }

    public void g() {
        this.j = true;
        w();
    }

    public void o() {
        bxo.b("pause must be called on the main UI thread.");
        if (!(this.e.j == null || this.e.j.b == null || !this.e.c())) {
            bkc.g();
            cna.a(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.p == null)) {
            try {
                this.e.j.p.d();
            } catch (RemoteException unused) {
                cpn.a(5);
            }
        }
        this.g.b(this.e.j);
        this.d.b();
    }

    public void p() {
        bxo.b("resume must be called on the main UI thread.");
        cti cti = (this.e.j == null || this.e.j.b == null) ? null : this.e.j.b;
        if (cti != null && this.e.c()) {
            bkc.g();
            cna.b(this.e.j.b);
        }
        if (!(this.e.j == null || this.e.j.p == null)) {
            try {
                this.e.j.p.e();
            } catch (RemoteException unused) {
                cpn.a(5);
            }
        }
        if (cti == null || !cti.G()) {
            this.d.c();
        }
        this.g.c(this.e.j);
    }

    public final void x_() {
        Executor executor = cqo.a;
        bjs bjs = this.d;
        bjs.getClass();
        executor.execute(bkh.a(bjs));
    }

    public final void y_() {
        Executor executor = cqo.a;
        bjs bjs = this.d;
        bjs.getClass();
        executor.execute(bki.a(bjs));
    }
}
