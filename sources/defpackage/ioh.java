package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ioh reason: default package */
public final class ioh {
    private final wlc<RxResolver> a;
    private final wlc<rnf> b;

    public ioh(wlc<RxResolver> wlc, wlc<rnf> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
    }

    public final iog a(String str) {
        return new iog((RxResolver) a(this.a.get(), 1), (String) a(str, 2), (rnf) a(this.b.get(), 3));
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
