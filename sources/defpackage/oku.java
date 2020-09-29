package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oku reason: default package */
final class oku {
    final wlc<Scheduler> a;
    final wlc<oew> b;
    final wlc<hck> c;
    final wlc<kxz> d;
    final wlc<opb> e;

    oku(wlc<Scheduler> wlc, wlc<oew> wlc2, wlc<hck> wlc3, wlc<kxz> wlc4, wlc<opb> wlc5) {
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
