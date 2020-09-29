package defpackage;

/* renamed from: fmb reason: default package */
final class fmb extends fmg {
    private final short c;
    private final short d;

    fmb(fmg fmg, int i, int i2) {
        super(fmg);
        this.c = (short) i;
        this.d = (short) i2;
    }

    public final void a(fmh fmh, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    fmh.a(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        fmh.a(s2 - 31, 16);
                    } else if (i == 0) {
                        fmh.a(Math.min(s2, 31), 5);
                    } else {
                        fmh.a(s2 - 31, 5);
                    }
                }
                fmh.a(bArr[this.c + i], 8);
                i++;
            } else {
                return;
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(this.c);
        sb.append("::");
        sb.append((this.c + this.d) - 1);
        sb.append('>');
        return sb.toString();
    }
}
