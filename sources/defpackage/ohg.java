package defpackage;

/* renamed from: ohg reason: default package */
abstract class ohg extends ohl {
    final gmc a;
    final String b;

    ohg(gmc gmc, String str) {
        if (gmc != null) {
            this.a = gmc;
            if (str != null) {
                this.b = str;
                return;
            }
            throw new NullPointerException("Null phoneNumber");
        }
        throw new NullPointerException("Null callingCode");
    }

    public final gmc a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ohl) {
            ohl ohl = (ohl) obj;
            return this.a.equals(ohl.a()) && this.b.equals(ohl.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("OtpHandle{callingCode=");
        sb.append(this.a);
        sb.append(", phoneNumber=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
