package defpackage;

/* renamed from: rlu reason: default package */
final class rlu extends a {
    private final String a;

    rlu(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null pageUri");
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        return this.a.equals(((a) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingStarted{pageUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
