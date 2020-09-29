package defpackage;

import android.content.Context;

/* renamed from: pqf reason: default package */
public final class pqf {
    private final wzi<pqz> a;
    private final wzi<Context> b;

    public pqf(wzi<pqz> wzi, wzi<Context> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final pqe a(String str) {
        return new pqe((String) a(str, 1), (pqz) a(this.a.get(), 2), (Context) a(this.b.get(), 3));
    }
}
