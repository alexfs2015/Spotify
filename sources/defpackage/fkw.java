package defpackage;

import com.google.protobuf.ByteString;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Utf8;
import java.io.InputStream;
import java.util.ArrayList;

/* renamed from: fkw reason: default package */
public final class fkw {
    int a;
    int b;
    private final byte[] c;
    private final boolean d;
    private int e;
    private int f;
    private int g;
    private final InputStream h;
    private int i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private a n;

    /* renamed from: fkw$a */
    interface a {
    }

    fkw(InputStream inputStream, int i2) {
        this.j = false;
        this.l = Integer.MAX_VALUE;
        this.b = 100;
        this.m = 67108864;
        this.n = null;
        this.c = new byte[4096];
        this.g = 0;
        this.k = 0;
        this.h = inputStream;
        this.d = false;
    }

    private fkw(byte[] bArr, int i2, int i3, boolean z) {
        this.j = false;
        this.l = Integer.MAX_VALUE;
        this.b = 100;
        this.m = 67108864;
        this.n = null;
        this.c = bArr;
        this.e = i3 + i2;
        this.g = i2;
        this.k = -i2;
        this.h = null;
        this.d = z;
    }

    public static fkw a(byte[] bArr) {
        return a(bArr, 0, bArr.length, false);
    }

