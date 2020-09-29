package defpackage;

/* renamed from: aus reason: default package */
final class aus {
    private static final int[] a = {ben.g("isom"), ben.g("iso2"), ben.g("iso3"), ben.g("iso4"), ben.g("iso5"), ben.g("iso6"), ben.g("avc1"), ben.g("hvc1"), ben.g("hev1"), ben.g("mp41"), ben.g("mp42"), ben.g("3g2a"), ben.g("3g2b"), ben.g("3gr6"), ben.g("3gs6"), ben.g("3ge6"), ben.g("3gg6"), ben.g("M4V "), ben.g("M4A "), ben.g("f4v "), ben.g("kddi"), ben.g("M4VP"), ben.g("qt  "), ben.g("MSNV")};

    private static boolean a(int i) {
        if ((i >>> 8) == ben.g("3gp")) {
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

    public static boolean a(atl atl) {
        return a(atl, true);
    }

    private static boolean a(atl atl, boolean z) {
        boolean z2;
        atl atl2 = atl;
        long d = atl.d();
        long j = -1;
        if (d == -1 || d > 4096) {
            d = 4096;
        }
        int i = (int) d;
        bea bea = new bea(64);
        int i2 = 0;
        boolean z3 = false;
        while (true) {
            if (i2 >= i) {
                break;
            }
            bea.a(8);
            atl2.c(bea.a, 0, 8);
            long g = bea.g();
            int i3 = bea.i();
            int i4 = 16;
            if (g == 1) {
                atl2.c(bea.a, 8, 8);
                bea.b(16);
                g = bea.p();
            } else {
                if (g == 0) {
                    long d2 = atl.d();
                    if (d2 != j) {
                        g = 8 + (d2 - atl.c());
                    }
                }
                i4 = 8;
            }
            long j2 = (long) i4;
            if (g >= j2) {
                i2 += i4;
                if (i3 != auk.B) {
                    if (i3 != auk.K && i3 != auk.M) {
                        if ((((long) i2) + g) - j2 >= ((long) i)) {
                            break;
                        }
                        int i5 = (int) (g - j2);
                        i2 += i5;
                        if (i3 == auk.a) {
                            if (i5 < 8) {
                                return false;
                            }
                            bea.a(i5);
                            atl2.c(bea.a, 0, i5);
                            int i6 = i5 / 4;
                            int i7 = 0;
                            while (true) {
                                if (i7 >= i6) {
                                    break;
                                }
                                if (i7 == 1) {
                                    bea.d(4);
                                } else if (a(bea.i())) {
                                    z3 = true;
                                    break;
                                }
                                i7++;
                            }
                            if (!z3) {
                                return false;
                            }
                        } else if (i5 != 0) {
                            atl2.c(i5);
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
        return z3 && z == z2;
    }

    public static boolean b(atl atl) {
        return a(atl, false);
    }
}
