package defpackage;

/* renamed from: vkw reason: default package */
abstract class vkw extends vla {
    final boolean a;
    final boolean b;
    final boolean c;
    final boolean d;
    final boolean e;
    final boolean f;

    /* renamed from: vkw$a */
    static final class a implements defpackage.vla.a {
        private Boolean a;
        private Boolean b;
        private Boolean c;
        private Boolean d;
        private Boolean e;
        private Boolean f;

        a() {
        }

        public final defpackage.vla.a a(boolean z) {
            this.a = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vla.a b(boolean z) {
            this.b = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vla.a c(boolean z) {
            this.c = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vla.a d(boolean z) {
            this.d = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vla.a e(boolean z) {
            this.e = Boolean.valueOf(z);
            return this;
        }

        public final defpackage.vla.a f(boolean z) {
            this.f = Boolean.valueOf(z);
            return this;
        }

        public final vla a() {
            String str = "";
            if (this.a == null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" canAcceptLicensesInOneStep");
                str = sb.toString();
            }
            if (this.b == null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(" canSignupWithAllGenders");
                str = sb2.toString();
            }
            if (this.c == null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(" canImplicitlyAcceptTermsAndCondition");
                str = sb3.toString();
            }
            if (this.d == null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(" requiresMarketingOptIn");
                str = sb4.toString();
            }
            if (this.e == null) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(str);
                sb5.append(" requiresMarketingOptInText");
                str = sb5.toString();
            }
            if (this.f == null) {
                StringBuilder sb6 = new StringBuilder();
                sb6.append(str);
                sb6.append(" requiresSpecificLicenses");
                str = sb6.toString();
            }
            if (str.isEmpty()) {
                vky vky = new vky(this.a.booleanValue(), this.b.booleanValue(), this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue());
                return vky;
            }
            StringBuilder sb7 = new StringBuilder("Missing required properties:");
            sb7.append(str);
            throw new IllegalStateException(sb7.toString());
        }
    }

    vkw(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final boolean e() {
        return this.e;
    }

    public final boolean f() {
        return this.f;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignupConfiguration{canAcceptLicensesInOneStep=");
        sb.append(this.a);
        sb.append(", canSignupWithAllGenders=");
        sb.append(this.b);
        sb.append(", canImplicitlyAcceptTermsAndCondition=");
        sb.append(this.c);
        sb.append(", requiresMarketingOptIn=");
        sb.append(this.d);
        sb.append(", requiresMarketingOptInText=");
        sb.append(this.e);
        sb.append(", requiresSpecificLicenses=");
        sb.append(this.f);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vla) {
            vla vla = (vla) obj;
            return this.a == vla.a() && this.b == vla.b() && this.c == vla.c() && this.d == vla.d() && this.e == vla.e() && this.f == vla.f();
        }
    }

    public int hashCode() {
        int i = 1231;
        int i2 = ((((((((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003) ^ (this.d ? 1231 : 1237)) * 1000003) ^ (this.e ? 1231 : 1237)) * 1000003;
        if (!this.f) {
            i = 1237;
        }
        return i2 ^ i;
    }
}
