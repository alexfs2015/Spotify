package defpackage;

/* renamed from: kee reason: default package */
final class kee extends kek {
    private final long a;
    private final long b;

    kee(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kek) {
            kek kek = (kek) obj;
            return this.a == kek.a() && this.b == kek.b();
        }
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ObservedBitrate{bitrate=");
        sb.append(this.a);
        sb.append(", bytesTransferred=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
