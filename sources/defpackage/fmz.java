package defpackage;

/* renamed from: fmz reason: default package */
final class fmz extends fmp {
    fmz() {
    }

    public final int a() {
        return 3;
    }

    /* access modifiers changed from: 0000 */
    public final int a(char c, StringBuilder sb) {
        if (c == 13) {
            sb.append(0);
        } else if (c == '*') {
            sb.append(1);
        } else if (c == '>') {
            sb.append(2);
        } else if (c == ' ') {
            sb.append(3);
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
        } else if (c < 'A' || c > 'Z') {
            fmw.c(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    public final void a(fmu fmu) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fmu.b()) {
                break;
            }
            char a = fmu.a();
            fmu.f++;
            a(a, sb);
            if (sb.length() % 3 == 0) {
                a(fmu, sb);
                int a2 = fmw.a(fmu.a, fmu.f, 3);
                if (a2 != 3) {
                    fmu.g = a2;
                    break;
                }
            }
        }
        b(fmu, sb);
    }

    /* access modifiers changed from: 0000 */
    public final void b(fmu fmu, StringBuilder sb) {
        fmu.d();
        int length = fmu.h.a - fmu.e.length();
        fmu.f -= sb.length();
        if (fmu.c() > 1 || length > 1 || fmu.c() != length) {
            fmu.a(254);
        }
        if (fmu.g < 0) {
            fmu.g = 0;
        }
    }
}
