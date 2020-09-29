package defpackage;

import java.nio.charset.Charset;

/* renamed from: bdj reason: default package */
public final class bdj {
    public byte[] a;
    public int b;
    public int c;

    public bdj() {
        this.a = bdw.f;
    }

    public bdj(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public bdj(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public bdj(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final int b() {
        return this.c - this.b;
    }

    public final void b(int i) {
        bcu.a(i >= 0 && i <= this.a.length);
        this.c = i;
    }

    public final void c(int i) {
        bcu.a(i >= 0 && i <= this.c);
        this.b = i;
    }

    public final void d(int i) {
        c(this.b + i);
    }

    public final void a(bdi bdi, int i) {
        a(bdi.a, 0, i);
        bdi.a(0);
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int c() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 8;
        int i3 = this.b;
        this.b = i3 + 1;
        return (bArr[i3] & 255) | i2;
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        byte b2 = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | b2;
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 16;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = i2 | ((bArr[i3] & 255) << 8);
        int i4 = this.b;
        this.b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    public final long g() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8);
        int i4 = this.b;
        this.b = i4 + 1;
        return j3 | (255 & ((long) bArr[i4]));
    }

    public final long h() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        return j3 | ((255 & ((long) bArr[i4])) << 24);
    }

    public final int i() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        int i2 = (bArr[i] & 255) << 24;
        int i3 = this.b;
        this.b = i3 + 1;
        byte b2 = i2 | ((bArr[i3] & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        byte b3 = b2 | ((bArr[i4] & 255) << 8);
        int i5 = this.b;
        this.b = i5 + 1;
        return (bArr[i5] & 255) | b3;
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        byte b2 = bArr[i] & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        byte b3 = b2 | ((bArr[i2] & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        byte b4 = b3 | ((bArr[i3] & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b4;
    }

    public final long k() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 40);
        int i4 = this.b;
        this.b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 32);
        int i5 = this.b;
        this.b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 24);
        int i6 = this.b;
        this.b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 16);
        int i7 = this.b;
        this.b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 8);
        int i8 = this.b;
        this.b = i8 + 1;
        return j7 | (255 & ((long) bArr[i8]));
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i2 = this.b;
        this.b = i2 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8);
        int i3 = this.b;
        this.b = i3 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16);
        int i4 = this.b;
        this.b = i4 + 1;
        long j4 = j3 | ((((long) bArr[i4]) & 255) << 24);
        int i5 = this.b;
        this.b = i5 + 1;
        long j5 = j4 | ((((long) bArr[i5]) & 255) << 32);
        int i6 = this.b;
        this.b = i6 + 1;
        long j6 = j5 | ((((long) bArr[i6]) & 255) << 40);
        int i7 = this.b;
        this.b = i7 + 1;
        long j7 = j6 | ((((long) bArr[i7]) & 255) << 48);
        int i8 = this.b;
        this.b = i8 + 1;
        return j7 | ((255 & ((long) bArr[i8])) << 56);
    }

    public final int m() {
        return (c() << 21) | (c() << 14) | (c() << 7) | c();
    }

    public final int n() {
        int i = i();
        if (i >= 0) {
            return i;
        }
        StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(i);
        throw new IllegalStateException(sb.toString());
    }

    public final int o() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final long p() {
        long k = k();
        if (k >= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    public final String e(int i) {
        return a(i, Charset.forName("UTF-8"));
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = (this.b + i) - 1;
        String a2 = bdw.a(this.a, this.b, (i2 >= this.c || this.a[i2] != 0) ? i : i - 1);
        this.b += i;
        return a2;
    }

    public final String q() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a2 = bdw.a(bArr, i2, i - i2);
        this.b = i;
        int i3 = this.b;
        if (i3 < this.c) {
            this.b = i3 + 1;
        }
        return a2;
    }

    public final String r() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !bdw.a((int) this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.b = i2 + 3;
            }
        }
        byte[] bArr2 = this.a;
        int i3 = this.b;
        String a2 = bdw.a(bArr2, i3, i - i3);
        this.b = i;
        int i4 = this.b;
        int i5 = this.c;
        if (i4 == i5) {
            return a2;
        }
        if (this.a[i4] == 13) {
            this.b = i4 + 1;
            if (this.b == i5) {
                return a2;
            }
        }
        byte[] bArr3 = this.a;
        int i6 = this.b;
        if (bArr3[i6] == 10) {
            this.b = i6 + 1;
        }
        return a2;
    }

    public final void a(int i) {
        byte[] bArr = this.a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        a(bArr, i);
    }
}
