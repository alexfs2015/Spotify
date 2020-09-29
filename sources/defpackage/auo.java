package defpackage;

/* renamed from: auo reason: default package */
final class auo {
    int a;
    int b;
    private final byte[] c;
    private final int d;

    public auo(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final boolean a() {
        boolean z = (((this.c[this.a] & 255) >> this.b) & 1) == 1;
        b(1);
        return z;
    }

    public final int a(int i) {
        int i2 = this.a;
        int min = Math.min(i, 8 - this.b);
        int i3 = i2 + 1;
        int i4 = ((this.c[i2] & 255) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        int i5 = i4 & (-1 >>> (32 - i));
        b(i);
        return i5;
    }

    public final void b(int i) {
        int i2 = i / 8;
        this.a += i2;
        this.b += i - (i2 << 3);
        int i3 = this.b;
        if (i3 > 7) {
            this.a++;
            this.b = i3 - 8;
        }
        b();
    }

    private void b() {
        boolean z;
        int i = this.a;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2 || (i == i2 && this.b == 0)) {
                z = true;
                bcu.b(z);
            }
        }
        z = false;
        bcu.b(z);
    }
}
