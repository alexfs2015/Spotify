package defpackage;

/* renamed from: avh reason: default package */
final class avh extends asn {

    /* renamed from: avh$a */
    static final class a implements g {
        private final bdt a;
        private final bdj b;

        /* synthetic */ a(bdt bdt, byte b2) {
            this(bdt);
        }

        private a(bdt bdt) {
            this.a = bdt;
            this.b = new bdj(20000);
        }

        public final f a(asu asu, long j) {
            long c = asu.c();
            int min = (int) Math.min(20000, asu.d() - asu.c());
            this.b.a(min);
            asu.c(this.b.a, 0, min);
            bdj bdj = this.b;
            int i = -1;
            long j2 = -9223372036854775807L;
            int i2 = -1;
            while (bdj.b() >= 4) {
                if (avh.a(bdj.a, bdj.b) != 442) {
                    bdj.d(1);
                } else {
                    bdj.d(4);
                    long a2 = avi.a(bdj);
                    if (a2 != -9223372036854775807L) {
                        long b2 = this.a.b(a2);
                        if (b2 > j) {
                            if (j2 == -9223372036854775807L) {
                                return f.a(b2, c);
                            }
                            return f.a(c + ((long) i2));
                        } else if (100000 + b2 > j) {
                            return f.a(c + ((long) bdj.b));
                        } else {
                            i2 = bdj.b;
                            j2 = b2;
                        }
                    }
                    int i3 = bdj.c;
                    if (bdj.b() >= 10) {
                        bdj.d(9);
                        int c2 = bdj.c() & 7;
                        if (bdj.b() >= c2) {
                            bdj.d(c2);
                            if (bdj.b() >= 4) {
                                if (avh.a(bdj.a, bdj.b) == 443) {
                                    bdj.d(4);
                                    int d = bdj.d();
                                    if (bdj.b() < d) {
                                        bdj.c(i3);
                                    } else {
                                        bdj.d(d);
                                    }
                                }
                                while (true) {
                                    if (bdj.b() < 4) {
                                        break;
                                    }
                                    int a3 = avh.a(bdj.a, bdj.b);
                                    if (a3 == 442 || a3 == 441 || (a3 >>> 8) != 1) {
                                        break;
                                    }
                                    bdj.d(4);
                                    if (bdj.b() < 2) {
                                        bdj.c(i3);
                                        break;
                                    }
                                    bdj.c(Math.min(bdj.c, bdj.b + bdj.d()));
                                }
                            } else {
                                bdj.c(i3);
                            }
                        } else {
                            bdj.c(i3);
                        }
                    } else {
                        bdj.c(i3);
                    }
                    i = bdj.b;
                }
            }
            if (j2 != -9223372036854775807L) {
                return f.b(j2, c + ((long) i));
            }
            return f.a;
        }
    }

    public avh(bdt bdt, long j, long j2) {
        super(new b(), new a(bdt, 0), j, 0, j + 1, 0, j2, 188, 1000);
    }

    static /* synthetic */ int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
