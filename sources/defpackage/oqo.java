package defpackage;

import android.content.Context;

/* renamed from: oqo reason: default package */
final class oqo implements a {
    private final wlc<oqj> a;
    private final wlc<Context> b;
    private final wlc<a> c;

    oqo(wlc<oqj> wlc, wlc<Context> wlc2, wlc<a> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oql a(ohd ohd) {
        return new oqn((oqj) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (a) a(this.c.get(), 3), (ohd) a(ohd, 4));
    }
}
