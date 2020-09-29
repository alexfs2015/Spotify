package defpackage;

/* renamed from: ixo reason: default package */
public final class ixo implements wig<ixn> {
    private final wzi<jlr> a;
    private final wzi<rom> b;
    private final wzi<String> c;

    private ixo(wzi<jlr> wzi, wzi<rom> wzi2, wzi<String> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static ixo a(wzi<jlr> wzi, wzi<rom> wzi2, wzi<String> wzi3) {
        return new ixo(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new ixn((jlr) this.a.get(), (rom) this.b.get(), (String) this.c.get());
    }
}
