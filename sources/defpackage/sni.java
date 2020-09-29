package defpackage;

/* renamed from: sni reason: default package */
public final class sni extends sph {
    private final String a;
    private final String b;
    private final String c;

    public sni(String str, String str2, String str3) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                if (str3 != null) {
                    this.c = str3;
                    return;
                }
                throw new NullPointerException("Null productType");
            }
            throw new NullPointerException("Null countryCode");
        }
        throw new NullPointerException("Null currentUser");
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sph) {
            sph sph = (sph) obj;
            return this.a.equals(sph.a()) && this.b.equals(sph.b()) && this.c.equals(sph.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchSessionState{currentUser=");
        sb.append(this.a);
        sb.append(", countryCode=");
        sb.append(this.b);
        sb.append(", productType=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
