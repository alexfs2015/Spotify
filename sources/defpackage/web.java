package defpackage;

/* renamed from: web reason: default package */
final class web {
    static void a(vyv vyv, int i, CharSequence charSequence, int i2) {
        if (charSequence instanceof wgw) {
            vza.a((wgw) charSequence, 0, vyv, i, i2);
        } else {
            b(vyv, i, charSequence, i2);
        }
    }

    private static void b(vyv vyv, int i, CharSequence charSequence, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + 1;
            vyv.b(i, (int) wgw.a(charSequence.charAt(i3)));
            i3++;
            i = i4;
        }
    }
}
