package defpackage;

/* renamed from: pkz reason: default package */
abstract class pkz extends pld {
    final String a;

    pkz(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CategoryViewModel{name=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pld)) {
            return false;
        }
        return this.a.equals(((pld) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
