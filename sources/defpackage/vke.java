package defpackage;

/* renamed from: vke reason: default package */
abstract class vke extends vkg {
    final int a;
    final int b;

    vke(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int a() {
        return this.a;
    }

    public final int b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vkg) {
            vkg vkg = (vkg) obj;
            return this.a == vkg.a() && this.b == vkg.b();
        }
    }

    public int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Range{start=");
        sb.append(this.a);
        sb.append(", length=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
