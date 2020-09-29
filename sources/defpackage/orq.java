package defpackage;

import io.reactivex.Scheduler;

/* renamed from: orq reason: default package */
final class orq {
    final wzi<opw> a;
    final wzi<orl> b;
    final wzi<hec> c;
    final wzi<szp> d;
    final wzi<String> e;
    final wzi<Scheduler> f;

    orq(wzi<opw> wzi, wzi<orl> wzi2, wzi<hec> wzi3, wzi<szp> wzi4, wzi<String> wzi5, wzi<Scheduler> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
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
