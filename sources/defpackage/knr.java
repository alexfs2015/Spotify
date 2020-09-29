package defpackage;

/* renamed from: knr reason: default package */
final class knr<M, E, F, MI, EI, FI> extends knu<M, E, F, MI, EI, FI> {
    private final kni<MI, EI, FI> a;
    private final knx<M, MI> b;
    private final knx<E, EI> c;
    private final knv<M, MI, M> d;
    private final kns<M, F, FI> e;

    /* renamed from: knr$a */
    static final class a<M, E, F, MI, EI, FI> extends defpackage.knu.a<M, E, F, MI, EI, FI> {
        private kni<MI, EI, FI> a;
        private knx<M, MI> b;
        private knx<E, EI> c;
        private knv<M, MI, M> d;
        private kns<M, F, FI> e;

        a() {
        }

        public final defpackage.knu.a<M, E, F, MI, EI, FI> a(kni<MI, EI, FI> kni) {
            if (kni != null) {
                this.a = kni;
                return this;
            }
            throw new NullPointerException("Null innerUpdate");
        }

        public final defpackage.knu.a<M, E, F, MI, EI, FI> a(kns<M, F, FI> kns) {
            if (kns != null) {
                this.e = kns;
                return this;
            }
            throw new NullPointerException("Null innerEffectHandler");
        }

        public final defpackage.knu.a<M, E, F, MI, EI, FI> a(knv<M, MI, M> knv) {
            if (knv != null) {
                this.d = knv;
                return this;
            }
            throw new NullPointerException("Null modelUpdater");
        }

        public final defpackage.knu.a<M, E, F, MI, EI, FI> a(knx<M, MI> knx) {
            if (knx != null) {
                this.b = knx;
                return this;
            }
            throw new NullPointerException("Null modelExtractor");
        }

        public final knu<M, E, F, MI, EI, FI> a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" innerUpdate");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" modelExtractor");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" eventExtractor");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" modelUpdater");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" innerEffectHandler");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                knr knr = new knr(this.a, this.b, this.c, this.d, this.e, 0);
                return knr;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.knu.a<M, E, F, MI, EI, FI> b(knx<E, EI> knx) {
            if (knx != null) {
                this.c = knx;
                return this;
            }
            throw new NullPointerException("Null eventExtractor");
        }
    }

    private knr(kni<MI, EI, FI> kni, knx<M, MI> knx, knx<E, EI> knx2, knv<M, MI, M> knv, kns<M, F, FI> kns) {
        this.a = kni;
        this.b = knx;
        this.c = knx2;
        this.d = knv;
        this.e = kns;
    }

    /* synthetic */ knr(kni kni, knx knx, knx knx2, knv knv, kns kns, byte b2) {
        this(kni, knx, knx2, knv, kns);
    }

    /* access modifiers changed from: protected */
    public final kni<MI, EI, FI> a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final knx<M, MI> b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final knx<E, EI> c() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final knv<M, MI, M> d() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final kns<M, F, FI> e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof knu) {
            knu knu = (knu) obj;
            return this.a.equals(knu.a()) && this.b.equals(knu.b()) && this.c.equals(knu.c()) && this.d.equals(knu.d()) && this.e.equals(knu.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InnerUpdate{innerUpdate=");
        sb.append(this.a);
        sb.append(", modelExtractor=");
        sb.append(this.b);
        sb.append(", eventExtractor=");
        sb.append(this.c);
        sb.append(", modelUpdater=");
        sb.append(this.d);
        sb.append(", innerEffectHandler=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
