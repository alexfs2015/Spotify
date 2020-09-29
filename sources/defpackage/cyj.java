package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: cyj reason: default package */
public final class cyj extends ddp<cyj, a> implements des {
    private static volatile dfc<cyj> zzakh;
    /* access modifiers changed from: private */
    public static final cyj zzdiw = new cyj();
    /* access modifiers changed from: 0000 */
    public int zzdih;
    zzbah zzdip = zzbah.a;
    private cyo zzdiv;

    /* renamed from: cyj$a */
    public static final class a extends defpackage.ddp.a<cyj, a> implements des {
        private a() {
            super(cyj.zzdiw);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a() {
            d();
            ((cyj) this.a).zzdih = 0;
            return this;
        }

        public final a a(zzbah zzbah) {
            d();
            cyj.a((cyj) this.a, zzbah);
            return this;
        }

        public final a a(cyo cyo) {
            d();
            cyj.a((cyj) this.a, cyo);
            return this;
        }
    }

    static {
        ddp.a(cyj.class, zzdiw);
    }

    private cyj() {
    }

    public static cyj a(zzbah zzbah) {
        return (cyj) ddp.a(zzdiw, zzbah);
    }

    static /* synthetic */ void a(cyj cyj, zzbah zzbah) {
        if (zzbah != null) {
            cyj.zzdip = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(cyj cyj, cyo cyo) {
        if (cyo != null) {
            cyj.zzdiv = cyo;
            return;
        }
        throw new NullPointerException();
    }

    public static a b() {
        return (a) ((defpackage.ddp.a) zzdiw.a(e.e));
    }

    public final cyo a() {
        cyo cyo = this.zzdiv;
        return cyo == null ? cyo.a() : cyo;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [dfc<cyj>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [dfc<cyj>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [ddp$b, dfc<cyj>] */
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
            int[] r0 = defpackage.cyk.a
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
            dfc<cyj> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<cyj> r0 = defpackage.cyj.class
            monitor-enter(r0)
            dfc<cyj> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
            cyj r1 = zzdiw     // Catch:{ all -> 0x002d }
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
            cyj r4 = zzdiw
            return r4
        L_0x0034:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdih"
            r4[r0] = r2
            java.lang.String r0 = "zzdiv"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdip"
            r4[r0] = r1
            cyj r0 = zzdiw
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x004d:
            cyj$a r4 = new cyj$a
            r4.<init>(r0)
            return r4
        L_0x0053:
            cyj r4 = new cyj
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyj.a(int):java.lang.Object");
    }
}
