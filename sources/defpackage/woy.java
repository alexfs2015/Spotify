package defpackage;

/* renamed from: woy reason: default package */
final class woy {
    private static wox a;
    private static long b;

    private woy() {
    }

    static wox a() {
        synchronized (woy.class) {
            if (a == null) {
                return new wox();
            }
            wox wox = a;
            a = wox.f;
            wox.f = null;
            b -= 8192;
            return wox;
        }
    }

    static void a(wox wox) {
        if (wox.f != null || wox.g != null) {
            throw new IllegalArgumentException();
        } else if (!wox.d) {
            synchronized (woy.class) {
                if (b + 8192 <= 65536) {
                    b += 8192;
                    wox.f = a;
                    wox.c = 0;
                    wox.b = 0;
                    a = wox;
                }
            }
        }
    }
}
