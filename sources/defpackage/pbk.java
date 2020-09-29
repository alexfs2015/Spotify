package defpackage;

import io.reactivex.Scheduler;

/* renamed from: pbk reason: default package */
final class pbk {
    final wzi<sbq> a;
    final wzi<opw> b;
    final wzi<pbe> c;
    final wzi<vjv> d;
    final wzi<pbh> e;
    final wzi<oml> f;
    final wzi<String> g;
    final wzi<Scheduler> h;
    final wzi<Scheduler> i;
    final wzi<pbd> j;
    final wzi<pav> k;
    final wzi<Integer> l;

    pbk(wzi<sbq> wzi, wzi<opw> wzi2, wzi<pbe> wzi3, wzi<vjv> wzi4, wzi<pbh> wzi5, wzi<oml> wzi6, wzi<String> wzi7, wzi<Scheduler> wzi8, wzi<Scheduler> wzi9, wzi<pbd> wzi10, wzi<pav> wzi11, wzi<Integer> wzi12) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
        this.g = (wzi) a(wzi7, 7);
        this.h = (wzi) a(wzi8, 8);
        this.i = (wzi) a(wzi9, 9);
        this.j = (wzi) a(wzi10, 10);
        this.k = (wzi) a(wzi11, 11);
        this.l = (wzi) a(wzi12, 12);
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
