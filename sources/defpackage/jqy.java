package defpackage;

/* renamed from: jqy reason: default package */
public final class jqy implements jrb {
    public static final jqy a = new jqy();

    private jqy() {
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
