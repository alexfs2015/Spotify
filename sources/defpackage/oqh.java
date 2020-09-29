package defpackage;

/* renamed from: oqh reason: default package */
public final class oqh implements wig<omr> {
    private final wzi<oms> a;
    private final wzi<oma> b;

    private oqh(wzi<oms> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqh a(wzi<oms> wzi, wzi<oma> wzi2) {
        return new oqh(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (omr) wil.a(new omu((owh) oms.a(((oms) this.a.get()).a.get(), 1), (gkq) oms.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
