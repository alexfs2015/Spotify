package defpackage;

/* renamed from: oso reason: default package */
final class oso implements a {
    private final wzi<osj> a;
    private final wzi<rlb> b;
    private final wzi<oml> c;
    private final wzi<omn> d;

    oso(wzi<osj> wzi, wzi<rlb> wzi2, wzi<oml> wzi3, wzi<omn> wzi4) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
        this.d = (wzi) a(wzi4, 4);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final /* synthetic */ osl a(oof oof) {
        osj osj = (osj) a(this.a.get(), 1);
        rlb rlb = (rlb) a(this.b.get(), 2);
        oml oml = (oml) a(this.c.get(), 3);
        omn omn = (omn) a(this.d.get(), 4);
        a(oof, 5);
        return new osn(osj, rlb, oml, omn);
    }
}
