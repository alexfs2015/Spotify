package defpackage;

import com.spotify.cosmos.android.RxResolver;

/* renamed from: iqu reason: default package */
public final class iqu {
    private final wzi<RxResolver> a;
    private final wzi<rwl> b;

    public iqu(wzi<RxResolver> wzi, wzi<rwl> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final iqt a(String str) {
        return new iqt((RxResolver) a(this.a.get(), 1), (String) a(str, 2), (rwl) a(this.b.get(), 3));
    }
}
