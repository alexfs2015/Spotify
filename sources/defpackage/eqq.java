package defpackage;

import android.content.Context;

/* renamed from: eqq reason: default package */
public final class eqq extends eur {
    private String a;
    private String b;
    private int c;
    private String d;
    private String e;
    private long f;
    private long g;
    private int h;
    private String i;
    private String j;

    eqq(ery ery) {
        super(ery);
    }

    /* access modifiers changed from: protected */
    public final boolean t() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b9  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ec  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x017f A[Catch:{ IllegalStateException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0180 A[Catch:{ IllegalStateException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0189 A[Catch:{ IllegalStateException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019c A[Catch:{ IllegalStateException -> 0x01ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void u() {
        /*
            r13 = this;
            android.content.Context r0 = r13.m()
            java.lang.String r0 = r0.getPackageName()
            android.content.Context r1 = r13.m()
            android.content.pm.PackageManager r1 = r1.getPackageManager()
            java.lang.String r2 = "Unknown"
            java.lang.String r3 = ""
            r4 = 0
            java.lang.String r5 = "unknown"
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r1 != 0) goto L_0x002d
            eqw r1 = r13.q()
            eqy r1 = r1.c
            java.lang.Object r7 = defpackage.eqw.a(r0)
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            r1.a(r8, r7)
        L_0x002a:
            r1 = r2
            goto L_0x008b
        L_0x002d:
            java.lang.String r5 = r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0032 }
            goto L_0x0041
        L_0x0032:
            eqw r7 = r13.q()
            eqy r7 = r7.c
            java.lang.Object r8 = defpackage.eqw.a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.a(r9, r8)
        L_0x0041:
            if (r5 != 0) goto L_0x0046
            java.lang.String r5 = "manual_install"
            goto L_0x004f
        L_0x0046:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x004f
            r5 = r3
        L_0x004f:
            android.content.Context r7 = r13.m()     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0078 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r7 == 0) goto L_0x002a
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0078 }
            java.lang.CharSequence r1 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0078 }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x0078 }
            if (r8 != 0) goto L_0x006e
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0078 }
            goto L_0x006f
        L_0x006e:
            r1 = r2
        L_0x006f:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0074 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0074 }
            goto L_0x008b
        L_0x0074:
            r12 = r2
            r2 = r1
            r1 = r12
            goto L_0x0079
        L_0x0078:
            r1 = r2
        L_0x0079:
            eqw r7 = r13.q()
            eqy r7 = r7.c
            java.lang.Object r8 = defpackage.eqw.a(r0)
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            r7.a(r9, r8, r2)
            r12 = r2
            r2 = r1
            r1 = r12
        L_0x008b:
            r13.a = r0
            r13.d = r5
            r13.b = r2
            r13.c = r6
            r13.e = r1
            r1 = 0
            r13.f = r1
            android.content.Context r5 = r13.m()
            com.google.android.gms.common.api.Status r5 = defpackage.bst.a(r5)
            r6 = 1
            if (r5 == 0) goto L_0x00ac
            boolean r7 = r5.c()
            if (r7 == 0) goto L_0x00ac
            r7 = 1
            goto L_0x00ad
        L_0x00ac:
            r7 = 0
        L_0x00ad:
            ery r8 = r13.r
            java.lang.String r8 = r8.a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r9 = "am"
            if (r8 != 0) goto L_0x00c5
            ery r8 = r13.r
            java.lang.String r8 = r8.b
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00c5
            r8 = 1
            goto L_0x00c6
        L_0x00c5:
            r8 = 0
        L_0x00c6:
            r7 = r7 | r8
            if (r7 != 0) goto L_0x00ea
            if (r5 != 0) goto L_0x00d7
            eqw r5 = r13.q()
            eqy r5 = r5.c
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r5.a(r8)
            goto L_0x00ea
        L_0x00d7:
            eqw r8 = r13.q()
            eqy r8 = r8.c
            int r10 = r5.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r5 = r5.g
            java.lang.String r11 = "GoogleService failed to initialize, status"
            r8.a(r11, r10, r5)
        L_0x00ea:
            if (r7 == 0) goto L_0x0154
            evw r5 = r13.s()
            java.lang.String r7 = "firebase_analytics_collection_enabled"
            java.lang.Boolean r5 = r5.b(r7)
            evw r7 = r13.s()
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x0116
            ery r5 = r13.r
            java.lang.String r5 = r5.a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0154
            eqw r5 = r13.q()
            eqy r5 = r5.i
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r5.a(r6)
            goto L_0x0154
        L_0x0116:
            if (r5 == 0) goto L_0x0134
            boolean r7 = r5.booleanValue()
            if (r7 != 0) goto L_0x0134
            ery r5 = r13.r
            java.lang.String r5 = r5.a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0154
            eqw r5 = r13.q()
            eqy r5 = r5.i
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r5.a(r6)
            goto L_0x0154
        L_0x0134:
            if (r5 != 0) goto L_0x0148
            boolean r5 = defpackage.bst.b()
            if (r5 == 0) goto L_0x0148
            eqw r5 = r13.q()
            eqy r5 = r5.i
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            r5.a(r6)
            goto L_0x0154
        L_0x0148:
            eqw r5 = r13.q()
            eqy r5 = r5.k
            java.lang.String r7 = "Collection enabled"
            r5.a(r7)
            goto L_0x0155
        L_0x0154:
            r6 = 0
        L_0x0155:
            r13.i = r3
            r13.j = r3
            r13.g = r1
            ery r1 = r13.r
            java.lang.String r1 = r1.a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0175
            ery r1 = r13.r
            java.lang.String r1 = r1.b
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0175
            ery r1 = r13.r
            java.lang.String r1 = r1.a
            r13.j = r1
        L_0x0175:
            java.lang.String r1 = defpackage.bst.a()     // Catch:{ IllegalStateException -> 0x01ac }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x01ac }
            if (r2 == 0) goto L_0x0180
            goto L_0x0181
        L_0x0180:
            r3 = r1
        L_0x0181:
            r13.i = r3     // Catch:{ IllegalStateException -> 0x01ac }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x01ac }
            if (r1 != 0) goto L_0x019a
            bxd r1 = new bxd     // Catch:{ IllegalStateException -> 0x01ac }
            android.content.Context r2 = r13.m()     // Catch:{ IllegalStateException -> 0x01ac }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x01ac }
            java.lang.String r2 = "admob_app_id"
            java.lang.String r1 = r1.a(r2)     // Catch:{ IllegalStateException -> 0x01ac }
            r13.j = r1     // Catch:{ IllegalStateException -> 0x01ac }
        L_0x019a:
            if (r6 == 0) goto L_0x01bc
            eqw r1 = r13.q()     // Catch:{ IllegalStateException -> 0x01ac }
            eqy r1 = r1.k     // Catch:{ IllegalStateException -> 0x01ac }
            java.lang.String r2 = "App package, google app id"
            java.lang.String r3 = r13.a     // Catch:{ IllegalStateException -> 0x01ac }
            java.lang.String r5 = r13.i     // Catch:{ IllegalStateException -> 0x01ac }
            r1.a(r2, r3, r5)     // Catch:{ IllegalStateException -> 0x01ac }
            goto L_0x01bc
        L_0x01ac:
            r1 = move-exception
            eqw r2 = r13.q()
            eqy r2 = r2.c
            java.lang.Object r0 = defpackage.eqw.a(r0)
            java.lang.String r3 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r2.a(r3, r0, r1)
        L_0x01bc:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01cd
            android.content.Context r0 = r13.m()
            boolean r0 = defpackage.bzz.a(r0)
            r13.h = r0
            return
        L_0x01cd:
            r13.h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eqq.u():void");
    }

    /* access modifiers changed from: 0000 */
    public final evq a(String str) {
        String str2;
        long j2;
        c();
        String v = v();
        String w = w();
        D();
        String str3 = this.b;
        long y = (long) y();
        D();
        String str4 = this.d;
        D();
        c();
        if (this.f == 0) {
            this.f = this.r.e().a(m(), m().getPackageName());
        }
        long j3 = this.f;
        boolean o = this.r.o();
        boolean z = !r().q;
        c();
        if (!s().c(this.a, eqm.U) || this.r.o()) {
            str2 = A();
        } else {
            str2 = null;
        }
        String str5 = str2;
        D();
        ery ery = this.r;
        Long valueOf = Long.valueOf(ery.b().i.a());
        if (valueOf.longValue() == 0) {
            j2 = ery.l;
        } else {
            j2 = Math.min(ery.l, valueOf.longValue());
        }
        int z2 = z();
        Boolean b2 = s().b("google_analytics_adid_collection_enabled");
        boolean z3 = b2 == null || b2.booleanValue();
        Boolean b3 = s().b("google_analytics_ssaid_collection_enabled");
        boolean z4 = b3 == null || b3.booleanValue();
        erh r = r();
        r.c();
        evq evq = new evq(v, w, str3, y, str4, 14700, j3, str, o, z, str5, 0, j2, z2, z3, z4, r.f().getBoolean("deferred_analytics_collection", false), x());
        return evq;
    }

    private final String A() {
        try {
            Class loadClass = m().getClassLoader().loadClass("com.google.firebase.analytics.FirebaseAnalytics");
            if (loadClass == null) {
                return null;
            }
            try {
                Object invoke = loadClass.getDeclaredMethod("getInstance", new Class[]{Context.class}).invoke(null, new Object[]{m()});
                if (invoke == null) {
                    return null;
                }
                try {
                    return (String) loadClass.getDeclaredMethod("getFirebaseInstanceId", new Class[0]).invoke(invoke, new Object[0]);
                } catch (Exception unused) {
                    q().h.a("Failed to retrieve Firebase Instance Id");
                    return null;
                }
            } catch (Exception unused2) {
                q().g.a("Failed to obtain Firebase Analytics instance");
                return null;
            }
        } catch (ClassNotFoundException unused3) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    public final String v() {
        D();
        return this.a;
    }

    /* access modifiers changed from: 0000 */
    public final String w() {
        D();
        return this.i;
    }

    /* access modifiers changed from: 0000 */
    public final String x() {
        D();
        return this.j;
    }

    /* access modifiers changed from: 0000 */
    public final int y() {
        D();
        return this.c;
    }

    /* access modifiers changed from: 0000 */
    public final int z() {
        D();
        return this.h;
    }

    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    public final /* bridge */ /* synthetic */ eqf d() {
        return super.d();
    }

    public final /* bridge */ /* synthetic */ etc e() {
        return super.e();
    }

    public final /* bridge */ /* synthetic */ eqq f() {
        return super.f();
    }

    public final /* bridge */ /* synthetic */ ets g() {
        return super.g();
    }

    public final /* bridge */ /* synthetic */ etp h() {
        return super.h();
    }

    public final /* bridge */ /* synthetic */ eqs i() {
        return super.i();
    }

    public final /* bridge */ /* synthetic */ euq j() {
        return super.j();
    }

    public final /* bridge */ /* synthetic */ ewg k() {
        return super.k();
    }

    public final /* bridge */ /* synthetic */ bzg l() {
        return super.l();
    }

    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    public final /* bridge */ /* synthetic */ equ n() {
        return super.n();
    }

    public final /* bridge */ /* synthetic */ evm o() {
        return super.o();
    }

    public final /* bridge */ /* synthetic */ eru p() {
        return super.p();
    }

    public final /* bridge */ /* synthetic */ eqw q() {
        return super.q();
    }

    public final /* bridge */ /* synthetic */ erh r() {
        return super.r();
    }

    public final /* bridge */ /* synthetic */ evw s() {
        return super.s();
    }
}
