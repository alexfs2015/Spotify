package defpackage;

import io.reactivex.Scheduler;

/* renamed from: num reason: default package */
final class num {
    final wlc<Scheduler> a;
    final wlc<a> b;
    final wlc<spi> c;

    num(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<spi> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
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
