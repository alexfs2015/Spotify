package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqq reason: default package */
public final class iqq {
    private final wzi<RxResolver> a;

    public iqq(wzi<RxResolver> wzi) {
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

    public final iqp a() {
        return new iqp((RxResolver) a(this.a.get(), 1));
    }
}
