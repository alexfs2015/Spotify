package defpackage;

/* renamed from: kxq reason: default package */
public final class kxq implements wig<kxp> {
    private final wzi<fqn> a;
    private final wzi<kxv> b;
    private final wzi<kxz> c;

    private kxq(wzi<fqn> wzi, wzi<kxv> wzi2, wzi<kxz> wzi3) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
    }

    public static kxq a(wzi<fqn> wzi, wzi<kxv> wzi2, wzi<kxz> wzi3) {
        return new kxq(wzi, wzi2, wzi3);
    }

    public final /* synthetic */ Object get() {
        return new kxp((fqn) this.a.get(), (kxv) this.b.get(), (kxz) this.c.get());
    }
}
