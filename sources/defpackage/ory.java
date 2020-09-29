package defpackage;

import io.reactivex.Scheduler;

/* renamed from: ory reason: default package */
final class ory {
    final wzi<Scheduler> a;
    final wzi<omc> b;
    final wzi<hfg> c;
    final wzi<lbi> d;
    final wzi<owh> e;

    ory(wzi<Scheduler> wzi, wzi<omc> wzi2, wzi<hfg> wzi3, wzi<lbi> wzi4, wzi<owh> wzi5) {
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
