package defpackage;

/* renamed from: avy reason: default package */
final class avy extends ate {

    /* renamed from: avy$a */
    static final class a implements g {
        private final bek a;
        private final bea b;

        private a(bek bek) {
            this.a = bek;
            this.b = new bea(20000);
        }

        /* synthetic */ a(bek bek, byte b2) {
            this(bek);
        }

        public final f a(atl atl, long j) {
            long c = atl.c();
            int min = (int) Math.min(20000, atl.d() - atl.c());
            this.b.a(min);
            atl.c(this.b.a, 0, min);
            bea bea = this.b;
            int i = -1;
            long j2 = -9223372036854775807L;
            int i2 = -1;
            while (bea.b() >= 4) {
                if (avy.a(bea.a, bea.b) != 442) {
                    bea.d(1);
                } else {
                    bea.d(4);
                    long a2 = avz.a(bea);
                    if (a2 != -9223372036854775807L) {
                        long b2 = this.a.b(a2);
                        if (b2 > j) {
                            return j2 == -9223372036854775807L ? f.a(b2, c) : f.a(c + ((long) i2));
                        }
                        if (100000 + b2 > j) {
                            return f.a(c + ((long) bea.b));
                        }
                        i2 = bea.b;
                        j2 = b2;
                    }
                    int i3 = bea.c;
                    if (bea.b() >= 10) {
                        bea.d(9);
                        int c2 = bea.c() & 7;
                        if (bea.b() >= c2) {
                            bea.d(c2);
                            if (bea.b() >= 4) {
                                if (avy.a(bea.a, bea.b) == 443) {
                                    bea.d(4);
                                    int d = bea.d();
                                    if (bea.b() < d) {
                                        bea.c(i3);
                                    } else {
                                        bea.d(d);
                                    }
                                }
                                while (true) {
                                    if (bea.b() < 4) {
                                        break;
                                    }
                                    int a3 = avy.a(bea.a, bea.b);
                                    if (a3 == 442 || a3 == 441 || (a3 >>> 8) != 1) {
                                        break;
                                    }
                                    bea.d(4);
                                    if (bea.b() < 2) {
                                        bea.c(i3);
                                        break;
                                    }
                                    bea.c(Math.min(bea.c, bea.b + bea.d()));
                                }
                            } else {
                                bea.c(i3);
                            }
                        } else {
                            bea.c(i3);
                        }
                    } else {
                        bea.c(i3);
                    }
                    i = bea.b;
                }
            }
            return j2 != -9223372036854775807L ? f.b(j2, c + ((long) i)) : f.a;
        }
    }

    public avy(bek bek, long j, long j2) {
        super(new b(), new a(bek, 0), j, 0, j + 1, 0, j2, 188, 1000);
    }

    static /* synthetic */ int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
