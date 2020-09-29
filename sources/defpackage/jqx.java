package defpackage;

/* renamed from: jqx reason: default package */
public final class jqx implements jrb {
    public static final jqx a = new jqx();

    private jqx() {
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
