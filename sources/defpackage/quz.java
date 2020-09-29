package defpackage;

/* renamed from: quz reason: default package */
public final class quz {
    private final wlc<qsr> a;
    private final wlc<uxn> b;
    private final wlc<qxq> c;
    private final wlc<jpb> d;

    public quz(wlc<qsr> wlc, wlc<uxn> wlc2, wlc<qxq> wlc3, wlc<jpb> wlc4) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
        this.d = (wlc) a(wlc4, 4);
    }

    public final quy a(String str) {
        quy quy = new quy(str, (qsr) a(this.a.get(), 2), (uxn) a(this.b.get(), 3), (qxq) a(this.c.get(), 4), (jpb) a(this.d.get(), 5));
        return quy;
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
