package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ovy reason: default package */
final class ovy {
    final wzi<Scheduler> a;
    final wzi<a> b;
    final wzi<a> c;
    final wzi<owf> d;
    final wzi<ous> e;

    ovy(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<a> wzi3, wzi<owf> wzi4, wzi<ous> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
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
