package defpackage;

/* renamed from: jle reason: default package */
final class jle extends jli {
    private final jlg a;

    jle(jlg jlg) {
        if (jlg != null) {
            this.a = jlg;
            return;
        }
        throw new NullPointerException("Null display");
    }

    public final jlg a() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Promotion{display=");
        sb.append(this.a);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof jli)) {
            return false;
        }
        return this.a.equals(((jli) obj).a());
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }
}
