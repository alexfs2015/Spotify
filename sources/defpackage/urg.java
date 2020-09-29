package defpackage;

/* renamed from: urg reason: default package */
final class urg extends urh {
    private final int a;
    private final int b;

    urg(int i, int i2) {
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
        StringBuilder sb = new StringBuilder("NowPlayingInsets{top=");
        sb.append(this.a);
        sb.append(", bottom=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof urh) {
            urh urh = (urh) obj;
            return this.a == urh.a() && this.b == urh.b();
        }
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ this.b;
    }
}
