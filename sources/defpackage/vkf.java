package defpackage;

/* renamed from: vkf reason: default package */
abstract class vkf extends vkj {
    final int a;
    final int b;
    final int c;
    final vkk d;
    final boolean e;

    /* renamed from: vkf$a */
    static final class a implements defpackage.vkj.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private vkk d;
        private Boolean e;

        /* synthetic */ a(vkj vkj, byte b2) {
            this(vkj);
        }

        a() {
        }

        private a(vkj vkj) {
            this.a = Integer.valueOf(vkj.a());
            this.b = Integer.valueOf(vkj.b());
            this.c = Integer.valueOf(vkj.c());
            this.d = vkj.d();
            this.e = Boolean.valueOf(vkj.e());
        }

        public final defpackage.vkj.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vkj.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vkj.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vkj.a a(vkk vkk) {
            if (vkk != null) {
                this.d = vkk;
                return this;
            }
            throw new NullPointerException("Null ageState");
        }

        public final defpackage.vkj.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final vkj a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" birthDay");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" birthMonth");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" birthYear");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" ageState");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" displayVerificationError");
                str = sb5.toString();
            }
            if (str.isEmpty()) {
                vkl vkl = new vkl(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d, this.e.booleanValue());
                return vkl;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }
    }

    vkf(int i, int i2, int i3, vkk vkk, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (vkk != null) {
            this.d = vkk;
            this.e = z;
            return;
        }
        throw new NullPointerException("Null ageState");
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final vkk d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AgeModel{birthDay=");
        sb.append(this.a);
        sb.append(", birthMonth=");
        sb.append(this.b);
        sb.append(", birthYear=");
        sb.append(this.c);
        sb.append(", ageState=");
        sb.append(this.d);
        sb.append(", displayVerificationError=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkj) {
            vkj vkj = (vkj) obj;
            return this.a == vkj.a() && this.b == vkj.b() && this.c == vkj.c() && this.d.equals(vkj.d()) && this.e == vkj.e();
        }
    }

    public int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
    }

    public final defpackage.vkj.a f() {
        return new a(this, 0);
    }
}
