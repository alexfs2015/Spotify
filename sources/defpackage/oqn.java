package defpackage;

/* renamed from: oqn reason: default package */
public final class oqn implements wig<oti> {
    private final wzi<otj> a;
    private final wzi<oma> b;

    private oqn(wzi<otj> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqn a(wzi<otj> wzi, wzi<oma> wzi2) {
        return new oqn(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oti) wil.a(new otl((owh) otj.a(((otj) this.a.get()).a.get(), 1), (gkq) otj.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
