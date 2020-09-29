package defpackage;

/* renamed from: ofc reason: default package */
public final class ofc extends ofk {
    private final long a;
    private final long b;
    private final float c;

    public ofc(long j, long j2, float f) {
        this.a = j;
        this.b = j2;
        this.c = f;
    }

    public final long a() {
        return this.a;
    }

    public final long b() {
        return this.b;
    }

    public final float c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ofk) {
            ofk ofk = (ofk) obj;
            return this.a == ofk.a() && this.b == ofk.b() && Float.floatToIntBits(this.c) == Float.floatToIntBits(ofk.c());
        }
    }

    public final int hashCode() {
        long j = this.a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        long j2 = this.b;
        return Float.floatToIntBits(this.c) ^ ((i ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarViewData{currentPlaybackPosition=");
        sb.append(this.a);
        sb.append(", duration=");
        sb.append(this.b);
        sb.append(", playbackSpeed=");
        sb.append(this.c);
        sb.append("}");
        return sb.toString();
    }
}
