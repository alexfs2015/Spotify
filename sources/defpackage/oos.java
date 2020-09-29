package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oos reason: default package */
final class oos {
    final wlc<Scheduler> a;
    final wlc<a> b;
    final wlc<a> c;
    final wlc<ooz> d;
    final wlc<onm> e;

    oos(wlc<Scheduler> wlc, wlc<a> wlc2, wlc<a> wlc3, wlc<ooz> wlc4, wlc<onm> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
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
