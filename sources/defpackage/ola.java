package defpackage;

/* renamed from: ola reason: default package */
final class ola extends b {
    private final ole a;
    private final fqn b;

    /* renamed from: ola$a */
    static final class a implements defpackage.olf.b.a {
        private ole a;
        private fqn b;

        a() {
        }

        public final defpackage.olf.b.a a(fqn fqn) {
            if (fqn != null) {
                this.b = fqn;
                return this;
            }
            throw new NullPointerException("Null flags");
        }

        public final defpackage.olf.b.a a(ole ole) {
            if (ole != null) {
                this.a = ole;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        public final b a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" data");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" flags");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                return new ola(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    private ola(ole ole, fqn fqn) {
        this.a = ole;
        this.b = fqn;
    }

    /* synthetic */ ola(ole ole, fqn fqn, byte b2) {
        this(ole, fqn);
    }

    public final ole a() {
        return this.a;
    }

    public final fqn b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            return this.a.equals(bVar.a()) && this.b.equals(bVar.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagsAndData{data=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
