package defpackage;

import com.comscore.streaming.ContentType;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

/* renamed from: fli reason: default package */
public final class fli {
    private static final int[] a = {4, 6, 6, 8, 8, 8, 8, 8, 8, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 12, 12, 12, 12, 12, 12, 12, 12, 12, 12};

    private static int a(int i, boolean z) {
        return ((z ? 88 : ContentType.LONG_FORM_ON_DEMAND) + (i << 4)) * i;
    }

    public static flg a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        fln fln;
        int i8;
        int i9;
        fln fln2;
        int i10;
        int i11;
        flj flj = new flj(bArr);
        Collection<fll> singletonList = Collections.singletonList(fll.a);
        int i12 = 0;
        while (true) {
            i3 = 5;
            i4 = 3;
            int i13 = 4;
            i5 = 32;
            i6 = 2;
            if (i12 >= flj.d.length) {
                break;
            }
            int i14 = i12 + 1;
            byte b = i14 < flj.d.length ? flj.d[i14] : 0;
            byte b2 = flj.d[i12];
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
                singletonList = flj.a((Iterable<fll>) singletonList, i12, i3);
                i12 = i14;
            } else {
                LinkedList linkedList = new LinkedList();
                for (fll a2 : singletonList) {
                    flj.a(a2, i12, (Collection<fll>) linkedList);
                }
                singletonList = flj.a(linkedList);
            }
            i12++;
        }
        fln a3 = ((fll) Collections.min(singletonList, new Comparator<fll>() {
            public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
                return ((fll) obj).d - ((fll) obj2).d;
            }
        })).a(flj.d);
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
                fln a5 = a(a3, i18);
                int i20 = a5.b + i16;
                String str = "Data to large for user specified layer";
                if (i20 > i19) {
                    throw new IllegalArgumentException(str);
                } else if (!z2 || a5.b <= (i18 << 6)) {
                    fln = a5;
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
            fln = null;
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
                        fln = a(a3, i8);
                    } else {
                        i8 = i22;
                    }
                    int i23 = i9 - (i9 % i8);
                    if ((z && fln.b > (i8 << 6)) || fln.b + i16 > i23) {
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
        fln a6 = a(fln, i9, i8);
        int i24 = fln.b / i8;
        fln fln3 = new fln();
        if (z) {
            fln3.a(i7 - 1, i6);
            fln3.a(i24 - 1, 6);
            fln2 = a(fln3, 28, 4);
        } else {
            fln3.a(i7 - 1, i3);
            fln3.a(i24 - 1, 11);
            fln2 = a(fln3, 40, 4);
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
        flo flo = new flo(i10);
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
                        flo.b(iArr2[i37 + i36], iArr2[i37 + i34]);
                    } else {
                        i11 = i24;
                    }
                    if (a6.a((i33 << 1) + i32 + i35 + i36)) {
                        int i38 = i31 << 1;
                        flo.b(iArr2[i38 + i34], iArr2[((i25 - 1) - i38) - i36]);
                    }
                    if (a6.a((i33 << 2) + i32 + i35 + i36)) {
                        int i39 = (i25 - 1) - (i31 << 1);
                        flo.b(iArr2[i39 - i36], iArr2[i39 - i34]);
                    }
                    if (a6.a((i33 * 6) + i32 + i35 + i36)) {
                        int i40 = i31 << 1;
                        flo.b(iArr2[((i25 - 1) - i40) - i34], iArr2[i40 + i36]);
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
        a(flo, z, i10, fln2);
        if (z) {
            a(flo, i10 / 2, 5);
        } else {
            int i43 = i10 / 2;
            a(flo, i43, 7);
            int i44 = 0;
            int i45 = 0;
            while (i44 < (i25 / 2) - 1) {
                for (int i46 = i43 & 1; i46 < i10; i46 += 2) {
                    int i47 = i43 - i45;
                    flo.b(i47, i46);
                    int i48 = i43 + i45;
                    flo.b(i48, i46);
                    flo.b(i46, i47);
                    flo.b(i46, i48);
                }
                i44 += 15;
                i45 += 16;
            }
        }
        flg flg = new flg();
        flg.a = z;
        flg.b = i10;
        flg.c = i7;
        flg.d = i42;
        flg.e = flo;
        return flg;
    }

    private static void a(flo flo, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3 += 2) {
            int i4 = i - i3;
            int i5 = i4;
            while (true) {
                int i6 = i + i3;
                if (i5 > i6) {
                    break;
                }
                flo.b(i5, i4);
                flo.b(i5, i6);
                flo.b(i4, i5);
                flo.b(i6, i5);
                i5++;
            }
        }
        int i7 = i - i2;
        flo.b(i7, i7);
        int i8 = i7 + 1;
        flo.b(i8, i7);
        flo.b(i7, i8);
        int i9 = i + i2;
        flo.b(i9, i7);
        flo.b(i9, i8);
        flo.b(i9, i9 - 1);
    }

    private static void a(flo flo, boolean z, int i, fln fln) {
        int i2 = i / 2;
        int i3 = 0;
        if (z) {
            while (i3 < 7) {
                int i4 = (i2 - 3) + i3;
                if (fln.a(i3)) {
                    flo.b(i4, i2 - 5);
                }
                if (fln.a(i3 + 7)) {
                    flo.b(i2 + 5, i4);
                }
                if (fln.a(20 - i3)) {
                    flo.b(i4, i2 + 5);
                }
                if (fln.a(27 - i3)) {
                    flo.b(i2 - 5, i4);
                }
                i3++;
            }
            return;
        }
        while (i3 < 10) {
            int i5 = (i2 - 5) + i3 + (i3 / 5);
            if (fln.a(i3)) {
                flo.b(i5, i2 - 7);
            }
            if (fln.a(i3 + 10)) {
                flo.b(i2 + 7, i5);
            }
            if (fln.a(29 - i3)) {
                flo.b(i5, i2 + 7);
            }
            if (fln.a(39 - i3)) {
                flo.b(i2 - 7, i5);
            }
            i3++;
        }
    }

    private static int[] b(fln fln, int i, int i2) {
        int[] iArr = new int[i2];
        int i3 = fln.b / i;
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                i5 |= fln.a((i4 * i) + i6) ? 1 << ((i - i6) - 1) : 0;
            }
            iArr[i4] = i5;
        }
        return iArr;
    }

    private static flp a(int i) {
        if (i == 4) {
            return flp.d;
        }
        if (i == 6) {
            return flp.c;
        }
        if (i == 8) {
            return flp.f;
        }
        if (i == 10) {
            return flp.b;
        }
        if (i == 12) {
            return flp.a;
        }
        throw new IllegalArgumentException("Unsupported word size ".concat(String.valueOf(i)));
    }

    private static fln a(fln fln, int i) {
        fln fln2 = new fln();
        int i2 = fln.b;
        int i3 = (1 << i) - 2;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = 0;
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = i4 + i6;
                if (i7 >= i2 || fln.a(i7)) {
                    i5 |= 1 << ((i - 1) - i6);
                }
            }
            int i8 = i5 & i3;
            if (i8 == i3) {
                fln2.a(i8, i);
            } else if (i8 == 0) {
                fln2.a(i5 | 1, i);
            } else {
                fln2.a(i5, i);
                i4 += i;
            }
            i4--;
            i4 += i;
        }
        return fln2;
    }

    private static fln a(fln fln, int i, int i2) {
        int i3 = fln.b / i2;
        flr flr = new flr(a(i2));
        int i4 = i / i2;
        int[] b = b(fln, i2, i4);
        flr.a(b, i4 - i3);
        int i5 = i % i2;
        fln fln2 = new fln();
        fln2.a(0, i5);
        for (int a2 : b) {
            fln2.a(a2, i2);
        }
        return fln2;
    }
}
