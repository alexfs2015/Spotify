package defpackage;

import android.content.Context;

/* renamed from: orj reason: default package */
final class orj implements a {
    private final wzi<ora> a;
    private final wzi<Context> b;
    private final wzi<a> c;

    orj(wzi<ora> wzi, wzi<Context> wzi2, wzi<a> wzi3) {
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

    public final /* synthetic */ org a() {
        return new ori((ora) a(this.a.get(), 1), (Context) a(this.b.get(), 2), (a) a(this.c.get(), 3));
    }
}
