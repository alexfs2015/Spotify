package defpackage;

/* renamed from: wsh reason: default package */
final class wsh {
    static void a(wnb wnb, int i, CharSequence charSequence, int i2) {
        if (charSequence instanceof wvc) {
            wng.a((wvc) charSequence, 0, wnb, i, i2);
        } else {
            b(wnb, i, charSequence, i2);
        }
    }

    private static void b(wnb wnb, int i, CharSequence charSequence, int i2) {
        int i3 = 0;
        while (i3 < i2) {
            int i4 = i + 1;
            wnb.b(i, (int) wvc.a(charSequence.charAt(i3)));
            i3++;
            i = i4;
        }
    }
}
