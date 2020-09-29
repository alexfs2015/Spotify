package defpackage;

import com.comscore.streaming.ContentType;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/* renamed from: fmc reason: default package */
public final class fmc {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : ContentType.LONG_FORM_ON_DEMAND) + (i << 4)) * i;
    }

    public static fma a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        fmh fmh;
        int i8;
        int i9;
        fmh fmh2;
        int i10;
        int i11;
        fmd fmd = new fmd(bArr);
        Collection<fmf> singletonList = Collections.singletonList(fmf.a);
        int i12 = 0;
        while (true) {
            i3 = 5;
            i4 = 3;
            int i13 = 4;
            i5 = 32;
            i6 = 2;
            if (i12 >= fmd.d.length) {
                break;
            }
            int i14 = i12 + 1;
            byte b = i14 < fmd.d.length ? fmd.d[i14] : 0;
            byte b2 = fmd.d[i12];
            if (b2 == 13) {
                if (b != 10) {
                    i6 = 0;
                }
                i3 = i6;
            } else if (b2 == 44) {
                if (b != 32) {
                    i13 = 0;
                }
                i3 = i13;
            } else if (b2 == 46) {
                if (b != 32) {
                    i4 = 0;
                }
                i3 = i4;
            } else if (!(b2 == 58 && b == 32)) {
                i3 = 0;
            }
            if (i3 > 0) {
                singletonList = fmd.a((Iterable<fmf>) singletonList, i12, i3);
                i12 = i14;
            } else {
                LinkedList linkedList = new LinkedList();
                for (fmf a2 : singletonList) {
                    fmd.a(a2, i12, (Collection<fmf>) linkedList);
                }
                singletonList = fmd.a(linkedList);
            }
            i12++;
        }
        fmh a3 = ((fmf) Collections.min(singletonList, new Comparator<fmf>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((fmf) obj).d - ((fmf) obj2).d;
            }
        })).a(fmd.d);
        int i15 = 11;
        int i16 = ((a3.b * i) / 100) + 11;
        int i17 = a3.b + i16;
        if (i2 != 0) {
            boolean z2 = i2 < 0;
            int abs = Math.abs(i2);
            if (z2) {
                i5 = 4;
            }
            if (abs <= i5) {
                int a4 = a(abs, z2);
                int i18 = a[abs];
                int i19 = a4 - (a4 % i18);
                fmh a5 = a(a3, i18);
                int i20 = a5.b + i16;
                String str = "Data to large for user specified layer";
                if (i20 > i19) {
                    throw new IllegalArgumentException(str);
                } else if (!z2 || a5.b <= (i18 << 6)) {
                    fmh = a5;
                    z = z2;
                    i7 = abs;
                    i9 = a4;
                    i8 = i18;
                } else {
                    throw new IllegalArgumentException(str);
                }
            } else {
                throw new IllegalArgumentException(String.format("Illegal value %s for layers", new Object[]{Integer.valueOf(i2)}));
            }
        } else {
            fmh = null;
            int i21 = 0;
            int i22 = 0;
            while (i21 <= i5) {
                z = i21 <= i4;
                i7 = z ? i21 + 1 : i21;
                i9 = a(i7, z);
                if (i17 <= i9) {
                    int[] iArr = a;
                    if (i22 != iArr[i7]) {
                        i8 = iArr[i7];
                        fmh = a(a3, i8);
                    } else {
                        i8 = i22;
                    }
                    int i23 = i9 - (i9 % i8);
                    if ((z && fmh.b > (i8 << 6)) || fmh.b + i16 > i23) {
                        i22 = i8;
                    }
                }
                i21++;
                i3 = 5;
                i4 = 3;
                i5 = 32;
                i6 = 2;
            }
            throw new IllegalArgumentException("Data too large for an Aztec code");
        }
        fmh a6 = a(fmh, i9, i8);
        int i24 = fmh.b / i8;
        fmh fmh3 = new fmh();
        if (z) {
            fmh3.a(i7 - 1, i6);
            fmh3.a(i24 - 1, 6);
            fmh2 = a(fmh3, 28, 4);
        } else {
            fmh3.a(i7 - 1, i3);
            fmh3.a(i24 - 1, 11);
            fmh2 = a(fmh3, 40, 4);
        }
        if (!z) {
            i15 = 14;
        }
        int i25 = i15 + (i7 << 2);
        int[] iArr2 = new int[i25];
        if (z) {
            for (int i26 = 0; i26 < iArr2.length; i26++) {
                iArr2[i26] = i26;
            }
            i10 = i25;
        } else {
            int i27 = i25 / 2;
            i10 = i25 + 1 + (((i27 - 1) / 15) * 2);
            int i28 = i10 / 2;
            for (int i29 = 0; i29 < i27; i29++) {
                int i30 = (i29 / 15) + i29;
                iArr2[(i27 - i29) - 1] = (i28 - i30) - 1;
                iArr2[i27 + i29] = i30 + i28 + 1;
            }
        }
        fmi fmi = new fmi(i10);
        int i31 = 0;
        int i32 = 0;
        while (i31 < i7) {
            int i33 = ((i7 - i31) << i6) + (z ? 9 : 12);
            int i34 = 0;
            while (i34 < i33) {
                int i35 = i34 << 1;
                int i36 = 0;
                while (i36 < i6) {
                    if (a6.a(i32 + i35 + i36)) {
                        int i37 = i31 << 1;
                        i11 = i24;
                        fmi.b(iArr2[i37 + i36], iArr2[i37 + i34]);
                    } else {
                        i11 = i24;
                    }
                    if (a6.a((i33 << 1) + i32 + i35 + i36)) {
                        int i38 = i31 << 1;
                        fmi.b(iArr2[i38 + i34], iArr2[((i25 - 1) - i38) - i36]);
                    }
                    if (a6.a((i33 << 2) + i32 + i35 + i36)) {
                        int i39 = (i25 - 1) - (i31 << 1);
                        fmi.b(iArr2[i39 - i36], iArr2[i39 - i34]);
                    }
                    if (a6.a((i33 * 6) + i32 + i35 + i36)) {
                        int i40 = i31 << 1;
                        fmi.b(iArr2[((i25 - 1) - i40) - i34], iArr2[i40 + i36]);
                    }
                    i36++;
                    i24 = i11;
                    i6 = 2;
                }
                int i41 = i24;
                i34++;
                i6 = 2;
            }
            i32 += i33 << 3;
            i31++;
            i24 = i24;
            i6 = 2;
        }
        int i42 = i24;
        a(fmi, z, i10, fmh2);
        if (z) {
            a(fmi, i10 / 2, 5);
        } else {
            int i43 = i10 / 2;
            a(fmi, i43, 7);
            int i44 = 0;
            int i45 = 0;
            while (i44 < (i25 / 2) - 1) {
                for (int i46 = i43 & 1; i46 < i10; i46 += 2) {
                    int i47 = i43 - i45;
                    fmi.b(i47, i46);
                    int i48 = i43 + i45;
                    fmi.b(i48, i46);
                    fmi.b(i46, i47);
                    fmi.b(i46, i48);
                }
                i44 += 15;
                i45 += 16;
            }
        }
        fma fma = new fma();
        fma.a = z;
        fma.b = i10;
        fma.c = i7;
        fma.d = i42;
        fma.e = fmi;
        return fma;
    }

    private static fmh a(fmh fmh, int i) {
        fmh fmh2 = new fmh();
        int i2 = fmh.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || fmh.a(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                fmh2.a(i8, i);
            } else if (i8 == 0) {
                fmh2.a(i5 | 1, i);
            } else {
                fmh2.a(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return fmh2;
    }

    private static fmh a(fmh fmh, int i, int i2) {
        int i3 = fmh.b / i2;
        fml fml = new fml(a(i2));
        int i4 = i / i2;
        int[] b = b(fmh, i2, i4);
        fml.a(b, i4 - i3);
        int i5 = i % i2;
        fmh fmh2 = new fmh();
        fmh2.a(0, i5);
        for (int a2 : b) {
            fmh2.a(a2, i2);
        }
        return fmh2;
    }

    private static fmj a(int i) {
        if (i == 4) {
            return fmj.d;
        }
        if (i == 6) {
            return fmj.c;
        }
        if (i == 8) {
            return fmj.f;
        }
        if (i == 10) {
            return fmj.b;
        }
        if (i == 12) {
            return fmj.a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    private static void a(fmi fmi, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                fmi.b(i5, i4);
                fmi.b(i5, i6);
                fmi.b(i4, i5);
                fmi.b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        fmi.b(i7, i7);
        int i8 = i7 + 1;
        fmi.b(i8, i7);
        fmi.b(i7, i8);
        int i9 = i + i2;
        fmi.b(i9, i7);
        fmi.b(i9, i8);
        fmi.b(i9, i9 - 1);
    }

    private static void a(fmi fmi, boolean z, int i, fmh fmh) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (fmh.a(i3)) {
                    fmi.b(i4, i2 - 5);
                }
                if (fmh.a(i3 + 7)) {
                    fmi.b(i2 + 5, i4);
                }
                if (fmh.a(20 - i3)) {
                    fmi.b(i4, i2 + 5);
                }
                if (fmh.a(27 - i3)) {
                    fmi.b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (fmh.a(i3)) {
                fmi.b(i5, i2 - 7);
            }
            if (fmh.a(i3 + 10)) {
                fmi.b(i2 + 7, i5);
            }
            if (fmh.a(29 - i3)) {
                fmi.b(i5, i2 + 7);
            }
            if (fmh.a(39 - i3)) {
                fmi.b(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] b(fmh fmh, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = fmh.b / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 |= fmh.a((i4 * i) + i6) ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }
}
