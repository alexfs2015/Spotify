package defpackage;

/* renamed from: iks reason: default package */
public final class iks {
    final int a;

    private iks(int i) {
        this.a = i;
    }

    public static iks a() {
        return a(0, 1, 2, 4, 8);
    }

    public static iks a(int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            i |= i2;
        }
        return new iks(i);
    }
}
