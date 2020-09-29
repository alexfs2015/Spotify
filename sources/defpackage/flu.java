package defpackage;

/* renamed from: flu reason: default package */
final class flu implements flz {
    flu() {
    }

    public final void a(fma fma) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!fma.b()) {
                break;
            }
            sb.append(fma.a());
            fma.f++;
            int a = fmc.a(fma.a, fma.f, 5);
            if (a != 5) {
                fma.g = a;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = fma.e.length() + length + 1;
        fma.a(length2);
        boolean z = fma.h.a - length2 > 0;
        if (fma.b() || z) {
            if (length <= 249) {
                sb.setCharAt(0, (char) length);
            } else if (length <= 1555) {
                sb.setCharAt(0, (char) ((length / 250) + 249));
                sb.insert(1, (char) (length % 250));
            } else {
                throw new IllegalStateException("Message length not in valid ranges: ".concat(String.valueOf(length)));
            }
        }
        int length3 = sb.length();
        for (int i = 0; i < length3; i++) {
            int charAt = sb.charAt(i) + (((fma.e.length() + 1) * 149) % 255) + 1;
            if (charAt > 255) {
                charAt -= 256;
            }
            fma.a((char) charAt);
        }
    }
}
