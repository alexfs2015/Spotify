package defpackage;

import android.content.Context;

/* renamed from: okf reason: default package */
final class okf implements a {
    private final wlc<ojw> a;
    private final wlc<Context> b;
    private final wlc<a> c;

    okf(wlc<ojw> wlc, wlc<Context> wlc2, wlc<a> wlc3) {
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

    public final /* synthetic */ okc a() {
        return new oke((ojw) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (a) a(this.c.get(), 3));
    }
}
