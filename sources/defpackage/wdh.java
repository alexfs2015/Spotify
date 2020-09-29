package defpackage;

import io.netty.handler.codec.base64.Base64Dialect;

/* renamed from: wdh reason: default package */
public final class wdh {
    private static byte[] a(Base64Dialect base64Dialect) {
        if (base64Dialect != null) {
            return base64Dialect.alphabet;
        }
        throw new NullPointerException("dialect");
    }

    private static byte[] b(Base64Dialect base64Dialect) {
        if (base64Dialect != null) {
            return base64Dialect.decodabet;
        }
        throw new NullPointerException("dialect");
    }

    public static vyv a(vyv vyv, boolean z) {
        Base64Dialect base64Dialect = Base64Dialect.STANDARD;
        if (vyv != null) {
            vyv a = a(vyv, vyv.c(), vyv.g(), true, base64Dialect, vyv.D());
            vyv.a(vyv.d());
            return a;
        }
        throw new NullPointerException("src");
    }

    public static vyv a(vyv vyv, int i, int i2, boolean z, Base64Dialect base64Dialect, vyw vyw) {
        int i3 = i2;
        if (vyv == null) {
            throw new NullPointerException("src");
        } else if (base64Dialect != null) {
            int i4 = (i3 << 2) / 3;
            vyv a = vyw.a((i3 % 3 > 0 ? 4 : 0) + i4 + (z ? i4 / 76 : 0)).a(vyv.E());
            int i5 = i3 - 2;
            int i6 = 0;
            int i7 = 0;
            int i8 = 0;
            while (i6 < i5) {
                a(vyv, i6 + i, 3, a, i7, base64Dialect);
                i8 += 4;
                if (z && i8 == 76) {
                    a.b(i7 + 4, 10);
                    i7++;
                    i8 = 0;
                }
                i6 += 3;
                i7 += 4;
            }
            if (i6 < i3) {
                a(vyv, i6 + i, i3 - i6, a, i7, base64Dialect);
                i7 += 4;
            }
            if (i7 > 1 && a.e(i7 - 1) == 10) {
                i7--;
            }
            return a.i(0, i7);
        } else {
            throw new NullPointerException("dialect");
        }
    }

    private static void a(vyv vyv, int i, int i2, vyv vyv2, int i3, Base64Dialect base64Dialect) {
        byte[] a = a(base64Dialect);
        int i4 = 0;
        int e = (i2 > 0 ? (vyv.e(i) << 24) >>> 8 : 0) | (i2 > 1 ? (vyv.e(i + 1) << 24) >>> 16 : 0);
        if (i2 > 2) {
            i4 = (vyv.e(i + 2) << 24) >>> 24;
        }
        int i5 = e | i4;
        if (i2 == 1) {
            vyv2.b(i3, (int) a[i5 >>> 18]);
            vyv2.b(i3 + 1, (int) a[(i5 >>> 12) & 63]);
            vyv2.b(i3 + 2, 61);
            vyv2.b(i3 + 3, 61);
        } else if (i2 == 2) {
            vyv2.b(i3, (int) a[i5 >>> 18]);
            vyv2.b(i3 + 1, (int) a[(i5 >>> 12) & 63]);
            vyv2.b(i3 + 2, (int) a[(i5 >>> 6) & 63]);
            vyv2.b(i3 + 3, 61);
        } else if (i2 == 3) {
            vyv2.b(i3, (int) a[i5 >>> 18]);
            vyv2.b(i3 + 1, (int) a[(i5 >>> 12) & 63]);
            vyv2.b(i3 + 2, (int) a[(i5 >>> 6) & 63]);
            vyv2.b(i3 + 3, (int) a[i5 & 63]);
        }
    }

    public static vyv a(vyv vyv) {
        Base64Dialect base64Dialect = Base64Dialect.STANDARD;
        if (vyv != null) {
            vyv a = a(vyv, vyv.c(), vyv.g(), base64Dialect, vyv.D());
            vyv.a(vyv.d());
            return a;
        }
        throw new NullPointerException("src");
    }

    private static vyv a(vyv vyv, int i, int i2, Base64Dialect base64Dialect, vyw vyw) {
        if (vyv == null) {
            throw new NullPointerException("src");
        } else if (base64Dialect != null) {
            byte[] b = b(base64Dialect);
            vyv a = vyw.a((i2 * 3) / 4).a(vyv.E());
            byte[] bArr = new byte[4];
            int i3 = i;
            int i4 = 0;
            int i5 = 0;
            while (i3 < i + i2) {
                byte e = (byte) (vyv.e(i3) & Byte.MAX_VALUE);
                byte b2 = b[e];
                if (b2 >= -5) {
                    if (b2 >= -1) {
                        int i6 = i4 + 1;
                        bArr[i4] = e;
                        if (i6 > 3) {
                            i5 += a(bArr, 0, a, i5, base64Dialect);
                            if (e == 61) {
                                break;
                            }
                            i4 = 0;
                        } else {
                            i4 = i6;
                        }
                    }
                    i3++;
                } else {
                    StringBuilder sb = new StringBuilder("bad Base64 input character at ");
                    sb.append(i3);
                    sb.append(": ");
                    sb.append(vyv.g(i3));
                    sb.append(" (decimal)");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            return a.i(0, i5);
        } else {
            throw new NullPointerException("dialect");
        }
    }

    private static int a(byte[] bArr, int i, vyv vyv, int i2, Base64Dialect base64Dialect) {
        byte[] b = b(base64Dialect);
        if (bArr[2] == 61) {
            vyv.b(i2, (int) (byte) ((((b[bArr[1]] & 255) << 12) | ((b[bArr[0]] & 255) << 18)) >>> 16));
            return 1;
        } else if (bArr[3] == 61) {
            int i3 = ((b[bArr[2]] & 255) << 6) | ((b[bArr[0]] & 255) << 18) | ((b[bArr[1]] & 255) << 12);
            vyv.b(i2, (int) (byte) (i3 >>> 16));
            vyv.b(i2 + 1, (int) (byte) (i3 >>> 8));
            return 2;
        } else {
            try {
                byte b2 = (b[bArr[3]] & 255) | ((b[bArr[0]] & 255) << 18) | ((b[bArr[1]] & 255) << 12) | ((b[bArr[2]] & 255) << 6);
                vyv.b(i2, (int) (byte) (b2 >> 16));
                vyv.b(i2 + 1, (int) (byte) (b2 >> 8));
                vyv.b(i2 + 2, (int) (byte) b2);
                return 3;
            } catch (IndexOutOfBoundsException unused) {
                throw new IllegalArgumentException("not encoded in Base64");
            }
        }
    }
}
