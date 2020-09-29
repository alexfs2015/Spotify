package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: rxa reason: default package */
public final class rxa implements rxb {
    private final wlc<RxResolver> a;
    private final wlc<wug> b;
    private final wlc<wug> c;

    public rxa(wlc<RxResolver> wlc, wlc<wug> wlc2, wlc<wug> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    /* renamed from: b */
    public final rwz a() {
        return new rwz((RxResolver) a(this.a.get(), 1), (wug) a(this.b.get(), 2), (wug) a(this.c.get(), 3));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
