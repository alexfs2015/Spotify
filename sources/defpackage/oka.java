package defpackage;

import android.content.Context;

/* renamed from: oka reason: default package */
public final class oka implements a {
    private final wlc<Context> a;

    public oka(wlc<Context> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ ojy a() {
        return new ojz((Context) a(this.a.get(), 1));
    }
}
