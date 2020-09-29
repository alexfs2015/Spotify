package defpackage;

import java.util.LinkedList;

/* renamed from: fll reason: default package */
final class fll {
    static final fll a = new fll(flm.a, 0, 0, 0);
    final int b;
    final int c;
    final int d;
    private final flm e;

    private fll(flm flm, int i, int i2, int i3) {
        this.e = flm;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* access modifiers changed from: 0000 */
    public final fll a(int i, int i2) {
        int i3 = this.d;
        flm flm = this.e;
        if (i != this.b) {
            int i4 = flj.b[this.b][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            flm = flm.a(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new fll(flm.a(i2, i7), i, 0, i3 + i7);
    }

    /* access modifiers changed from: 0000 */
    public final fll b(int i, int i2) {
        flm flm = this.e;
        int i3 = this.b == 2 ? 4 : 5;
        return new fll(flm.a(flj.c[this.b][i], i3).a(i2, 5), this.b, 0, this.d + i3 + 5);
    }

    /* access modifiers changed from: 0000 */
    public final fll a(int i) {
        flm flm = this.e;
        int i2 = this.b;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = flj.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            flm = flm.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        fll fll = new fll(flm, i2, this.c + 1, i3 + i8);
        return fll.c == 2078 ? fll.b(i + 1) : fll;
    }

    /* access modifiers changed from: 0000 */
    public final fll b(int i) {
        int i2 = this.c;
        if (i2 == 0) {
            return this;
        }
        return new fll(this.e.b(i - i2, i2), this.b, 0, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(fll fll) {
        int i = this.d + (flj.b[this.b][fll.b] >> 16);
        int i2 = fll.c;
        if (i2 > 0) {
            int i3 = this.c;
            if (i3 == 0 || i3 > i2) {
                i += 10;
            }
        }
        return i <= fll.d;
    }

    /* access modifiers changed from: 0000 */
    public final fln a(byte[] bArr) {
        LinkedList<flm> linkedList = new LinkedList<>();
        for (flm flm = b(bArr.length).e; flm != null; flm = flm.b) {
            linkedList.addFirst(flm);
        }
        fln fln = new fln();
        for (flm a2 : linkedList) {
            a2.a(fln, bArr);
        }
        return fln;
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{flj.a[this.b], Integer.valueOf(this.d), Integer.valueOf(this.c)});
    }
}
