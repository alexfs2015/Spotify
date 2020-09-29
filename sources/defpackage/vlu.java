package defpackage;

/* renamed from: vlu reason: default package */
public final class vlu extends vlw {
    private final int a;
    private final int b;

    public vlu(int i, int i2) {
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
        if (obj instanceof vlw) {
            vlw vlw = (vlw) obj;
            return this.a == vlw.a() && this.b == vlw.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Range{start=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
