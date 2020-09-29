package defpackage;

import com.google.android.gms.internal.measurement.zzun;
import com.google.android.gms.internal.measurement.zzwe;
import java.util.Arrays;

/* renamed from: eme reason: default package */
final class eme extends emc {
    private final byte[] d;
    private final boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;

    private eme(byte[] bArr, int i2, int i3, boolean z) {
        super(0);
        this.k = Integer.MAX_VALUE;
        this.d = bArr;
        this.f = i3 + i2;
        this.h = i2;
        this.i = this.h;
        this.e = z;
    }

    public final int a() {
        if (t()) {
            this.j = 0;
            return 0;
        }
        this.j = v();
        int i2 = this.j;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw new zzwe("Protocol message contained an invalid tag (zero).");
    }

    public final void a(int i2) {
        if (this.j != i2) {
            throw zzwe.d();
        }
    }

    public final boolean b(int i2) {
        int a;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f - this.h >= 10) {
                while (i4 < 10) {
                    byte[] bArr = this.d;
                    int i5 = this.h;
                    this.h = i5 + 1;
                    if (bArr[i5] < 0) {
                        i4++;
                    }
                }
                throw zzwe.c();
            }
            while (i4 < 10) {
                if (A() < 0) {
                    i4++;
                }
            }
            throw zzwe.c();
            return true;
        } else if (i3 == 1) {
            e(8);
            return true;
        } else if (i3 == 2) {
            e(v());
            return true;
        } else if (i3 == 3) {
            do {
                a = a();
                if (a == 0) {
                    break;
                }
            } while (b(a));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                e(4);
                return true;
            }
            throw zzwe.e();
        }
    }

    public final double b() {
        return Double.longBitsToDouble(y());
    }

    public final float c() {
        return Float.intBitsToFloat(x());
    }

    public final long d() {
        return w();
    }

    public final long e() {
        return w();
    }

    public final int f() {
        return v();
    }

    public final long g() {
        return y();
    }

    public final int h() {
        return x();
    }

    public final boolean i() {
        return w() != 0;
    }

    public final String j() {
        int v = v();
        if (v > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (v <= i2 - i3) {
                String str = new String(this.d, i3, v, emy.a);
                this.h += v;
                return str;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v < 0) {
            throw zzwe.b();
        }
        throw zzwe.a();
    }

    public final String k() {
        int v = v();
        if (v > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (v <= i2 - i3) {
                String b = epm.b(this.d, i3, v);
                this.h += v;
                return b;
            }
        }
        if (v == 0) {
            return "";
        }
        if (v <= 0) {
            throw zzwe.b();
        }
        throw zzwe.a();
    }

    public final <T extends enx> T a(eoh<T> eoh, eml eml) {
        int v = v();
        if (this.a < this.b) {
            int c = c(v);
            this.a++;
            T t = (enx) eoh.a(this, eml);
            a(0);
            this.a--;
            d(c);
            return t;
        }
        throw zzwe.f();
    }

    public final zzun l() {
        byte[] bArr;
        int v = v();
        if (v > 0) {
            int i2 = this.f;
            int i3 = this.h;
            if (v <= i2 - i3) {
                zzun a = zzun.a(this.d, i3, v);
                this.h += v;
                return a;
            }
        }
        if (v == 0) {
            return zzun.a;
        }
        if (v > 0) {
            int i4 = this.f;
            int i5 = this.h;
            if (v <= i4 - i5) {
                this.h = v + i5;
                bArr = Arrays.copyOfRange(this.d, i5, this.h);
                return zzun.a(bArr);
            }
        }
        if (v > 0) {
            throw zzwe.a();
        } else if (v == 0) {
            bArr = emy.b;
            return zzun.a(bArr);
        } else {
            throw zzwe.b();
        }
    }

    public final int m() {
        return v();
    }

    public final int n() {
        return v();
    }

    public final int o() {
        return x();
    }

    public final long p() {
        return y();
    }

    public final int q() {
        int v = v();
        return (-(v & 1)) ^ (v >>> 1);
    }

    public final long r() {
        long w = w();
        return (-(w & 1)) ^ (w >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final int v() {
        /*
            r5 = this;
            int r0 = r5.h
            int r1 = r5.f
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.h = r3
            return r0
        L_0x0011:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x006b
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0022
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
            goto L_0x0068
        L_0x0022:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x002f
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L_0x002d:
            r1 = r3
            goto L_0x0068
        L_0x002f:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x003d
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0068
        L_0x003d:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r3 = r2[r3]
            if (r3 >= 0) goto L_0x0068
            int r3 = r1 + 1
            byte r1 = r2[r1]
            if (r1 >= 0) goto L_0x002d
            int r1 = r3 + 1
            byte r2 = r2[r3]
            if (r2 < 0) goto L_0x006b
        L_0x0068:
            r5.h = r1
            return r0
        L_0x006b:
            long r0 = r5.s()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eme.v():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final long w() {
        /*
            r11 = this;
            int r0 = r11.h
            int r1 = r11.f
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.d
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.h = r3
            long r0 = (long) r0
            return r0
        L_0x0012:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L_0x00b5
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0026
            r0 = r0 ^ -128(0xffffffffffffff80, float:NaN)
        L_0x0022:
            long r2 = (long) r0
            r3 = r2
            goto L_0x00b2
        L_0x0026:
            int r3 = r1 + 1
            byte r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L_0x0037
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
            long r0 = (long) r0
            r9 = r0
            r1 = r3
            r3 = r9
            goto L_0x00b2
        L_0x0037:
            int r1 = r3 + 1
            byte r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L_0x0045
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L_0x0022
        L_0x0045:
            long r3 = (long) r0
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r5 = (long) r1
            r1 = 28
            long r5 = r5 << r1
            long r3 = r3 ^ r5
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x005c
            r1 = 266354560(0xfe03f80, double:1.315966377E-315)
        L_0x0058:
            long r1 = r1 ^ r3
            r3 = r1
        L_0x005a:
            r1 = r0
            goto L_0x00b2
        L_0x005c:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 35
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0070
            r5 = -34093383808(0xfffffff80fe03f80, double:NaN)
        L_0x006e:
            long r3 = r3 ^ r5
            goto L_0x00b2
        L_0x0070:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 42
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0083
            r1 = 4363953127296(0x3f80fe03f80, double:2.1560793202584E-311)
            goto L_0x0058
        L_0x0083:
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            r0 = 49
            long r7 = r7 << r0
            long r3 = r3 ^ r7
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0096
            r5 = -558586000294016(0xfffe03f80fe03f80, double:NaN)
            goto L_0x006e
        L_0x0096:
            int r0 = r1 + 1
            byte r1 = r2[r1]
            long r7 = (long) r1
            r1 = 56
            long r7 = r7 << r1
            long r3 = r3 ^ r7
            r7 = 71499008037633920(0xfe03f80fe03f80, double:6.838959413692434E-304)
            long r3 = r3 ^ r7
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 >= 0) goto L_0x005a
            int r1 = r0 + 1
            byte r0 = r2[r0]
            long r7 = (long) r0
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x00b5
        L_0x00b2:
            r11.h = r1
            return r3
        L_0x00b5:
            long r0 = r11.s()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eme.w():long");
    }

    /* access modifiers changed from: 0000 */
    public final long s() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte A = A();
            j2 |= ((long) (A & Byte.MAX_VALUE)) << i2;
            if ((A & 128) == 0) {
                return j2;
            }
        }
        throw zzwe.c();
    }

    private final int x() {
        int i2 = this.h;
        if (this.f - i2 >= 4) {
            byte[] bArr = this.d;
            this.h = i2 + 4;
            return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
        }
        throw zzwe.a();
    }

    private final long y() {
        int i2 = this.h;
        if (this.f - i2 >= 8) {
            byte[] bArr = this.d;
            this.h = i2 + 8;
            return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
        }
        throw zzwe.a();
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int u = i2 + u();
            int i3 = this.k;
            if (u <= i3) {
                this.k = u;
                z();
                return i3;
            }
            throw zzwe.a();
        }
        throw zzwe.b();
    }

    private final void z() {
        this.f += this.g;
        int i2 = this.f;
        int i3 = i2 - this.i;
        int i4 = this.k;
        if (i3 > i4) {
            this.g = i3 - i4;
            this.f = i2 - this.g;
            return;
        }
        this.g = 0;
    }

    public final void d(int i2) {
        this.k = i2;
        z();
    }

    public final boolean t() {
        return this.h == this.f;
    }

    public final int u() {
        return this.h - this.i;
    }

    private final byte A() {
        int i2 = this.h;
        if (i2 != this.f) {
            byte[] bArr = this.d;
            this.h = i2 + 1;
            return bArr[i2];
        }
        throw zzwe.a();
    }

    public final void e(int i2) {
        if (i2 >= 0) {
            int i3 = this.f;
            int i4 = this.h;
            if (i2 <= i3 - i4) {
                this.h = i4 + i2;
                return;
            }
        }
        if (i2 < 0) {
            throw zzwe.b();
        }
        throw zzwe.a();
    }

    /* synthetic */ eme(byte[] bArr, int i2, int i3, boolean z, byte b) {
        this(bArr, i2, i3, false);
    }
}
