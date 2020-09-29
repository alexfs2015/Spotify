package defpackage;

/* renamed from: vev reason: default package */
public final class vev {
    public static String a(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt <= 31 || codePointAt >= 127) {
                xcq xcq = new xcq();
                xcq.a(str, 0, i);
                xcq.a(63);
                while (true) {
                    i += Character.charCount(codePointAt);
                    if (i >= length) {
                        return xcq.o();
                    }
                    codePointAt = str.codePointAt(i);
                    xcq.a((codePointAt <= 31 || codePointAt >= 127) ? 63 : codePointAt);
                }
            } else {
                i += Character.charCount(codePointAt);
            }
        }
        return str;
    }
}
