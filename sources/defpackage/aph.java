package defpackage;

@Deprecated
/* renamed from: aph reason: default package */
public final class aph {
    public static final aph a = new aph(-1, -2);
    public static final aph b = new aph(320, 50);
    public static final aph c = new aph(300, 250);
    public static final aph d = new aph(468, 60);
    public static final aph e = new aph(728, 90);
    public static final aph f = new aph(160, 600);
    private final ber g;

    private aph(int i, int i2) {
        this(new ber(i, i2));
    }

    public aph(ber ber) {
        this.g = ber;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aph)) {
            return false;
        }
        return this.g.equals(((aph) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String toString() {
        return this.g.toString();
    }

    public final int a() {
        return this.g.j;
    }

    public final int b() {
        return this.g.k;
    }
}
