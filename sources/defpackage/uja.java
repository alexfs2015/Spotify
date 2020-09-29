package defpackage;

/* renamed from: uja reason: default package */
final class uja extends ujk {
    private final String b;
    private final String c;
    private final boolean d;
    private final Long e;
    private final Long f;
    private final Long g;

    /* renamed from: uja$a */
    static final class a implements defpackage.ujk.a {
        private String a;
        private String b;
        private Boolean c;
        private Long d;
        private Long e;
        private Long f;

        a() {
        }

        private a(ujk ujk) {
            this.a = ujk.a();
            this.b = ujk.b();
            this.c = Boolean.valueOf(ujk.c());
            this.d = ujk.d();
            this.e = ujk.e();
            this.f = ujk.f();
        }

        /* synthetic */ a(ujk ujk, byte b2) {
            this(ujk);
        }

        public final defpackage.ujk.a a(Long l) {
            if (l != null) {
                this.d = l;
                return this;
            }
            throw new NullPointerException("Null position");
        }

        public final defpackage.ujk.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null previewId");
        }

        public final defpackage.ujk.a a(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final ujk a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" previewId");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" previewKey");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isLoading");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" position");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" duration");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" timestamp");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                uja uja = new uja(this.a, this.b, this.c.booleanValue(), this.d, this.e, this.f, 0);
                return uja;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }

        public final defpackage.ujk.a b(Long l) {
            if (l != null) {
                this.e = l;
                return this;
            }
            throw new NullPointerException("Null duration");
        }

        public final defpackage.ujk.a b(String str) {
            if (str != null) {
                this.b = str;
                return this;
            }
            throw new NullPointerException("Null previewKey");
        }

        public final defpackage.ujk.a c(Long l) {
            if (l != null) {
                this.f = l;
                return this;
            }
            throw new NullPointerException("Null timestamp");
        }
    }

    private uja(String str, String str2, boolean z, Long l, Long l2, Long l3) {
        this.b = str;
        this.c = str2;
        this.d = z;
        this.e = l;
        this.f = l2;
        this.g = l3;
    }

    /* synthetic */ uja(String str, String str2, boolean z, Long l, Long l2, Long l3, byte b2) {
        this(str, str2, z, l, l2, l3);
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final Long d() {
        return this.e;
    }

    public final Long e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ujk) {
            ujk ujk = (ujk) obj;
            return this.b.equals(ujk.a()) && this.c.equals(ujk.b()) && this.d == ujk.c() && this.e.equals(ujk.d()) && this.f.equals(ujk.e()) && this.g.equals(ujk.f());
        }
    }

    public final Long f() {
        return this.g;
    }

    public final defpackage.ujk.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PreviewPlayerState{previewId=");
        sb.append(this.b);
        sb.append(", previewKey=");
        sb.append(this.c);
        sb.append(", isLoading=");
        sb.append(this.d);
        sb.append(", position=");
        sb.append(this.e);
        sb.append(", duration=");
        sb.append(this.f);
        sb.append(", timestamp=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
