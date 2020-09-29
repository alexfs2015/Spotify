package defpackage;

import java.util.Arrays;

/* renamed from: auj reason: default package */
final class auj {
    final auk a = new auk();
    final bdj b = new bdj(new byte[65025], 0);
    int c = -1;
    boolean d;
    private int e;

    auj() {
    }

    public final boolean a(asu asu) {
        int i;
        bcu.b(asu != null);
        if (this.d) {
            this.d = false;
            this.b.a();
        }
        while (!this.d) {
            if (this.c < 0) {
                if (!this.a.a(asu, true)) {
                    return false;
                }
                int i2 = this.a.d;
                if ((this.a.a & 1) == 1 && this.b.c == 0) {
                    i2 += a(0);
                    i = this.e + 0;
                } else {
                    i = 0;
                }
                asu.b(i2);
                this.c = i;
            }
            int a2 = a(this.c);
            int i3 = this.c + this.e;
            if (a2 > 0) {
                if (this.b.a.length < this.b.c + a2) {
                    bdj bdj = this.b;
                    bdj.a = Arrays.copyOf(bdj.a, this.b.c + a2);
                }
                asu.b(this.b.a, this.b.c, a2);
                bdj bdj2 = this.b;
                bdj2.b(bdj2.c + a2);
                this.d = this.a.f[i3 + -1] != 255;
            }
            if (i3 == this.a.c) {
                i3 = -1;
            }
            this.c = i3;
        }
        return true;
    }

    public final void a() {
        if (this.b.a.length != 65025) {
            bdj bdj = this.b;
            bdj.a = Arrays.copyOf(bdj.a, Math.max(65025, this.b.c));
        }
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
}
