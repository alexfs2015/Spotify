package defpackage;

/* renamed from: oqp reason: default package */
public final class oqp implements wig<oss> {
    private final wzi<ost> a;
    private final wzi<oma> b;

    private oqp(wzi<ost> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqp a(wzi<ost> wzi, wzi<oma> wzi2) {
        return new oqp(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oss) wil.a(((ost) this.a.get()).a(((oma) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
