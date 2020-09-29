package defpackage;

/* renamed from: qhx reason: default package */
final class qhx {
    private static int a = 2131099716;
    private static int b = 2131099720;
    private static int c = 2131099688;
    private static int d = 2131100294;

    /* renamed from: qhx$a */
    static class a {
        int a;
        int b;
        int c;

        public a(int i, int i2, int i3) {
            this.a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    static a a(int i) {
        int i2 = a;
        if (i == i2) {
            return new a(b, c, d);
        }
        int i3 = b;
        if (i == i3) {
            return new a(c, d, i2);
        }
        if (i == c) {
            return new a(d, i2, i3);
        }
        if (i == -1 || i == d) {
            return new a(a, b, c);
        }
        throw new IllegalArgumentException("Unsupported start color");
    }
}
