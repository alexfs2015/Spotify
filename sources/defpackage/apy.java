package defpackage;

@Deprecated
/* renamed from: apy reason: default package */
public final class apy {
    public static final apy a = new apy(-1, -2);
    public static final apy b = new apy(320, 50);
    public static final apy c = new apy(300, 250);
    public static final apy d = new apy(468, 60);
    public static final apy e = new apy(728, 90);
    public static final apy f = new apy(160, 600);
    private final bfi g;

    private apy(int i, int i2) {
        this(new bfi(i, i2));
    }

    public apy(bfi bfi) {
        this.g = bfi;
    }

    public final int a() {
        return this.g.j;
    }

    public final int b() {
        return this.g.k;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof apy)) {
            return false;
        }
        return this.g.equals(((apy) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.toString();
    }
}
