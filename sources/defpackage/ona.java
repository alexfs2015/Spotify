package defpackage;

import android.content.Context;

/* renamed from: ona reason: default package */
final class ona implements a {
    private final wzi<omv> a;
    private final wzi<Context> b;

    ona(wzi<omv> wzi, wzi<Context> wzi2) {
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

    public final /* synthetic */ omx a() {
        return new omz((omv) a(this.a.get(), 1), (Context) a(this.b.get(), 2));
    }
}
