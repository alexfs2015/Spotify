package defpackage;

import java.util.List;

/* renamed from: jno reason: default package */
final class jno extends jns {
    private final List<jnt> a;

    jno(List<jnt> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null fields");
    }

    public final List<jnt> a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jns)) {
            return false;
        }
        return this.a.equals(((jns) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Display{fields=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }
}
