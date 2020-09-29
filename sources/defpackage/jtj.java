package defpackage;

/* renamed from: jtj reason: default package */
public final class jtj implements jtm {
    public static final jtj a = new jtj();

    private jtj() {
    }

    public final boolean a(String str) {
        return str.length() == 16;
    }

    public final boolean b(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i);
            if ((charAt < '0' || charAt > '9') && ((charAt < 'a' || charAt > 'f') && (charAt < 'A' || charAt > 'F'))) {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
