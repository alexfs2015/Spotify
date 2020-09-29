package defpackage;

/* renamed from: pkg reason: default package */
abstract class pkg extends pkn {
    final int a;
    final String b;
    final String c;
    final String d;

    pkg(int i, String str, String str2, String str3) {
        this.a = i;
        if (str != null) {
            this.b = str;
            if (str2 != null) {
                this.c = str2;
                if (str3 != null) {
                    this.d = str3;
                    return;
                }
                throw new NullPointerException("Null entityUri");
            }
            throw new NullPointerException("Null campaignId");
        }
        throw new NullPointerException("Null messageId");
    }

    public final int a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.d;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SaveEntityAction{notificationId=");
        sb.append(this.a);
        sb.append(", messageId=");
        sb.append(this.b);
        sb.append(", campaignId=");
        sb.append(this.c);
        sb.append(", entityUri=");
        sb.append(this.d);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pkn) {
            pkn pkn = (pkn) obj;
            return this.a == pkn.a() && this.b.equals(pkn.b()) && this.c.equals(pkn.c()) && this.d.equals(pkn.d());
        }
    }

    public int hashCode() {
        return ((((((this.a ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }
}
