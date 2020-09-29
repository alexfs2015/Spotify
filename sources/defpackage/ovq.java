package defpackage;

import android.content.Context;

/* renamed from: ovq reason: default package */
final class ovq implements a {
    private final wlc<ovk> a;
    private final wlc<Context> b;
    private final wlc<ovd> c;

    ovq(wlc<ovk> wlc, wlc<Context> wlc2, wlc<ovd> wlc3) {
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

    public final /* synthetic */ ovn a(ohl ohl) {
        return new ovp((ovk) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (ovd) a(this.c.get(), 3), (ohl) a(ohl, 4));
    }
}
