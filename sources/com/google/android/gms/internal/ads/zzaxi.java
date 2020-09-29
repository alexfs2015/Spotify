package com.google.android.gms.internal.ads;

public final class zzaxi extends dcy<zzaxi, a> implements deb {
    private static volatile del<zzaxi> zzakh;
    /* access modifiers changed from: private */
    public static final zzaxi zzdkv = new zzaxi();
    public String zzdks = "";
    public zzbah zzdkt = zzbah.a;
    private int zzdku;

    public static final class a extends defpackage.dcy.a<zzaxi, a> implements deb {
        private a() {
            super(zzaxi.zzdkv);
        }

        /* synthetic */ a(byte b) {
            this();
        }

        public final a a(zzb zzb) {
            d();
            zzaxi.a((zzaxi) this.a, zzb);
            return this;
        }

        public final a a(zzbah zzbah) {
            d();
            zzaxi.a((zzaxi) this.a, zzbah);
            return this;
        }

        public final a a(String str) {
            d();
            zzaxi.a((zzaxi) this.a, str);
            return this;
        }
    }

    public enum zzb implements ddb {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private final int value;

        static {
            new czc();
        }

        private zzb(int i) {
            this.value = i;
        }

        public static zzb a(int i) {
            if (i == 0) {
                return UNKNOWN_KEYMATERIAL;
            }
            if (i == 1) {
                return SYMMETRIC;
            }
            if (i == 2) {
                return ASYMMETRIC_PRIVATE;
            }
            if (i == 3) {
                return ASYMMETRIC_PUBLIC;
            }
            if (i != 4) {
                return null;
            }
            return REMOTE;
        }

        public final int a() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        dcy.a(zzaxi.class, zzdkv);
    }

    private zzaxi() {
    }

    public static a b() {
        return (a) ((defpackage.dcy.a) zzdkv.a(e.e));
    }

    public static zzaxi c() {
        return zzdkv;
    }

    public final zzb a() {
        zzb a2 = zzb.a(this.zzdku);
        return a2 == null ? zzb.UNRECOGNIZED : a2;
    }

    /* JADX WARNING: type inference failed for: r4v9, types: [del<com.google.android.gms.internal.ads.zzaxi>] */
    /* JADX WARNING: type inference failed for: r4v10, types: [java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v12, types: [del<com.google.android.gms.internal.ads.zzaxi>] */
    /* JADX WARNING: type inference failed for: r4v13 */
    /* JADX WARNING: type inference failed for: r4v14, types: [del<com.google.android.gms.internal.ads.zzaxi>, dcy$b] */
    /* JADX WARNING: type inference failed for: r4v18 */
    /* JADX WARNING: type inference failed for: r4v19 */
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
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(int r4) {
        /*
            r3 = this;
            int[] r0 = defpackage.czb.a
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
            del<com.google.android.gms.internal.ads.zzaxi> r4 = zzakh
            if (r4 != 0) goto L_0x0030
            java.lang.Class<com.google.android.gms.internal.ads.zzaxi> r0 = com.google.android.gms.internal.ads.zzaxi.class
            monitor-enter(r0)
            del<com.google.android.gms.internal.ads.zzaxi> r4 = zzakh     // Catch:{ all -> 0x002d }
            if (r4 != 0) goto L_0x002b
            dcy$b r4 = new dcy$b     // Catch:{ all -> 0x002d }
            com.google.android.gms.internal.ads.zzaxi r1 = zzdkv     // Catch:{ all -> 0x002d }
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
            com.google.android.gms.internal.ads.zzaxi r4 = zzdkv
            return r4
        L_0x0034:
            r4 = 3
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r2 = "zzdks"
            r4[r0] = r2
            java.lang.String r0 = "zzdkt"
            r4[r1] = r0
            r0 = 2
            java.lang.String r1 = "zzdku"
            r4[r0] = r1
            com.google.android.gms.internal.ads.zzaxi r0 = zzdkv
            java.lang.String r1 = "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f"
            java.lang.Object r4 = a(r0, r1, r4)
            return r4
        L_0x004d:
            com.google.android.gms.internal.ads.zzaxi$a r4 = new com.google.android.gms.internal.ads.zzaxi$a
            r4.<init>(r0)
            return r4
        L_0x0053:
            com.google.android.gms.internal.ads.zzaxi r4 = new com.google.android.gms.internal.ads.zzaxi
            r4.<init>()
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaxi.a(int):java.lang.Object");
    }

    static /* synthetic */ void a(zzaxi zzaxi, String str) {
        if (str != null) {
            zzaxi.zzdks = str;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(zzaxi zzaxi, zzbah zzbah) {
        if (zzbah != null) {
            zzaxi.zzdkt = zzbah;
            return;
        }
        throw new NullPointerException();
    }

    static /* synthetic */ void a(zzaxi zzaxi, zzb zzb2) {
        if (zzb2 != null) {
            zzaxi.zzdku = zzb2.a();
            return;
        }
        throw new NullPointerException();
    }
}
