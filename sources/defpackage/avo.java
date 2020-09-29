package defpackage;

/* renamed from: avo reason: default package */
final class avo extends asn {

    /* renamed from: avo$a */
    static final class a implements g {
        private final bdt a;
        private final bdj b = new bdj(37600);
        private final int c;

        public a(int i, bdt bdt) {
            this.c = i;
            this.a = bdt;
        }

        public final f a(asu asu, long j) {
            long c2 = asu.c();
            int min = (int) Math.min(37600, asu.d() - asu.c());
            this.b.a(min);
            asu.c(this.b.a, 0, min);
            bdj bdj = this.b;
            int i = bdj.c;
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (bdj.b() >= 188) {
                int a2 = avs.a(bdj.a, bdj.b, i);
                int i2 = a2 + 188;
                if (i2 > i) {
                    break;
                }
                long a3 = avs.a(bdj, a2, this.c);
                if (a3 != -9223372036854775807L) {
                    long b2 = this.a.b(a3);
                    if (b2 > j) {
                        if (j4 == -9223372036854775807L) {
                            return f.a(b2, c2);
                        }
                        return f.a(c2 + j3);
                    } else if (100000 + b2 > j) {
                        return f.a(c2 + ((long) a2));
                    } else {
                        j3 = (long) a2;
                        j4 = b2;
                    }
                }
                bdj.c(i2);
                j2 = (long) i2;
            }
            if (j4 != -9223372036854775807L) {
                return f.b(j4, c2 + j2);
            }
            return f.a;
        }
    }

    public avo(bdt bdt, long j, long j2, int i) {
        long j3 = j;
        super(new b(), new a(i, bdt), j3, 0, j + 1, 0, j2, 188, 940);
    }
}
