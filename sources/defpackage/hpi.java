package defpackage;

import io.reactivex.Scheduler;

/* renamed from: hpi reason: default package */
public final class hpi {
    public final wzi<igj> a;
    public final wzi<ihv> b;
    public final wzi<igo> c;
    public final wzi<igm> d;
    public final wzi<igf> e;
    public final wzi<Scheduler> f;

    public hpi(wzi<igj> wzi, wzi<ihv> wzi2, wzi<igo> wzi3, wzi<igm> wzi4, wzi<igf> wzi5, wzi<Scheduler> wzi6) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
        this.f = (wzi) a(wzi6, 6);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
