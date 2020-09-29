package defpackage;

/* renamed from: sar reason: default package */
final class sar extends sba {
    private final int a;
    private final int b;

    sar(int i, int i2) {
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
        StringBuilder sb = new StringBuilder("ImageSizeSpec{cell=");
        sb.append(this.a);
        sb.append(", card=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof sba) {
            sba sba = (sba) obj;
            return this.a == sba.a() && this.b == sba.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
