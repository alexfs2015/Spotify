package defpackage;

import android.content.Context;

/* renamed from: ofw reason: default package */
final class ofw implements a {
    private final wlc<ofr> a;
    private final wlc<Context> b;

    ofw(wlc<ofr> wlc, wlc<Context> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oft a() {
        return new ofv((ofr) a(this.a.get(), 1), (Context) a(this.b.get(), 2));
    }
}
