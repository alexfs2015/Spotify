package defpackage;

/* renamed from: pio reason: default package */
public final class pio implements wig<tym> {
    private final wzi<fqn> a;
    private final wzi<sgt> b;

    private pio(wzi<fqn> wzi, wzi<sgt> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static pio a(wzi<fqn> wzi, wzi<sgt> wzi2) {
        return new pio(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        fqn fqn = (fqn) this.a.get();
        tym tym = new tym((sgt) this.b.get());
        tym.a = fqn.b(sgn.a);
        return (tym) wil.a(tym, "Cannot return null from a non-@Nullable @Provides method");
    }
}
