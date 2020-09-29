package defpackage;

/* renamed from: dan reason: default package */
public final class dan extends ddp<dan, a> implements des {
    private static volatile dfc<dan> zzakh;
    /* access modifiers changed from: private */
    public static final dan zzdmt = new dan();
    private int zzdlq;
    private String zzdmr = "";
    ddu<czx> zzdms = dfe.d();

    /* renamed from: dan$a */
    public static final class a extends defpackage.ddp.a<dan, a> implements des {
        private a() {
            super(dan.zzdmt);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(czx czx) {
            d();
            dan.a((dan) this.a, czx);
            return this;
        }

        public final a a(String str) {
            d();
            dan.a((dan) this.a, str);
            return this;
        }
    }

    static {
        ddp.a(dan.class, zzdmt);
    }

    private dan() {
    }

    public static a a() {
        return (a) ((defpackage.ddp.a) zzdmt.a(e.e));
    }

    static /* synthetic */ void a(dan dan, czx czx) {
        if (czx != null) {
            if (!dan.zzdms.a()) {
                ddu<czx> ddu = dan.zzdms;
                int size = ddu.size();
                dan.zzdms = ddu.a(size == 0 ? 10 : size << 1);
            }
            dan.zzdms.add(czx);
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(dan dan, String str) {
        if (str != null) {
            dan.zzdmr = str;
            return;
        }
        throw new NullPointerException();
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [dfc<dan>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [dfc<dan>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [dfc<dan>, ddp$b] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v13
      assigns: []
      uses: []
      mth insns count: 44
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
            int[] r0 = defpackage.dao.a
            r1 = 1
            int r4 = r4 - r1
            r4 = r0[r4]
            r0 = 0
            switch(r4) {
                case 1: goto L_0x0058;
                case 2: goto L_0x0052;
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
            dfc<dan> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<dan> r0 = defpackage.dan.class
            monitor-enter(r0)
            dfc<dan> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
            dan r1 = zzdmt     // Catch:{ all -> 0x002d }
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
            dan r4 = zzdmt
            return r4
        L_0x0034:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdlq"
            r4[r0] = r2
            java.lang.String r0 = "zzdmr"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdms"
            r4[r0] = r1
            r0 = 3
            java.lang.Class<czx> r1 = defpackage.czx.class
            r4[r0] = r1
            dan r0 = zzdmt
            java.lang.String r1 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001Ȉ\u0002\u001b"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x0052:
            dan$a r4 = new dan$a
            r4.<init>(r0)
            return r4
        L_0x0058:
            dan r4 = new dan
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dan.a(int):java.lang.Object");
    }
}
