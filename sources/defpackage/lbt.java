package defpackage;

/* renamed from: lbt reason: default package */
public final class lbt implements wig<gkm> {
    private final wzi<jqx> a;

    private lbt(wzi<jqx> wzi) {
        this.a = wzi;
    }

    public static gkm a(jqx jqx) {
        return (gkm) wil.a(a.a(jqx), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static lbt a(wzi<jqx> wzi) {
        return new lbt(wzi);
    }

    public final /* synthetic */ Object get() {
        return a((jqx) this.a.get());
    }
}
