package defpackage;

/* renamed from: kvb reason: default package */
public final class kvb extends kvc {
    private final long a;
    private final double b;
    private final boolean c;
    private final boolean d;
    private final long e;

    public kvb(long j, double d2, boolean z, boolean z2, long j2) {
        this.a = j;
        this.b = d2;
        this.c = z;
        this.d = z2;
        this.e = j2;
    }

    public final long a() {
        return this.a;
    }

    public final double b() {
        return this.b;
    }

    public final boolean c() {
        return this.c;
    }

    public final boolean d() {
        return this.d;
    }

    public final long e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvc) {
            kvc kvc = (kvc) obj;
            return this.a == kvc.a() && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(kvc.b()) && this.c == kvc.c() && this.d == kvc.d() && this.e == kvc.e();
        }
    }

    public final int hashCode() {
        long j = this.a;
        int i = 1231;
        int doubleToLongBits = (((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.b) >>> 32) ^ Double.doubleToLongBits(this.b)))) * 1000003) ^ (this.c ? 1231 : 1237)) * 1000003;
        if (!this.d) {
            i = 1237;
        }
        int i2 = (doubleToLongBits ^ i) * 1000003;
        long j2 = this.e;
        return ((int) (j2 ^ (j2 >>> 32))) ^ i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContextPlayerPlaybackState{currentPosition=");
        sb.append(this.a);
        sb.append(", playbackSpeed=");
        sb.append(this.b);
        sb.append(", isPlaying=");
        sb.append(this.c);
        sb.append(", isPaused=");
        sb.append(this.d);
        sb.append(", duration=");
        sb.append(this.e);
        sb.append("}");
        return sb.toString();
    }
}
