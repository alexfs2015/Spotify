package defpackage;

/* renamed from: gom reason: default package */
final class gom extends got {
    private final String b;
    private final goo c;
    private final gon d;

    /* renamed from: gom$a */
    static final class a implements defpackage.got.a {
        private String a;
        private goo b;
        private gon c;

        /* synthetic */ a(got got, byte b2) {
            this(got);
        }

        a() {
        }

        private a(got got) {
            this.a = got.a();
            this.b = got.b();
            this.c = got.c();
        }

        public final defpackage.got.a a(String str) {
            if (str != null) {
                this.a = str;
                return this;
            }
            throw new NullPointerException("Null oneTimeResetPasswordToken");
        }

        public final defpackage.got.a a(goo goo) {
            if (goo != null) {
                this.b = goo;
                return this;
            }
            throw new NullPointerException("Null passwordState");
        }

        public final defpackage.got.a a(gon gon) {
            if (gon != null) {
                this.c = gon;
                return this;
            }
            throw new NullPointerException("Null errorState");
        }

        public final got a() {
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
                return new gom(this.a, this.b, this.c, 0);
            }
            StringBuilder sb4 = new StringBuilder("Missing required properties:");
            sb4.append(str);
            throw new IllegalStateException(sb4.toString());
        }
    }

    /* synthetic */ gom(String str, goo goo, gon gon, byte b2) {
        this(str, goo, gon);
    }

    private gom(String str, goo goo, gon gon) {
        this.b = str;
        this.c = goo;
        this.d = gon;
    }

    public final String a() {
        return this.b;
    }

    public final goo b() {
        return this.c;
    }

    public final gon c() {
        return this.d;
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof got) {
            got got = (got) obj;
            return this.b.equals(got.a()) && this.c.equals(got.b()) && this.d.equals(got.c());
        }
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final defpackage.got.a d() {
        return new a(this, 0);
    }
}
