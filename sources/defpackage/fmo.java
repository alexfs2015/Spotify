package defpackage;

/* renamed from: fmo reason: default package */
final class fmo implements fmt {
    fmo() {
    }

    public final void a(fmu fmu) {
        StringBuilder sb = new StringBuilder();
        sb.append(0);
        while (true) {
            if (!fmu.b()) {
                break;
            }
            sb.append(fmu.a());
            fmu.f++;
            int a = fmw.a(fmu.a, fmu.f, 5);
            if (a != 5) {
                fmu.g = a;
                break;
            }
        }
        int length = sb.length() - 1;
        int length2 = fmu.e.length() + length + 1;
        fmu.a(length2);
        boolean z = fmu.h.a - length2 > 0;
        if (fmu.b() || z) {
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
            int charAt = sb.charAt(i) + (((fmu.e.length() + 1) * 149) % 255) + 1;
            if (charAt > 255) {
                charAt -= 256;
            }
            fmu.a((char) charAt);
        }
    }
}
