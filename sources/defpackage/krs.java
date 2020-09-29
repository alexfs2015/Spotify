package defpackage;

/* renamed from: krs reason: default package */
public final class krs extends krt {
    private final long a;
    private final double b;
    private final boolean c;
    private final boolean d;
    private final long e;

    public krs(long j, double d2, boolean z, boolean z2, long j2) {
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

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof krt) {
            krt krt = (krt) obj;
            return this.a == krt.a() && Double.doubleToLongBits(this.b) == Double.doubleToLongBits(krt.b()) && this.c == krt.c() && this.d == krt.d() && this.e == krt.e();
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
}
