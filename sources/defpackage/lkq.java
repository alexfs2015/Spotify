package defpackage;

/* renamed from: lkq reason: default package */
public final class lkq {
    public final wlc<jjf> a;
    public final wlc<jrp> b;

    lkq(wlc<jjf> wlc, wlc<jrp> wlc2) {
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
