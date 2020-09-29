package defpackage;

import io.reactivex.Flowable;

/* renamed from: sok reason: default package */
public final class sok {
    public final wzi<Flowable<sqj>> a;
    public final wzi<Flowable<sqj>> b;

    public sok(wzi<Flowable<sqj>> wzi, wzi<Flowable<sqj>> wzi2) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
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
