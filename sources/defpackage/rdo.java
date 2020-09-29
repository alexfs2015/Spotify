package defpackage;

/* renamed from: rdo reason: default package */
public final class rdo {
    private final wzi<rbg> a;
    private final wzi<vjp> b;
    private final wzi<rgf> c;
    private final wzi<jrn> d;

    public rdo(wzi<rbg> wzi, wzi<vjp> wzi2, wzi<rgf> wzi3, wzi<jrn> wzi4) {
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

    public final rdn a(String str) {
        rdn rdn = new rdn(str, (rbg) a(this.a.get(), 2), (vjp) a(this.b.get(), 3), (rgf) a(this.c.get(), 4), (jrn) a(this.d.get(), 5));
        return rdn;
    }
}
