package defpackage;

/* renamed from: flh reason: default package */
final class flh extends flm {
    private final short c;
    private final short d;

    flh(flm flm, int i, int i2) {
        super(flm);
        this.c = (short) i;
        this.d = (short) i2;
    }

    public final void a(fln fln, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.d;
            if (i < s) {
                if (i == 0 || (i == 31 && s <= 62)) {
                    fln.a(31, 5);
                    short s2 = this.d;
                    if (s2 > 62) {
                        fln.a(s2 - 31, 16);
                    } else if (i == 0) {
                        fln.a(Math.min(s2, 31), 5);
                    } else {
                        fln.a(s2 - 31, 5);
                    }
                }
                fln.a(bArr[this.c + i], 8);
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
