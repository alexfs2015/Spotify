package defpackage;

/* renamed from: pci reason: default package */
public final class pci {
    private final wzi<owh> a;
    private final wzi<owk> b;
    private final wzi<wbt> c;

    public pci(wzi<owh> wzi, wzi<owk> wzi2, wzi<wbt> wzi3) {
        this.a = (wzi) a(wzi, 1);
        this.b = (wzi) a(wzi2, 2);
        this.c = (wzi) a(wzi3, 3);
    }

    private static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final pck a(gkq gkq) {
        return new pck((owh) a(this.a.get(), 1), (owk) a(this.b.get(), 2), (wbt) a(this.c.get(), 3), (gkq) a(gkq, 4));
    }
}
