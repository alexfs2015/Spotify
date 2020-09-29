package defpackage;

/* renamed from: oqj reason: default package */
public final class oqj implements wig<oqw> {
    private final wzi<oqx> a;
    private final wzi<oma> b;

    private oqj(wzi<oqx> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqj a(wzi<oqx> wzi, wzi<oma> wzi2) {
        return new oqj(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oqw) wil.a(new oqz((owh) oqx.a(((oqx) this.a.get()).a.get(), 1), (gkq) oqx.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
