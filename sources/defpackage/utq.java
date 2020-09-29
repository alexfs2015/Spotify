package defpackage;

/* renamed from: utq reason: default package */
public final class utq {
    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                wok wok = new wok();
                wok.a(str, 0, i);
                wok.a(63);
                while (true) {
                    i += Character.charCount(codePointAt);
                    if (i >= length) {
                        return wok.o();
                    }
                    codePointAt = str.codePointAt(i);
                    wok.a((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                }
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        return str;
    }
}
