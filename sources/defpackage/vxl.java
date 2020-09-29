package defpackage;

/* renamed from: vxl reason: default package */
abstract class vxl extends vxp {
    final int a;
    final int b;
    final int c;
    final vxq d;
    final boolean e;

    /* renamed from: vxl$a */
    static final class a implements defpackage.vxp.a {
        private Integer a;
        private Integer b;
        private Integer c;
        private vxq d;
        private Boolean e;

        a() {
        }

        private a(vxp vxp) {
            this.a = Integer.valueOf(vxp.a());
            this.b = Integer.valueOf(vxp.b());
            this.c = Integer.valueOf(vxp.c());
            this.d = vxp.d();
            this.e = Boolean.valueOf(vxp.e());
        }

        /* synthetic */ a(vxp vxp, byte b2) {
            this(vxp);
        }

        public final defpackage.vxp.a a(int i) {
            this.a = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vxp.a a(vxq vxq) {
            if (vxq != null) {
                this.d = vxq;
                return this;
            }
            throw new NullPointerException("Null ageState");
        }

        public final defpackage.vxp.a a(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final vxp a() {
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
                vxr vxr = new vxr(this.a.intValue(), this.b.intValue(), this.c.intValue(), this.d, this.e.booleanValue());
                return vxr;
            }
            StringBuilder sb6 = new StringBuilder("Missing required properties:");
            sb6.append(str);
            throw new IllegalStateException(sb6.toString());
        }

        public final defpackage.vxp.a b(int i) {
            this.b = Integer.valueOf(i);
            return this;
        }

        public final defpackage.vxp.a c(int i) {
            this.c = Integer.valueOf(i);
            return this;
        }
    }

    vxl(int i, int i2, int i3, vxq vxq, boolean z) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        if (vxq != null) {
            this.d = vxq;
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

    public final vxq d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vxp) {
            vxp vxp = (vxp) obj;
            return this.a == vxp.a() && this.b == vxp.b() && this.c == vxp.c() && this.d.equals(vxp.d()) && this.e == vxp.e();
        }
    }

    public final defpackage.vxp.a f() {
        return new a(this, 0);
    }

    public int hashCode() {
        return ((((((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (this.e ? 1231 : 1237);
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
}
