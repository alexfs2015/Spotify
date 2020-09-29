package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oaz reason: default package */
final class oaz {
    final wzi<Scheduler> a;
    final wzi<a> b;
    final wzi<szp> c;

    oaz(wzi<Scheduler> wzi, wzi<a> wzi2, wzi<szp> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
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
