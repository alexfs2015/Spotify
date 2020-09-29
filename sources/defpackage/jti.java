package defpackage;

/* renamed from: jti reason: default package */
public final class jti implements jtm {
    public static final jti a = new jti();

    private jti() {
    }

    public final boolean a(String str) {
        return !str.isEmpty();
    }

    public final boolean b(String str) {
        int i = 0;
        while (true) {
            boolean z = true;
            if (i >= str.length()) {
                return true;
            }
            char charAt = str.charAt(i);
            if (charAt == '?' || charAt == '#') {
                z = false;
            }
            if (!z) {
                return false;
            }
            i++;
        }
    }
}
