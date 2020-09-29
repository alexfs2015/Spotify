package defpackage;

/* renamed from: oqk reason: default package */
public final class oqk implements wig<orl> {
    private final wzi<orm> a;
    private final wzi<oma> b;

    private oqk(wzi<orm> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqk a(wzi<orm> wzi, wzi<oma> wzi2) {
        return new oqk(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (orl) wil.a(new oro((owh) orm.a(((orm) this.a.get()).a.get(), 1), (gkq) orm.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
