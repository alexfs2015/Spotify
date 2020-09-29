package defpackage;

import com.google.android.gms.internal.ads.zzawy;
import com.google.android.gms.internal.ads.zzaxa;
import com.google.android.gms.internal.ads.zzbah;

/* renamed from: cyq reason: default package */
public final class cyq extends dcy<cyq, a> implements deb {
    private static volatile del<cyq> zzakh;
    /* access modifiers changed from: private */
    public static final cyq zzdjx = new cyq();
    private int zzdju;
    private int zzdjv;
    zzbah zzdjw = zzbah.a;

    /* renamed from: cyq$a */
    public static final class a extends defpackage.dcy.a<cyq, a> implements deb {
        private a() {
            super(cyq.zzdjx);
        }

        /* synthetic */ a(byte b) {
            this();
        }
    }

    static {
        dcy.a(cyq.class, zzdjx);
    }

    private cyq() {
    }

    public static cyq c() {
        return zzdjx;
    }

    public final zzawy a() {
        zzawy a2 = zzawy.a(this.zzdju);
        return a2 == null ? zzawy.UNRECOGNIZED : a2;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [del<cyq>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [del<cyq>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [dcy$b, del<cyq>] */
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
            int[] r0 = defpackage.cyr.a
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
            del<cyq> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<cyq> r0 = defpackage.cyq.class
            monitor-enter(r0)
            del<cyq> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            dcy$b r4 = new dcy$b     // Catch:{ all -> 0x002d }
            cyq r1 = zzdjx     // Catch:{ all -> 0x002d }
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
            cyq r4 = zzdjx
            return r4
        L_0x0034:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdju"
            r4[r0] = r2
            java.lang.String r0 = "zzdjv"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdjw"
            r4[r0] = r1
            cyq r0 = zzdjx
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u000b\u000b\f\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x004d:
            cyq$a r4 = new cyq$a
            r4.<init>(r0)
            return r4
        L_0x0053:
            cyq r4 = new cyq
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cyq.a(int):java.lang.Object");
    }

    public final zzaxa b() {
        zzaxa a2 = zzaxa.a(this.zzdjv);
        return a2 == null ? zzaxa.UNRECOGNIZED : a2;
    }
}
