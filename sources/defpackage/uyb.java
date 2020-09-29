package defpackage;

/* renamed from: uyb reason: default package */
abstract class uyb extends uyd {
    final int a;
    final int b;

    uyb(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Range{start=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof uyd) {
            uyd uyd = (uyd) obj;
            return this.a == uyd.a() && this.b == uyd.b();
        }
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
