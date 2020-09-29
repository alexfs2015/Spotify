package defpackage;

/* renamed from: odu reason: default package */
final class odu extends b {
    private final ody a;
    private final fpt b;

    /* renamed from: odu$a */
    static final class a implements defpackage.odz.b.a {
        private ody a;
        private fpt b;

        a() {
        }

        public final defpackage.odz.b.a a(ody ody) {
            if (ody != null) {
                this.a = ody;
                return this;
            }
            throw new NullPointerException("Null data");
        }

        public final defpackage.odz.b.a a(fpt fpt) {
            if (fpt != null) {
                this.b = fpt;
                return this;
            }
            throw new NullPointerException("Null flags");
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
                return new odu(this.a, this.b, 0);
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ odu(ody ody, fpt fpt, byte b2) {
        this(ody, fpt);
    }

    private odu(ody ody, fpt fpt) {
        this.a = ody;
        this.b = fpt;
    }

    public final ody a() {
        return this.a;
    }

    public final fpt b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FlagsAndData{data=");
        sb.append(this.a);
        sb.append(", flags=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
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
}
