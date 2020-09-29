package defpackage;

import android.content.Context;

/* renamed from: oaf reason: default package */
public final class oaf {
    public final wlc<Context> a;
    public final wlc<jro> b;
    public final wlc<oag> c;
    public final wlc<hed> d;
    public final wlc<hvl> e;

    public oaf(wlc<Context> wlc, wlc<jro> wlc2, wlc<oag> wlc3, wlc<hed> wlc4, wlc<hvl> wlc5) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
        this.e = (wlc) a(wlc5, 5);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
