package defpackage;

/* renamed from: czx reason: default package */
public final class czx extends ddp<czx, a> implements des {
    private static volatile dfc<czx> zzakh;
    /* access modifiers changed from: private */
    public static final czx zzdlp = new czx();
    String zzdks;
    String zzdll;
    /* access modifiers changed from: 0000 */
    public int zzdlm;
    /* access modifiers changed from: 0000 */
    public boolean zzdln;
    String zzdlo;

    /* renamed from: czx$a */
    public static final class a extends defpackage.ddp.a<czx, a> implements des {
        private a() {
            super(czx.zzdlp);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a() {
            d();
            ((czx) this.a).zzdlm = 0;
            return this;
        }

        public final a a(String str) {
            d();
            czx.a((czx) this.a, str);
            return this;
        }

        public final a b() {
            d();
            ((czx) this.a).zzdln = true;
            return this;
        }

        public final a b(String str) {
            d();
            czx.b((czx) this.a, str);
            return this;
        }

        public final a c(String str) {
            d();
            czx.c((czx) this.a, str);
            return this;
        }
    }

    static {
        ddp.a(czx.class, zzdlp);
    }

    private czx() {
        String str = "";
        this.zzdll = str;
        this.zzdks = str;
        this.zzdlo = str;
    }

    public static a a() {
        return (a) ((defpackage.ddp.a) zzdlp.a(e.e));
    }

    static /* synthetic */ void a(czx czx, String str) {
        if (str != null) {
            czx.zzdll = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void b(czx czx, String str) {
        if (str != null) {
            czx.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void c(czx czx, String str) {
        if (str != null) {
            czx.zzdlo = str;
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [dfc<czx>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [dfc<czx>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [dfc<czx>, ddp$b] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v13
      assigns: []
      uses: []
      mth insns count: 46
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
            int[] r0 = defpackage.czy.a
            r1 = 1
            int r4 = r4 - r1
            r4 = r0[r4]
            r0 = 0
            switch(r4) {
                case 1: goto L_0x005d;
                case 2: goto L_0x0057;
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
            dfc<czx> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<czx> r0 = defpackage.czx.class
            monitor-enter(r0)
            dfc<czx> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
            czx r1 = zzdlp     // Catch:{ all -> 0x002d }
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
            czx r4 = zzdlp
            return r4
        L_0x0034:
            r4 = 5
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdll"
            r4[r0] = r2
            java.lang.String r0 = "zzdks"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdlm"
            r4[r0] = r1
            r0 = 3
            java.lang.String r1 = "zzdln"
            r4[r0] = r1
            r0 = 4
            java.lang.String r1 = "zzdlo"
            r4[r0] = r1
            czx r0 = zzdlp
            java.lang.String r1 = "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0006\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x0057:
            czx$a r4 = new czx$a
            r4.<init>(r0)
            return r4
        L_0x005d:
            czx r4 = new czx
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czx.a(int):java.lang.Object");
    }
}