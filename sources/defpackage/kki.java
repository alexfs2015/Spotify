package defpackage;

/* renamed from: kki reason: default package */
final class kki<M, E, F, MI, EI, FI> extends kkl<M, E, F, MI, EI, FI> {
    private final kjz<MI, EI, FI> a;
    private final kko<M, MI> b;
    private final kko<E, EI> c;
    private final kkm<M, MI, M> d;
    private final kkj<M, F, FI> e;

    /* renamed from: kki$a */
    static final class a<M, E, F, MI, EI, FI> extends defpackage.kkl.a<M, E, F, MI, EI, FI> {
        private kjz<MI, EI, FI> a;
        private kko<M, MI> b;
        private kko<E, EI> c;
        private kkm<M, MI, M> d;
        private kkj<M, F, FI> e;

        a() {
        }

        public final defpackage.kkl.a<M, E, F, MI, EI, FI> a(kjz<MI, EI, FI> kjz) {
            if (kjz != null) {
                this.a = kjz;
                return this;
            }
            throw new NullPointerException("Null innerUpdate");
        }

        public final defpackage.kkl.a<M, E, F, MI, EI, FI> a(kko<M, MI> kko) {
            if (kko != null) {
                this.b = kko;
                return this;
            }
            throw new NullPointerException("Null modelExtractor");
        }

        public final defpackage.kkl.a<M, E, F, MI, EI, FI> b(kko<E, EI> kko) {
            if (kko != null) {
                this.c = kko;
                return this;
            }
            throw new NullPointerException("Null eventExtractor");
        }

        public final defpackage.kkl.a<M, E, F, MI, EI, FI> a(kkm<M, MI, M> kkm) {
            if (kkm != null) {
                this.d = kkm;
                return this;
            }
            throw new NullPointerException("Null modelUpdater");
        }

        public final defpackage.kkl.a<M, E, F, MI, EI, FI> a(kkj<M, F, FI> kkj) {
            if (kkj != null) {
                this.e = kkj;
                return this;
            }
            throw new NullPointerException("Null innerEffectHandler");
        }

        public final kkl<M, E, F, MI, EI, FI> a() {
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
                kki kki = new kki(this.a, this.b, this.c, this.d, this.e, 0);
                return kki;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ kki(kjz kjz, kko kko, kko kko2, kkm kkm, kkj kkj, byte b2) {
        this(kjz, kko, kko2, kkm, kkj);
    }

    private kki(kjz<MI, EI, FI> kjz, kko<M, MI> kko, kko<E, EI> kko2, kkm<M, MI, M> kkm, kkj<M, F, FI> kkj) {
        this.a = kjz;
        this.b = kko;
        this.c = kko2;
        this.d = kkm;
        this.e = kkj;
    }

    /* access modifiers changed from: protected */
    public final kjz<MI, EI, FI> a() {
        return this.a;
    }

    /* access modifiers changed from: protected */
    public final kko<M, MI> b() {
        return this.b;
    }

    /* access modifiers changed from: protected */
    public final kko<E, EI> c() {
        return this.c;
    }

    /* access modifiers changed from: protected */
    public final kkm<M, MI, M> d() {
        return this.d;
    }

    /* access modifiers changed from: protected */
    public final kkj<M, F, FI> e() {
        return this.e;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kkl) {
            kkl kkl = (kkl) obj;
            return this.a.equals(kkl.a()) && this.b.equals(kkl.b()) && this.c.equals(kkl.c()) && this.d.equals(kkl.d()) && this.e.equals(kkl.e());
        }
    }

    public final int hashCode() {
        return ((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
    }
}
