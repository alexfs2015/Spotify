package defpackage;

/* renamed from: oqu reason: default package */
public final class oqu implements wig<gkm> {
    private final wzi<jqx> a;

    private oqu(wzi<jqx> wzi) {
        this.a = wzi;
    }

    public static oqu a(wzi<jqx> wzi) {
        return new oqu(wzi);
    }

    public final /* synthetic */ Object get() {
        return (gkm) wil.a(a.a((jqx) this.a.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
