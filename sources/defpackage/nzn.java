package defpackage;

/* renamed from: nzn reason: default package */
final class nzn extends nzr {
    private final String a;
    private final String b;

    nzn(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null expectedResultPartner");
        }
        throw new NullPointerException("Null backendUrl");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerAccountLinkingStatusRequest{backendUrl=");
        sb.append(this.a);
        sb.append(", expectedResultPartner=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof nzr) {
            nzr nzr = (nzr) obj;
            return this.a.equals(nzr.a()) && this.b.equals(nzr.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
