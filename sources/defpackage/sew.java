package defpackage;

/* renamed from: sew reason: default package */
final class sew extends sey {
    private final Boolean a;
    private final String b;
    private final String c;

    sew(Boolean bool, String str, String str2) {
        if (bool != null) {
            this.a = bool;
            if (str != null) {
                this.b = str;
                if (str2 != null) {
                    this.c = str2;
                    return;
                }
                throw new NullPointerException("Null partnerIntegrationId");
            }
            throw new NullPointerException("Null clientId");
        }
        throw new NullPointerException("Null isConnected");
    }

    public final Boolean a() {
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
        if (obj instanceof sey) {
            sey sey = (sey) obj;
            return this.a.equals(sey.a()) && this.b.equals(sey.b()) && this.c.equals(sey.c());
        }
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PartnerIntegrationModel{isConnected=");
        sb.append(this.a);
        sb.append(", clientId=");
        sb.append(this.b);
        sb.append(", partnerIntegrationId=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
