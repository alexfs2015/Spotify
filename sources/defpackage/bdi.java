package defpackage;

/* renamed from: bdi reason: default package */
public final class bdi {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public bdi() {
        this.a = bdw.f;
    }

    public bdi(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public bdi(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final int a() {
        return ((this.d - this.b) << 3) - this.c;
    }

    public final int b() {
        return (this.b << 3) + this.c;
    }

    public final int c() {
        bcu.b(this.c == 0);
        return this.b;
    }

    public final void a(int i) {
        this.b = i / 8;
        this.c = i - (this.b << 3);
        g();
    }

    public final void d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        g();
    }

    public final void b(int i) {
        int i2 = i / 8;
        this.b += i2;
        this.c += i - (i2 << 3);
        int i3 = this.c;
        if (i3 > 7) {
            this.b++;
            this.c = i3 - 8;
        }
        g();
    }

    public final boolean e() {
        boolean z = (this.a[this.b] & (128 >> this.c)) != 0;
        d();
        return z;
    }

    public final int c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            this.c = i2 - 8;
            byte[] bArr = this.a;
            int i4 = this.b;
            this.b = i4 + 1;
            i3 |= (bArr[i4] & 255) << this.c;
        }
        byte[] bArr2 = this.a;
        int i5 = this.b;
        int i6 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i5] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i5 + 1;
        }
        g();
        return i6;
    }

    public final void a(byte[] bArr, int i, int i2) {
        int i3 = (i2 >> 3) + 0;
        for (int i4 = 0; i4 < i3; i4++) {
            byte[] bArr2 = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            byte b2 = bArr2[i5];
            int i6 = this.c;
            bArr[i4] = (byte) (b2 << i6);
            bArr[i4] = (byte) (((255 & bArr2[this.b]) >> (8 - i6)) | bArr[i4]);
        }
        int i7 = i2 & 7;
        if (i7 != 0) {
            bArr[i3] = (byte) (bArr[i3] & (255 >> i7));
            int i8 = this.c;
            if (i8 + i7 > 8) {
                byte b3 = bArr[i3];
                byte[] bArr3 = this.a;
                int i9 = this.b;
                this.b = i9 + 1;
                bArr[i3] = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                this.c = i8 - 8;
            }
            this.c += i7;
            byte[] bArr4 = this.a;
            int i10 = this.b;
            byte b4 = bArr4[i10] & 255;
            int i11 = this.c;
            bArr[i3] = (byte) (((byte) ((b4 >> (8 - i11)) << (8 - i7))) | bArr[i3]);
            if (i11 == 8) {
                this.c = 0;
                this.b = i10 + 1;
            }
            g();
        }
    }

    public final void f() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            g();
        }
    }

    public final void b(byte[] bArr, int i, int i2) {
        bcu.b(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i2);
        this.b += i2;
        g();
    }

    public void g() {
        boolean z;
        int i = this.b;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2 || (i == i2 && this.c == 0)) {
                z = true;
                bcu.b(z);
            }
        }
        z = false;
        bcu.b(z);
    }
}
