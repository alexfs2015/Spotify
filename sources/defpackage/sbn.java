package defpackage;

import com.google.common.base.Optional;

/* renamed from: sbn reason: default package */
final class sbn extends sbu {
    private final String b;
    private final sbw c;
    private final Optional<sbr> d;
    private final kxx e;
    private final sbz f;
    private final sbk g;

    /* renamed from: sbn$a */
    static final class a extends defpackage.sbu.a {
        private String a;
        private sbw b;
        private Optional<sbr> c;
        private kxx d;
        private sbz e;
        private sbk f;

        /* synthetic */ a(sbu sbu, byte b2) {
            this(sbu);
        }

        a() {
            this.c = Optional.e();
        }

        private a(sbu sbu) {
            this.c = Optional.e();
            this.a = sbu.a();
            this.b = sbu.b();
            this.c = sbu.c();
            this.d = sbu.d();
            this.e = sbu.e();
            this.f = sbu.f();
        }

        public final defpackage.sbu.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null query");
        }

        public final defpackage.sbu.a a(sbw sbw) {
            if (sbw != null) {
                this.b = sbw;
                return this;
            }
            throw new NullPointerException("Null result");
        }

        public final defpackage.sbu.a a(Optional<sbr> optional) {
            if (optional != null) {
                this.c = optional;
                return this;
            }
            throw new NullPointerException("Null error");
        }

        public final defpackage.sbu.a a(kxx kxx) {
            if (kxx != null) {
                this.d = kxx;
                return this;
            }
            throw new NullPointerException("Null connectionState");
        }

        public final defpackage.sbu.a a(sbz sbz) {
            if (sbz != null) {
                this.e = sbz;
                return this;
            }
            throw new NullPointerException("Null userSession");
        }

        public final defpackage.sbu.a a(sbk sbk) {
            if (sbk != null) {
                this.f = sbk;
                return this;
            }
            throw new NullPointerException("Null config");
        }

        public final sbu a() {
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
                sbn sbn = new sbn(this.a, this.b, this.c, this.d, this.e, this.f, 0);
                return sbn;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    /* synthetic */ sbn(String str, sbw sbw, Optional optional, kxx kxx, sbz sbz, sbk sbk, byte b2) {
        this(str, sbw, optional, kxx, sbz, sbk);
    }

    private sbn(String str, sbw sbw, Optional<sbr> optional, kxx kxx, sbz sbz, sbk sbk) {
        this.b = str;
        this.c = sbw;
        this.d = optional;
        this.e = kxx;
        this.f = sbz;
        this.g = sbk;
    }

    public final String a() {
        return this.b;
    }

    public final sbw b() {
        return this.c;
    }

    public final Optional<sbr> c() {
        return this.d;
    }

    public final kxx d() {
        return this.e;
    }

    public final sbz e() {
        return this.f;
    }

    public final sbk f() {
        return this.g;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbu) {
            sbu sbu = (sbu) obj;
            return this.b.equals(sbu.a()) && this.c.equals(sbu.b()) && this.d.equals(sbu.c()) && this.e.equals(sbu.d()) && this.f.equals(sbu.e()) && this.g.equals(sbu.f());
        }
    }

    public final int hashCode() {
        return ((((((((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode()) * 1000003) ^ this.f.hashCode()) * 1000003) ^ this.g.hashCode();
    }

    public final defpackage.sbu.a g() {
        return new a(this, 0);
    }
}
