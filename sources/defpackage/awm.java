package defpackage;

/* renamed from: awm reason: default package */
final class awm implements ats {
    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    long f;
    long g;
    private final int h;

    public awm(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.h = i3;
        this.c = i4;
        this.d = i5;
        this.e = i6;
    }

    public final a a(long j) {
        long j2 = (((long) this.h) * j) / 1000000;
        int i = this.c;
        long a2 = ben.a((j2 / ((long) i)) * ((long) i), 0, this.g - ((long) i));
        long j3 = this.f + a2;
        long b2 = b(j3);
        att att = new att(b2, j3);
        if (b2 < j) {
            long j4 = this.g;
            int i2 = this.c;
            if (a2 != j4 - ((long) i2)) {
                long j5 = j3 + ((long) i2);
                return new a(att, new att(b(j5), j5));
            }
        }
        return new a(att);
    }

    public final long b() {
        return ((this.g / ((long) this.c)) * 1000000) / ((long) this.b);
    }

    public final long b(long j) {
        return (Math.max(0, j - this.f) * 1000000) / ((long) this.h);
    }

    public final boolean c() {
        return (this.f == 0 || this.g == 0) ? false : true;
    }

    public final boolean l_() {
        return true;
    }
}
