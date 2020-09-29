package defpackage;

/* renamed from: fly reason: default package */
final class fly implements flz {
    fly() {
    }

    public final void a(fma fma) {
        boolean z;
        StringBuilder sb = new StringBuilder();
        while (true) {
            z = true;
            if (!fma.b()) {
                break;
            }
            char a = fma.a();
            if (a >= ' ' && a <= '?') {
                sb.append(a);
            } else if (a < '@' || a > '^') {
                fmc.c(a);
            } else {
                sb.append((char) (a - '@'));
            }
            fma.f++;
            if (sb.length() >= 4) {
                fma.a(a(sb, 0));
                sb.delete(0, 4);
                if (fmc.a(fma.a, fma.f, 4) != 4) {
                    fma.g = 0;
                    break;
                }
            }
        }
        sb.append(31);
        try {
            int length = sb.length();
            if (length != 0) {
                if (length == 1) {
                    fma.d();
                    int length2 = fma.h.a - fma.e.length();
                    if (fma.c() == 0 && length2 <= 2) {
                        fma.g = 0;
                        return;
                    }
                }
                if (length <= 4) {
                    int i = length - 1;
                    String a2 = a(sb, 0);
                    if (!(!fma.b()) || i > 2) {
                        z = false;
                    }
                    if (i <= 2) {
                        fma.a(fma.e.length() + i);
                        if (fma.h.a - fma.e.length() >= 3) {
                            fma.a(fma.e.length() + a2.length());
                            z = false;
                        }
                    }
                    if (z) {
                        fma.h = null;
                        fma.f -= i;
                    } else {
                        fma.a(a2);
                    }
                    fma.g = 0;
                    return;
                }
                throw new IllegalStateException("Count must not exceed 4");
            }
        } finally {
            fma.g = 0;
        }
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
}
