package defpackage;

/* renamed from: pts reason: default package */
abstract class pts extends ptx {
    final String a;
    final String b;

    pts(String str, String str2) {
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

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ptx) {
            ptx ptx = (ptx) obj;
            return this.a.equals(ptx.a()) && this.b.equals(ptx.b());
        }
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("DescriptionViewModel{title=");
        sb.append(this.a);
        sb.append(", description=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
