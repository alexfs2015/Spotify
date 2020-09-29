package defpackage;

import com.google.android.gms.internal.ads.zzaxl;
import com.google.android.gms.internal.ads.zzayd;

/* renamed from: czk reason: default package */
public final class czk extends dcy<czk, a> implements deb {
    private static volatile del<czk> zzakh;
    /* access modifiers changed from: private */
    public static final czk zzdlz = new czk();
    private int zzdlq;
    /* access modifiers changed from: private */
    public int zzdlr;
    private ddd<b> zzdly = den.d();

    /* renamed from: czk$a */
    public static final class a extends defpackage.dcy.a<czk, a> implements deb {
        private a() {
            super(czk.zzdlz);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(int i) {
            d();
            ((czk) this.a).zzdlr = i;
            return this;
        }

        public final a a(b bVar) {
            d();
            czk.a((czk) this.a, bVar);
            return this;
        }
    }

    /* renamed from: czk$b */
    public static final class b extends dcy<b, a> implements deb {
        private static volatile del<b> zzakh;
        /* access modifiers changed from: private */
        public static final b zzdma = new b();
        private String zzdks = "";
        private int zzdlj;
        private int zzdlv;
        /* access modifiers changed from: private */
        public int zzdlw;

        /* renamed from: czk$b$a */
        public static final class a extends defpackage.dcy.a<b, a> implements deb {
            private a() {
                super(b.zzdma);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(int i) {
                d();
                ((b) this.a).zzdlw = i;
                return this;
            }

            public final a a(zzaxl zzaxl) {
                d();
                b.a((b) this.a, zzaxl);
                return this;
            }

            public final a a(zzayd zzayd) {
                d();
                b.a((b) this.a, zzayd);
                return this;
            }

            public final a a(String str) {
                d();
                b.a((b) this.a, str);
                return this;
            }
        }

        static {
            dcy.a(b.class, zzdma);
        }

        private b() {
        }

        public static a a() {
            return (a) ((defpackage.dcy.a) zzdma.a(e.e));
        }

        /* JADX WARNING: type inference failed for: r4v9, types: [del<czk$b>] */
        /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
        /* JADX WARNING: type inference failed for: r4v12, types: [del<czk$b>] */
        /* JADX WARNING: type inference failed for: r4v13 */
        /* JADX WARNING: type inference failed for: r4v14, types: [dcy$b, del<czk$b>] */
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
                int[] r0 = defpackage.czl.a
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
                del<czk$b> r4 = zzakh
                if (r4 != 0) goto L_0x0030
                java.lang.Class<czk$b> r0 = defpackage.czk.b.class
                monitor-enter(r0)
                del<czk$b> r4 = zzakh     // Catch:{ all -> 0x002d }
                if (r4 != 0) goto L_0x002b
                dcy$b r4 = new dcy$b     // Catch:{ all -> 0x002d }
                czk$b r1 = zzdma     // Catch:{ all -> 0x002d }
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
                czk$b r4 = zzdma
                return r4
            L_0x0034:
                r4 = 4
                java.lang.Object[] r4 = new java.lang.Object[r4]
                java.lang.String r2 = "zzdks"
                r4[r0] = r2
                java.lang.String r0 = "zzdlv"
                r4[r1] = r0
                r0 = 2
                java.lang.String r1 = "zzdlw"
                r4[r0] = r1
                r0 = 3
                java.lang.String r1 = "zzdlj"
                r4[r0] = r1
                czk$b r0 = zzdma
                java.lang.String r1 = "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f"
                java.lang.Object r4 = a(r0, r1, r4)
                return r4
            L_0x0052:
                czk$b$a r4 = new czk$b$a
                r4.<init>(r0)
                return r4
            L_0x0058:
                czk$b r4 = new czk$b
                r4.<init>()
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.czk.b.a(int):java.lang.Object");
        }

        static /* synthetic */ void a(b bVar, String str) {
            if (str != null) {
                bVar.zzdks = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(b bVar, zzaxl zzaxl) {
            if (zzaxl != null) {
                bVar.zzdlv = zzaxl.a();
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(b bVar, zzayd zzayd) {
            if (zzayd != null) {
                bVar.zzdlj = zzayd.a();
                return;
            }
            throw new NullPointerException();
        }
    }

    static {
        dcy.a(czk.class, zzdlz);
    }

    public static a a() {
        return (a) ((defpackage.dcy.a) zzdlz.a(e.e));
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [del<czk>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [del<czk>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [del<czk>, dcy$b] */
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
            int[] r0 = defpackage.czl.a
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
            del<czk> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<czk> r0 = defpackage.czk.class
            monitor-enter(r0)
            del<czk> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            dcy$b r4 = new dcy$b     // Catch:{ all -> 0x002d }
            czk r1 = zzdlz     // Catch:{ all -> 0x002d }
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
            czk r4 = zzdlz
            return r4
        L_0x0034:
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdlq"
            r4[r0] = r2
            java.lang.String r0 = "zzdlr"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdly"
            r4[r0] = r1
            r0 = 3
            java.lang.Class<czk$b> r1 = defpackage.czk.b.class
            r4[r0] = r1
            czk r0 = zzdlz
            java.lang.String r1 = "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0003\u0000\u0001\u0000\u0001\u000b\u0002\u001b"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x0052:
            czk$a r4 = new czk$a
            r4.<init>(r0)
            return r4
        L_0x0058:
            czk r4 = new czk
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czk.a(int):java.lang.Object");
    }

    private czk() {
    }

    static /* synthetic */ void a(czk czk, b bVar) {
        if (bVar != null) {
            if (!czk.zzdly.a()) {
                ddd<b> ddd = czk.zzdly;
                int size = ddd.size();
                czk.zzdly = ddd.a(size == 0 ? 10 : size << 1);
            }
            czk.zzdly.add(bVar);
            return;
        }
        throw new NullPointerException();
    }
}
