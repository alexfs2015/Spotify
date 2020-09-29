package defpackage;

/* renamed from: weg reason: default package */
final class weg extends wel {
    private final String n;

    weg(String str) {
        if (str != null) {
            this.n = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final String a() {
        return this.n;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof wel)) {
            return false;
        }
        return this.n.equals(((wel) obj).a());
    }

    public final int hashCode() {
        return this.n.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorType{type=");
        sb.append(this.n);
        sb.append("}");
        return sb.toString();
    }
}
