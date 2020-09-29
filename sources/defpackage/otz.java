package defpackage;

import io.reactivex.Scheduler;

/* renamed from: otz reason: default package */
final class otz {
    final wlc<rsj> a;
    final wlc<ois> b;
    final wlc<ott> c;
    final wlc<uxt> d;
    final wlc<otw> e;
    final wlc<ofh> f;
    final wlc<String> g;
    final wlc<Scheduler> h;
    final wlc<ots> i;

    otz(wlc<rsj> wlc, wlc<ois> wlc2, wlc<ott> wlc3, wlc<uxt> wlc4, wlc<otw> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8, wlc<ots> wlc9) {
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
