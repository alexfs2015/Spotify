package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: ioj reason: default package */
public final class ioj {
    private final wlc<RxResolver> a;

    public ioj(wlc<RxResolver> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public final ioi a() {
        return new ioi((RxResolver) a(this.a.get(), 1));
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
