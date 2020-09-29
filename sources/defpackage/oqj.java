package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oqj reason: default package */
final class oqj {
    final wlc<tcn> a;
    final wlc<ois> b;
    final wlc<oqe> c;
    final wlc<String> d;
    final wlc<hbj> e;
    final wlc<Scheduler> f;

    oqj(wlc<tcn> wlc, wlc<ois> wlc2, wlc<oqe> wlc3, wlc<String> wlc4, wlc<hbj> wlc5, wlc<Scheduler> wlc6) {
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