    static fkw a(byte[] bArr, int i2, int i3, boolean z) {
        fkw fkw = new fkw(bArr, i2, i3, z);
        try {
            fkw.c(i3);
            return fkw;
        } catch (InvalidProtocolBufferException e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    private void e(int i2) {
        if (!f(i2)) {
            throw InvalidProtocolBufferException.a();
        }
    }

    private boolean f(int i2) {
        do {
            int i3 = this.g;
            int i4 = i3 + i2;
            int i5 = this.e;
            if (i4 > i5) {
                if (this.k + i3 + i2 <= this.l && this.h != null) {
                    if (i3 > 0) {
                        if (i5 > i3) {
                            byte[] bArr = this.c;
                            System.arraycopy(bArr, i3, bArr, 0, i5 - i3);
                        }
                        this.k += i3;
                        this.e -= i3;
                        this.g = 0;
                    }
                    InputStream inputStream = this.h;
                    byte[] bArr2 = this.c;
                    int i6 = this.e;
                    int read = inputStream.read(bArr2, i6, bArr2.length - i6);
                    if (read == 0 || read < -1 || read > this.c.length) {
                        StringBuilder sb = new StringBuilder("InputStream#read(byte[]) returned invalid result: ");
                        sb.append(read);
                        sb.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb.toString());
                    } else if (read > 0) {
                        this.e += read;
                        if ((this.k + i2) - this.m <= 0) {
                            m();
                        } else {
                            throw InvalidProtocolBufferException.h();
                        }
                    }
                }
                return false;
            }
            StringBuilder sb2 = new StringBuilder("refillBuffer() called when ");
            sb2.append(i2);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        } while (this.e < i2);
        return true;
    }

    private byte[] g(int i2) {
        if (i2 > 0) {
            int i3 = this.k;
            int i4 = this.g;
            int i5 = i3 + i4 + i2;
            if (i5 <= this.m) {
                int i6 = this.l;
                if (i5 <= i6) {
                    InputStream inputStream = this.h;
                    if (inputStream != null) {
                        int i7 = this.e;
                        int i8 = i7 - i4;
                        this.k = i3 + i7;
                        this.g = 0;
                        this.e = 0;
                        int i9 = i2 - i8;
                        if (i9 < 4096 || i9 <= inputStream.available()) {
                            byte[] bArr = new byte[i2];
                            System.arraycopy(this.c, i4, bArr, 0, i8);
                            while (i8 < bArr.length) {
                                int read = this.h.read(bArr, i8, i2 - i8);
                                if (read != -1) {
                                    this.k += read;
                                    i8 += read;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            }
                            return bArr;
                        }
                        ArrayList<byte[]> arrayList = new ArrayList<>();
                        while (i9 > 0) {
                            byte[] bArr2 = new byte[Math.min(i9, 4096)];
                            int i10 = 0;
                            while (i10 < bArr2.length) {
                                int read2 = this.h.read(bArr2, i10, bArr2.length - i10);
                                if (read2 != -1) {
                                    this.k += read2;
                                    i10 += read2;
                                } else {
                                    throw InvalidProtocolBufferException.a();
                                }
                            }
                            i9 -= bArr2.length;
                            arrayList.add(bArr2);
                        }
                        byte[] bArr3 = new byte[i2];
                        System.arraycopy(this.c, i4, bArr3, 0, i8);
                        for (byte[] bArr4 : arrayList) {
                            System.arraycopy(bArr4, 0, bArr3, i8, bArr4.length);
                            i8 += bArr4.length;
                        }
                        return bArr3;
                    }
                    throw InvalidProtocolBufferException.a();
                }
                h((i6 - i3) - i4);
                throw InvalidProtocolBufferException.a();
            }
            throw InvalidProtocolBufferException.h();
        } else if (i2 == 0) {
            return flc.b;
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    private void h(int i2) {
        int i3 = this.e;
        int i4 = this.g;
        if (i2 > i3 - i4 || i2 < 0) {
            i(i2);
        } else {
            this.g = i4 + i2;
        }
    }

    private void i(int i2) {
        if (i2 >= 0) {
            int i3 = this.k;
            int i4 = this.g;
            int i5 = i3 + i4 + i2;
            int i6 = this.l;
            if (i5 <= i6) {
                int i7 = this.e;
                int i8 = i7 - i4;
                this.g = i7;
                e(1);
                while (true) {
                    int i9 = i2 - i8;
                    int i10 = this.e;
                    if (i9 > i10) {
                        i8 += i10;
                        this.g = i10;
                        e(1);
                    } else {
                        this.g = i9;
                        return;
                    }
                }
            } else {
                h((i6 - i3) - i4);
                throw InvalidProtocolBufferException.a();
            }
        } else {
            throw InvalidProtocolBufferException.b();
        }
    }

    private long l() {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte n2 = n();
            j2 |= ((long) (n2 & Byte.MAX_VALUE)) << i2;
            if ((n2 & 128) == 0) {
                return j2;
            }
        }
        throw InvalidProtocolBufferException.c();
    }

    private void m() {
        this.e += this.f;
        int i2 = this.k;
        int i3 = this.e;
        int i4 = i2 + i3;
        int i5 = this.l;
        if (i4 > i5) {
            this.f = i4 - i5;
            this.e = i3 - this.f;
            return;
        }
        this.f = 0;
    }

    private byte n() {
        if (this.g == this.e) {
            e(1);
        }
        byte[] bArr = this.c;
        int i2 = this.g;
        this.g = i2 + 1;
        return bArr[i2];
    }

    public final int a() {
        boolean z = true;
        if (this.g != this.e || f(1)) {
            z = false;
        }
        if (z) {
            this.i = 0;
            return 0;
        }
        this.i = g();
        int i2 = this.i;
        if ((i2 >>> 3) != 0) {
            return i2;
        }
        throw InvalidProtocolBufferException.d();
    }

    public final <T extends fli> T a(fll<T> fll, fky fky) {
        int g2 = g();
        if (this.a < this.b) {
            int c2 = c(g2);
            this.a++;
            T t = (fli) fll.a(this, fky);
            a(0);
            this.a--;
            d(c2);
            return t;
        }
        throw InvalidProtocolBufferException.g();
    }

    public final void a(int i2) {
        if (this.i != i2) {
            throw InvalidProtocolBufferException.e();
        }
    }

    public final boolean b() {
        return h() != 0;
    }

    public final boolean b(int i2) {
        int a2;
        int i3 = i2 & 7;
        if (i3 == 0) {
            int i4 = this.e;
            int i5 = this.g;
            if (i4 - i5 >= 10) {
                byte[] bArr = this.c;
                int i6 = i5;
                int i7 = 0;
                while (true) {
                    if (i7 >= 10) {
                        break;
                    }
                    int i8 = i6 + 1;
                    if (bArr[i6] >= 0) {
                        this.g = i8;
                        break;
                    }
                    i7++;
                    i6 = i8;
                }
            }
            for (int i9 = 0; i9 < 10; i9++) {
                if (n() >= 0) {
                    return true;
                }
            }
            throw InvalidProtocolBufferException.c();
        } else if (i3 == 1) {
            h(8);
            return true;
        } else if (i3 == 2) {
            h(g());
            return true;
        } else if (i3 == 3) {
            do {
                a2 = a();
                if (a2 == 0) {
                    break;
                }
            } while (b(a2));
            a(((i2 >>> 3) << 3) | 4);
            return true;
        } else if (i3 == 4) {
            return false;
        } else {
            if (i3 == 5) {
                h(4);
                return true;
            }
            throw InvalidProtocolBufferException.f();
        }
    }

    public final int c(int i2) {
        if (i2 >= 0) {
            int i3 = i2 + this.k + this.g;
            int i4 = this.l;
            if (i3 <= i4) {
                this.l = i3;
                m();
                return i4;
            }
            throw InvalidProtocolBufferException.a();
        }
        throw InvalidProtocolBufferException.b();
    }

    public final String c() {
        int g2 = g();
        int i2 = this.e;
        int i3 = this.g;
        if (g2 <= i2 - i3 && g2 > 0) {
            String str = new String(this.c, i3, g2, flc.a);
            this.g += g2;
            return str;
        } else if (g2 == 0) {
            return "";
        } else {
            if (g2 > this.e) {
                return new String(g(g2), flc.a);
            }
            e(g2);
            String str2 = new String(this.c, this.g, g2, flc.a);
            this.g += g2;
            return str2;
        }
    }

    public final String d() {
        byte[] bArr;
        int g2 = g();
        int i2 = this.g;
        int i3 = 0;
        if (g2 <= this.e - i2 && g2 > 0) {
            bArr = this.c;
            this.g = i2 + g2;
            i3 = i2;
        } else if (g2 == 0) {
            return "";
        } else {
            if (g2 <= this.e) {
                e(g2);
                bArr = this.c;
                this.g = g2 + 0;
            } else {
                bArr = g(g2);
            }
        }
        if (Utf8.a(bArr, i3, i3 + g2)) {
            return new String(bArr, i3, g2, flc.a);
        }
        throw InvalidProtocolBufferException.i();
    }

    public final void d(int i2) {
        this.l = i2;
        m();
    }

    public final ByteString e() {
        int g2 = g();
        int i2 = this.e;
        int i3 = this.g;
        if (g2 > i2 - i3 || g2 <= 0) {
            return g2 == 0 ? ByteString.a : ByteString.b(g(g2));
        }
        ByteString a2 = ByteString.a(this.c, i3, g2);
        this.g += g2;
        return a2;
    }

    public final int f() {
        int g2 = g();
        return (-(g2 & 1)) ^ (g2 >>> 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0066, code lost:
        if (r2[r3] >= 0) goto L_0x0068;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int g() {
        /*
            r5 = this;
            int r0 = r5.g
            int r1 = r5.e
            if (r1 == r0) goto L_0x006b
            byte[] r2 = r5.c
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0011
            r5.g = r3
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
            r5.g = r1
            return r0
        L_0x006b:
            long r0 = r5.l()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkw.g():int");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b0, code lost:
        if (((long) r2[r0]) >= 0) goto L_0x00b2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long h() {
        /*
            r11 = this;
            int r0 = r11.g
            int r1 = r11.e
            if (r1 == r0) goto L_0x00b5
            byte[] r2 = r11.c
            int r3 = r0 + 1
            byte r0 = r2[r0]
            if (r0 < 0) goto L_0x0012
            r11.g = r3
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
            r11.g = r1
            return r3
        L_0x00b5:
            long r0 = r11.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fkw.h():long");
    }

    public final int i() {
        int i2 = this.g;
        if (this.e - i2 < 4) {
            e(4);
            i2 = this.g;
        }
        byte[] bArr = this.c;
        this.g = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long j() {
        int i2 = this.g;
        if (this.e - i2 < 8) {
            e(8);
            i2 = this.g;
        }
        byte[] bArr = this.c;
        this.g = i2 + 8;
        return ((((long) bArr[i2 + 7]) & 255) << 56) | (((long) bArr[i2]) & 255) | ((((long) bArr[i2 + 1]) & 255) << 8) | ((((long) bArr[i2 + 2]) & 255) << 16) | ((((long) bArr[i2 + 3]) & 255) << 24) | ((((long) bArr[i2 + 4]) & 255) << 32) | ((((long) bArr[i2 + 5]) & 255) << 40) | ((((long) bArr[i2 + 6]) & 255) << 48);
    }

    public final int k() {
        int i2 = this.l;
        if (i2 == Integer.MAX_VALUE) {
            return -1;
        }
        return i2 - (this.k + this.g);
    }
}
