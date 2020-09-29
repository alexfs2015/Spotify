package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: cyd reason: default package */
public final class cyd extends ddp<cyd, a> implements des {
    private static volatile dfc<cyd> zzakh;
    /* access modifiers changed from: private */
    public static final cyd zzdiq = new cyd();
    /* access modifiers changed from: 0000 */
    public int zzdih;
    private cyh zzdio;
    zzbah zzdip = zzbah.a;

    /* renamed from: cyd$a */
    public static final class a extends defpackage.ddp.a<cyd, a> implements des {
        private a() {
            super(cyd.zzdiq);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a() {
            d();
            ((cyd) this.a).zzdih = 0;
            return this;
        }

        public final a a(zzbah zzbah) {
            d();
            cyd.a((cyd) this.a, zzbah);
            return this;
        }

        public final a a(cyh cyh) {
            d();
            cyd.a((cyd) this.a, cyh);
            return this;
        }
    }

    static {
        ddp.a(cyd.class, zzdiq);
    }

    private cyd() {
    }

    public static cyd a(zzbah zzbah) {
        return (cyd) ddp.a(zzdiq, zzbah);
    }

    static /* synthetic */ void a(cyd cyd, zzbah zzbah) {
        if (zzbah != null) {
            cyd.zzdip = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(cyd cyd, cyh cyh) {
        if (cyh != null) {
            cyd.zzdio = cyh;
            return;
        }
        throw new NullPointerException();
    }

    public static a b() {
        return (a) ((defpackage.ddp.a) zzdiq.a(e.e));
    }

    public static cyd c() {
        return zzdiq;
    }

    public final cyh a() {
        cyh cyh = this.zzdio;
        return cyh == null ? cyh.a() : cyh;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [dfc<cyd>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [dfc<cyd>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [dfc<cyd>, ddp$b] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v13
      assigns: []
      uses: []
      mth insns count: 42
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r4) {
        /*
            r3 = this;
            int[] r0 = defpackage.cye.a
            r1 = 1
            int r4 = r4 - r1
            r4 = r0[r4]
            r0 = 0
            switch(r4) {
                case 1: goto L_0x0053;
                case 2: goto L_0x004d;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                case 5: goto L_0x0017;
                case 6: goto L_0x0012;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
            r4.<init>()
            throw r4
        L_0x0010:
            r4 = 0
            return r4
        L_0x0012:
            java.lang.Byte r4 = java.lang.Byte.valueOf(r1)
            return r4
        L_0x0017:
            dfc<cyd> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<cyd> r0 = defpackage.cyd.class
            monitor-enter(r0)
            dfc<cyd> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
            cyd r1 = zzdiq     // Catch:{ all -> 0x002d }
            r4.<init>(r1)     // Catch:{ all -> 0x002d }
            zzakh = r4     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r4 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r4
        L_0x0030:
            return r4
        L_0x0031:
            cyd r4 = zzdiq
            return r4
        L_0x0034:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdih"
            r4[r0] = r2
            java.lang.String r0 = "zzdio"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdip"
            r4[r0] = r1
            cyd r0 = zzdiq
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x004d:
            cyd$a r4 = new cyd$a
            r4.<init>(r0)
            return r4
        L_0x0053:
            cyd r4 = new cyd
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyd.a(int):java.lang.Object");
    }
}
