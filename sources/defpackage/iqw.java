package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqw reason: default package */
public final class iqw {
    private final wzi<RxResolver> a;

    public iqw(wzi<RxResolver> wzi) {
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

    public final iqv a() {
        return new iqv((RxResolver) a(this.a.get(), 1));
    }
}
