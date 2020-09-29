package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iop reason: default package */
public final class iop {
    public final wlc<RxResolver> a;

    public iop(wlc<RxResolver> wlc) {
        this.a = (wlc) a(wlc, 1);
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
