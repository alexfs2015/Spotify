package defpackage;

import java.util.Arrays;

/* renamed from: ase reason: default package */
final class ase {
    final int a;
    final float b;
    final float c;
    final float d;
    final int e = (this.n * 2);
    short[] f;
    int g;
    short[] h;
    int i;
    int j;
    int k;
    private final int l;
    private final int m;
    private final int n;
    private final short[] o;
    private short[] p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public ase(int i2, int i3, float f2, float f3, int i4) {
        this.l = i2;
        this.a = i3;
        this.b = f2;
        this.c = f3;
        this.d = ((float) i2) / ((float) i4);
        this.m = i2 / 400;
        this.n = i2 / 65;
        int i5 = this.e;
        this.o = new short[i5];
        this.f = new short[(i5 * i3)];
        this.h = new short[(i5 * i3)];
        this.p = new short[(i5 * i3)];
    }

    private int a(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.a;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        int i9 = 255;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                i10 += Math.abs(sArr[i5 + i11] - sArr[(i5 + i3) + i11]);
            }
            if (i10 * i7 < i6 * i3) {
                i7 = i3;
                i6 = i10;
            }
            if (i10 * i9 > i8 * i3) {
                i9 = i3;
                i8 = i10;
            }
            i3++;
        }
        this.u = i6 / i7;
        this.v = i8 / i9;
        return i7;
    }

    private void a(float f2) {
        int i2;
        int i3;
        int i4;
        int i5 = this.g;
        if (i5 >= this.e) {
            int i6 = 0;
            do {
                int i7 = this.k;
                if (i7 > 0) {
                    int min = Math.min(this.e, i7);
                    b(this.f, i6, min);
                    this.k -= min;
                    i6 += min;
                } else {
                    short[] sArr = this.f;
                    int i8 = this.l;
                    boolean z = true;
                    int i9 = i8 > 4000 ? i8 / 4000 : 1;
                    if (this.a == 1 && i9 == 1) {
                        i2 = a(sArr, i6, this.m, this.n);
                    } else {
                        c(sArr, i6, i9);
                        int a2 = a(this.o, 0, this.m / i9, this.n / i9);
                        if (i9 != 1) {
                            int i10 = a2 * i9;
                            int i11 = i9 << 2;
                            int i12 = i10 - i11;
                            int i13 = i10 + i11;
                            int i14 = this.m;
                            if (i12 >= i14) {
                                i14 = i12;
                            }
                            int i15 = this.n;
                            if (i13 > i15) {
                                i13 = i15;
                            }
                            if (this.a == 1) {
                                i2 = a(sArr, i6, i14, i13);
                            } else {
                                c(sArr, i6, 1);
                                i2 = a(this.o, 0, i14, i13);
                            }
                        } else {
                            i2 = a2;
                        }
                    }
                    int i16 = this.u;
                    int i17 = this.v;
                    if (i16 == 0 || this.s == 0 || i17 > i16 * 3 || (i16 << 1) <= this.t * 3) {
                        z = false;
                    }
                    int i18 = z ? this.s : i2;
                    this.t = this.u;
                    this.s = i2;
                    if (((double) f2) > 1.0d) {
                        short[] sArr2 = this.f;
                        if (f2 >= 2.0f) {
                            i4 = (int) (((float) i18) / (f2 - 1.0f));
                        } else {
                            this.k = (int) ((((float) i18) * (2.0f - f2)) / (f2 - 1.0f));
                            i4 = i18;
                        }
                        this.h = a(this.h, this.i, i4);
                        a(i4, this.a, this.h, this.i, sArr2, i6, sArr2, i6 + i18);
                        this.i += i4;
                        i6 += i18 + i4;
                    } else {
                        short[] sArr3 = this.f;
                        if (f2 < 0.5f) {
                            i3 = (int) ((((float) i18) * f2) / (1.0f - f2));
                        } else {
                            this.k = (int) ((((float) i18) * ((2.0f * f2) - 1.0f)) / (1.0f - f2));
                            i3 = i18;
                        }
                        int i19 = i18 + i3;
                        this.h = a(this.h, this.i, i19);
                        int i20 = this.a;
                        System.arraycopy(sArr3, i6 * i20, this.h, this.i * i20, i20 * i18);
                        a(i3, this.a, this.h, this.i + i18, sArr3, i6 + i18, sArr3, i6);
                        this.i += i19;
                        i6 += i3;
                    }
                }
            } while (this.e + i6 <= i5);
            int i21 = this.g - i6;
            short[] sArr4 = this.f;
            int i22 = this.a;
            System.arraycopy(sArr4, i6 * i22, sArr4, 0, i22 * i21);
            this.g = i21;
        }
    }

    private void a(float f2, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        if (this.i != i2) {
            int i6 = this.l;
            int i7 = (int) (((float) i6) / f2);
            while (true) {
                if (i7 <= 16384 && i6 <= 16384) {
                    break;
                }
                i7 /= 2;
                i6 /= 2;
            }
            int i8 = this.i - i2;
            this.p = a(this.p, this.j, i8);
            short[] sArr = this.h;
            int i9 = this.a;
            System.arraycopy(sArr, i2 * i9, this.p, this.j * i9, i9 * i8);
            this.i = i2;
            this.j += i8;
            int i10 = 0;
            while (true) {
                i3 = this.j;
                if (i10 >= i3 - 1) {
                    break;
                }
                while (true) {
                    i4 = this.q;
                    int i11 = (i4 + 1) * i7;
                    i5 = this.r;
                    z = true;
                    if (i11 <= i5 * i6) {
                        break;
                    }
                    this.h = a(this.h, this.i, 1);
                    int i12 = 0;
                    while (true) {
                        int i13 = this.a;
                        if (i12 >= i13) {
                            break;
                        }
                        short[] sArr2 = this.h;
                        int i14 = (this.i * i13) + i12;
                        short[] sArr3 = this.p;
                        int i15 = (i10 * i13) + i12;
                        short s2 = sArr3[i15];
                        short s3 = sArr3[i15 + i13];
                        int i16 = this.r * i6;
                        int i17 = this.q;
                        int i18 = i17 * i7;
                        int i19 = (i17 + 1) * i7;
                        int i20 = i19 - i16;
                        int i21 = i19 - i18;
                        sArr2[i14] = (short) (((s2 * i20) + ((i21 - i20) * s3)) / i21);
                        i12++;
                    }
                    this.r++;
                    this.i++;
                }
                this.q = i4 + 1;
                if (this.q == i6) {
                    this.q = 0;
                    if (i5 != i7) {
                        z = false;
                    }
                    bdl.b(z);
                    this.r = 0;
                }
                i10++;
            }
            int i22 = i3 - 1;
            if (i22 != 0) {
                short[] sArr4 = this.p;
                int i23 = this.a;
                System.arraycopy(sArr4, i22 * i23, sArr4, 0, (i3 - i22) * i23);
                this.j -= i22;
            }
        }
    }

    private static void a(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i5 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i4 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i10] = (short) (((sArr2[i8] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i10 += i3;
                i8 += i3;
                i9 += i3;
            }
        }
    }

    private void b(short[] sArr, int i2, int i3) {
        this.h = a(this.h, this.i, i3);
        int i4 = this.a;
        System.arraycopy(sArr, i2 * i4, this.h, this.i * i4, i4 * i3);
        this.i += i3;
    }

    private void c(short[] sArr, int i2, int i3) {
        int i4 = this.e / i3;
        int i5 = this.a;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.o[i8] = (short) (i9 / i6);
        }
    }

    public final void a() {
        this.g = 0;
        this.i = 0;
        this.j = 0;
        this.q = 0;
        this.r = 0;
        this.k = 0;
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = 0;
    }

    /* access modifiers changed from: 0000 */
    public short[] a(short[] sArr, int i2, int i3) {
        int length = sArr.length;
        int i4 = this.a;
        int i5 = length / i4;
        return i2 + i3 <= i5 ? sArr : Arrays.copyOf(sArr, (((i5 * 3) / 2) + i3) * i4);
    }

    /* access modifiers changed from: 0000 */
    public void b() {
        int i2 = this.i;
        float f2 = this.b;
        float f3 = this.c;
        float f4 = f2 / f3;
        float f5 = this.d * f3;
        double d2 = (double) f4;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            a(f4);
        } else {
            b(this.f, 0, this.g);
            this.g = 0;
        }
        if (f5 != 1.0f) {
            a(f5, i2);
        }
    }
}
