package defpackage;

/* renamed from: quf reason: default package */
public final class quf {
    private final wlc<qsr> a;
    private final wlc<ioi> b;
    private final wlc<qxq> c;

    public quf(wlc<qsr> wlc, wlc<ioi> wlc2, wlc<qxq> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public final que a(a aVar) {
        return new que((a) a(aVar, 1), (qsr) a(this.a.get(), 2), (ioi) a(this.b.get(), 3), (qxq) a(this.c.get(), 4));
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
