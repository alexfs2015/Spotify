package defpackage;

import com.google.android.gms.internal.ads.zzbah;

/* renamed from: cys reason: default package */
public final class cys extends ddp<cys, a> implements des {
    private static volatile dfc<cys> zzakh;
    /* access modifiers changed from: private */
    public static final cys zzdja = new cys();
    int zzdir;

    /* renamed from: cys$a */
    public static final class a extends defpackage.ddp.a<cys, a> implements des {
        private a() {
            super(cys.zzdja);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        ddp.a(cys.class, zzdja);
    }

    private cys() {
    }

    public static cys a(zzbah zzbah) {
        return (cys) ddp.a(zzdja, zzbah);
    }

    /* JADX WARNING: type inference failed for: r3v8, types: [dfc<cys>] */
    /* JADX WARNING: type inference failed for: r3v9, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r3v11, types: [dfc<cys>] */
    /* JADX WARNING: type inference failed for: r3v12 */
    /* JADX WARNING: type inference failed for: r3v13, types: [dfc<cys>, ddp$b] */
    /* JADX WARNING: type inference failed for: r3v17 */
    /* JADX WARNING: type inference failed for: r3v18 */
    /* access modifiers changed from: protected */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v12
      assigns: []
      uses: []
      mth insns count: 38
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
    public final java.lang.Object a(int r3) {
        /*
            r2 = this;
            int[] r0 = defpackage.cyt.a
            r1 = 1
            int r3 = r3 - r1
            r3 = r0[r3]
            r0 = 0
            switch(r3) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0043;
                case 3: goto L_0x0034;
                case 4: goto L_0x0031;
                case 5: goto L_0x0017;
                case 6: goto L_0x0012;
                case 7: goto L_0x0010;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.UnsupportedOperationException r3 = new java.lang.UnsupportedOperationException
            r3.<init>()
            throw r3
        L_0x0010:
            r3 = 0
            return r3
        L_0x0012:
            java.lang.Byte r3 = java.lang.Byte.valueOf(r1)
            return r3
        L_0x0017:
            dfc<cys> r3 = zzakh
            if (r3 != 0) goto L_0x0030
            java.lang.Class<cys> r0 = defpackage.cys.class
            monitor-enter(r0)
            dfc<cys> r3 = zzakh     // Catch:{ all -> 0x002d }
            if (r3 != 0) goto L_0x002b
            ddp$b r3 = new ddp$b     // Catch:{ all -> 0x002d }
            cys r1 = zzdja     // Catch:{ all -> 0x002d }
            r3.<init>(r1)     // Catch:{ all -> 0x002d }
            zzakh = r3     // Catch:{ all -> 0x002d }
        L_0x002b:
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            goto L_0x0030
        L_0x002d:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002d }
            throw r3
        L_0x0030:
            return r3
        L_0x0031:
            cys r3 = zzdja
            return r3
        L_0x0034:
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.lang.String r1 = "zzdir"
            r3[r0] = r1
            cys r0 = zzdja
            java.lang.String r1 = "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0003\u0000\u0000\u0000\u0002\u000b"
            java.lang.Object r3 = a(r0, r1, r3)
            return r3
        L_0x0043:
            cys$a r3 = new cys$a
            r3.<init>(r0)
            return r3
        L_0x0049:
            cys r3 = new cys
            r3.<init>()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cys.a(int):java.lang.Object");
    }
}
