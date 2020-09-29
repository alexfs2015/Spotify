package defpackage;

import io.netty.handler.codec.base64.Base64Dialect;

/* renamed from: wgh reason: default package */
public final class wgh {
    static void a(wav wav, Throwable th) {
        wav.o();
        wav.c(new wgg(th));
        wav.i();
    }

    static void a(vyv vyv) {
        if (!vyv.a()) {
            vyv.h(0, vyv.P());
        }
    }

    public static void b(vyv vyv) {
        a(vyv);
        vyv.B();
    }

    public static vyv a(vyw vyw, vyv vyv) {
        vyv a = wdh.a(vyv, vyv.c(), vyv.g(), true, Base64Dialect.STANDARD, vyw);
        vyv.a(vyv.d());
        return a;
    }
}
