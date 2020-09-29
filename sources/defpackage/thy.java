package defpackage;

/* renamed from: thy reason: default package */
public final class thy implements wig<thq> {
    private final wzi<lap> a;
    private final wzi<fqn> b;

    private thy(wzi<lap> wzi, wzi<fqn> wzi2) {
        this.a = wzi;
        this.b = wzi2;
    }

    public static thq a(lap lap, fqn fqn) {
        return (thq) wil.a(CC.a(lap, fqn), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static thy a(wzi<lap> wzi, wzi<fqn> wzi2) {
        return new thy(wzi, wzi2);
    }

    public final /* synthetic */ Object get() {
        return a((lap) this.a.get(), (fqn) this.b.get());
    }
}
