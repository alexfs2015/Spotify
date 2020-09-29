package defpackage;

/* renamed from: jtl reason: default package */
public final class jtl implements jtm {
    public static final jtl a = new jtl();

    private jtl() {
    }

    public final boolean a(String str) {
        return true;
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
