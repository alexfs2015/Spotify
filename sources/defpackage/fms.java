package defpackage;

/* renamed from: fms reason: default package */
final class fms implements fmt {
    fms() {
    }

    private static String a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        if (length != 0) {
            char c = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : 0;
            if (length >= 4) {
                c = charSequence.charAt(3);
            }
            int i2 = (charAt << 18) + (charAt2 << 12) + (charAt3 << 6) + c;
            char c2 = (char) ((i2 >> 16) & 255);
            char c3 = (char) ((i2 >> 8) & 255);
            char c4 = (char) (i2 & 255);
            StringBuilder sb = new StringBuilder(3);
            sb.append(c2);
            if (length >= 2) {
                sb.append(c3);
            }
            if (length >= 3) {
                sb.append(c4);
            }
            return sb.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    public final void a(fmu fmu) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!fmu.b()) {
                break;
            }
            char a = fmu.a();
            if (a >= ' ' && a <= '?') {
                sb.append(a);
            } else if (a < '@' || a > '^') {
                fmw.c(a);
            } else {
                sb.append((char) (a - '@'));
            }
            fmu.f++;
            if (sb.length() >= 4) {
                fmu.a(a(sb, 0));
                sb.delete(0, 4);
                if (fmw.a(fmu.a, fmu.f, 4) != 4) {
                    fmu.g = 0;
                    break;
                }
            }
        }
        sb.append(31);
        try {
            int length = sb.length();
            if (length != 0) {
                if (length == 1) {
                    fmu.d();
                    int length2 = fmu.h.a - fmu.e.length();
                    if (fmu.c() == 0 && length2 <= 2) {
                        fmu.g = 0;
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a2 = a(sb, 0);
                    if (!(!fmu.b()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        fmu.a(fmu.e.length() + i);
                        if (fmu.h.a - fmu.e.length() >= 3) {
                            fmu.a(fmu.e.length() + a2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        fmu.h = null;
                        fmu.f -= i;
                    } else {
                        fmu.a(a2);
                    }
                    fmu.g = 0;
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            fmu.g = 0;
        }
    }
}
