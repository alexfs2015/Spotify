package defpackage;

/* renamed from: lul reason: default package */
final class lul extends lum {
    private final String b;
    private final boolean c;
    private final boolean d;
    private final boolean e;
    private final veg f;

    /* renamed from: lul$a */
    static final class a extends defpackage.lum.a {
        private String a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private veg e;

        /* synthetic */ a(lum lum, byte b2) {
            this(lum);
        }

        a() {
        }

        private a(lum lum) {
            this.a = lum.a();
            this.b = Boolean.valueOf(lum.b());
            this.c = Boolean.valueOf(lum.c());
            this.d = Boolean.valueOf(lum.d());
            this.e = lum.e();
        }

        public final defpackage.lum.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null uri");
        }

        public final defpackage.lum.a a(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.lum.a b(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.lum.a c(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.lum.a a(veg veg) {
            if (veg != null) {
                this.e = veg;
                return this;
            }
            throw new NullPointerException("Null properties");
        }

        public final lum a() {
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
                lul lul = new lul(this.a, this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e, 0);
                return lul;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ lul(String str, boolean z, boolean z2, boolean z3, veg veg, byte b2) {
        this(str, z, z2, z3, veg);
    }

    private lul(String str, boolean z, boolean z2, boolean z3, veg veg) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = veg;
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

    public final veg e() {
        return this.f;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof lum) {
            lum lum = (lum) obj;
            return this.b.equals(lum.a()) && this.c == lum.b() && this.d == lum.c() && this.e == lum.d() && this.f.equals(lum.e());
        }
    }

    public final int hashCode() {
        int i = 1231;
        int hashCode = (((((this.b.hashCode() ^ 1000003) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003;
        if (!this.e) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f.hashCode();
    }

    public final defpackage.lum.a f() {
        return new a(this, 0);
    }
}
