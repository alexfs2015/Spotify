package defpackage;

/* renamed from: oqo reason: default package */
public final class oqo implements wig<oxk> {
    private final wzi<oxl> a;
    private final wzi<oma> b;

    private oqo(wzi<oxl> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqo a(wzi<oxl> wzi, wzi<oma> wzi2) {
        return new oqo(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oxk) wil.a(new oxn((owh) oxl.a(((oxl) this.a.get()).a.get(), 1), (gkq) oxl.a(((oma) this.b.get()).c, 2)), "Cannot return null from a non-@Nullable @Provides method");
    }
}
