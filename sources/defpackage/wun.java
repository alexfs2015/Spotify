package defpackage;

import io.netty.handler.codec.base64.Base64Dialect;

/* renamed from: wun reason: default package */
public final class wun {
    public static wnb a(wnc wnc, wnb wnb) {
        wnb a = wrn.a(wnb, wnb.c(), wnb.g(), true, Base64Dialect.STANDARD, wnc);
        wnb.a(wnb.d());
        return a;
    }

    static void a(wnb wnb) {
        if (!wnb.a()) {
            wnb.h(0, wnb.P());
        }
    }

    static void a(wpb wpb, Throwable th) {
        wpb.o();
        wpb.c(new wum(th));
        wpb.i();
    }

    public static void b(wnb wnb) {
        a(wnb);
        wnb.B();
    }
}
