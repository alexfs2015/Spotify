package defpackage;

/* renamed from: oqs reason: default package */
public final class oqs implements a {
    private final wlc<tcn> a;
    private final wlc<ose> b;
    private final wlc<oqu> c;

    public oqs(wlc<tcn> wlc, wlc<ose> wlc2, wlc<oqu> wlc3) {
        this.a = (wlc) a(wlc, 1);
        this.b = (wlc) a(wlc2, 2);
        this.c = (wlc) a(wlc3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ oqq a(orf orf) {
        return new oqr((tcn) a(this.a.get(), 1), (ose) a(this.b.get(), 2), (oqu) a(this.c.get(), 3), (orf) a(orf, 4));
    }
}
