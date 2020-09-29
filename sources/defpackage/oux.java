package defpackage;

/* renamed from: oux reason: default package */
public final class oux {
    private final wlc<opb> a;
    private final wlc<ope> b;
    private final wlc<vol> c;

    public oux(wlc<opb> wlc, wlc<ope> wlc2, wlc<vol> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    public final ouz a(gjf gjf) {
        return new ouz((opb) a(this.a.get(), 1), (ope) a(this.b.get(), 2), (vol) a(this.c.get(), 3), (gjf) a(gjf, 4));
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
