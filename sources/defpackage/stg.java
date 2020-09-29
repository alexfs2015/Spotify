package defpackage;

/* renamed from: stg reason: default package */
final class stg extends stl {
    private final int a;
    private final int b;

    stg(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScrollEvent{y=");
        sb.append(this.a);
        sb.append(", oldY=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof stl) {
            stl stl = (stl) obj;
            return this.a == stl.a() && this.b == stl.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
