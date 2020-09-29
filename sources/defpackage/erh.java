package defpackage;

import android.content.Context;

/* renamed from: erh reason: default package */
public final class erh extends evi {
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

    erh(esp esp) {
        super(esp);
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
    public final ewh a(String str) {
        c();
        String v = v();
        String w = w();
        D();
        String str2 = this.b;
        long y = (long) y();
        D();
        String str3 = this.d;
        D();
        c();
        if (this.f == 0) {
            this.f = this.r.e().a(m(), m().getPackageName());
        }
        long j2 = this.f;
        boolean o = this.r.o();
        boolean z = !r().q;
        c();
        String A = (!s().c(this.a, erd.U) || this.r.o()) ? A() : null;
        D();
        esp esp = this.r;
        Long valueOf = Long.valueOf(esp.b().i.a());
        long min = valueOf.longValue() == 0 ? esp.l : Math.min(esp.l, valueOf.longValue());
        int z2 = z();
        Boolean b2 = s().b("google_analytics_adid_collection_enabled");
        boolean z3 = b2 == null || b2.booleanValue();
        Boolean b3 = s().b("google_analytics_ssaid_collection_enabled");
        boolean z4 = b3 == null || b3.booleanValue();
        ery r = r();
        r.c();
        ewh ewh = new ewh(v, w, str2, y, str3, 14700, j2, str, o, z, A, 0, min, z2, z3, z4, r.f().getBoolean("deferred_analytics_collection", false), x());
        return ewh;
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
        return true;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0180 A[Catch:{ IllegalStateException -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0181 A[Catch:{ IllegalStateException -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x018a A[Catch:{ IllegalStateException -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x019d A[Catch:{ IllegalStateException -> 0x01ad }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c3  */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01ce  */
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
            ern r1 = r13.q()
            erp r1 = r1.c
            java.lang.Object r7 = defpackage.ern.a(r0)
            java.lang.String r8 = "PackageManager is null, app identity information might be inaccurate. appId"
            r1.a(r8, r7)
        L_0x002a:
            r1 = r2
            goto L_0x008c
        L_0x002d:
            r1.getInstallerPackageName(r0)     // Catch:{ IllegalArgumentException -> 0x0033 }
            java.lang.String r5 = "com.android.vending"
            goto L_0x0042
        L_0x0033:
            ern r7 = r13.q()
            erp r7 = r7.c
            java.lang.Object r8 = defpackage.ern.a(r0)
            java.lang.String r9 = "Error retrieving app installer package name. appId"
            r7.a(r9, r8)
        L_0x0042:
            if (r5 != 0) goto L_0x0047
            java.lang.String r5 = "manual_install"
            goto L_0x0050
        L_0x0047:
            java.lang.String r7 = "com.android.vending"
            boolean r7 = r7.equals(r5)
            if (r7 == 0) goto L_0x0050
            r5 = r3
        L_0x0050:
            android.content.Context r7 = r13.m()     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.String r7 = r7.getPackageName()     // Catch:{ NameNotFoundException -> 0x0079 }
            android.content.pm.PackageInfo r7 = r1.getPackageInfo(r7, r4)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r7 == 0) goto L_0x002a
            android.content.pm.ApplicationInfo r8 = r7.applicationInfo     // Catch:{ NameNotFoundException -> 0x0079 }
            java.lang.CharSequence r1 = r1.getApplicationLabel(r8)     // Catch:{ NameNotFoundException -> 0x0079 }
            boolean r8 = android.text.TextUtils.isEmpty(r1)     // Catch:{ NameNotFoundException -> 0x0079 }
            if (r8 != 0) goto L_0x006f
            java.lang.String r1 = r1.toString()     // Catch:{ NameNotFoundException -> 0x0079 }
            goto L_0x0070
        L_0x006f:
            r1 = r2
        L_0x0070:
            java.lang.String r2 = r7.versionName     // Catch:{ NameNotFoundException -> 0x0075 }
            int r6 = r7.versionCode     // Catch:{ NameNotFoundException -> 0x0075 }
            goto L_0x008c
        L_0x0075:
            r12 = r2
            r2 = r1
            r1 = r12
            goto L_0x007a
        L_0x0079:
            r1 = r2
        L_0x007a:
            ern r7 = r13.q()
            erp r7 = r7.c
            java.lang.Object r8 = defpackage.ern.a(r0)
            java.lang.String r9 = "Error retrieving package info. appId, appName"
            r7.a(r9, r8, r2)
            r12 = r2
            r2 = r1
            r1 = r12
        L_0x008c:
            r13.a = r0
            r13.d = r5
            r13.b = r2
            r13.c = r6
            r13.e = r1
            r1 = 0
            r13.f = r1
            android.content.Context r5 = r13.m()
            com.google.android.gms.common.api.Status r5 = defpackage.btk.a(r5)
            r6 = 1
            if (r5 == 0) goto L_0x00ad
            boolean r7 = r5.c()
            if (r7 == 0) goto L_0x00ad
            r7 = 1
            goto L_0x00ae
        L_0x00ad:
            r7 = 0
        L_0x00ae:
            esp r8 = r13.r
            java.lang.String r8 = r8.a
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            java.lang.String r9 = "am"
            if (r8 != 0) goto L_0x00c6
            esp r8 = r13.r
            java.lang.String r8 = r8.b
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x00c6
            r8 = 1
            goto L_0x00c7
        L_0x00c6:
            r8 = 0
        L_0x00c7:
            r7 = r7 | r8
            if (r7 != 0) goto L_0x00eb
            if (r5 != 0) goto L_0x00d8
            ern r5 = r13.q()
            erp r5 = r5.c
            java.lang.String r8 = "GoogleService failed to initialize (no status)"
            r5.a(r8)
            goto L_0x00eb
        L_0x00d8:
            ern r8 = r13.q()
            erp r8 = r8.c
            int r10 = r5.f
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.String r5 = r5.g
            java.lang.String r11 = "GoogleService failed to initialize, status"
            r8.a(r11, r10, r5)
        L_0x00eb:
            if (r7 == 0) goto L_0x0155
            ewn r5 = r13.s()
            java.lang.String r7 = "firebase_analytics_collection_enabled"
            java.lang.Boolean r5 = r5.b(r7)
            ewn r7 = r13.s()
            boolean r7 = r7.f()
            if (r7 == 0) goto L_0x0117
            esp r5 = r13.r
            java.lang.String r5 = r5.a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0155
            ern r5 = r13.q()
            erp r5 = r5.i
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_deactivated=1"
            r5.a(r6)
            goto L_0x0155
        L_0x0117:
            if (r5 == 0) goto L_0x0135
            boolean r7 = r5.booleanValue()
            if (r7 != 0) goto L_0x0135
            esp r5 = r13.r
            java.lang.String r5 = r5.a
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L_0x0155
            ern r5 = r13.q()
            erp r5 = r5.i
            java.lang.String r6 = "Collection disabled with firebase_analytics_collection_enabled=0"
            r5.a(r6)
            goto L_0x0155
        L_0x0135:
            if (r5 != 0) goto L_0x0149
            boolean r5 = defpackage.btk.b()
            if (r5 == 0) goto L_0x0149
            ern r5 = r13.q()
            erp r5 = r5.i
            java.lang.String r6 = "Collection disabled with google_app_measurement_enable=0"
            r5.a(r6)
            goto L_0x0155
        L_0x0149:
            ern r5 = r13.q()
            erp r5 = r5.k
            java.lang.String r7 = "Collection enabled"
            r5.a(r7)
            goto L_0x0156
        L_0x0155:
            r6 = 0
        L_0x0156:
            r13.i = r3
            r13.j = r3
            r13.g = r1
            esp r1 = r13.r
            java.lang.String r1 = r1.a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0176
            esp r1 = r13.r
            java.lang.String r1 = r1.b
            boolean r1 = r9.equals(r1)
            if (r1 == 0) goto L_0x0176
            esp r1 = r13.r
            java.lang.String r1 = r1.a
            r13.j = r1
        L_0x0176:
            java.lang.String r1 = defpackage.btk.a()     // Catch:{ IllegalStateException -> 0x01ad }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x01ad }
            if (r2 == 0) goto L_0x0181
            goto L_0x0182
        L_0x0181:
            r3 = r1
        L_0x0182:
            r13.i = r3     // Catch:{ IllegalStateException -> 0x01ad }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ IllegalStateException -> 0x01ad }
            if (r1 != 0) goto L_0x019b
            bxu r1 = new bxu     // Catch:{ IllegalStateException -> 0x01ad }
            android.content.Context r2 = r13.m()     // Catch:{ IllegalStateException -> 0x01ad }
            r1.<init>(r2)     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.String r2 = "admob_app_id"
            java.lang.String r1 = r1.a(r2)     // Catch:{ IllegalStateException -> 0x01ad }
            r13.j = r1     // Catch:{ IllegalStateException -> 0x01ad }
        L_0x019b:
            if (r6 == 0) goto L_0x01bd
            ern r1 = r13.q()     // Catch:{ IllegalStateException -> 0x01ad }
            erp r1 = r1.k     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.String r2 = "App package, google app id"
            java.lang.String r3 = r13.a     // Catch:{ IllegalStateException -> 0x01ad }
            java.lang.String r5 = r13.i     // Catch:{ IllegalStateException -> 0x01ad }
            r1.a(r2, r3, r5)     // Catch:{ IllegalStateException -> 0x01ad }
            goto L_0x01bd
        L_0x01ad:
            r1 = move-exception
            ern r2 = r13.q()
            erp r2 = r2.c
            java.lang.Object r0 = defpackage.ern.a(r0)
            java.lang.String r3 = "getGoogleAppId or isMeasurementEnabled failed with exception. appId"
            r2.a(r3, r0, r1)
        L_0x01bd:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 16
            if (r0 < r1) goto L_0x01ce
            android.content.Context r0 = r13.m()
            boolean r0 = defpackage.caq.a(r0)
            r13.h = r0
            return
        L_0x01ce:
            r13.h = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.erh.u():void");
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
}
