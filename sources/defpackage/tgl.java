package defpackage;

/* renamed from: tgl reason: default package */
public final class tgl implements tgk {
    private final wlc<tgg> a;
    private final wlc<rnf> b;

    public tgl(wlc<tgg> wlc, wlc<rnf> wlc2) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
    }

    public final tgj a(tge tge, int i) {
        return new tgj((tge) a((T) tge, 1), 1, (tgg) a((T) this.a.get(), 3), (rnf) a((T) this.b.get(), 4));
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
