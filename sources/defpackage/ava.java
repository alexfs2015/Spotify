package defpackage;

import java.util.Arrays;

/* renamed from: ava reason: default package */
final class ava {
    final avb a = new avb();
    final bea b = new bea(new byte[65025], 0);
    int c = -1;
    boolean d;
    private int e;

    ava() {
    }

    private int a(int i) {
        int i2 = 0;
        this.e = 0;
        while (this.e + i < this.a.c) {
            int[] iArr = this.a.f;
            int i3 = this.e;
            this.e = i3 + 1;
            int i4 = iArr[i3 + i];
            i2 += i4;
            if (i4 != 255) {
                break;
            }
        }
        return i2;
    }

    public final void a() {
        if (this.b.a.length != 65025) {
            bea bea = this.b;
            bea.a = Arrays.copyOf(bea.a, Math.max(65025, this.b.c));
        }
    }

    public final boolean a(atl atl) {
        int i;
        bdl.b(atl != null);
        if (this.d) {
            this.d = false;
            this.b.a();
        }
        while (!this.d) {
            if (this.c < 0) {
                if (!this.a.a(atl, true)) {
                    return false;
                }
                int i2 = this.a.d;
                if ((this.a.a & 1) == 1 && this.b.c == 0) {
                    i2 += a(0);
                    i = this.e + 0;
                } else {
                    i = 0;
                }
                atl.b(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.e;
            if (a2 > 0) {
                if (this.b.a.length < this.b.c + a2) {
                    bea bea = this.b;
                    bea.a = Arrays.copyOf(bea.a, this.b.c + a2);
                }
                atl.b(this.b.a, this.b.c, a2);
                bea bea2 = this.b;
                bea2.b(bea2.c + a2);
                this.d = this.a.f[i3 + -1] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }
}
