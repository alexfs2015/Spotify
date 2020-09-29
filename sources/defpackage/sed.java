package defpackage;

import io.reactivex.Flowable;

/* renamed from: sed reason: default package */
public final class sed {
    public final wlc<Flowable<sgc>> a;
    public final wlc<Flowable<sgc>> b;

    public sed(wlc<Flowable<sgc>> wlc, wlc<Flowable<sgc>> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
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
