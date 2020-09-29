package defpackage;

/* renamed from: jkh reason: default package */
final class jkh extends jkj {
    private final int a;
    private final int b;
    private final int c;

    jkh(int i, int i2, int i3) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof jkj) {
            jkj jkj = (jkj) obj;
            return this.a == jkj.a() && this.b == jkj.b() && this.c == jkj.c();
        }
    }

    public final int hashCode() {
        return ((((this.a ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c;
    }
}
