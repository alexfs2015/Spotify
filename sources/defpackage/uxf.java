package defpackage;

/* renamed from: uxf reason: default package */
public final class uxf implements wig<uxe> {
    private final wzi<jlr> a;
    private final wzi<uvu> b;
    private final wzi<fqn> c;

    private uxf(wzi<jlr> wzi, wzi<uvu> wzi2, wzi<fqn> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static uxf a(wzi<jlr> wzi, wzi<uvu> wzi2, wzi<fqn> wzi3) {
        return new uxf(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new uxe((jlr) this.a.get(), (uvu) this.b.get(), (fqn) this.c.get());
    }
}
