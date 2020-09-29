package defpackage;

/* renamed from: jtg reason: default package */
public final class jtg implements jtm {
    public static final jtg a = new jtg();

    private jtg() {
    }

    public final boolean a(String str) {
        return str.length() == 22;
    }

    public final boolean b(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetterOrDigit(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
