package defpackage;

/* renamed from: okz reason: default package */
final class okz implements a {
    private final wlc<oku> a;
    private final wlc<ofh> b;

    okz(wlc<oku> wlc, wlc<ofh> wlc2) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ okw a(gjf gjf) {
        return new oky((oku) a(this.a.get(), 1), (ofh) a(this.b.get(), 2), (gjf) a(gjf, 3));
    }
}
