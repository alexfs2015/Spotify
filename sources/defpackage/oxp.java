package defpackage;

import io.reactivex.Scheduler;

/* renamed from: oxp reason: default package */
final class oxp {
    final wzi<tmu> a;
    final wzi<opw> b;
    final wzi<oxk> c;
    final wzi<String> d;
    final wzi<hec> e;
    final wzi<Scheduler> f;

    oxp(wzi<tmu> wzi, wzi<opw> wzi2, wzi<oxk> wzi3, wzi<String> wzi4, wzi<hec> wzi5, wzi<Scheduler> wzi6) {
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
