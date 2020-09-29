package defpackage;

import com.google.android.gms.internal.ads.zzbah;
import com.google.android.gms.internal.ads.zzbbu;

/* renamed from: dcm reason: default package */
final class dcm {
    static int a(int i, byte[] bArr, int i2, int i3, dcn dcn) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                return b(bArr, i2, dcn);
            }
            if (i4 == 1) {
                return i2 + 8;
            }
            if (i4 == 2) {
                return a(bArr, i2, dcn) + dcn.a;
            }
            if (i4 == 3) {
                int i5 = (i & -8) | 4;
                int i6 = 0;
                while (i2 < i3) {
                    i2 = a(bArr, i2, dcn);
                    i6 = dcn.a;
                    if (i6 == i5) {
                        break;
                    }
                    i2 = a(i6, bArr, i2, i3, dcn);
                }
                if (i2 <= i3 && i6 == i5) {
                    return i2;
                }
                throw zzbbu.g();
            } else if (i4 == 5) {
                return i2 + 4;
            } else {
                throw zzbbu.d();
            }
        } else {
            throw zzbbu.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, int i3, ddu<?> ddu, dcn dcn) {
        ddq ddq = (ddq) ddu;
        int a = a(bArr, i2, dcn);
        while (true) {
            ddq.c(dcn.a);
            if (a >= i3) {
                break;
            }
            int a2 = a(bArr, a, dcn);
            if (i != dcn.a) {
                break;
            }
            a = a(bArr, a2, dcn);
        }
        return a;
    }

    static int a(int i, byte[] bArr, int i2, int i3, dgc dgc, dcn dcn) {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int b = b(bArr, i2, dcn);
                dgc.a(i, (Object) Long.valueOf(dcn.b));
                return b;
            } else if (i4 == 1) {
                dgc.a(i, (Object) Long.valueOf(b(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int a = a(bArr, i2, dcn);
                int i5 = dcn.a;
                dgc.a(i, (Object) i5 == 0 ? zzbah.a : zzbah.a(bArr, a, i5));
                return a + i5;
            } else if (i4 == 3) {
                dgc b2 = dgc.b();
                int i6 = (i & -8) | 4;
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int a2 = a(bArr, i2, dcn);
                    int i8 = dcn.a;
                    i7 = i8;
                    if (i8 == i6) {
                        i2 = a2;
                        break;
                    }
                    int a3 = a(i7, bArr, a2, i3, b2, dcn);
                    i7 = i8;
                    i2 = a3;
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzbbu.g();
                }
                dgc.a(i, (Object) b2);
                return i2;
            } else if (i4 == 5) {
                dgc.a(i, (Object) Integer.valueOf(a(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzbbu.d();
            }
        } else {
            throw zzbbu.d();
        }
    }

    static int a(int i, byte[] bArr, int i2, dcn dcn) {
        int i3;
        int i4;
        int i5 = i & 127;
        int i6 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            i4 = b << 7;
        } else {
            int i7 = i5 | ((b & Byte.MAX_VALUE) << 7);
            int i8 = i6 + 1;
            byte b2 = bArr[i6];
            if (b2 >= 0) {
                i3 = b2 << 14;
            } else {
                i5 = i7 | ((b2 & Byte.MAX_VALUE) << 14);
                i6 = i8 + 1;
                byte b3 = bArr[i8];
                if (b3 >= 0) {
                    i4 = b3 << 21;
                } else {
                    i7 = i5 | ((b3 & Byte.MAX_VALUE) << 21);
                    i8 = i6 + 1;
                    byte b4 = bArr[i6];
                    if (b4 >= 0) {
                        i3 = b4 << 28;
                    } else {
                        int i9 = i7 | ((b4 & Byte.MAX_VALUE) << 28);
                        while (true) {
                            int i10 = i8 + 1;
                            if (bArr[i8] >= 0) {
                                dcn.a = i9;
                                return i10;
                            }
                            i8 = i10;
                        }
                    }
                }
            }
            dcn.a = i7 | i3;
            return i8;
        }
        dcn.a = i5 | i4;
        return i6;
    }

    static int a(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    static int a(byte[] bArr, int i, dcn dcn) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return a((int) b, bArr, i2, dcn);
        }
        dcn.a = b;
        return i2;
    }

    static int a(byte[] bArr, int i, ddu<?> ddu, dcn dcn) {
        ddq ddq = (ddq) ddu;
        int a = a(bArr, i, dcn);
        int i2 = dcn.a + a;
        while (a < i2) {
            a = a(bArr, a, dcn);
            ddq.c(dcn.a);
        }
        if (a == i2) {
            return a;
        }
        throw zzbbu.a();
    }

    static int b(byte[] bArr, int i, dcn dcn) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            dcn.b = j;
            return i2;
        }
        long j2 = j & 127;
        int i3 = i2 + 1;
        byte b = bArr[i2];
        long j3 = j2 | (((long) (b & Byte.MAX_VALUE)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j3 |= ((long) (b2 & Byte.MAX_VALUE)) << i4;
            int i6 = i5;
            b = b2;
            i3 = i6;
        }
        dcn.b = j3;
        return i3;
    }

    static long b(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    static double c(byte[] bArr, int i) {
        return Double.longBitsToDouble(b(bArr, i));
    }

    static int c(byte[] bArr, int i, dcn dcn) {
        int a = a(bArr, i, dcn);
        int i2 = dcn.a;
        if (i2 == 0) {
            dcn.c = "";
            return a;
        }
        dcn.c = new String(bArr, a, i2, ddr.a);
        return a + i2;
    }

    static float d(byte[] bArr, int i) {
        return Float.intBitsToFloat(a(bArr, i));
    }

    static int d(byte[] bArr, int i, dcn dcn) {
        int a = a(bArr, i, dcn);
        int i2 = dcn.a;
        if (i2 == 0) {
            dcn.c = "";
            return a;
        }
        int i3 = a + i2;
        if (dgj.a(bArr, a, i3)) {
            dcn.c = new String(bArr, a, i2, ddr.a);
            return i3;
        }
        throw zzbbu.h();
    }

    static int e(byte[] bArr, int i, dcn dcn) {
        int a = a(bArr, i, dcn);
        int i2 = dcn.a;
        if (i2 == 0) {
            dcn.c = zzbah.a;
            return a;
        }
        dcn.c = zzbah.a(bArr, a, i2);
        return a + i2;
    }
}
