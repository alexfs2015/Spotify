package defpackage;

import android.content.Context;

/* renamed from: ntd reason: default package */
final class ntd implements a {
    private final wzi<ntf> a;
    private final wzi<Context> b;
    private final wzi<omc> c;
    private final wzi<oml> d;
    private final wzi<nsy> e;

    ntd(wzi<ntf> wzi, wzi<Context> wzi2, wzi<omc> wzi3, wzi<oml> wzi4, wzi<nsy> wzi5) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
        this.e = (wzi) a(wzi5, 5);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ nta a() {
        ntc ntc = new ntc((ntf) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (omc) a(this.c.get(), 3), (oml) a(this.d.get(), 4), (nsy) a(this.e.get(), 5));
        return ntc;
    }
}
