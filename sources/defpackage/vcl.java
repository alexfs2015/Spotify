package defpackage;

/* renamed from: vcl reason: default package */
final class vcl extends vcm {
    private final int a;
    private final int b;

    vcl(int i, int i2) {
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
        if (obj instanceof vcm) {
            vcm vcm = (vcm) obj;
            return this.a == vcm.a() && this.b == vcm.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NowPlayingInsets{top=");
        sb.append(this.a);
        sb.append(", bottom=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
