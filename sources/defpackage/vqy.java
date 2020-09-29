package defpackage;

/* renamed from: vqy reason: default package */
final class vqy extends vrd {
    private final String l;

    vqy(String str) {
        if (str != null) {
            this.l = str;
            return;
        }
        throw new NullPointerException("Null type");
    }

    public final String a() {
        return this.l;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorType{type=");
        sb.append(this.l);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vrd)) {
            return false;
        }
        return this.l.equals(((vrd) obj).a());
    }

    public final int hashCode() {
        return this.l.hashCode() ^ 1000003;
    }
}
