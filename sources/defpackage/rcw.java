package defpackage;

/* renamed from: rcw reason: default package */
final class rcw extends a {
    private final String a;

    rcw(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null pageUri");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoadingStarted{pageUri=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
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
}
