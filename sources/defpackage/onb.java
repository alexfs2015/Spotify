package defpackage;

import io.reactivex.Scheduler;

/* renamed from: onb reason: default package */
public final class onb {
    final wlc<ois> a;
    final wlc<omy> b;
    final wlc<omt> c;
    final wlc<uxt> d;
    final wlc<tcn> e;
    final wlc<ofh> f;
    final wlc<String> g;
    final wlc<Scheduler> h;

    public onb(wlc<ois> wlc, wlc<omy> wlc2, wlc<omt> wlc3, wlc<uxt> wlc4, wlc<tcn> wlc5, wlc<ofh> wlc6, wlc<String> wlc7, wlc<Scheduler> wlc8) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
        this.f = (wlc) a(wlc6, 6);
        this.g = (wlc) a(wlc7, 7);
        this.h = (wlc) a(wlc8, 8);
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
