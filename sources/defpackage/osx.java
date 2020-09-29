package defpackage;

import io.reactivex.Scheduler;

/* renamed from: osx reason: default package */
final class osx {
    final wzi<opw> a;
    final wzi<oss> b;
    final wzi<szp> c;
    final wzi<vjv> d;
    final wzi<osz> e;
    final wzi<oml> f;
    final wzi<String> g;
    final wzi<Scheduler> h;

    osx(wzi<opw> wzi, wzi<oss> wzi2, wzi<szp> wzi3, wzi<vjv> wzi4, wzi<osz> wzi5, wzi<oml> wzi6, wzi<String> wzi7, wzi<Scheduler> wzi8) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
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
