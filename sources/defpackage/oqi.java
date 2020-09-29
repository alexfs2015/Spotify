package defpackage;

/* renamed from: oqi reason: default package */
public final class oqi implements wig<oya> {
    private final wzi<oyb> a;
    private final wzi<oma> b;

    private oqi(wzi<oyb> wzi, wzi<oma> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static oqi a(wzi<oyb> wzi, wzi<oma> wzi2) {
        return new oqi(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return (oya) wil.a(((oyb) this.a.get()).a(((oma) this.b.get()).c), "Cannot return null from a non-@Nullable @Provides method");
    }
}
