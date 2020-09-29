package defpackage;

/* renamed from: xde reason: default package */
final class xde {
    private static xdd a;
    private static long b;

    private xde() {
    }

    static xdd a() {
        synchronized (xde.class) {
            if (a == null) {
                return new xdd();
            }
            xdd xdd = a;
            a = xdd.f;
            xdd.f = null;
            b -= 8192;
            return xdd;
        }
    }

    static void a(xdd xdd) {
        if (xdd.f != null || xdd.g != null) {
            throw new IllegalArgumentException();
        } else if (!xdd.d) {
            synchronized (xde.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    xdd.f = a;
                    xdd.c = 0;
                    xdd.b = 0;
                    a = xdd;
                }
            }
        }
    }
}
