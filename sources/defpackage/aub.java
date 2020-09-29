package defpackage;

/* renamed from: aub reason: default package */
final class aub {
    private static final int[] a = {bdw.g("isom"), bdw.g("iso2"), bdw.g("iso3"), bdw.g("iso4"), bdw.g("iso5"), bdw.g("iso6"), bdw.g("avc1"), bdw.g("hvc1"), bdw.g("hev1"), bdw.g("mp41"), bdw.g("mp42"), bdw.g("3g2a"), bdw.g("3g2b"), bdw.g("3gr6"), bdw.g("3gs6"), bdw.g("3ge6"), bdw.g("3gg6"), bdw.g("M4V "), bdw.g("M4A "), bdw.g("f4v "), bdw.g("kddi"), bdw.g("M4VP"), bdw.g("qt  "), bdw.g("MSNV")};

    public static boolean a(asu asu) {
        return a(asu, true);
    }

    public static boolean b(asu asu) {
        return a(asu, false);
    }

    private static boolean a(asu asu, boolean z) {
        boolean z2;
        asu asu2 = asu;
        long d = asu.d();
        long j = -1;
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        bdj bdj = new bdj(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            bdj.a(8);
            asu2.c(bdj.a, 0, 8);
            long g = bdj.g();
            int i3 = bdj.i();
            int i4 = 16;
            if (g == 1) {
                asu2.c(bdj.a, 8, 8);
                bdj.b(16);
                g = bdj.p();
            } else {
                if (g == 0) {
                    long d2 = asu.d();
                    if (d2 != j) {
                        g = 8 + (d2 - asu.c());
                    }
                }
                i4 = 8;
            }
            long j2 = (long) i4;
            if (g >= j2) {
                i2 += i4;
                if (i3 != att.B) {
                    if (i3 != att.K && i3 != att.M) {
                        if ((((long) i2) + g) - j2 >= ((long) i)) {
                            break;
                        }
                        int i5 = (int) (g - j2);
                        i2 += i5;
                        if (i3 == att.a) {
                            if (i5 < 8) {
                                return false;
                            }
                            bdj.a(i5);
                            asu2.c(bdj.a, 0, i5);
                            int i6 = i5 / 4;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    break;
                                }
                                if (i7 == 1) {
                                    bdj.d(4);
                                } else if (a(bdj.i())) {
                                    z3 = true;
                                    break;
                                }
                                i7++;
                            }
                            if (!z3) {
                                return false;
                            }
                        } else if (i5 != 0) {
                            asu2.c(i5);
                        }
                        j = -1;
                    } else {
                        z2 = true;
                    }
                }
            } else {
                return false;
            }
        }
        z2 = false;
        if (!z3 || z != z2) {
            return false;
        }
        return true;
    }

    private static boolean a(int i) {
        if ((i >>> 8) == bdw.g("3gp")) {
            return true;
        }
        int[] iArr = a;
        for (int i2 = 0; i2 < 24; i2++) {
            if (iArr[i2] == i) {
                return true;
            }
        }
        return false;
    }
}
