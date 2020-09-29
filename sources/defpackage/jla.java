package defpackage;

/* renamed from: jla reason: default package */
final class jla extends jlb {
    private final String a;
    private final String b;
    private final String c;
    private final String d;

    /* renamed from: jla$a */
    public static final class a extends defpackage.jlb.a {
        private String a;
        private String b;
        private String c;
        private String d;

        public a() {
        }

        private a(jlb jlb) {
            this.a = jlb.a();
            this.b = jlb.b();
            this.c = jlb.c();
            this.d = jlb.d();
        }

        /* synthetic */ a(jlb jlb, byte b2) {
            this(jlb);
        }

        public final defpackage.jlb.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null entityUri");
        }

        public final jlb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" entityUri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" storylineGid");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" playbackId");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" assetId");
                str = sb4.toString();
            }
            if (str.isEmpty()) {
                jla jla = new jla(this.a, this.b, this.c, this.d, 0);
                return jla;
            }
            StringBuilder sb5 = new StringBuilder("Missing required properties:");
            sb5.append(str);
            throw new IllegalStateException(sb5.toString());
        }

        public final defpackage.jlb.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null storylineGid");
        }

        public final defpackage.jlb.a c(String str) {
            if (str != null) {
                this.c = str;
                return this;
            }
            throw new NullPointerException("Null playbackId");
        }

        public final defpackage.jlb.a d(String str) {
            if (str != null) {
                this.d = str;
                return this;
            }
            throw new NullPointerException("Null assetId");
        }
    }

    private jla(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    /* synthetic */ jla(String str, String str2, String str3, String str4, byte b2) {
        this(str, str2, str3, str4);
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

    public final defpackage.jlb.a e() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jlb) {
            jlb jlb = (jlb) obj;
            return this.a.equals(jlb.a()) && this.b.equals(jlb.b()) && this.c.equals(jlb.c()) && this.d.equals(jlb.d());
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StorylinesLoggingData{entityUri=");
        sb.append(this.a);
        sb.append(", storylineGid=");
        sb.append(this.b);
        sb.append(", playbackId=");
        sb.append(this.c);
        sb.append(", assetId=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
