package defpackage;

import io.reactivex.Scheduler;

/* renamed from: sdh reason: default package */
public final class sdh {
    final wzi<lbi> a;
    final wzi<scx> b;
    final wzi<Scheduler> c;

    public sdh(wzi<lbi> wzi, wzi<scx> wzi2, wzi<Scheduler> wzi3) {
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
