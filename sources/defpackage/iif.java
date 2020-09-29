package defpackage;

/* renamed from: iif reason: default package */
public final class iif {
    final int a;

    public static iif a() {
        return a(0, 1, 2, 4, 8);
    }

    public static iif a(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return new iif(i);
    }

    private iif(int i) {
        this.a = i;
    }
}
