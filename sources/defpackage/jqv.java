package defpackage;

/* renamed from: jqv reason: default package */
public final class jqv implements jrb {
    public static final jqv a = new jqv();

    private jqv() {
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
