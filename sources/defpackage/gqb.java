package defpackage;

/* renamed from: gqb reason: default package */
final class gqb extends gqi {
    private final String b;
    private final gqd c;
    private final gqc d;

    /* renamed from: gqb$a */
    static final class a implements defpackage.gqi.a {
        private String a;
        private gqd b;
        private gqc c;

        a() {
        }

        private a(gqi gqi) {
            this.a = gqi.a();
            this.b = gqi.b();
            this.c = gqi.c();
        }

        /* synthetic */ a(gqi gqi, byte b2) {
            this(gqi);
        }

        public final defpackage.gqi.a a(gqc gqc) {
            if (gqc != null) {
                this.c = gqc;
                return this;
            }
            throw new NullPointerException("Null errorState");
        }

        public final defpackage.gqi.a a(gqd gqd) {
            if (gqd != null) {
                this.b = gqd;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        public final defpackage.gqi.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null oneTimeResetPasswordToken");
        }

        public final gqi a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" oneTimeResetPasswordToken");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" passwordState");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" errorState");
                str = sb3.toString();
            }
            if (str.isEmpty()) {
                return new gqb(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    private gqb(String str, gqd gqd, gqc gqc) {
        this.b = str;
        this.c = gqd;
        this.d = gqc;
    }

    /* synthetic */ gqb(String str, gqd gqd, gqc gqc, byte b2) {
        this(str, gqd, gqc);
    }

    public final String a() {
        return this.b;
    }

    public final gqd b() {
        return this.c;
    }

    public final gqc c() {
        return this.d;
    }

    public final defpackage.gqi.a d() {
        return new a(this, 0);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof gqi) {
            gqi gqi = (gqi) obj;
            return this.b.equals(gqi.a()) && this.c.equals(gqi.b()) && this.d.equals(gqi.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPasswordModel{oneTimeResetPasswordToken=");
        sb.append(this.b);
        sb.append(", passwordState=");
        sb.append(this.c);
        sb.append(", errorState=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }
}
