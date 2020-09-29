package defpackage;

/* renamed from: flt reason: default package */
final class flt implements flz {
    flt() {
    }

    public final void a(fma fma) {
        int i;
        String str = fma.a;
        int i2 = fma.f;
        int length = str.length();
        if (i2 < length) {
            char charAt = str.charAt(i2);
            i = 0;
            while (fmc.a(charAt) && i2 < length) {
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
            char charAt2 = fma.a.charAt(fma.f);
            char charAt3 = fma.a.charAt(fma.f + 1);
            if (!fmc.a(charAt2) || !fmc.a(charAt3)) {
                StringBuilder sb = new StringBuilder("not digits: ");
                sb.append(charAt2);
                sb.append(charAt3);
                throw new IllegalArgumentException(sb.toString());
            }
            fma.a((char) (((charAt2 - '0') * 10) + (charAt3 - '0') + 130));
            fma.f += 2;
            return;
        }
        char a = fma.a();
        int a2 = fmc.a(fma.a, fma.f, 0);
        if (a2 != 0) {
            if (a2 == 1) {
                fma.a(230);
                fma.g = 1;
            } else if (a2 == 2) {
                fma.a(239);
                fma.g = 2;
            } else if (a2 == 3) {
                fma.a(238);
                fma.g = 3;
            } else if (a2 == 4) {
                fma.a(240);
                fma.g = 4;
            } else if (a2 == 5) {
                fma.a(231);
                fma.g = 5;
            } else {
                throw new IllegalStateException("Illegal mode: ".concat(String.valueOf(a2)));
            }
        } else if (fmc.b(a)) {
            fma.a(235);
            fma.a((char) ((a - 128) + 1));
            fma.f++;
        } else {
            fma.a((char) (a + 1));
            fma.f++;
        }
    }
}
