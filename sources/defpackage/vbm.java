package defpackage;

/* renamed from: vbm reason: default package */
public final class vbm extends vbp {
    private final String a;

    public vbm(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null title");
    }

    public final String a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Header{title=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vbp)) {
            return false;
        }
        return this.a.equals(((vbp) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
