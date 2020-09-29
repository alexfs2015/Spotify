package defpackage;

/* renamed from: voh reason: default package */
final class voh extends voi {
    private final boolean a;
    private final boolean b;
    private final boolean c;

    voh(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
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

    public final String toString() {
        StringBuilder sb = new StringBuilder("TermsAndConditionsModel{canImplicitlyAcceptTermsAndConditions=");
        sb.append(this.a);
        sb.append(", canImplicitlyAcceptPrivacyPolicy=");
        sb.append(this.b);
        sb.append(", shouldUseSpecificLicenses=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof voi) {
            voi voi = (voi) obj;
            return this.a == voi.a() && this.b == voi.b() && this.c == voi.c();
        }
    }

    public final int hashCode() {
        int i = 1231;
        int i2 = ((((this.a ? 1231 : 1237) ^ 1000003) * 1000003) ^ (this.b ? 1231 : 1237)) * 1000003;
        if (!this.c) {
            i = 1237;
        }
        return i2 ^ i;
    }
}
