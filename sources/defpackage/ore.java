package defpackage;

import android.content.Context;

/* renamed from: ore reason: default package */
public final class ore implements a {
    private final wzi<Context> a;

    public ore(wzi<Context> wzi) {
        this.a = (wzi) a(wzi, 1);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ orc a() {
        return new ord((Context) a(this.a.get(), 1));
    }
}
