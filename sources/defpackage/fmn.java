package defpackage;

/* renamed from: fmn reason: default package */
final class fmn implements fmt {
    fmn() {
    }

    public final void a(fmu fmu) {
        int i;
        String str = fmu.a;
        int i2 = fmu.f;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (fmw.a(charAt) && i2 < length) {
                i++;
                i2++;
                if (i2 < length) {
                    charAt = str.charAt(i2);
                }
            }
        } else {
            i = 0;
        }
        if (i >= 2) {
            char charAt2 = fmu.a.charAt(fmu.f);
            char charAt3 = fmu.a.charAt(fmu.f + 1);
            if (!fmw.a(charAt2) || !fmw.a(charAt3)) {
                StringBuilder sb = new StringBuilder("not digits: ");
                sb.append(charAt2);
                sb.append(charAt3);
                throw new IllegalArgumentException(sb.toString());
            }
            fmu.a((char) (((charAt2 - '0') * 10) + (charAt3 - '0') + 130));
            fmu.f += 2;
            return;
        }
        char a = fmu.a();
        int a2 = fmw.a(fmu.a, fmu.f, 0);
        if (a2 != 0) {
            if (a2 == 1) {
                fmu.a(230);
                fmu.g = 1;
            } else if (a2 == 2) {
                fmu.a(239);
                fmu.g = 2;
            } else if (a2 == 3) {
                fmu.a(238);
                fmu.g = 3;
            } else if (a2 == 4) {
                fmu.a(240);
                fmu.g = 4;
            } else if (a2 == 5) {
                fmu.a(231);
                fmu.g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(a2)));
            }
        } else if (fmw.b(a)) {
            fmu.a(235);
            fmu.a((char) ((a - 128) + 1));
            fmu.f++;
        } else {
            fmu.a((char) (a + 1));
            fmu.f++;
        }
    }
}
