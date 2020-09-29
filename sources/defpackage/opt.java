package defpackage;

import com.google.common.base.Optional;

/* renamed from: opt reason: default package */
final class opt extends defpackage.oqc.a {
    private final Optional<Integer> a;
    private final boolean b;
    private final opy c;

    /* renamed from: opt$a */
    static final class a implements C0066a {
        private Optional<Integer> a;
        private Boolean b;
        private opy c;

        a() {
            this.a = Optional.e();
        }

        private a(defpackage.oqc.a aVar) {
            this.a = Optional.e();
            this.a = aVar.a();
            this.b = Boolean.valueOf(aVar.b());
            this.c = aVar.c();
        }

        /* synthetic */ a(defpackage.oqc.a aVar, byte b2) {
            this(aVar);
        }

        public final C0066a a(Optional<Integer> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null limitRangeTo");
        }

        public final C0066a a(opy opy) {
            if (opy != null) {
                this.c = opy;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public final C0066a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.oqc.a a() {
            String str = "";
            if (this.b == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" showUnavailableSongs");
                str = sb.toString();
            }
            if (this.c == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" filterAndSort");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new opt(this.a, this.b.booleanValue(), this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private opt(Optional<Integer> optional, boolean z, opy opy) {
        this.a = optional;
        this.b = z;
        this.c = opy;
    }

    /* synthetic */ opt(Optional optional, boolean z, opy opy, byte b2) {
        this(optional, z, opy);
    }

    public final Optional<Integer> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final opy c() {
        return this.c;
    }

    public final C0066a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oqc.a) {
            defpackage.oqc.a aVar = (defpackage.oqc.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b() && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DerivedConfiguration{limitRangeTo=");
        sb.append(this.a);
        sb.append(", showUnavailableSongs=");
        sb.append(this.b);
        sb.append(", filterAndSort=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
