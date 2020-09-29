package defpackage;

/* renamed from: sbp reason: default package */
public final class sbp extends sbz {
    private final String a;
    private final String b;
    private final String c;

    public sbp(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null countryCode");
            }
            throw new NullPointerException("Null productType");
        }
        throw new NullPointerException("Null username");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserSession{username=");
        sb.append(this.a);
        sb.append(", productType=");
        sb.append(this.b);
        sb.append(", countryCode=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sbz) {
            sbz sbz = (sbz) obj;
            return this.a.equals(sbz.a()) && this.b.equals(sbz.b()) && this.c.equals(sbz.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }
}
