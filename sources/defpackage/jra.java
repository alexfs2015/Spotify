package defpackage;

/* renamed from: jra reason: default package */
public final class jra implements jrb {
    public static final jra a = new jra();

    public final boolean a(String str) {
        return true;
    }

    private jra() {
    }

    public final boolean b(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            if (str.charAt(i) == '#') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
