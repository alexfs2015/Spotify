package defpackage;

import java.util.List;

/* renamed from: jlc reason: default package */
final class jlc extends jlg {
    private final List<jlh> a;

    jlc(List<jlh> list) {
        if (list != null) {
            this.a = list;
            return;
        }
        throw new NullPointerException("Null fields");
    }

    public final List<jlh> a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Display{fields=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jlg)) {
            return false;
        }
        return this.a.equals(((jlg) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
