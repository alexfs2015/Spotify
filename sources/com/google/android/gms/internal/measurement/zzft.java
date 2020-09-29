package com.google.android.gms.internal.measurement;

public final class zzft {

    public static final class a extends emw<a, C0007a> implements enz {
        /* access modifiers changed from: private */
        public static final a zzavj = new a();
        private static volatile eoh<a> zznw;
        private String zzavh = "";
        private long zzavi;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzft$a$a reason: collision with other inner class name */
        public static final class C0007a extends defpackage.emw.a<a, C0007a> implements enz {
            private C0007a() {
                super(a.zzavj);
            }

            public final C0007a a(String str) {
                b();
                a.a((a) this.a, str);
                return this;
            }

            public final C0007a a(long j) {
                b();
                a.a((a) this.a, j);
                return this;
            }

            /* synthetic */ C0007a(byte b) {
                this();
            }
        }

        private a() {
        }

        public static C0007a a() {
            return (C0007a) ((defpackage.emw.a) zzavj.a(e.e));
        }

        public final Object a(int i) {
            switch (ejs.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0007a(0);
                case 3:
                    return a((enx) zzavj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zznr", "zzavh", "zzavi"});
                case 4:
                    return zzavj;
                case 5:
                    eoh<a> eoh = zznw;
                    if (eoh == null) {
                        synchronized (a.class) {
                            eoh = zznw;
                            if (eoh == null) {
                                eoh = new b<>(zzavj);
                                zznw = eoh;
                            }
                        }
                    }
                    return eoh;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            emw.a(a.class, zzavj);
        }

        static /* synthetic */ void a(a aVar, String str) {
            if (str != null) {
                aVar.zznr |= 1;
                aVar.zzavh = str;
                return;
            }
            throw new NullPointerException();
        }

        static /* synthetic */ void a(a aVar, long j) {
            aVar.zznr |= 2;
            aVar.zzavi = j;
        }
    }

    public static final class zzb extends emw<zzb, a> implements enz {
        /* access modifiers changed from: private */
        public static final zzb zzavm = new zzb();
        private static volatile eoh<zzb> zznw;
        private int zzavk = 1;
        private enc<a> zzavl = eok.d();
        private int zznr;

        public static final class a extends defpackage.emw.a<zzb, a> implements enz {
            private a() {
                super(zzb.zzavm);
            }

            public final a a(a aVar) {
                b();
                zzb.a((zzb) this.a, aVar);
                return this;
            }

            /* synthetic */ a(byte b) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzft$zzb$zzb reason: collision with other inner class name */
        public enum C0008zzb implements ena {
            RADS(1),
            PROVISIONING(2);
            
            private final int value;

            public final int a() {
                return this.value;
            }

            public static C0008zzb a(int i) {
                if (i == 1) {
                    return RADS;
                }
                if (i != 2) {
                    return null;
                }
                return PROVISIONING;
            }

            public static enb b() {
                return eju.a;
            }

            private C0008zzb(int i) {
                this.value = i;
            }

            static {
                new ejt();
            }
        }

        private zzb() {
        }

        public static a a() {
            return (a) ((defpackage.emw.a) zzavm.a(e.e));
        }

        public final Object a(int i) {
            switch (ejs.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new a(0);
                case 3:
                    return a((enx) zzavm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zznr", "zzavk", C0008zzb.b(), "zzavl", a.class});
                case 4:
                    return zzavm;
                case 5:
                    eoh<zzb> eoh = zznw;
                    if (eoh == null) {
                        synchronized (zzb.class) {
                            eoh = zznw;
                            if (eoh == null) {
                                eoh = new b<>(zzavm);
                                zznw = eoh;
                            }
                        }
                    }
                    return eoh;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        public static eoh<zzb> b() {
            return (eoh) zzavm.a(e.g);
        }

        static {
            emw.a(zzb.class, zzavm);
        }

        static /* synthetic */ void a(zzb zzb, a aVar) {
            if (aVar != null) {
                if (!zzb.zzavl.a()) {
                    enc<a> enc = zzb.zzavl;
                    int size = enc.size();
                    zzb.zzavl = enc.a(size == 0 ? 10 : size << 1);
                }
                zzb.zzavl.add(aVar);
                return;
            }
            throw new NullPointerException();
        }
    }
}
