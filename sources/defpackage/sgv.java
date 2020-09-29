package defpackage;

/* renamed from: sgv reason: default package */
final class sgv extends shb {
    private final String a;
    private final String b;

    sgv(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null subtitle");
        }
        throw new NullPointerException("Null header");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OfflineTextHolder{header=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof shb) {
            shb shb = (shb) obj;
            return this.a.equals(shb.a()) && this.b.equals(shb.b());
        }
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
