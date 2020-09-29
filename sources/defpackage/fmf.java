package defpackage;

/* renamed from: fmf reason: default package */
final class fmf extends flv {
    public final int a() {
        return 3;
    }

    fmf() {
    }

    public final void a(fma fma) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fma.b()) {
                break;
            }
            char a = fma.a();
            fma.f++;
            a(a, sb);
            if (sb.length() % 3 == 0) {
                a(fma, sb);
                int a2 = fmc.a(fma.a, fma.f, 3);
                if (a2 != 3) {
                    fma.g = a2;
                    break;
                }
            }
        }
        b(fma, sb);
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
            fmc.c(c);
        } else {
            sb.append((char) ((c - 'A') + 14));
        }
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public final void b(fma fma, StringBuilder sb) {
        fma.d();
        int length = fma.h.a - fma.e.length();
        fma.f -= sb.length();
        if (fma.c() > 1 || length > 1 || fma.c() != length) {
            fma.a(254);
        }
        if (fma.g < 0) {
            fma.g = 0;
        }
    }
}
