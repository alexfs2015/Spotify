package defpackage;

/* renamed from: lyk reason: default package */
final class lyk extends lyl {
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final vrb f;

    /* renamed from: lyk$a */
    static final class a extends defpackage.lyl.a {
        private String a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private vrb e;

        a() {
        }

        private a(lyl lyl) {
            this.a = lyl.a();
            this.b = Boolean.valueOf(lyl.b());
            this.c = Boolean.valueOf(lyl.c());
            this.d = Boolean.valueOf(lyl.d());
            this.e = lyl.e();
        }

        /* synthetic */ a(lyl lyl, byte b2) {
            this(lyl);
        }

        public final defpackage.lyl.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.lyl.a a(vrb vrb) {
            if (vrb != null) {
                this.e = vrb;
                return this;
            }
            throw new NullPointerException("Null properties");
        }

        public final defpackage.lyl.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final lyl a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" uri");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" isNft");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" isNpt");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" isVoiceEnabled");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" properties");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                lyk lyk = new lyk(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, 0);
                return lyk;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.lyl.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.lyl.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }
    }

    private lyk(String str, boolean z, boolean z2, boolean z3, vrb vrb) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = vrb;
    }

    /* synthetic */ lyk(String str, boolean z, boolean z2, boolean z3, vrb vrb, byte b2) {
        this(str, z, z2, z3, vrb);
    }

    public final String a() {
        return this.b;
    }

    public final boolean b() {
        return this.c;
    }

    public final boolean c() {
        return this.d;
    }

    public final boolean d() {
        return this.e;
    }

    public final vrb e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lyl) {
            lyl lyl = (lyl) obj;
            return this.b.equals(lyl.a()) && this.c == lyl.b() && this.d == lyl.c() && this.e == lyl.d() && this.f.equals(lyl.e());
        }
    }

    public final defpackage.lyl.a f() {
        return new a(this, 0);
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseConfig{uri=");
        sb.append(this.b);
        sb.append(", isNft=");
        sb.append(this.c);
        sb.append(", isNpt=");
        sb.append(this.d);
        sb.append(", isVoiceEnabled=");
        sb.append(this.e);
        sb.append(", properties=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }
}
