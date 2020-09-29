package defpackage;

import android.content.Context;

/* renamed from: rks reason: default package */
public final class rks {
    private final wzi<Context> a;
    private final wzi<kk> b;
    private final wzi<rlh> c;

    public rks(wzi<Context> wzi, wzi<kk> wzi2, wzi<rlh> wzi3) {
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

    public final rkr a(boolean z) {
        return new rkr((Context) a(this.a.get(), 1), (kk) a(this.b.get(), 2), (rlh) a(this.c.get(), 3), z);
    }
}
