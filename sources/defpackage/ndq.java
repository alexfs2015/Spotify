package defpackage;

/* renamed from: ndq reason: default package */
public final class ndq implements wig<ndp> {
    private final wzi<juc> a;
    private final wzi<jty> b;
    private final wzi<vlp> c;
    private final wzi<rpv> d;

    private ndq(wzi<juc> wzi, wzi<jty> wzi2, wzi<vlp> wzi3, wzi<rpv> wzi4) {
        this.a = wzi;
        this.b = wzi2;
        this.c = wzi3;
        this.d = wzi4;
    }

    public static ndq a(wzi<juc> wzi, wzi<jty> wzi2, wzi<vlp> wzi3, wzi<rpv> wzi4) {
        return new ndq(wzi, wzi2, wzi3, wzi4);
    }

    public final /* synthetic */ Object get() {
        return new ndp((juc) this.a.get(), (jty) this.b.get(), (vlp) this.c.get(), (rpv) this.d.get());
    }
}
