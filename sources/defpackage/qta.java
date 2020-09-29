package defpackage;

/* renamed from: qta reason: default package */
public final class qta implements wig<qsz> {
    private final wzi<qtd> a;
    private final wzi<Boolean> b;
    private final wzi<qqf> c;

    private qta(wzi<qtd> wzi, wzi<Boolean> wzi2, wzi<qqf> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static qta a(wzi<qtd> wzi, wzi<Boolean> wzi2, wzi<qqf> wzi3) {
        return new qta(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new qsz((qtd) this.a.get(), ((Boolean) this.b.get()).booleanValue(), (qqf) this.c.get());
    }
}
