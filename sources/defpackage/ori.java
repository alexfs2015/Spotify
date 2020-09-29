package defpackage;

/* renamed from: ori reason: default package */
final class ori implements a {
    private final wlc<ora> a;
    private final wlc<ord> b;

    ori(wlc<ora> wlc, wlc<ord> wlc2) {
        this.a = (wlc) a((T) wlc, 1);
        this.b = (wlc) a((T) wlc2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ org a(oiv oiv, ohf ohf) {
        return new orh((ora) a((T) this.a.get(), 1), (ord) a((T) this.b.get(), 2), (oiv) a((T) oiv, 3), (ohf) a((T) ohf, 4));
    }
}
