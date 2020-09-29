package defpackage;

/* renamed from: awf reason: default package */
final class awf extends ate {

    /* renamed from: awf$a */
    static final class a implements g {
        private final bek a;
        private final bea b = new bea(37600);
        private final int c;

        public a(int i, bek bek) {
            this.c = i;
            this.a = bek;
        }

        public final f a(atl atl, long j) {
            long c2 = atl.c();
            int min = (int) Math.min(37600, atl.d() - atl.c());
            this.b.a(min);
            atl.c(this.b.a, 0, min);
            bea bea = this.b;
            int i = bea.c;
            long j2 = -1;
            long j3 = -1;
            long j4 = -9223372036854775807L;
            while (bea.b() >= 188) {
                int a2 = awj.a(bea.a, bea.b, i);
                int i2 = a2 + 188;
                if (i2 > i) {
                    break;
                }
                long a3 = awj.a(bea, a2, this.c);
                if (a3 != -9223372036854775807L) {
                    long b2 = this.a.b(a3);
                    if (b2 > j) {
                        return j4 == -9223372036854775807L ? f.a(b2, c2) : f.a(c2 + j3);
                    }
                    if (100000 + b2 > j) {
                        return f.a(c2 + ((long) a2));
                    }
                    j3 = (long) a2;
                    j4 = b2;
                }
                bea.c(i2);
                j2 = (long) i2;
            }
            return j4 != -9223372036854775807L ? f.b(j4, c2 + j2) : f.a;
        }
    }

    public awf(bek bek, long j, long j2, int i) {
        long j3 = j;
        super(new b(), new a(i, bek), j3, 0, j + 1, 0, j2, 188, 940);
    }
}
