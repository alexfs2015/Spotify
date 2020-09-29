package defpackage;

/* renamed from: tdn reason: default package */
final class tdn extends tds {
    private final int a;
    private final int b;

    tdn(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tds) {
            tds tds = (tds) obj;
            return this.a == tds.a() && this.b == tds.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollEvent{y=");
        sb.append(this.a);
        sb.append(", oldY=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
