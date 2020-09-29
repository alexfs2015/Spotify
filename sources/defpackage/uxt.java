package defpackage;

/* renamed from: uxt reason: default package */
public final class uxt implements wig<uxe> {
    private final wzi<jlr> a;
    private final wzi<uvu> b;
    private final wzi<fqn> c;

    private uxt(wzi<jlr> wzi, wzi<uvu> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uxt a(wzi<jlr> wzi, wzi<uvu> wzi2, wzi<fqn> wzi3) {
        return new uxt(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return (uxe) wil.a(new uxe((jlr) this.a.get(), (uvu) this.b.get(), (fqn) this.c.get()), "Cannot return null from a non-@Nullable @Provides method");
    }
}
