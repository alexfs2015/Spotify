package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: cxi reason: default package */
public final class cxi extends dcy<cxi, a> implements deb {
    private static volatile del<cxi> zzakh;
    /* access modifiers changed from: private */
    public static final cxi zzdik = new cxi();
    /* access modifiers changed from: 0000 */
    public int zzdih;
    private cxm zzdii;
    private cyv zzdij;

    /* renamed from: cxi$a */
    public static final class a extends defpackage.dcy.a<cxi, a> implements deb {
        private a() {
            super(cxi.zzdik);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(int i) {
            d();
            ((cxi) this.a).zzdih = i;
            return this;
        }

        public final a a(cxm cxm) {
            d();
            cxi.a((cxi) this.a, cxm);
            return this;
        }

        public final a a(cyv cyv) {
            d();
            cxi.a((cxi) this.a, cyv);
            return this;
        }
    }

    static {
        dcy.a(cxi.class, zzdik);
    }

    private cxi() {
    }

    public static cxi a(zzbah zzbah) {
        return (cxi) dcy.a(zzdik, zzbah);
    }

    public static a c() {
        return (a) ((defpackage.dcy.a) zzdik.a(e.e));
    }

    public final cxm a() {
        cxm cxm = this.zzdii;
        return cxm == null ? cxm.c() : cxm;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [del<cxi>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [del<cxi>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [del<cxi>, dcy$b] */
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
            int[] r0 = defpackage.cxj.a
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
            del<cxi> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<cxi> r0 = defpackage.cxi.class
            monitor-enter(r0)
            del<cxi> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            dcy$b r4 = new dcy$b     // Catch:{ all -> 0x002d }
            cxi r1 = zzdik     // Catch:{ all -> 0x002d }
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
            cxi r4 = zzdik
            return r4
        L_0x0034:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdih"
            r4[r0] = r2
            java.lang.String r0 = "zzdii"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdij"
            r4[r0] = r1
            cxi r0 = zzdik
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x004d:
            cxi$a r4 = new cxi$a
            r4.<init>(r0)
            return r4
        L_0x0053:
            cxi r4 = new cxi
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cxi.a(int):java.lang.Object");
    }

    public final cyv b() {
        cyv cyv = this.zzdij;
        return cyv == null ? cyv.c() : cyv;
    }

    static /* synthetic */ void a(cxi cxi, cxm cxm) {
        if (cxm != null) {
            cxi.zzdii = cxm;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(cxi cxi, cyv cyv) {
        if (cyv != null) {
            cxi.zzdij = cyv;
            return;
        }
        throw new NullPointerException();
    }
}
