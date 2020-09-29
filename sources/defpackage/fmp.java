package defpackage;

/* renamed from: fmp reason: default package */
class fmp implements fmt {
    fmp() {
    }

    private int a(fmu fmu, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        fmu.f--;
        int a = a(fmu.a(), sb2);
        fmu.h = null;
        return a;
    }

    static void a(fmu fmu, StringBuilder sb) {
        int charAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        fmu.a(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    /* access modifiers changed from: 0000 */
    public int a(char c, StringBuilder sb) {
        if (c == ' ') {
            sb.append(3);
            return 1;
        } else if (c >= '0' && c <= '9') {
            sb.append((char) ((c - '0') + 4));
            return 1;
        } else if (c >= 'A' && c <= 'Z') {
            sb.append((char) ((c - 'A') + 14));
            return 1;
        } else if (c >= 0 && c <= 31) {
            sb.append(0);
            sb.append(c);
            return 2;
        } else if (c >= '!' && c <= '/') {
            sb.append(1);
            sb.append((char) (c - '!'));
            return 2;
        } else if (c >= ':' && c <= '@') {
            sb.append(1);
            sb.append((char) ((c - ':') + 15));
            return 2;
        } else if (c >= '[' && c <= '_') {
            sb.append(1);
            sb.append((char) ((c - '[') + 22));
            return 2;
        } else if (c >= '`' && c <= 127) {
            sb.append(2);
            sb.append((char) (c - '`'));
            return 2;
        } else if (c >= 128) {
            sb.append("\u0001\u001e");
            return a((char) (c - 128), sb) + 2;
        } else {
            throw new IllegalArgumentException("Illegal character: ".concat(String.valueOf(c)));
        }
    }

    public void a(fmu fmu) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fmu.b()) {
                break;
            }
            char a = fmu.a();
            fmu.f++;
            int a2 = a(a, sb);
            int length = fmu.e.length() + ((sb.length() / 3) << 1);
            fmu.a(length);
            int i = fmu.h.a - length;
            if (!fmu.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    a2 = a(fmu, sb, sb2, a2);
                }
                while (sb.length() % 3 == 1 && ((a2 <= 3 && i != 1) || a2 > 3)) {
                    a2 = a(fmu, sb, sb2, a2);
                }
            } else if (sb.length() % 3 == 0) {
                int a3 = fmw.a(fmu.a, fmu.f, a());
                if (a3 != a()) {
                    fmu.g = a3;
                    break;
                }
            }
        }
        b(fmu, sb);
    }

    /* access modifiers changed from: 0000 */
    public void b(fmu fmu, StringBuilder sb) {
        int length = sb.length() % 3;
        int length2 = fmu.e.length() + ((sb.length() / 3) << 1);
        fmu.a(length2);
        int i = fmu.h.a - length2;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                a(fmu, sb);
            }
            if (fmu.b()) {
                fmu.a(254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                a(fmu, sb);
            }
            if (fmu.b()) {
                fmu.a(254);
            }
            fmu.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                a(fmu, sb);
            }
            if (i > 0 || fmu.b()) {
                fmu.a(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        fmu.g = 0;
    }
}
