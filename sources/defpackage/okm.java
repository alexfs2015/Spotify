package defpackage;

import io.reactivex.Scheduler;

/* renamed from: okm reason: default package */
final class okm {
    final wlc<ois> a;
    final wlc<okh> b;
    final wlc<hbj> c;
    final wlc<spi> d;
    final wlc<String> e;
    final wlc<Scheduler> f;

    okm(wlc<ois> wlc, wlc<okh> wlc2, wlc<hbj> wlc3, wlc<spi> wlc4, wlc<String> wlc5, wlc<Scheduler> wlc6) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
    }

    static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
