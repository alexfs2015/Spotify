package defpackage;

import com.google.common.base.Optional;

/* renamed from: oip reason: default package */
final class oip extends defpackage.oiy.a {
    private final Optional<Integer> a;
    private final boolean b;
    private final oiu c;

    /* renamed from: oip$a */
    static final class a implements C0065a {
        private Optional<Integer> a;
        private Boolean b;
        private oiu c;

        /* synthetic */ a(defpackage.oiy.a aVar, byte b2) {
            this(aVar);
        }

        a() {
            this.a = Optional.e();
        }

        private a(defpackage.oiy.a aVar) {
            this.a = Optional.e();
            this.a = aVar.a();
            this.b = Boolean.valueOf(aVar.b());
            this.c = aVar.c();
        }

        public final C0065a a(Optional<Integer> optional) {
            if (optional != null) {
                this.a = optional;
                return this;
            }
            throw new NullPointerException("Null limitRangeTo");
        }

        public final C0065a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final C0065a a(oiu oiu) {
            if (oiu != null) {
                this.c = oiu;
                return this;
            }
            throw new NullPointerException("Null filterAndSort");
        }

        public final defpackage.oiy.a a() {
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
                return new oip(this.a, this.b.booleanValue(), this.c, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ oip(Optional optional, boolean z, oiu oiu, byte b2) {
        this(optional, z, oiu);
    }

    private oip(Optional<Integer> optional, boolean z, oiu oiu) {
        this.a = optional;
        this.b = z;
        this.c = oiu;
    }

    public final Optional<Integer> a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final oiu c() {
        return this.c;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof defpackage.oiy.a) {
            defpackage.oiy.a aVar = (defpackage.oiy.a) obj;
            return this.a.equals(aVar.a()) && this.b == aVar.b() && this.c.equals(aVar.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ this.c.hashCode();
    }

    public final C0065a d() {
        return new a(this, 0);
    }
}
