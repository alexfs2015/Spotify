package defpackage;

import android.content.Context;

/* renamed from: oxu reason: default package */
final class oxu implements a {
    private final wzi<oxp> a;
    private final wzi<Context> b;
    private final wzi<a> c;

    oxu(wzi<oxp> wzi, wzi<Context> wzi2, wzi<a> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oxr a(ooh ooh) {
        return new oxt((oxp) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (a) a(this.c.get(), 3), (ooh) a(ooh, 4));
    }
}
