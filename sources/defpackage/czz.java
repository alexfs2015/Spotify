package defpackage;

import com.google.android.gms.internal.ads.zzaxi;
import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzayd;

/* renamed from: czz reason: default package */
public final class czz extends ddp<czz, a> implements des {
    private static volatile dfc<czz> zzakh;
    /* access modifiers changed from: private */
    public static final czz zzdlt = new czz();
    private int zzdlq;
    int zzdlr;
    ddu<b> zzdls = dfe.d();

    /* renamed from: czz$a */
    public static final class a extends defpackage.ddp.a<czz, a> implements des {
        private a() {
            super(czz.zzdlt);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    /* renamed from: czz$b */
    public static final class b extends ddp<b, a> implements des {
        private static volatile dfc<b> zzakh;
        /* access modifiers changed from: private */
        public static final b zzdlx = new b();
        private int zzdlj;
        zzaxi zzdlu;
        private int zzdlv;
        int zzdlw;

        /* renamed from: czz$b$a */
        public static final class a extends defpackage.ddp.a<b, a> implements des {
            private a() {
                super(b.zzdlx);
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        static {
            ddp.a(b.class, zzdlx);
        }

        private b() {
        }

        public final zzaxi a() {
            zzaxi zzaxi = this.zzdlu;
            return zzaxi == null ? zzaxi.c() : zzaxi;
        }

        /* JADX WARNING: type inference failed for: r4v9, types: [dfc<czz$b>] */
        /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r4v12, types: [dfc<czz$b>] */
        /* JADX WARNING: type inference failed for: r4v13 */
        /* JADX WARNING: type inference failed for: r4v14, types: [dfc<czz$b>, ddp$b] */
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
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1541)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
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
                int[] r0 = defpackage.daa.a
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
                dfc<czz$b> r4 = zzakh
                if (r4 != 0) goto L_0x0030
                java.lang.Class<czz$b> r0 = defpackage.czz.b.class
                monitor-enter(r0)
                dfc<czz$b> r4 = zzakh     // Catch:{ all -> 0x002d }
                if (r4 != 0) goto L_0x002b
                ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
                czz$b r1 = zzdlx     // Catch:{ all -> 0x002d }
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
                czz$b r4 = zzdlx
                return r4
            L_0x0034:
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r2 = "zzdlu"
                r4[r0] = r2
                java.lang.String r0 = "zzdlv"
                r4[r1] = r0
                r0 = 2
                java.lang.String r1 = "zzdlw"
                r4[r0] = r1
                r0 = 3
                java.lang.String r1 = "zzdlj"
                r4[r0] = r1
                czz$b r0 = zzdlx
                java.lang.String r1 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f"
                java.lang.Object r4 = a(r0, r1, r4)
                return r4
            L_0x0052:
                czz$b$a r4 = new czz$b$a
                r4.<init>(r0)
                return r4
            L_0x0058:
                czz$b r4 = new czz$b
                r4.<init>()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.b.a(int):java.lang.Object");
        }

        public final zzaxl b() {
            zzaxl a2 = zzaxl.a(this.zzdlv);
            return a2 == null ? zzaxl.UNRECOGNIZED : a2;
        }

        public final zzayd c() {
            zzayd a2 = zzayd.a(this.zzdlj);
            return a2 == null ? zzayd.UNRECOGNIZED : a2;
        }
    }

    static {
        ddp.a(czz.class, zzdlt);
    }

    private czz() {
    }

    public static czz a(byte[] bArr) {
        return (czz) ddp.a(zzdlt, bArr);
    }

    public final int a() {
        return this.zzdls.size();
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [dfc<czz>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [dfc<czz>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [dfc<czz>, ddp$b] */
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
            int[] r0 = defpackage.daa.a
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
            dfc<czz> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<czz> r0 = defpackage.czz.class
            monitor-enter(r0)
            dfc<czz> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            ddp$b r4 = new ddp$b     // Catch:{ all -> 0x002d }
            czz r1 = zzdlt     // Catch:{ all -> 0x002d }
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
            czz r4 = zzdlt
            return r4
        L_0x0034:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdlq"
            r4[r0] = r2
            java.lang.String r0 = "zzdlr"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdls"
            r4[r0] = r1
            r0 = 3
            java.lang.Class<czz$b> r1 = defpackage.czz.b.class
            r4[r0] = r1
            czz r0 = zzdlt
            java.lang.String r1 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x0052:
            czz$a r4 = new czz$a
            r4.<init>(r0)
            return r4
        L_0x0058:
            czz r4 = new czz
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czz.a(int):java.lang.Object");
    }
}
