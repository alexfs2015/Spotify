package defpackage;

import java.util.Arrays;

/* renamed from: fln reason: default package */
public final class fln implements Cloneable {
    public int[] a;
    public int b;

    public fln() {
        this.b = 0;
        this.a = new int[1];
    }

    private fln(int[] iArr, int i) {
        this.a = iArr;
        this.b = i;
    }

    public final int a() {
        return (this.b + 7) / 8;
    }

    private void b(int i) {
        int[] iArr = this.a;
        if (i > (iArr.length << 5)) {
            int[] iArr2 = new int[((i + 31) / 32)];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            this.a = iArr2;
        }
    }

    public final boolean a(int i) {
        return ((1 << (i & 31)) & this.a[i / 32]) != 0;
    }

    public final void a(boolean z) {
        b(this.b + 1);
        if (z) {
            int[] iArr = this.a;
            int i = this.b;
            int i2 = i / 32;
            iArr[i2] = (1 << (i & 31)) | iArr[i2];
        }
        this.b++;
    }

    public final void a(int i, int i2) {
        if (i2 < 0 || i2 > 32) {
            throw new IllegalArgumentException("Num bits must be between 0 and 32");
        }
        b(this.b + i2);
        while (i2 > 0) {
            boolean z = true;
            if (((i >> (i2 - 1)) & 1) != 1) {
                z = false;
            }
            a(z);
            i2--;
        }
    }

    public final void a(fln fln) {
        int i = fln.b;
        b(this.b + i);
        for (int i2 = 0; i2 < i; i2++) {
            a(fln.a(i2));
        }
    }

    public final void a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        int i5 = 0;
        while (i5 < i3) {
            int i6 = i4;
            int i7 = 0;
            for (int i8 = 0; i8 < 8; i8++) {
                if (a(i6)) {
                    i7 |= 1 << (7 - i8);
                }
                i6++;
            }
            bArr[i5 + 0] = (byte) i7;
            i5++;
            i4 = i6;
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof fln)) {
            return false;
        }
        fln fln = (fln) obj;
        if (this.b != fln.b || !Arrays.equals(this.a, fln.a)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (this.b * 31) + Arrays.hashCode(this.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(this.b);
        for (int i = 0; i < this.b; i++) {
            if ((i & 7) == 0) {
                sb.append(' ');
            }
            sb.append(a(i) ? 'X' : '.');
        }
        return sb.toString();
    }

    public final /* synthetic */ Object clone() {
        return new fln((int[]) this.a.clone(), this.b);
    }
}
