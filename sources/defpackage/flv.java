package defpackage;

/* renamed from: flv reason: default package */
class flv implements flz {
    public int a() {
        return 1;
    }

    flv() {
    }

    public void a(fma fma) {
        StringBuilder sb = new StringBuilder();
        while (true) {
            if (!fma.b()) {
                break;
            }
            char a = fma.a();
            fma.f++;
            int a2 = a(a, sb);
            int length = fma.e.length() + ((sb.length() / 3) << 1);
            fma.a(length);
            int i = fma.h.a - length;
            if (!fma.b()) {
                StringBuilder sb2 = new StringBuilder();
                if (sb.length() % 3 == 2 && (i < 2 || i > 2)) {
                    a2 = a(fma, sb, sb2, a2);
                }
                while (sb.length() % 3 == 1 && ((a2 <= 3 && i != 1) || a2 > 3)) {
                    a2 = a(fma, sb, sb2, a2);
                }
            } else if (sb.length() % 3 == 0) {
                int a3 = fmc.a(fma.a, fma.f, a());
                if (a3 != a()) {
                    fma.g = a3;
                    break;
                }
            }
        }
        b(fma, sb);
    }

    private int a(fma fma, StringBuilder sb, StringBuilder sb2, int i) {
        int length = sb.length();
        sb.delete(length - i, length);
        fma.f--;
        int a = a(fma.a(), sb2);
        fma.h = null;
        return a;
    }

    /* access modifiers changed from: 0000 */
    public void b(fma fma, StringBuilder sb) {
        int length = sb.length() % 3;
        int length2 = fma.e.length() + ((sb.length() / 3) << 1);
        fma.a(length2);
        int i = fma.h.a - length2;
        if (length == 2) {
            sb.append(0);
            while (sb.length() >= 3) {
                a(fma, sb);
            }
            if (fma.b()) {
                fma.a(254);
            }
        } else if (i == 1 && length == 1) {
            while (sb.length() >= 3) {
                a(fma, sb);
            }
            if (fma.b()) {
                fma.a(254);
            }
            fma.f--;
        } else if (length == 0) {
            while (sb.length() >= 3) {
                a(fma, sb);
            }
            if (i > 0 || fma.b()) {
                fma.a(254);
            }
        } else {
            throw new IllegalStateException("Unexpected case. Please report!");
        }
        fma.g = 0;
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

    static void a(fma fma, StringBuilder sb) {
        int charAt = (sb.charAt(0) * 1600) + (sb.charAt(1) * '(') + sb.charAt(2) + 1;
        fma.a(new String(new char[]{(char) (charAt / 256), (char) (charAt % 256)}));
        sb.delete(0, 3);
    }
}
