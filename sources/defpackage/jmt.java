package defpackage;

/* renamed from: jmt reason: default package */
final class jmt extends jmv {
    private final int a;
    private final int b;
    private final int c;

    jmt(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jmv) {
            jmv jmv = (jmv) obj;
            return this.a == jmv.a() && this.b == jmv.b() && this.c == jmv.c();
        }
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Feature{imageResource=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", description=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
