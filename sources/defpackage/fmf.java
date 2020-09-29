package defpackage;

import java.util.LinkedList;

/* renamed from: fmf reason: default package */
final class fmf {
    static final fmf a = new fmf(fmg.a, 0, 0, 0);
    final int b;
    final int c;
    final int d;
    private final fmg e;

    private fmf(fmg fmg, int i, int i2, int i3) {
        this.e = fmg;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    /* access modifiers changed from: 0000 */
    public final fmf a(int i) {
        fmg fmg = this.e;
        int i2 = this.b;
        int i3 = this.d;
        if (i2 == 4 || i2 == 2) {
            int i4 = fmd.b[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            fmg = fmg.a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.c;
        int i8 = (i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8;
        fmf fmf = new fmf(fmg, i2, this.c + 1, i3 + i8);
        return fmf.c == 2078 ? fmf.b(i + 1) : fmf;
    }

    /* access modifiers changed from: 0000 */
    public final fmf a(int i, int i2) {
        int i3 = this.d;
        fmg fmg = this.e;
        if (i != this.b) {
            int i4 = fmd.b[this.b][i];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            fmg = fmg.a(i5, i6);
            i3 += i6;
        }
        int i7 = i == 2 ? 4 : 5;
        return new fmf(fmg.a(i2, i7), i, 0, i3 + i7);
    }

    /* access modifiers changed from: 0000 */
    public final fmh a(byte[] bArr) {
        LinkedList<fmg> linkedList = new LinkedList<>();
        for (fmg fmg = b(bArr.length).e; fmg != null; fmg = fmg.b) {
            linkedList.addFirst(fmg);
        }
        fmh fmh = new fmh();
        for (fmg a2 : linkedList) {
            a2.a(fmh, bArr);
        }
        return fmh;
    }

    /* access modifiers changed from: 0000 */
    public final boolean a(fmf fmf) {
        int i = this.d + (fmd.b[this.b][fmf.b] >> 16);
        int i2 = fmf.c;
        if (i2 > 0) {
            int i3 = this.c;
            if (i3 == 0 || i3 > i2) {
                i += 10;
            }
        }
        return i <= fmf.d;
    }

    /* access modifiers changed from: 0000 */
    public final fmf b(int i) {
        int i2 = this.c;
        return i2 == 0 ? this : new fmf(this.e.b(i - i2, i2), this.b, 0, this.d);
    }

    /* access modifiers changed from: 0000 */
    public final fmf b(int i, int i2) {
        fmg fmg = this.e;
        int i3 = this.b == 2 ? 4 : 5;
        return new fmf(fmg.a(fmd.c[this.b][i], i3).a(i2, 5), this.b, 0, this.d + i3 + 5);
    }

    public final String toString() {
        return String.format("%s bits=%d bytes=%d", new Object[]{fmd.a[this.b], Integer.valueOf(this.d), Integer.valueOf(this.c)});
    }
}
