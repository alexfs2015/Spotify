package defpackage;

/* renamed from: jnq reason: default package */
final class jnq extends jnu {
    private final jns a;

    jnq(jns jns) {
        if (jns != null) {
            this.a = jns;
            return;
        }
        throw new NullPointerException("Null display");
    }

    public final jns a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jnu)) {
            return false;
        }
        return this.a.equals(((jnu) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Promotion{display=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
