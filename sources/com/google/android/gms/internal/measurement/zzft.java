package com.google.android.gms.internal.measurement;

public final class zzft {

    public static final class a extends enn<a, C0007a> implements eoq {
        /* access modifiers changed from: private */
        public static final a zzavj = new a();
        private static volatile eoy<a> zznw;
        private String zzavh = "";
        private long zzavi;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzft$a$a reason: collision with other inner class name */
        public static final class C0007a extends defpackage.enn.a<a, C0007a> implements eoq {
            private C0007a() {
                super(a.zzavj);
            }

            /* synthetic */ C0007a(byte b) {
                this();
            }

            public final C0007a a(long j) {
                b();
                a.a((a) this.a, j);
                return this;
            }

            public final C0007a a(String str) {
                b();
                a.a((a) this.a, str);
                return this;
            }
        }

        static {
            enn.a(a.class, zzavj);
        }

        private a() {
        }

        public static C0007a a() {
            return (C0007a) ((defpackage.enn.a) zzavj.a(e.e));
        }

        static /* synthetic */ void a(a aVar, long j) {
            aVar.zznr |= 2;
            aVar.zzavi = j;
        }

        static /* synthetic */ void a(a aVar, String str) {
            if (str != null) {
                aVar.zznr |= 1;
                aVar.zzavh = str;
                return;
            }
            throw new NullPointerException();
        }

        public final Object a(int i) {
            switch (ekj.a[i - 1]) {
                case 1:
                    return new a();
                case 2:
                    return new C0007a(0);
                case 3:
                    return a((eoo) zzavj, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", new Object[]{"zznr", "zzavh", "zzavi"});
                case 4:
                    return zzavj;
                case 5:
                    eoy<a> eoy = zznw;
                    if (eoy == null) {
                        synchronized (a.class) {
                            eoy = zznw;
                            if (eoy == null) {
                                eoy = new b<>(zzavj);
                                zznw = eoy;
                            }
                        }
                    }
                    return eoy;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }

    public static final class zzb extends enn<zzb, a> implements eoq {
        /* access modifiers changed from: private */
        public static final zzb zzavm = new zzb();
        private static volatile eoy<zzb> zznw;
        private int zzavk = 1;
        private ent<a> zzavl = epb.d();
        private int zznr;

        public static final class a extends defpackage.enn.a<zzb, a> implements eoq {
            private a() {
                super(zzb.zzavm);
            }

            /* synthetic */ a(byte b) {
                this();
            }

            public final a a(a aVar) {
                b();
                zzb.a((zzb) this.a, aVar);
                return this;
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzft$zzb$zzb reason: collision with other inner class name */
        public enum C0008zzb implements enr {
            RADS(1),
            PROVISIONING(2);
            
            private final int value;

            static {
                new ekk();
            }

            private C0008zzb(int i) {
                this.value = i;
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

            public static ens b() {
                return ekl.a;
            }

            public final int a() {
                return this.value;
            }
        }

        static {
            enn.a(zzb.class, zzavm);
        }

        private zzb() {
        }

        public static a a() {
            return (a) ((defpackage.enn.a) zzavm.a(e.e));
        }

        static /* synthetic */ void a(zzb zzb, a aVar) {
            if (aVar != null) {
                if (!zzb.zzavl.a()) {
                    ent<a> ent = zzb.zzavl;
                    int size = ent.size();
                    zzb.zzavl = ent.a(size == 0 ? 10 : size << 1);
                }
                zzb.zzavl.add(aVar);
                return;
            }
            throw new NullPointerException();
        }

        public static eoy<zzb> b() {
            return (eoy) zzavm.a(e.g);
        }

        public final Object a(int i) {
            switch (ekj.a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new a(0);
                case 3:
                    return a((eoo) zzavm, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", new Object[]{"zznr", "zzavk", C0008zzb.b(), "zzavl", a.class});
                case 4:
                    return zzavm;
                case 5:
                    eoy<zzb> eoy = zznw;
                    if (eoy == null) {
                        synchronized (zzb.class) {
                            eoy = zznw;
                            if (eoy == null) {
                                eoy = new b<>(zzavm);
                                zznw = eoy;
                            }
                        }
                    }
                    return eoy;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }
    }
}
