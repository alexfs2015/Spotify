package defpackage;

/* renamed from: oao reason: default package */
abstract class oao extends oas {
    final gkq a;
    final String b;

    oao(gkq gkq, String str) {
        if (gkq != null) {
            this.a = gkq;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null phoneNumber");
        }
        throw new NullPointerException("Null callingCode");
    }

    public final gkq a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OtpHandle{callingCode=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof oas) {
            oas oas = (oas) obj;
            return this.a.equals(oas.a()) && this.b.equals(oas.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
