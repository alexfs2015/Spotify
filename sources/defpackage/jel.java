package defpackage;

/* renamed from: jel reason: default package */
final class jel extends jem {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final Long e;
    private final Boolean f;

    /* renamed from: jel$a */
    static final class a extends defpackage.jem.a {
        String a;
        private String b;
        private String c;
        private String d;
        private Long e;
        private Boolean f;

        a() {
        }

        public final defpackage.jem.a a(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null value");
        }

        public final defpackage.jem.a b(String str) {
            this.c = str;
            return this;
        }

        public final defpackage.jem.a c(String str) {
            this.d = str;
            return this;
        }

        public final defpackage.jem.a a(Long l) {
            this.e = l;
            return this;
        }

        public final defpackage.jem.a a(Boolean bool) {
            this.f = bool;
            return this;
        }

        public final jem a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" name");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" value");
                str = sb2.toString();
            }
            if (str.isEmpty()) {
                jel jel = new jel(this.a, this.b, this.c, this.d, this.e, this.f, 0);
                return jel;
            }
            StringBuilder sb3 = new StringBuilder("Missing required properties:");
            sb3.append(str);
            throw new IllegalStateException(sb3.toString());
        }
    }

    /* synthetic */ jel(String str, String str2, String str3, String str4, Long l, Boolean bool, byte b2) {
        this(str, str2, str3, str4, l, bool);
    }

    private jel(String str, String str2, String str3, String str4, Long l, Boolean bool) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = l;
        this.f = bool;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public final Long e() {
        return this.e;
    }

    public final Boolean f() {
        return this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImmutableHttpCookie{name=");
        sb.append(this.a);
        sb.append(", value=");
        sb.append(this.b);
        sb.append(", path=");
        sb.append(this.c);
        sb.append(", domain=");
        sb.append(this.d);
        sb.append(", maxAge=");
        sb.append(this.e);
        sb.append(", secure=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jem) {
            jem jem = (jem) obj;
            if (this.a.equals(jem.a()) && this.b.equals(jem.b())) {
                String str = this.c;
                if (str != null ? str.equals(jem.c()) : jem.c() == null) {
                    String str2 = this.d;
                    if (str2 != null ? str2.equals(jem.d()) : jem.d() == null) {
                        Long l = this.e;
                        if (l != null ? l.equals(jem.e()) : jem.e() == null) {
                            Boolean bool = this.f;
                            return bool != null ? bool.equals(jem.f()) : jem.f() == null;
                        }
                    }
                }
            }
        }
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        String str = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Long l = this.e;
        int hashCode4 = (hashCode3 ^ (l == null ? 0 : l.hashCode())) * 1000003;
        Boolean bool = this.f;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode4 ^ i;
    }
}
