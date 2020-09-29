package defpackage;

/* renamed from: pla reason: default package */
abstract class pla extends plf {
    final String a;
    final String b;

    pla(String str, String str2) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                return;
            }
            throw new NullPointerException("Null description");
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DescriptionViewModel{title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof plf) {
            plf plf = (plf) obj;
            return this.a.equals(plf.a()) && this.b.equals(plf.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }
}
