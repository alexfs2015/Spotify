package defpackage;

import com.google.common.base.Optional;

/* renamed from: slu reason: default package */
final class slu extends smb {
    private final String b;
    private final smd c;
    private final Optional<sly> d;
    private final lbg e;
    private final smg f;
    private final slr g;

    /* renamed from: slu$a */
    static final class a extends defpackage.smb.a {
        private String a;
        private smd b;
        private Optional<sly> c;
        private lbg d;
        private smg e;
        private slr f;

        a() {
            this.c = Optional.e();
        }

        private a(smb smb) {
            this.c = Optional.e();
            this.a = smb.a();
            this.b = smb.b();
            this.c = smb.c();
            this.d = smb.d();
            this.e = smb.e();
            this.f = smb.f();
        }

        /* synthetic */ a(smb smb, byte b2) {
            this(smb);
        }

        public final defpackage.smb.a a(Optional<sly> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        public final defpackage.smb.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null query");
        }

        public final defpackage.smb.a a(lbg lbg) {
            if (lbg != null) {
                this.d = lbg;
                return this;
            }
            throw new NullPointerException("Null connectionState");
        }

        public final defpackage.smb.a a(slr slr) {
            if (slr != null) {
                this.f = slr;
                return this;
            }
            throw new NullPointerException("Null config");
        }

        public final defpackage.smb.a a(smd smd) {
            if (smd != null) {
                this.b = smd;
                return this;
            }
            throw new NullPointerException("Null result");
        }

        public final defpackage.smb.a a(smg smg) {
            if (smg != null) {
                this.e = smg;
                return this;
            }
            throw new NullPointerException("Null userSession");
        }

        public final smb a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" query");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" result");
                str = sb2.toString();
            }
            if (this.d == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" connectionState");
                str = sb3.toString();
            }
            if (this.e == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" userSession");
                str = sb4.toString();
            }
            if (this.f == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" config");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                slu slu = new slu(this.a, this.b, this.c, this.d, this.e, this.f, 0);
                return slu;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    private slu(String str, smd smd, Optional<sly> optional, lbg lbg, smg smg, slr slr) {
        this.b = str;
        this.c = smd;
        this.d = optional;
        this.e = lbg;
        this.f = smg;
        this.g = slr;
    }

    /* synthetic */ slu(String str, smd smd, Optional optional, lbg lbg, smg smg, slr slr, byte b2) {
        this(str, smd, optional, lbg, smg, slr);
    }

    public final String a() {
        return this.b;
    }

    public final smd b() {
        return this.c;
    }

    public final Optional<sly> c() {
        return this.d;
    }

    public final lbg d() {
        return this.e;
    }

    public final smg e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof smb) {
            smb smb = (smb) obj;
            return this.b.equals(smb.a()) && this.c.equals(smb.b()) && this.d.equals(smb.c()) && this.e.equals(smb.d()) && this.f.equals(smb.e()) && this.g.equals(smb.f());
        }
    }

    public final slr f() {
        return this.g;
    }

    public final defpackage.smb.a g() {
        return new a(this, 0);
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchModel{query=");
        sb.append(this.b);
        sb.append(", result=");
        sb.append(this.c);
        sb.append(", error=");
        sb.append(this.d);
        sb.append(", connectionState=");
        sb.append(this.e);
        sb.append(", userSession=");
        sb.append(this.f);
        sb.append(", config=");
        sb.append(this.g);
        sb.append("}");
        return sb.toString();
    }
}
