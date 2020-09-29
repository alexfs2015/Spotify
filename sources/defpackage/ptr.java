package defpackage;

/* renamed from: ptr reason: default package */
abstract class ptr extends ptv {
    final String a;

    ptr(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null name");
    }

    public final String a() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ptv)) {
            return false;
        }
        return this.a.equals(((ptv) obj).a());
    }

    public int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CategoryViewModel{name=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
