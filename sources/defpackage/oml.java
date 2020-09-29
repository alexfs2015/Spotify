package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oml reason: default package */
final class oml {
    final wlc<ois> a;
    final wlc<ome> b;
    final wlc<uxt> c;
    final wlc<ofa> d;
    final wlc<omi> e;
    final wlc<tcn> f;
    final wlc<ofh> g;
    final wlc<String> h;
    final wlc<Scheduler> i;

    oml(wlc<ois> wlc, wlc<ome> wlc2, wlc<uxt> wlc3, wlc<ofa> wlc4, wlc<omi> wlc5, wlc<tcn> wlc6, wlc<ofh> wlc7, wlc<String> wlc8, wlc<Scheduler> wlc9) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
        this.i = (wlc) a(wlc9, 9);
    }

    static <T> T a(T t, int i2) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i2);
        throw new NullPointerException(sb.toString());
    }
}
